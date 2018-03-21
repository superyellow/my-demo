##ACID
* Atomicity原子性
* Consistency一致性
* Isolation隔离性
* Durability持久性

##隔离级别
* Read Uncommitted
* Read Committed
* Repeatable Read
* Serializable

##死锁
* innoDB检测到死锁的循环依赖, 会理解返回一个错误
* innoDB将持有最少行级排它锁的事务回滚

##事务日志
* 采用追加方式, 写日志是操作磁盘上一小块区域的顺序io, 比随机io快
* 预写式日志(Write-Ahead Logging), 即先写入日志, 后续慢慢写入磁盘

##mysql的事务
* AUTOCOMMIT(自动提交)
  * show variables like 'autocommit'; 
  * set autocommit=1;
* 设置会话隔离级别
  * select @@tx_isolation;
  * set session transaction isolation level read commited;
* 事务中不建议混合使用存储引擎
* 隐式锁定 显示锁定
  * 数据库根据隔离级别自动加锁 - 隐式锁定
  * for update; lock in share mode - innoDB支持的显式锁定

##MVCC
* 行级锁的变种, 保存数据在某个时间点的快照实现, 有乐观跟悲观两种并发控制
* repeatable read隔离级别下
  * insert操作, 保存该数据行隐藏的创建版本号
  * delete操作, 保存该数据行隐藏的过期版本号
  * update操作, 在原数据行保存过期版本号, 新加一行添加创建版本号, 相当于删除后添加
  * select操作, 只查询创建版本号小于本事务版本, 并且过期版本号大于本事务版本的数据
  * 这样可以保证同一事务下无论何时查询, 得到的数据是一致的
* mvcc只在repeatable read和read commited下工作