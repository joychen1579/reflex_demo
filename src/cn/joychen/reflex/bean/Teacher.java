package cn.joychen.reflex.bean;

import cn.joychen.reflex.imlp.Driveimep;

/**
 * Created by apple on 2016/12/8.
 */
public class  Teacher extends Person implements Driveimep {

    private int jobType;    //老师类型
    private String jobName;    //工作名称
    private boolean isCanDrive;  //是否会开车
    private boolean isCanMoto;  //是否会开摩托

    public static boolean isHoliday;

    public Teacher() {
    }

    public Teacher(int id, String name) {
        super(id, name);
    }

    public int getJobType() {
        return jobType;
    }

    public void setJobType(int jobType) {
        this.jobType = jobType;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public boolean isCanDrive() {
        return isCanDrive;
    }

    public void setCanDrive(boolean canDrive) {
        isCanDrive = canDrive;
    }

    public boolean isCanMoto() {
        return isCanMoto;
    }

    public void setCanMoto(boolean canMoto) {
        isCanMoto = canMoto;
    }

    @Override
    public void driveCar() {
        if (isCanDrive) {
            System.out.println(getName() + getJobName() + "在开车。");
        } else {
            System.out.println(getName() + getJobName() + "不会开车。");
        }
    }

    @Override
    public void driveMoto() {
        if (isCanMoto) {
            System.out.println(getName() + getJobName() + "开摩托。");
        } else {
            System.out.println(getName() + getJobName() + "不会开摩托。");
        }
    }

    public void isHoliday() {
        if (isHoliday) {
            System.out.println(getName() + "老师放假了。");
        } else {
            System.out.println(getName() + "老师没放假。");
        }
    }
}
