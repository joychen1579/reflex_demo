package cn.joychen.reflex;

import cn.joychen.reflex.sysannotation.Apple;
import cn.joychen.reflex.sysannotation.Fruit;
import cn.joychen.reflex.sysannotation.FruitService;
import cn.joychen.reflex.sysannotation.Orange;

/**
 * Created by joychen on 2016/12/13.
 * 1.0.0版本
 */
public class MainReflex10Annotation1 {


    /**
     * 根据注解参数的个数，我们可以将注解分为三类：
     　　　　1.标记注解:一个没有成员定义的Annotation类型被称为标记注解。这种Annotation类型仅使用自身的存在与否来为我们提供信息。比如后面的系统注解@Override;
     　　　　2.单值注解
     　　　　3.完整注解　　

     　　根据注解使用方法和用途，我们可以将Annotation分为三类：
     　　　　1.JDK内置系统注解
     　　　　2.元注解
     　　　　3.自定义注解
     */

    /**
     * 系统内置标准注解：
     * <p>
     * 　　注解的语法比较简单，除了@符号的使用外，他基本与Java固有的语法一致，JavaSE中内置三个标准注解，定义在java.lang中：
     * 　//　　　@Override：用于修饰此方法覆盖了父类的方法;
     * 　　//　　@Deprecated：用于修饰已经过时的方法;
     * 　　//　　@SuppressWarnnings:用于通知java编译器禁止特定的编译警告。
     * <p>
     * 　　下面我们依次看看三个内置标准注解的作用和使用场景。
     */


    public static void main(String[] args) {
        //一.验证Override

        Fruit f = new Orange();
        f.displayName();

        Fruit f2 = new Apple();  //里面有个@Override 注释了   重写的方法写错了。所以打印不了
        f2.displayName();

        //二.验证Deprecated

        Apple apple = new Apple();
        apple.displayName();

        apple.showTaste();
        apple.showTaste(0);
        apple.showTaste(2);


        //三.SuppressWarnnings，抑制编译器警告
//        @SuppressWarnings("unused")

        System.out.println(FruitService.getFruitList());
    }


}
