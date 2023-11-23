package domain;

/**
 * @author LONG
 */
public class WorkerTask {
    /**小工number*/
    private String number;
    /**任务所属小组*/
    private int group_id;
    /**具体任务*/
    private String task;
    /**任务完成情况  0：未完成，1：完成*/
    private int task_completion;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setTask_completion(int task_completion) {
        this.task_completion = task_completion;
    }

    public String getNumber() {
        return number;
    }

    public int getGroup_id() {
        return group_id;
    }

    public String getTask() {
        return task;
    }

    public int getTask_completion() {
        return task_completion;
    }

}
