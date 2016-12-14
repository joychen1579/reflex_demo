package cn.joychen.reflex.annotataintable;

import com.sun.tools.classfile.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by joychen on 2016/12/14.
 * 1.0.0版本
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    String name();   //name 用来设置字段
}
