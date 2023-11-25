package dao.imp;

import dao.EngineeringGroupDao;
import domain.EngineeringGroup;
import utils.BeanListHandler;
import utils.CRUDUtil;

import java.util.List;

public class EngineeringGroupDaoImp implements EngineeringGroupDao {
    @Override
    /**项目经理找对应的工程组*/
    public List<EngineeringGroup> findGroupId3(String number) {
        String sql ="select * from engineering_group where manager_num=?";
        List<EngineeringGroup> engineeringGroups = CRUDUtil.executeQuery(sql, new BeanListHandler<>(EngineeringGroup.class), number);
        return engineeringGroups;
    }

    @Override
    /**总负责人找工程组*/
    public List<EngineeringGroup> findGroupId4(String number) {
        String sql = "select * from engineering_group where leader_num=?";
        List<EngineeringGroup> engineeringGroups = CRUDUtil.executeQuery(sql, new BeanListHandler<>(EngineeringGroup.class),number);
        return engineeringGroups;
    }

    /**创建工程队*/
    @Override
    public boolean createEG(EngineeringGroup eg) {
        String sql ="insert into engineering_group(id,group_name,task_info,task_dif,task_deadline,manager_num,leader_num) values(?,?,?,?,?,?,?)";
        int i = CRUDUtil.executeUpdate(sql, eg.getId(), eg.getGroup_name(), eg.getTask_info(), eg.getTask_dif(), eg.getTask_deadline(), eg.getManager_num(),eg.getLeader_num());
        if(i>0){
            return true;
        }else {
            return false;
        }

    }

    /**修改信息*/
    @Override
    public boolean updateEG(EngineeringGroup eg) {
        String sql = "update engineering_group set group_name=?,task_info=?,task_dif=?,task_deadline=? where id=?";
        int i = CRUDUtil.executeUpdate(sql, eg.getGroup_name(), eg.getTask_info(), eg.getTask_dif(), eg.getTask_deadline(),eg.getId());
        if(i>0){
            return true;
        }else {
            return false;
        }

    }

    /**修改施工经理*/
    @Override
    public boolean updateManager(int eid, String number) {
        String sql="update engineering_group set manager_num=? where id=?";
        int i = CRUDUtil.executeUpdate(sql, number, eid);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

    /**完成工程队任务*/
    @Override
    public boolean completeET(int eid) {
        String sql ="update engineering_group set eg_completion=1 where id =?";
        int i = CRUDUtil.executeUpdate(sql, eid);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

    /**删除数据工程队*/
    @Override
    public boolean deleteEG(int eid) {
        String sql = "delete from engineering_group where id = ?";
        int i = CRUDUtil.executeUpdate(sql, eid);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }


}
