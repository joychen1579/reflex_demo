package cn.joychen.reflex.myannotation.annotations;

import java.lang.annotation.Inherited;

/**
 * Created by joychen on 2016/12/13.
 * 1.0.0版本
 */
@Inherited
public @interface Greeting {
    public enum FontColor {BULE, RED, GREEN}



    String name();

    FontColor fontColor() default FontColor.GREEN;


}
