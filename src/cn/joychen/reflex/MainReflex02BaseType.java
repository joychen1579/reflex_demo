package cn.joychen.reflex;

/**
 * Created by joychen on 2016/12/8.
 */
public class MainReflex02BaseType {
    ///jdk 内置的9大内置实例和数组的Class
    ///数有的数据类型都不class属性
    ///

    public static void main(String[] args) {


        Class voidClazz = void.class;
        System.out.println("voidClazz=" + voidClazz);
        Class strClazz = String.class;
        System.out.println("strClazz=" + strClazz);
        Class intClazz = int.class;
        System.out.println("intClazz=" + intClazz);
        Class doubleClazz = double.class;
        System.out.println("doubleClazz=" + doubleClazz);
        Class floatClazz = float.class;
        System.out.println("floatClazz=" + floatClazz);
        Class longClazz = long.class;
        System.out.println("longClazz=" + longClazz);
        Class booleClazz = boolean.class;
        System.out.println("booleClazz=" + booleClazz);
        Class charClazz = char.class;
        System.out.println("charClazz=" + charClazz);
        Class shortClazz = short.class;
        System.out.println("shortClazz=" + shortClazz);

        //泛型不可以为基本数据类弄如果要写，就应该写包装类
        System.out.println("\n\n泛型不可以为基本数据类弄如果要写，就应该写包装类");

        Class<Void> voidClazz1 = void.class;
        System.out.println("voidClazz1=" + voidClazz1);
        Class<String> strClazz1 = String.class;
        System.out.println("strClazz1=" + strClazz1);
        Class<Integer> intClazz1 = int.class;
        System.out.println("intClazz1=" + intClazz1);
        Class<Double> doubleClazz1 = double.class;
        System.out.println("doubleClazz1=" + doubleClazz1);
        Class<Float> floatClazz1 = float.class;
        System.out.println("floatClazz1=" + floatClazz1);
        Class<Long> longClazz1 = long.class;
        System.out.println("longClazz1=" + longClazz1);
        Class<Boolean> booleClazz1 = boolean.class;
        System.out.println("booleClazz1=" + booleClazz1);
        Class<Character> charClazz1 = char.class;
        System.out.println("charClazz1=" + charClazz1);
        Class<Short> shortClazz1 = short.class;
        System.out.println("shortClazz1=" + shortClazz1);

        System.out.println("\n\n包装类的数据类型");

        //包装类的数据类型
        Class<Void> voidClazz3 = Void.class;
        System.out.println("voidClazz3=" + voidClazz3);
        Class<String> strClazz3 = String.class;
        System.out.println("strClazz3=" + strClazz3);
        Class<Integer> intClazz3 = Integer.class;
        System.out.println("intClazz3=" + intClazz3);
        Class<Double> doubleClazz3 = Double.class;
        System.out.println("doubleClazz3=" + doubleClazz3);
        Class<Float> floatClazz3 = Float.class;
        System.out.println("floatClazz3=" + floatClazz3);
        Class<Long> longClazz3 = Long.class;
        System.out.println("longClazz3=" + longClazz3);
        Class<Boolean> booleClazz3 = Boolean.class;
        System.out.println("booleClazz3=" + booleClazz3);
        Class<Character> charClazz3 = Character.class;
        System.out.println("charClazz3=" + charClazz3);
        Class<Short> shortClazz3 = Short.class;
        System.out.println("shortClazz3=" + shortClazz3);

        System.out.println("\n\n看一下包装类型与原生数据类型是否相等");


        ///看一下包装类型与原生数据类型是否相等
        System.out.println("void:" + (voidClazz == voidClazz3));
        System.out.println("String:" + (strClazz == strClazz3));
        System.out.println("Integer:" + (intClazz == intClazz3));
        System.out.println("Double:" + (doubleClazz == doubleClazz3));
        System.out.println("Float:" + (floatClazz == floatClazz3));
        System.out.println("Long:" + (longClazz == longClazz3));
        System.out.println("Boolean:" + (booleClazz == booleClazz3));
        System.out.println("Character:" + (charClazz == charClazz3));
        System.out.println("Short:" + (shortClazz == shortClazz3));

        ///
        System.out.println("\n\n看一下包装类型中的TYPE属性是否与原生类型相等");

        System.out.println("void:" + (void.class == Void.TYPE));
        System.out.println("String:" + (String.class == String.class));
        System.out.println("Integer:" + (int.class == Integer.TYPE));
        System.out.println("Double:" + (double.class == Double.TYPE));
        System.out.println("Float:" + (float.class == Float.TYPE));
        System.out.println("Long:" + (long.class == Long.TYPE));
        System.out.println("Boolean:" + (boolean.class == Boolean.TYPE));
        System.out.println("Character:" + (char.class == Character.TYPE));
        System.out.println("Short:" + (short.class == Short.TYPE));


    }
}
