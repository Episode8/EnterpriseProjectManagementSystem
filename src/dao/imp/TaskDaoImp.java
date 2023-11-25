package dao.imp;

import dao.TaskDao;
import domain.WorkerTask;
import javafx.concurrent.Task;
import utils.BeanHandler;
import utils.BeanListHandler;
import utils.CRUDUtil;

import java.util.List;


public class TaskDaoImp implements TaskDao {
    @Override
    /**按照number来查找小工任务*/
    /**成功返回对象，不成功返回null*/
    public WorkerTask findTask(String number)  {
        String sql = "select * from worker_task where number = ?";
        WorkerTask workerTask = CRUDUtil.executeQuery(sql,new BeanHandler<>(WorkerTask.class), number);
        return workerTask;
    }

    /**将小工任务改为完成*/
    @Override
    public boolean taskComplete(String number) {
        String sql="update worker_task set task_completion = 1 where number =?";
        int i = CRUDUtil.executeUpdate(sql, number);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

    /**给小工添加任务*/
    @Override
    public boolean upTask(String number, String task,int gid) {
        String sql="insert into worker_task(number,group_id,task) values(?,?,?)";
        int i = CRUDUtil.executeUpdate(sql, number,gid,task);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean deTask(String number) {
        String sql="delete from worker_task where number =?";
        int i = CRUDUtil.executeUpdate(sql, number);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<WorkerTask> allTask() {
        String sql = "select * from worker_task";
        List<WorkerTask> tasks = CRUDUtil.executeQuery(sql, new BeanListHandler<>(WorkerTask.class));
        return tasks;
    }


}
