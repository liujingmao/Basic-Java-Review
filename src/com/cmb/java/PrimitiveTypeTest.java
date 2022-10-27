package com.cmb.java;

/**
 * 复习Java的基本数据类型
 */

public class PrimitiveTypeTest {

    /**
     * 局部变量声明在方法、构造方法或者语句块中；
     * 局部变量在方法、构造方法、或者语句块被执行的时候创建，当它们执行完成后，变量将会被销毁；
     * 访问修饰符不能用于局部变量；
     * 局部变量只在声明它的方法、构造方法或者语句块中可见；
     * 局部变量是在栈上分配的。
     * 局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。
     * @return
     */

    public int print(){
        int a = 12; // 局部变量，在方法之内
        System.out.println("a是局部变量:"+a);
        return a;
    }

    String name ; // 实例变量：独立于方法之外的变量，没有用static修饰

    static boolean bool; //类变量： 独立于方法之外的变量，用static修饰
    static byte by;
    static short sh;
    static char ch;
    static double d;
    static float f;
    static int i;
    static long l;
    static String str;

    public static void main(String[] args) {

        PrimitiveTypeTest primitiveTypeTest = new PrimitiveTypeTest();
        primitiveTypeTest.print();

        System.out.println();

        System.out.println("*******************基本数据类型默认值******************");

        System.out.println("boolean的默认值："+bool);
        System.out.println("Byte的默认值是:"+by);
        System.out.println("Short的默认值是:"+sh);
        System.out.println("Char的默认值是:"+ch);
        System.out.println("Double的默认值是:"+d);
        System.out.println("Float的默认值是:"+f);
        System.out.println("Integer的默认值是:"+i);
        System.out.println("Long的默认值是:"+l);
        System.out.println("String的默认值是:"+str);

        System.out.println();

        System.out.println("*********基本数据类型基本信息********");

        //byte
        System.out.println("基本数据类型：byte 二进制位数："+Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("Min Value:"+Byte.MIN_VALUE);
        System.out.println("Max Value:"+Byte.MAX_VALUE);
        System.out.println();

        //short
        System.out.println("基本数据类型：short 二进制位数："+ Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("Min Value:"+ Short.MIN_VALUE);
        System.out.println("Max Value:"+Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("基本数据类型：int 二进制位数："+ Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("Min Value:"+ Integer.MIN_VALUE);
        System.out.println("Max Value:"+ Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);





    }



}
