package com.practice.lin.singleton;

import java.io.ObjectStreamException;

public class Example2 {

    //懒汉模式
    private static Example2 mInstance;

    synchronized public  static  Example2 getInstance(){
        if (null==mInstance){
            mInstance = new Example2();
        }
        return  mInstance;
    }

    //防止反序列化的时候被新创建实例
    private Object readResolve() throws ObjectStreamException {
        return mInstance;
    }
}
