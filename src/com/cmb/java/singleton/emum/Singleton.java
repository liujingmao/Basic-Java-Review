package com.cmb.java.singleton.emum;
/**
 * 用枚举实现单例模式
 */
public class Singleton {
    //枚举类是线程安全的，并且只会装载一次
    private enum SingletonEnum{
        INSTANCE;
        // 声明实例对象
        private final Singleton instance;
        // 实例化
        SingletonEnum(){
            instance = new Singleton();
        }

        private Singleton getInstance(){
            return instance;
        }

    }
    // 获取实例对象，单例对象
    public static Singleton getInstance(){
        return SingletonEnum.INSTANCE.getInstance();
    }

    private Singleton(){

    }

    //类方法
    public void sayHi(){
        System.out.println("EmumClass used to relize single mode");
    }
}

class SingleTest{
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.sayHi();
    }
}
