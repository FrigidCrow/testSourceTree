package com.wudi;

/**
 * Created by Wudi on 17/2/27.
 */
public class Person {

    // 主函数快捷键 psvm
    public static void main(String[] args)
    {
        System.out.println("hallo world");
        System.out.println("aaaaaaaa");
        // 输快捷键 sout

        int x = 10;
        System.out.println(x);

        //nslong(@"x=%d", x);
        System.out.println("x的值为" + x);

        // 一个数字会被编译器默认为int形,我们可以在数字后添加大写的L来告诉编译器此数字是long型
        // 如果一个数值太大 在后面加"l" (推荐大写) 表示长整形
        long y = 123213231231232113L;

        // 很小的数可以直接给byte
        byte a = 127;

        a = (byte) (a + 2);

        System.out.println(a);

        // 10.5这种带小数的数字, 编译器会认为是double类
        float z = 10.5f;
        double s = 10.5;

        char d  = 'a';

        boolean e = true;

        if (x != 0)
        {

        }

        if ((x + y) > 10)
        {
            System.out.println(x);
        } else  {
            System.out.println("X不大于10");
        }




    }



}
