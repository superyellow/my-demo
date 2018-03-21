### 并发编程模型的分类
* 并发编程中遇到的两个问题: 线程之间如何通信, 线程之间如何同步
* 以线程之间的通信模式来看, 并发模型可以分为两种
  * 共享内存的并发模型
  * 消息传递的并发模型
* java并发采用的是共享内存模型
### JMM抽象模型
* java中, 堆内存是线程之间共享的, 其中包括了实例域、静态域、数组元素, 而局部变量、
方法参数、异常处理参数是线程私有的, 不会有内存可见性问题, 不受内存模型影响
* JMM决定了一个线程对共享变量的写入何时对另一个线程可见
* 从抽象角度来看, 共享变量存储在主内存中, 每个线程有一个副本, 读写在这个副本上, 最终由JMM决定与主内存的同步
  * 线程A向主内存刷新变更, 线程B向主内存读取更新, 实现线程通信
* java内存模型
### 重排序
* 编译器优化重排序
* 指令级并行的重排序
* 内存系统的重排序
* JMM属于语言级的内存模型, 它确保了在不同编译器与不同处理器平台上, 通过禁止特定的重排序, 为程序员提供一致的内存可见性
### 内存屏障
实现cpu数据可见性, 禁止指令重排序
### java内存模型如何定义并发关键字的行为
* synchronized
  * 线程释放monitor, 把cpu缓存(线程本地缓存)刷新到主内存
  * 线程获得monitor, 把cpu缓存失效, 强制从主内存获取
  * 禁止特定的指令重排
* volatile
  * volatile修饰的变量, 每次的变更都会刷新到主内存, 每次读取这种变量前, 也必须保证缓存无效
  * 禁止特定的指令重排
* final
  * final修饰的变量, 在正确的构造对象后, 对其它线程是可见的
### happens-before
### 双重检查锁定(double-check-locking)
### 参考资料
[深入理解Java内存模型（一）——基础](http://www.infoq.com/cn/articles/java-memory-model-1)

[什么是Java内存模型](https://mp.weixin.qq.com/s?__biz=MzIwMzY1OTU1NQ==&mid=2247484020&idx=1&sn=a6ba310fdafd6daa5a9b131eba697696&chksm=96cd4238a1bacb2e36c68c3490cb11ad1d61135cbc179118d1083a42d3c6e73aeebd86835940&scene=0&key=68df68e89e41b5df774778d4e71d8f91b943c86590830dc737b3e7ef7bbdf9bf85c30f566d69d896ae2ced1630b1693ae05f0c4aa35bbd49857c29f35e815c5036242c82be8c0dd6e1f945a811ce463f&ascene=0&uin=MTE1MjE2MjcwMQ%3D%3D&devicetype=iMac+MacBookPro12%2C1+OSX+OSX+10.12.4+build(16E195)&version=12020810&nettype=WIFI&lang=zh_CN&fontScale=100&pass_ticket=5y0Ozaj%2BDHEYLIX6OxIvmjFD7%2BypKSOCNOEwinUTjnb6NEejNw2KofPlDmiDeSJz)