package dao.imp;

import dao.WorkerDao;
import domain.SmallGroup;
import domain.Worker;
import utils.BeanHandler;
import utils.BeanListHandler;
import utils.CRUDUtil;
import utils.JdbcUtil;
import domain.WorkerUtil;

import java.sql.*;
import java.util.List;

public class WorkerDaoImp implements WorkerDao {
    //查找是否有职工号
    @Override
    public boolean findNumber(String number) {

        String sql = "select * from worker where number = ?";
        Worker worker = CRUDUtil.executeQuery(sql, new BeanHandler<>(Worker.class), number);
        if(worker!=null){
            return true;
        }else {
            return false;
        }

    }

    /**存储员工信息方法*/
    @Override
    public boolean saveWokerInfo(Worker worker) {

        //编写sql 职工号，姓名，性别，入职日期，电话号码,职位，密码
        String sql = "insert into worker(number,name,gender,hiredate,phone_number,position_id,password) values(?,?,?,?,?,?,?)";
        int i = CRUDUtil.executeUpdate(sql,worker.getNumber(),worker.getName(),worker.getGender(),worker.getHiredate(),worker.getPhone_number(),worker.getPosition_id(),worker.getPassword());


        if(i>0){
            return true;
        }else{
            ;
            return false;
        }

    }

    /**登录方法，成功返回worker对象，失败返回null*/
    @Override
    public Worker workerLogin(Worker worker) {

            String sql = "select * from worker where number = ? and  password = ?";
            Worker worker1 = CRUDUtil.executeQuery(sql,new BeanHandler<>(Worker.class) ,worker.getNumber(), worker.getPassword());

            return worker1;


    }

    /**加载员工信息的方法*/
    @Override
    public Worker loadW(String number) {
        String sql = "select * from worker where number = ?";
        Worker worker1 = CRUDUtil.executeQuery(sql, new BeanHandler<>(Worker.class), number);
        return worker1;
    }

    /**找到所有员工*/
    @Override
    public List<Worker> findAW() {
        String sql = "select * from worker";
        List<Worker> workers = CRUDUtil.executeQuery(sql, new BeanListHandler<>(Worker.class));
        return workers;
    }

    /**搜索员工*/
    @Override
    public List<Worker> searchW(String sinfo) {
        String sql = "select * from worker where number like ? or name like ?";
        String si = "%"+sinfo+"%";
        List<Worker> workers = CRUDUtil.executeQuery(sql, new BeanListHandler<>(Worker.class), si, si);
        return workers;
    }

    /**是否是对应职位且空闲*/
    @Override
    public boolean isNoJob(String number,int pid) {
        String sql = "select * from worker where number =?&& position_id=? && havingjob=0";
        Worker worker = CRUDUtil.executeQuery(sql, new BeanHandler<>(Worker.class),number,pid);
        if(worker!=null){
            return true;
        }else {
            return false;
        }
    }

    /**改任务情况，第参数传修改情况*/
    @Override
    public boolean givingJob(String number,int having) {
        String sql = "update worker set havingjob=? where number=?";
        int i = CRUDUtil.executeUpdate(sql,having,number);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

    /**修改信息*/
    @Override
    public boolean updateInfo(Worker worker) {
        String sql="update worker set name=?,gender=?,hiredate=?,phone_number=?,password=? where number=?";
        int i = CRUDUtil.executeUpdate(sql, worker.getName(), worker.getGender(), worker.getHiredate(),worker.getPhone_number(), worker.getPassword(), worker.getNumber());
        if(i>0){
            return true;
        }else {
            return false;
        }

    }

    /**修改职位*/
    @Override
    public boolean upPo(String number, int po) {
        String sql = "update worker set position_id=? where number=?";
        int i = CRUDUtil.executeUpdate(sql, po, number);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

    /**判断职工是否无工作*/
    @Override
    public boolean isNoJob(String number) {
        String sql = "select * from worker where number =? && havingjob=0";
        Worker worker = CRUDUtil.executeQuery(sql, new BeanHandler<>(Worker.class),number);
        if(worker!=null){
            return true;
        }else {
            return false;
        }
    }

    /**判断职工是否是对应职位*/
    @Override
    public boolean isPo(String number, int po) {
        String sql ="select * from worker where number=? and position_id=?";
        Worker worker = CRUDUtil.executeQuery(sql, new BeanHandler<>(Worker.class), number, po);
        if(worker!=null){
            return true;
        }else {
            return false;
        }
    }


}
