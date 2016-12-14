package cn.joychen.reflex.bean;

/**
 * Created by apple on 2016/12/8.
 */
public class Course {
    private int id;
    private String courseName;   //课程名称
    private int achievement;  //成绩

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAchievement() {
        return achievement;
    }

    public void setAchievement(int achievement) {
        this.achievement = achievement;
    }
}
