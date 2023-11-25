package dao;

import domain.Worker;
import domain.WorkerTask;
import javafx.concurrent.Task;

import java.util.List;

/**
 * @author LONG
 * 任务表的操作
 */
public interface TaskDao {

    public WorkerTask findTask(String number);
    public boolean taskComplete(String number);
    public boolean upTask(String number,String task,int gid);
    public boolean deTask(String number);
    public List<WorkerTask> allTask();
}
