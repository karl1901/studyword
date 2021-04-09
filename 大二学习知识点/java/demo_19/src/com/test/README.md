# java-File（文件操作类）

---

string：`getName()`：获取文件名称  
string：`getPath()`：获取文件路径(包含自身文件名称)  
string：`getParentFile()`：获取文件(父)路径(不包含自身文件名称)  
boolean：`isFile()`：判断是否是文件  
boolean：`isDirectory()`：判断是否是文件夹  
boolean：`exists`：判断文件是否存在  
boolean：`createNewFile()`：创建文件  
boolean：`mkdirs()`：创建文件夹  
boolean：`delete()`：删除文件(慎用！！！)  
string：`length()`：文件大小(单位：字节/Byte)

## 方法：

> 1、扫描文件的方法  
> 2、扫描文件类型的方法

## 其他方法

> File类  
在java中，不管是文件还是文件夹都是叫做File对象  
> createNewFile方法是创建一个文件  
mkdir方法是创建一个文件夹  
exists判断所关联的文件是否存在  
delete删除所关联的文件  
equals在File类中是比较的文件名字相同为true，不同为false  
getAbsolutePath获得文件的绝对路径  
getName获得文件名  
getParent是获得文件的上一次父目录的名字  
getParentFile是获得文件的上一次父目录的对象  
isDirectory判断是否是目录  
isFile判断是否是文件  
isHidden判断是否是隐藏文件  
lastModified获得文件的最后修改时间  
length获得文件长度以字节为单位  
list是获得文件夹下面的所有文件的名字列表  
listFile是获得文件夹下面的所有文件的对象列表  
renameTo是重命名  
listRoots获得当前系统的盘符  


---

- [**返回**](https://code.aliyun.com/kangxianghui/studywrod/tree/master/%E5%A4%A7%E4%BA%8C%E5%AD%A6%E4%B9%A0%E7%9F%A5%E8%AF%86%E7%82%B9/java)
- [**首页**](https://code.aliyun.com/kangxianghui/studywrod/tree/master)