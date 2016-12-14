package cn.joychen.reflex.sysannotation;

import cn.joychen.reflex.myannotation.annotations.FruitColor;
import cn.joychen.reflex.myannotation.annotations.FruitName;

/**
 * Created by joychen on 2016/12/13.
 * 1.0.0版本
 */
public class Fruit {

    @FruitName("sbssbsb")
    private String name;

    @FruitColor(fruitColor = FruitColor.Color.RED)
    private int color;  //水果颜色

    public void displayName() {
        System.out.println("水果的名字是：*****=" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }


}