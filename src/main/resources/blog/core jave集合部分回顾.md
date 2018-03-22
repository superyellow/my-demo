### 接口
队列接口可以在尾部添加, 在头部删除, 并返回元素个数,
一个队列的最小接口可能类似如下
```java
public interface MyQueue<E> {
    void add(E element);
    E remove();
    int size();
}
```
队列实现可能有两个, 循环数组跟链表队列
```java
public class MyCircularArrayQueue<E> implements MyQueue<E> {
    private E[] elements;
    private int head;
    private int tail;
    MyCircularArrayQueue(int capacity) {...}

    @Override
    public void add(E e) {...}

    @Override
    public E remove() {...}

    @Override
    public int size() {...}
}
```

```java
public class MyLinkedListQueue<E> implements MyQueue<E> {
    @Override
    public void add(E e) {...}

    @Override
    public E remove() {...}

    @Override
    public int size() {...}

    public MyLinkedListQueue() {...}

    private Link<E> head;
    private Link<E> tail;

    public class Link<E> {
        private E element;
        private Link<E> next;
    }
}
```
jdk类库中, 每种数据结构接口通常会对应一个Abstract类,
这是类库设计者将一些通用的实现方法集成了, 方便框架设计

集合类的基本接口是Collection
* 扩展了Iterable接口，可以支持for each
* Iterator, next() remove()方法都是操作的迭代器前面的那一个元素,
这里与InputStream.read()方法有点类似
* 迭代器访问顺序取决于集合顺序
* Collection提供了一些需要实现的方法: iterator() add() addAll()
remove() removeAll() contains() containsAll() retainAll()
size() isEmpty() equals() clear() toArray()
  
### 具体的集合
* ArrayList
* LinkedList
   * 双向链接
* ArrayDeque
* HashSet
   * LinkedHashSet
* EnumSet
* PriorityQueue
* HashMap
   * LinkedHashMap
* TreeMap
* EnumMap
* WeakHashMap
* IdentityHashMap