package cn.joychen.reflex.bean;

/**
 * Created by apple on 2016/12/8.
 */
public class Person {
    public int id;
    public String name;
    private int age;     //
    public int gender;  //0:女  1:男

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private Person(int id, String name, int age, int gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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


    @Override
    public String toString() {
        return "id=" + id +
                ",name=" + name +
                ",age=" + age +
                ",gender=" + gender;
    }
}
