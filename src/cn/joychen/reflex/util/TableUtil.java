package cn.joychen.reflex.util;

import cn.joychen.reflex.annotataintable.Column;
import cn.joychen.reflex.annotataintable.Table;
import cn.joychen.reflex.bean.NameAndType;

import java.util.List;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by joychen on 2016/12/14.
 * 1.0.0版本
 */
public class TableUtil {

    // 运行时获取注解并转化
//          基础API
//  AnnotatedElement代表能够被注解的元素，如方法，成员变量，方法参数，包，类都是这个接口的实现，AnnotatedElement有方法如下表：
//
//    方法名 用法
//
//    Annotation getAnnotation(Class annotationType)	获取注解在其上的annotationType
//
//    Annotation[] getAnnotations()	获取所有注解
//
//    isAnnotationPresent(Class annotationType)	判断当前元素是否被annotationType注解
//
//    Annotation[] getDeclareAnnotations()	与getAnnotations()类似，但是不包括父类中被Inherited修饰的注解
//    返回的Annotation是注解的实例，可以反射Method获取需要的值，即是获取@Column或者@Table中name的值。


    /**
     * 逐个分析Bean的成员变量是否有被@Column注解，有则获取其对应的字段名与类型
     *
     * @param bean
     * @return
     */
    private static String getTableName(Class<?> bean) {
        String name = null;
        //判断是否有Table注解
        if (bean.isAnnotationPresent(Table.class)) {
            //获取注解对象
            Table table = bean.getAnnotation(Table.class);
            name = table.name();
        }
        return name;
    }


    /**
     * 逐个分析Bean的成员变量是否有被@Column注解，有则获取其对应的字段名与类型
     *
     * @param bean
     * @return
     */
    private static List<NameAndType> getColumns(Class<?> bean) {
        List<NameAndType> columns = new ArrayList<NameAndType>();
        Field[] fields = bean.getDeclaredFields();
        if (fields != null) {
            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                if (field.isAnnotationPresent(Column.class)) {
                    Column co = field.getAnnotation(Column.class);
                    String name = co.name();

                    //生成sql字段类型
                    String type = null;
                    if (int.class.isAssignableFrom(field.getType())) {
                        type = "integer";

                    } else if (String.class.isAssignableFrom(field.getType())) {
                        type = "text";
                    } else {
                        throw new RuntimeException("unspoorted type=" + field.getType().getSimpleName());
                    }

                    columns.add(new NameAndType(name, type));
                }
            }
        }

        return columns;

    }


    /**
     * 生成sql表语句比较简单，主要是把前两部份获取的表名与字段结合起来组合成sql语句
     *
     * @param bean
     * @return
     */
    public static String createTable(Class<?> bean) {
        String tableName = getTableName(bean);
        List<NameAndType> columns = getColumns(bean);
        if (tableName != null && !tableName.equals("") && !columns.isEmpty()) {
            StringBuilder createTableSql = new StringBuilder("create table ");
            //加表名
            createTableSql.append(tableName);
            createTableSql.append("(");

            //加表中字段
            for (int i = 0; i < columns.size(); i++) {
                NameAndType column = columns.get(i);
                createTableSql.append(column.getName());
                createTableSql.append(" ");
                createTableSql.append(column.getType());
                // 追加下一个字段定义前需要添加逗号
                if (i != columns.size() - 1) {
                    createTableSql.append(",");
                }
            }
            createTableSql.append(")");
            return createTableSql.toString();
        }

        return null;
    }


}
