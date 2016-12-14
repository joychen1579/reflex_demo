package cn.joychen.reflex;

import cn.joychen.reflex.bean.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by joychen on 2016/12/9.
 * 获取构造器
 */
public class MainReflex04Constructor {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Person> calzz = Person.class;

        //获取公共的构造器
        System.out.println("\n\n\n获取公共的构造器");
        Constructor[] cs = calzz.getConstructors();

        for (Constructor c : cs) {
            System.out.println("c=" + c);
        }

        //获取全部的构造器
        System.out.println("\n\n\n获取全部的构造器");
        Constructor[] pcs = calzz.getDeclaredConstructors();

        for (Constructor c : pcs) {
            System.out.println("c=" + c);
        }

        //用构造器生成类实例
        System.out.println("\n\n\n用构造器生成类实例");
        Constructor c1 =  calzz.getConstructor();
        Person p = (Person) c1.newInstance();
        p.setName("aa");
        System.out.println(p.getName());

        //调用私有的构造器生成类实例
        System.out.println("\n\n\n调用私有的构造器生成类实例");
        Constructor<Person> c2 = calzz.getDeclaredConstructor(int.class,String.class,int.class,int.class);
        c2.setAccessible(true);
        Person p2 = c2.newInstance(1,"1",32,1);
        System.out.println(p2);

    }
}
