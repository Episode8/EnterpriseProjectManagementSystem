package domain;

import java.sql.Date;

public class SmallGroup {

    private int id;
    private String group_name;
    private String task_info;
    private String task_dif;
    private Date task_deadline;
    private String contractor_num;
    private int engineering_id;
    private int sg_completion;





    public void setSg_completion(int sg_completion) {
        this.sg_completion = sg_completion;
    }

    public int getSg_completion() {
        return sg_completion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
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

    public void setContractor_num(String contractor_num) {
        this.contractor_num = contractor_num;
    }

    public void setEngineering_id(int engineering_id) {
        this.engineering_id = engineering_id;
    }

    public int getId() {
        return id;
    }

    public String getGroup_name() {
        return group_name;
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

    public String getContractor_num() {
        return contractor_num;
    }

    public int getEngineering_id() {
        return engineering_id;
    }

    @Override
    public String toString() {
        return "SmallGroup{" +
                "id=" + id +
                ", group_name='" + group_name + '\'' +
                ", task_info='" + task_info + '\'' +
                ", task_dif='" + task_dif + '\'' +
                ", task_deadline=" + task_deadline +
                ", contractor_num='" + contractor_num + '\'' +
                ", engineering_id=" + engineering_id +
                ", sg_completion=" + sg_completion +
                '}';
    }
}
