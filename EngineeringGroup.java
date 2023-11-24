package domain;

import java.sql.Date;

/**
 * @author LONG
 * 工程队对象
 */
public class EngineeringGroup {
    private int id;
    private String group_name;
    private String task_info;
    private String task_dif;
    private Date task_deadline;
    private String manager_num;
    private String leader_num;

    public void setLeader_num(String leader_num) {
        this.leader_num = leader_num;
    }

    public String getLeader_num() {
        return leader_num;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getGroup_name() {
        return group_name;
    }

    private int eg_completion;



    public void setId(int id) {
        this.id = id;
    }



    public void setTask_info(String task_info) {
        this.task_info = task_info;
    }

    public void setTask_dif(String task_dif) {
        this.task_dif = task_dif;
    }

    public void setTask_deadline(Date task_deadline) {
        this.task_deadline = task_deadline;
    }

    public void setManager_num(String manager_num) {
        this.manager_num = manager_num;
    }

    public void setEg_completion(int eg_completion) {
        this.eg_completion = eg_completion;
    }

    public int getId() {
        return id;
    }



    public String getTask_info() {
        return task_info;
    }

    public String getTask_dif() {
        return task_dif;
    }

    public Date getTask_deadline() {
        return task_deadline;
    }

    public String getManager_num() {
        return manager_num;
    }

    public int getEg_completion() {
        return eg_completion;
    }
}
