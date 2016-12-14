package cn.joychen.reflex.bean;

import cn.joychen.reflex.annotataintable.Column;
import cn.joychen.reflex.annotataintable.Table;

/**
 * Created by joychen on 2016/12/14.
 * 1.0.0版本
 */
@Table(name = "Student")
public class TableBean {

    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    public TableBean() {
    }

    public TableBean(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
