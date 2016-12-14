package cn.joychen.reflex;


import cn.joychen.reflex.bean.ClasseGrades;

import java.lang.reflect.*;
import java.util.Date;
import java.util.List;
import java.util.Arrays;

/**
 * Created by joychen on 2016/12/10.
 * 1.0.0版本
 * 反射调用泛型
 */
public class MainReflex08Genericity {

    /**
     * 反射调用泛型
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Class clz = Arrays.class;

        System.out.println("\n\n\n例子1泛型传值调用");

        Method method[] = clz.getMethods();
        for (Method m : method) {
            System.out.println("m=" + m);
        }

        Method m = clz.getMethod("asList", Object[].class);
        System.out.println("m=" + m.getName());
        //
        List s = (List) m.invoke(null, new Object[]{new Object[]{"A,B,C"}});

        System.out.println(s.toString());

        System.out.println("\n\n\n例子2打印泛型信息");

        Class clazz = ClasseGrades.class;
        Field f = clazz.getField("menberStudent");
        Class ftype = f.getType();
        System.out.println("ftype=" + ftype);

        Type ftype2 = f.getGenericType();
        System.out.println("ftype2=" + ftype2);

        ParameterizedType ftypePara = (ParameterizedType) ftype2;
        Type[] types = ftypePara.getActualTypeArguments();
        System.out.println("types[0]=" + types[0]);
        System.out.println("types[1]=" + types[1]);

        System.out.println("\n\n\n例子3泛型反射创建对象");

        Date date = createInstance("java.util.Date", Date.class);
        System.out.println("time=" + date.toLocaleString());


    }

    //通用类型实例化
    public static <T> T createInstance(String className, Class<T> type) {
        try {
            Class<T> clz = (Class<T>) Class.forName(className);
            Object ob = clz.newInstance();
            if (type.isInstance(ob)) {
                return (T) ob;
            }else{
                throw new IllegalArgumentException("对象和类型不兼容");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
