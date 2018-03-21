##Non-blocking IO
##三大组件
* Channel
  * FileChannel
  * DatagramChannel
  * SocketChannel
  * ServerSocketChannel
* Buffer
 * ByteBuffer
 * CharBuffer
 * DoubleBuffer
 * FloatBuffer
 * LongBuffer
 * IntBuffer
 * ShortBuffer
 * MappedByteBuffer
* Selector
 * 单线程处理多个Channel
 * 向Selector中注册Channel, 调用select()方法阻塞

##基本用法
* channel是双向的, 与buffer交互

```java
public static void testFileBuffer() throws IOException {
    RandomAccessFile raFile = new RandomAccessFile("README.md", "rw");
    FileChannel inChannel = raFile.getChannel();

    ByteBuffer buffer = ByteBuffer.allocate(48);//capacity置为48,即分配48字节的空间
    int byteRead = inChannel.read(buffer);//从channel中读,向buffer中写入数据
    while (byteRead != -1) {
        System.out.println(byteRead);
        buffer.flip();//转换buffer到读状态,position重置为0,limit置为写模式下的position
        System.out.println(new String(buffer.array(), "UTF-8"));
        while (buffer.hasRemaining()) {
            System.out.println((char)buffer.get());//从buffer中拿到数据,以字节为单位
        }

        buffer.clear();//clear()清空buffer或compact()清除已读数据
        byteRead = inChannel.read(buffer);
        System.out.println(byteRead);
    }
    raFile.close();
}

```

##Buffer的三个属性
* capacity
* position
* limit
* flip()方法
* rewind()方法
* clear()与compact()方法
* equals()与compareTo()方法

##通道之间的数据传输
* 条件是其中一个通道是FileChannel
* FileChannel有两个方法
  * transferFrom()
  * transferTo()
* 示例

```java

public static void testChannelTransfer() throws IOException {
    RandomAccessFile fromFile = new RandomAccessFile("README.md", "rw");
    FileChannel fromChannel = fromFile.getChannel();
    RandomAccessFile toFile = new RandomAccessFile("nio-file.txt", "rw");
    FileChannel toChannel = toFile.getChannel();

    int position = 0;
    long count = fromChannel.size();
    toChannel.transferFrom(fromChannel, position, count);

    ByteBuffer buffer = ByteBuffer.allocate(1024);
    toChannel.read(buffer);
    System.out.println(new String(buffer.array()));
}

```

##参考链接
* See [ifeve-nio](http://ifeve.com/java-nio-all/)
