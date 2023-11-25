package dao.imp;


import dao.SmallRecordDao;
import domain.SmallRecord;
import utils.BeanListHandler;
import utils.CRUDUtil;

import java.util.List;

/**
 * @author LONG
 */
public class SmallRecordDaoImp implements SmallRecordDao{
    @Override
    /**记录小组信息*/
    public boolean smallRecord(int sid, String record) {
        String sql = "insert into small_record(sid,record) values(?,?)";
        int i = CRUDUtil.executeUpdate(sql, sid, record);
        if(i>0){
            return true;
        }else{
            return false;
        }
    }

    /**获取小组记录根据小组id*/
    @Override
    public List<SmallRecord> findSmallRecord(int sid) {
        String sql = "select * from small_record where sid =?";
        List<SmallRecord> smallRecords = CRUDUtil.executeQuery(sql, new BeanListHandler<>(SmallRecord.class), sid);
        return smallRecords;
    }

    /**删除id对应的记录*/
    @Override
    public boolean deSR(int id) {
        String sql = "delete from small_record where id=?";
        int i = CRUDUtil.executeUpdate(sql, id);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }


    @Override
    public boolean deASR(int sid) {
        String sql = "delete from small_record where sid=?";
        int i = CRUDUtil.executeUpdate(sql, sid);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }
}
