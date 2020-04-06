package com.practice.lin.singleton;

import android.content.Intent;

import java.io.ObjectStreamException;

public class Example4 {

    //静态内部类（DCL有时会失效）
    //第一次加载时Example4时不会初始化mInstance，只有在调用getInstance时才会导致虚拟机加载SingletonHolder类从而实例化mInstance
    //线程安全/单例对象唯一/延迟单例的实例化

    public static Example4 getInstance() {
        return SingletonHolder.mInstance;
    }

    private static class SingletonHolder {
        private static final Example4 mInstance = new Example4();
    }

    /**
     * 防止反序列化的时候被新创建实例
     *
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return SingletonHolder.mInstance;
    }

}
