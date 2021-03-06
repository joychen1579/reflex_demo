package cn.joychen.reflex.myannotation.annotations;

import java.lang.annotation.*;

/**
 * Created by joychen on 2016/12/13.
 * 1.0.0版本
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {


    /**
     * 供应商编号
     *
     * @return
     */
    public int id() default -1;


    /**
     * 供应商名称
     *
     * @return
     */
    public String name() default "";


    /**
     * 供应商地址
     *
     * @return
     */
    public String address() default "";

}
