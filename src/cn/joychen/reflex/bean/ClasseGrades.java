package cn.joychen.reflex.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by joychen on 2016/12/10.
 * 1.0.0版本
 * 班级类
 */
public class ClasseGrades {
    private int classId;   //班级id
    private String className;   //班级名称

    public Map<Integer, Student> menberStudent = new HashMap<Integer, Student>();


    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Map<Integer, Student> getMenberStudent() {
        return menberStudent;
    }

    public void setMenberStudent(Map<Integer, Student> menberStudent) {
        this.menberStudent = menberStudent;
    }
}
