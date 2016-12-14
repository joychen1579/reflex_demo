package cn.joychen.reflex;

import cn.joychen.reflex.bean.Course;
import cn.joychen.reflex.bean.Teacher;

import java.lang.reflect.Modifier;

/**
 * Created by joychen on 2016/12/10.
 * 1.0.0版本
 */
public class MainReflex07Other {


    /**
     * 反射的一些其它的函数
     *
     * @param args
     */
    public static void main(String[] args) throws NoSuchFieldException {

        //获取修饰符
        System.out.println("获取修饰符");
        System.out.println("Course=" + Modifier.toString(Course.class.getModifiers()));
        System.out.println("Teacher=" + Modifier.toString(Teacher.class.getModifiers()));
        System.out.println("获取字段修饰符");
        System.out.println("Teacher.name=" + Modifier.toString(Teacher.class.getDeclaredField("jobName").getModifiers()));
        //静态字段修饰符
        System.out.println("Teacher.isHoliday=" + Modifier.toString(Teacher.class.getDeclaredField("isHoliday").getModifiers()));

        Class clazzPer = Teacher.class;
        //反回类的全限定名
        System.out.println("反回类的全限定名="+clazzPer.getName());

        //获得类的简单名字
        System.out.println("获得类的简单名字="+clazzPer.getSimpleName());

        //获得类的父类

        System.out.println("\n\n\n获得类的父类");
        System.out.println("当前类clazzPer="+clazzPer);
        System.out.println("父类="+clazzPer.getSuperclass());
        Class []clazzInterface = clazzPer.getInterfaces();
        for (Class c :clazzInterface){
            System.out.println("父类接口="+c);
        }


        //判断该Class实例是否是数组
        Class clazzArray = int [].class;
        System.out.println("\n\n\n是否是数组");
        System.out.println("是否是数组"+clazzArray.isArray());
        System.out.println("Teacher是否是数组"+Teacher.class.isArray());

        //判断该Class实例是否是枚举
        System.out.println("\n\n\n否是枚举");
        System.out.println("否是枚举"+clazzArray.isEnum());

    }
}
