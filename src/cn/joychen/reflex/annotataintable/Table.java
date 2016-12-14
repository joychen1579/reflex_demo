package cn.joychen.reflex.annotataintable;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by joychen on 2016/12/14.
 * 1.0.0版本
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    String name();    //用来设置表名

}
