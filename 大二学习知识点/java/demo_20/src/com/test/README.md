# io-读写流

## 字节流，字符流，对象流

---

`i`：读 ( input )  
`o`：写 ( output )  

- 字节流  
  - `FileInputStream`：读流  
  - `FileOutputStream`：写流  

- 缓存流  
  - `BufferedOutputStream`：写流  

- 对象流  
  - `ObjectInputStream`：读流(反序列化)  
  - `ObjectOutputStream`：写流(序列化)  

## 知识点大纲

> 流是一组流动的数据的总称。类似于水流  
流是有方向性的。我们应该以当前程序为参照物。  
如果说是程序中要获得外面的数据，那么我们应该使用输入流  
如果由程序向外面扔数据就应该是输出流  
>  
> FileInputStream的  
> read方法是一次读一个字节，返回值是这个读到字节的ascii码值  
read(byte[])是相当于给一个容器，没有都去填充这个容器，它的返回  值是容器中有效字节的个数  
>  
> FileOutputStream的  
write(int)一次写一个字节的ascii码值  
write(byte[ ],起始位置，长度)表示从字节数组的开始位置写多长  

---

- [**返回**](https://code.aliyun.com/kangxianghui/studywrod/tree/master/%E5%A4%A7%E4%BA%8C%E5%AD%A6%E4%B9%A0%E7%9F%A5%E8%AF%86%E7%82%B9/java)
- [**首页**](https://code.aliyun.com/kangxianghui/studywrod/tree/master)