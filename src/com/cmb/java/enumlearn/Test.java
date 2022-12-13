package com.cmb.java.enumlearn;

/**
 *枚举是一个特殊的类，一般表示一组常量，比如一年的 4 个季节，一个年的 12 个月份，一个星期的 7 天，方向有东南西北等。
 *
 * Java 枚举类使用 enum 关键字来定义，各个常量使用逗号 , 来分割。
 *
 * 例如定义一个颜色的枚举类。
 */

enum Color {
    RED,GREEN,BLUE
}

public class Test {

    public static void main(String[] args) {
      Color color = Color.BLUE;
        System.out.println(color);
    }

}
