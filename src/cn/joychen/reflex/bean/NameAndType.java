package cn.joychen.reflex.bean;

/**
 * Created by joychen on 2016/12/14.
 * 1.0.0版本
 */
public class NameAndType {

    private String type;
    private String name;

    public NameAndType() {
    }

    public NameAndType(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
