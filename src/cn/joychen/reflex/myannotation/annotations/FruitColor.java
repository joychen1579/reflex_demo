package cn.joychen.reflex.myannotation.annotations;

import java.lang.annotation.*;

/**
 * Created by joychen on 2016/12/13.
 * 1.0.0版本
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {


    /**
     * 颜色枚举
     */
    public enum Color {
        BULE, RED, GREEN
    }

    Color fruitColor() default Color.GREEN;
}
