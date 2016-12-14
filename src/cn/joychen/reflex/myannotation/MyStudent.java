package cn.joychen.reflex.myannotation;

import cn.joychen.reflex.myannotation.annotations.NoDBColumn;

/**
 * Created by joychen on 2016/12/13.
 * 1.0.0版本
 */
public class MyStudent {


    @NoDBColumn
    private String name;

    private String funcName;

    private boolean defaultDBValue;


}
