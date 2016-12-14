package cn.joychen.reflex;

import cn.joychen.reflex.bean.Teacher;

import java.lang.reflect.Field;

/**
 * Created by joychen on 2016/12/9.
 * 1.0.0版本
 * 反射获取成员变量
 */
public class MainReflex06Field {


    /**
     * 获取字段
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {

        Class clazz = Teacher.class;

        //获取所有的公共字段
        System.out.println("\n\n\n获取所有的公共字段");
        Field[] fs = clazz.getFields();
        for (Field f : fs) {
            System.out.println("f=" + f);
        }

        //获取所有的字段,不包含继承的
        System.out.println("\n\n\n获取所有的字段,不包含继承的");
        Field[] fs2 = clazz.getDeclaredFields();
        for (Field f : fs2) {
            System.out.println("f=" + f);
        }


        Teacher teacher = new Teacher(1, "SX");


        //获取单个公共字段
        System.out.println("\n\n\n获取单个公共字段");
        Field f1 = clazz.getField("name");
        System.out.println("f1=" + f1);
        System.out.println("teacher.name=" + f1.get(teacher));

        //获取单个私有字段
        System.out.println("\n\n\n获取单个私有字段,并调用");
        Field f2 = clazz.getDeclaredField("isCanDrive");
        System.out.println("f2=" + f2);
        teacher.driveCar();
        f2.setAccessible(true);  //允许设置值
        f2.set(teacher, true);  //设置值
        teacher.driveCar();

        //调用静态的字段
        System.out.println("\n\n\n调用静态的字段");
        Field f3 = clazz.getDeclaredField("isHoliday");
        System.out.println("f3=" + f3);
        teacher.isHoliday();
        f3.set(null,true);  //设置值
        teacher.isHoliday();

        //调用个字符串
        System.out.println("\n\n\n调用个字符串");
        Field f4 = clazz.getDeclaredField("jobName");
        System.out.println("f4=" + f4);
        teacher.isHoliday();
        f4.setAccessible(true);
        f4.set(teacher,"语文老师");  //设置值
        System.out.println("f4="+f4.get(teacher));

    }
}
