package cn.joychen.reflex;

import cn.joychen.reflex.bean.Person;
import cn.joychen.reflex.bean.Student;


/**
 * Created by joychen on 2016/12/8.
 */
public class MainReflex01Description {

    //Class是用于描术类的类。对一切类共同功能行为和状态的抽象。(包，父类，类名，构造函数，方法，方法参数，接口，枚举，所有修饰，成员变量，注解。。。。)
    //Class类：用于描述一切类/接口/枚举。    注解是一程接口就
    //Class实例:是指JVM中一份字节码
    //反射是得到元数据的行为
    //同一个类中一个jvm中会存在一分字解码。同一个类型所获取的字解码都是一样的。字节码在启动jvm 中后，只要第一次用过后。就会永远在内存里


    public static void main(String[] args) throws ClassNotFoundException {
        //一、获取元数据方式.也就是获取Class类 
        //-------------------------------------------
        // 例： 拿Student类为例子

        //方式一
        Class clazz = Student.class;
        System.out.println("方式一：clazz=" + clazz.getName());
        Class<Student> clazz1 = Student.class;
        System.out.println("方式一：clazz1=" + clazz1.getName());

        //方式二
        Student student = new Student();
        student.setName("张三");
        Class clazz3 = student.getClass();
        System.out.println("方式二：clazz3=" + clazz3.getName());
        Class<Student> clazz4 = (Class<Student>) student.getClass();
        System.out.println("方式二：clazz4=" + clazz4.getName());

        //方式三
        Class<Student> clazz5 = (Class<Student>) Class.forName("cn.joychen.reflex.bean.Student");
        System.out.println("方式三：clazz5=" + clazz5.getName());


        System.out.println("clazz1=clazz3:"+clazz1.equals(clazz3));
    }
}
