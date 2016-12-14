package cn.joychen.reflex;

import cn.joychen.reflex.bean.TableBean;
import cn.joychen.reflex.util.TableUtil;

/**
 * Created by joychen on 2016/12/13.
 * 1.0.0版本
 */
public class MainReflex12Annotation3 {


    /**
     * 参考
     * http://blog.csdn.net/duo2005duo/article/details/50505884
     *
     * @param args
     */

    public static void main(String[] args) {

        //自定义注解框架  跟据实体对象生成  sql语法。
        System.out.println(TableUtil.createTable(TableBean.class));
    }


}
