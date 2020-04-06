package com.practice.lin.singleton;

import java.io.ObjectStreamException;

public class Example3 {

    //DCL 双重检查
    private volatile static Example3 mInstance;

    public static Example3 getInstance() {
        if (null == mInstance) {//避免懒汉模式下出现的不必要同步（synchronized）
            synchronized (Example3.class) {
                if (null == mInstance) {//判断实例为空
                    mInstance = new Example3();
                }
            }
        }
        return mInstance;
    }


    //防止反序列化的时候被新创建实例
    private Object readResolve() throws ObjectStreamException {
        return mInstance;
    }
}
