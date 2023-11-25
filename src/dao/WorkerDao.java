package dao;

import domain.SmallGroup;
import domain.Worker;

import java.util.List;

/**
 * @author LONG
 * 操作work表
 */
public interface WorkerDao {
    public boolean findNumber(String number);
    public boolean saveWokerInfo(Worker worker);
    public Worker workerLogin(Worker worker);
    public Worker loadW(String number);
    public List<Worker> findAW();
    public List<Worker> searchW(String sinfo);
   public boolean isNoJob(String number,int pid);
   public boolean givingJob(String number,int having);
   public boolean updateInfo(Worker worker);
   public boolean upPo(String number,int po);
   public boolean isNoJob(String number);
   public boolean isPo(String number,int po);
}
