package com.practice.lin.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Example1 implements Serializable{

    //饿汉模式
    private static final Example1 mInstance = new Example1();

    public static Example1 getInstance(){
        return  mInstance;
    }

    //防止反序列化的时候被新创建实例
    private Object readResolve() throws ObjectStreamException {
        return mInstance;
    }
}
