package domain;


import java.sql.Date;

public class Worker {
        /**职工号*/
    private String number;
    /**姓名*/
    private String name;
    /**密码*/
    private String password;
    /**性别（0：女，1：男*/
    private Integer gender;
    /**入职日期*/
    private Date hiredate;
    /**电话号码*/
    private String phone_number;
    /**职位id*/
    private Integer position_id;
    /**组别id*/

    /**头像*/
    private String portrait;

    /**任务*/
    private String task;
    /**任务完成情况*/
    private int task_completion;
    /**有无工作*/
    private int havingjob;



    public void setHavingjob(int havingjob) {
        this.havingjob = havingjob;
    }

    public int getHavingjob() {
        return havingjob;
    }


    public void setTask_completion(int task_completion) {
        this.task_completion = task_completion;
    }

    public int getTask_completion() {
        return task_completion;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setPosition_id(Integer position_id) {
        this.position_id = position_id;
    }


    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Integer getGender() {
        return gender;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public Integer getPosition_id() {
        return position_id;
    }


    public String getPortrait() {
        return portrait;
    }
}
