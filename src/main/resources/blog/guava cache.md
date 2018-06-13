### 核心类库
* Cache与LodingCache
* CacheBuilder
* CacheBuilderSpec
* CacheLoader
* CacheStats
* RemovalListener

### 特性
* 自动加载
* 回收策略：容量回收、定时回收、基于引用回收
* 定时清理
* 缓存状态统计
* 缓存刷新
* 删除的监听器

### 特性源码实现
#### CacheBuilder
```java
public static LoadingCache<String, String> cache1 = CacheBuilder.newBuilder()
        .maximumSize(1000)
        .expireAfterWrite(10, TimeUnit.MINUTES)
        .build(new CacheLoader<String, String>() {
            @Override
            public String load(String s) throws Exception {
                return s + "'s value";
            }
        });
```