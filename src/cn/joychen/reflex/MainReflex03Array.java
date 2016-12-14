package cn.joychen.reflex;

/**
 * Created by joychen on 2016/12/9.
 */
public class MainReflex03Array {

    //所有具有相同元素类型 和维数的数组才共享同一份字节码(Class对象)
    //注意：和数组中的元素没有一眯关系

    public static void main(String[] args) {
        String[] sArr1 = {"A", "B"};
        String[] sArr2 = {};
        String[][][] sArr3 = {};
        int[] iArr1 = {};

        System.out.println(String[].class == sArr2.getClass());

        System.out.println(String[][][].class == sArr3.getClass());


    }
}
