package dao.imp;


import dao.EngineeringRecordDao;
import domain.EngineeringRecord;
import utils.BeanListHandler;
import utils.CRUDUtil;

import java.util.List;

public class EngineeringRecordDaoImp implements EngineeringRecordDao {
    @Override
    public boolean engineeringRecord(int eid, String record) {
        String sql = "insert into engineering_record(eid,record) values(?,?)";
        int i = CRUDUtil.executeUpdate(sql,eid, record);
        if(i>0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<EngineeringRecord> findER(int eid) {
        String sql="select * from engineering_record where eid=?";
        List<EngineeringRecord> engineeringRecords = CRUDUtil.executeQuery(sql, new BeanListHandler<>(EngineeringRecord.class), eid);
        return engineeringRecords;
    }

    @Override
    public boolean deER(int rid) {
        String sql="delete from engineering_record where id=?";
        int i = CRUDUtil.executeUpdate(sql, rid);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean deAER(int eid) {
        String sql = "delete from engineering_record where eid=?";
        int i = CRUDUtil.executeUpdate(sql, eid);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }
}
