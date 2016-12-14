package cn.joychen.reflex.bean;

/**
 * Created by apple on 2016/12/8.
 */
public class Student extends Person {

    private int grade;  //年级   1:小学一级年级。2：小学二年级3：小学三年级。4：小学四年级。5：小学五年级。6：小学六年级。7：初中一年级。8：初中二年级 9：初中三年级 。。。
    private Course[] courses;  //参加的课程
    private int cor [];

    public Student() {
    }

    public Student(int id, String name) {
        super(id, name);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Course[] getCourses() {
        return courses;
    }


    private void doHomeWork() {
        System.out.println(getName() + "做作业");
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public int[] getCor() {
        return cor;
    }

    public void setCor(int... cor) {
        this.cor = cor;
    }

    private void printColor(){
        for (int c:cor){
            System.out.print(c+",");
        }
    }

    //所有学生都有睡觉功能所以定成静态方法
    public static void doSleep(){
        System.out.println("睡觉功能！");
    }
}
