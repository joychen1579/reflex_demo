package cn.joychen.reflex;

import cn.joychen.reflex.bean.Student;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by joychen on 2016/12/9.
 */
public class MainReflex05Method {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class clazz = Student.class;

        //获取所有公共方法，包含继承的
        System.out.println("\n\n\n获取所有公共方法，包含继承的");
        Method[] m1 = clazz.getMethods();
        for (Method m : m1) {
            System.out.println("m=" + m);
        }
        //获取所有方法，不包含继承的
        System.out.println("\n\n\n获取所有方法，不包含继承的");
        Method[] m2 = clazz.getDeclaredMethods();
        for (Method m : m2) {
            System.out.println("m=" + m);
        }


        Student student = new Student(1, "aa");

        System.out.println("\n\n\n调用无参函数");
        //调用无参函数
        Method m = clazz.getMethod("getName");
        System.out.println("m=" + m);
        String name = (String) m.invoke(student);
        System.out.println(name);

        //调用有参函数
        System.out.println("\n\n\n调用有参函数");

        Method m3 = clazz.getMethod("setName", String.class);
        System.out.println("m3=" + m3);
        m3.invoke(student, "sb");
        System.out.println(student.getName());

        //调用参数是数组的方法  在调用的的时候 传的参数先用Object数组包装起来， 其它的参数也可以用Object 来包装起来
        System.out.println("\n\n\n调用参数是数组的方法");
        Method m4 = clazz.getDeclaredMethod("setCor", int[].class);
        System.out.println("m4=" + m4);
        m4.invoke(student, new Object[]{new int[]{1, 2, 3, 4,89}});
        //打印传入的数组
        Method m5 = clazz.getDeclaredMethod("printColor");
        m5.setAccessible(true);
        m5.invoke(student);

        //调用静态方法  前面对象可以传空
        System.out.println("\n\n\n调用静态方法");
        Method m6 = clazz.getDeclaredMethod("doSleep");
        m6.invoke(null);

    }
}
