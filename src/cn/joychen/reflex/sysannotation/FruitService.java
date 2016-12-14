package cn.joychen.reflex.sysannotation;


import java.util.List;
import java.util.ArrayList;

/**
 * Created by joychen on 2016/12/13.
 * 1.0.0版本
 */
public class FruitService {

    @SuppressWarnings(value={ "rawtypes", "unchecked" })
    public static List<Fruit> getFruitList(){
        List<Fruit> fruitList=new ArrayList();
        return fruitList;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static  List<Fruit> getFruit(){
        List<Fruit> fruitList=new ArrayList();
        return fruitList;
    }


}
