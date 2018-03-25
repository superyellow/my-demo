### codePoint
* 代码点&代码单元，是从Unicode标准而来的术语，Unicode标准的核心是一个编码字符集
* 在java中, 一个字符, 仅仅代表一个代码点(codePoint), 
但却有可能代表多个代码单元(在java中就是两个字节, 一个char),比如表情符😝, 
只代表一个代码点, 却占着两个char
### java api
* 首先看一下表情符的length()长度
```java
int length = "😁".length();
System.out.println("length " + length);//2
```
* int codePointAt(int index): 返回char数组的给定索引上的代码点
```java
int at1 = "😁".codePointAt(0);
System.out.println("at1 " + at1);//128513
int at2 = "😁".codePointAt(1);
System.out.println("at2 " + at2);//56833
```
* int codePointBefore(int index): 这里有疑惑, 按理说应该返的代码点值跟上面方法一样才对
```java
int before1 = "😁".codePointBefore(1);
System.out.println("before1 " + before1);//55357
int before2 = "😁".codePointBefore(2);
System.out.println("before2 " + before2);//128513
```
* int codePointCount(int beginIndex, int endIndex): 返回某个索引区间的代码点数量,
我们重点用这个
```java
int count = "😁".codePointCount(0, "😁".length()-1);
System.out.println("count " + count);//1
```
* IntStream codePoints(): 返回所有代码点值的Stream
```java
"😁".codePoints().boxed().forEach(
        integer -> System.out.println(integer));
```
* int offsetByCodePoints(int index, int codePointOffset): 头疼, 后边再分析
```java
int offset = "😁😁".offsetByCodePoints(1, 2);
System.out.println("offset " + offset);//4
```

###参考资料
总结的时候发现还是有些疑问的, 烦烦烦, 待续吧
[java的字符编码集](http://www.360doc.com/content/12/0420/13/9470897_205152817.shtml)