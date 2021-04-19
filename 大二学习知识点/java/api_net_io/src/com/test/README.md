# net-网络流

---

- `InetAddress`：网络流
  - `getLocalHost()`：获取电脑名称和IP
  - `getHostName()`：获取电脑名称
  - `getHostAddress()`：获取电脑IP

- `InputStream`：网络字节流
- `InputStreamReader`：字节转化为字符流

```java
InputStreamReader isr = new InputStreamReader(inputstreamname, "UTF-8");
```

```txt
流是一组流动的数据的总称。类似于水流
流是有方向性的。我们应该以当前程序为参照物。
如果说是程序中要获得外面的数据，那么我们应该使用输入流
如果由程序向外面扔数据就应该是输出流
```

---

- [**返回**](https://code.aliyun.com/kangxianghui/studywrod/tree/master/%E5%A4%A7%E4%BA%8C%E5%AD%A6%E4%B9%A0%E7%9F%A5%E8%AF%86%E7%82%B9/java)
- [**首页**](https://code.aliyun.com/kangxianghui/studywrod/tree/master)
