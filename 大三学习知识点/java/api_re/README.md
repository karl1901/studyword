# API-反射

> **反射：对于类和类里面的属性以及方法，进行相关的操作**  
>  
> 一、获取类对象  
>> 1、类名.class  
>> 2、对象.getClass()  
>> 3、Class.forName("全限定名")  
>> 4、类加载的loadClass("全限定名")  
>> 5、子类.class.getSuperClass()  
>> 6、包装类.class  
>  
> 二、根据类得到类名(全限定名)  
>> c.getName()--全限定名  
>> c.getSimpleName()--类名  
>> c.getPackage()--包名  
>  
> 三、根据类得到类的属性  
>> 获取公开的属性：f=c.getField("field属性名")  
>>> 属性名：f.getName()  
>>> 属性修饰符：f.getModifiers()  
>>>> 1: public  
>>>> 2: private  
>>>> 0: 默认的(友好的)  
>>>> 4: 受保护的  
>>>> 8: 静态的  
>>>> 6: 最终的  
>>>  
>>> 属性的数据类型: f.getType().getName()  
>>> 给属性设值: f.set("f"/f,值)  
>>  
>> 获取私有的属性：f.getDeclaredField("field属性名")  
>>> 得到所有的声明的属性: c.getDeclaredFields()---返回的是Field集合  

- [**返回**](https://code.aliyun.com/kangxianghui/studywrod/tree/master/%E5%A4%A7%E4%B8%89%E5%AD%A6%E4%B9%A0%E7%9F%A5%E8%AF%86%E7%82%B9/java/README.md)
- [**首页**](https://code.aliyun.com/kangxianghui/studywrod/tree/master/README.md)
