package dao.imp;

import dao.SmallGroupDao;
import domain.SmallGroup;
import domain.Worker;
import utils.BeanHandler;
import utils.BeanListHandler;
import utils.CRUDUtil;

import java.util.List;

public class SmallGroupDaoImp implements SmallGroupDao {
    @Override
    /**小工找小组*/
    public List<SmallGroup> findGroup1(String number) {
        String sql="SELECT sg.* FROM small_group AS sg LEFT  OUTER JOIN worker_task AS wt ON sg.id=wt.group_id where wt.number=?";
        List<SmallGroup> smallGroups = CRUDUtil.executeQuery(sql, new BeanListHandler<>(SmallGroup.class), number);
        return smallGroups;
    }

    @Override
    /**包工头找小组*/
    public List<SmallGroup> findGroup2(String number) {

        String sql = "select * from small_group where contractor_num=? ";
        List<SmallGroup> smallGroups = CRUDUtil.executeQuery(sql, new BeanListHandler<>(SmallGroup.class), number);
         return smallGroups;
    }

    @Override
    /**经理找小组*/
    public List<SmallGroup> findGroup3(String number) {
        String sql = "select sg.* from small_group as sg left outer join engineering_group as eg on sg.engineering_id=eg.id where eg.manager_num=?";
        List<SmallGroup> smallGroups = CRUDUtil.executeQuery(sql, new BeanListHandler<>(SmallGroup.class), number);
        return smallGroups;
    }

    @Override
    /**负责人按工程队找小组*/
    public List<SmallGroup> findFGroup4(String number) {
        System.out.println(number);
        String sql="SELECT sg.* FROM small_group  AS sg LEFT  OUTER JOIN engineering_group AS eg ON eg.id=sg.engineering_id WHERE eg.leader_num=?";
        List<SmallGroup> smallGroups = CRUDUtil.executeQuery(sql, new BeanListHandler<>(SmallGroup.class),number);
        return smallGroups;

    }

    @Override
    /**找小组人员*/
    public List<Worker> findGWoker(int gid) {
        String sql="select  w.*,wt.task,wt.task_completion  from worker as w LEFT  OUTER JOIN worker_task as wt on w.number=wt.number where wt.group_id=?";
        List<Worker> workers = CRUDUtil.executeQuery(sql, new BeanListHandler<>(Worker.class), gid);
        return workers;
    }

    /**创建新小组*/
    @Override
    public boolean createG(SmallGroup s) {
        String sql="insert into small_group(id,group_name,task_info,task_dif,task_deadline,contractor_num,engineering_id) values(?,?,?,?,?,?,?)";

        int i = CRUDUtil.executeUpdate(sql, s.getId(), s.getGroup_name(), s.getTask_info(), s.getTask_dif(), s.getTask_deadline(), s.getContractor_num(), s.getEngineering_id());
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

    /**修改小组信息*/
    @Override
    public boolean upI(SmallGroup s) {
        String sql="update small_group set group_name=?,task_info=?,task_dif=?,task_deadline=? where id=?";
        int i = CRUDUtil.executeUpdate(sql, s.getGroup_name(), s.getTask_info(), s.getTask_dif(), s.getTask_deadline(), s.getId());
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    /**修改小组包工头*/
    public boolean upCon(SmallGroup s) {
        String sql="update small_group set contractor_num=? where id=?";
        int i = CRUDUtil.executeUpdate(sql, s.getContractor_num(), s.getId());
        if(i>0){
            return true;
        }else{
            return false;
        }

    }

    /**删除小组*/
    @Override
    public boolean deG(int gid) {
        String sql="delete from small_group where id=?";
        int i = CRUDUtil.executeUpdate(sql, gid);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

    /**根据工程队id找对应小组*/
    @Override
    public List<SmallGroup> findGroupOfE(int eid) {
        String sql="select * from small_group where engineering_id=?";
        List<SmallGroup> smallGroups = CRUDUtil.executeQuery(sql, new BeanListHandler<>(SmallGroup.class), eid);
        return smallGroups;
    }

    /**提交对应小组任务*/
    @Override
    public boolean completeT(int gid) {
        String sql="update small_group set sg_completion=1 where id=?";
        int i = CRUDUtil.executeUpdate(sql, gid);
        if(i>0){
            return true;
        }else {
            return false;
        }

    }


}
