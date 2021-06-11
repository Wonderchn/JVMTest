package com.hongna.Demo;

public class Demo1 {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.getClass().getClassLoader());
        System.out.println(obj.getClass().getClassLoader().getParent());
        System.out.println(obj.getClass().getClassLoader().getParent().getParent());
        //NullPointerException 空指针异常，我们的Object是bootsrap类根加载器加载的

        //结果为Null 证明这个类是在根加载器中进行处理的

        Demo1 demo1 = new Demo1();
        System.out.println(demo1.getClass().getClassLoader());
        System.out.println(demo1.getClass().getClassLoader().getParent());
        System.out.println(demo1.getClass().getClassLoader().getParent().getParent());
        //自己创建的类是通过AppClassLoader 来实现类的加载的
        //这里会涉及一个 类的双亲委托机制

    }
}
