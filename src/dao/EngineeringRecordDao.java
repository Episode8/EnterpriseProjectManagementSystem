package dao;

import domain.EngineeringRecord;

import java.util.List;

/**
 * @author LONG
 * 施工队记录
 */
public interface EngineeringRecordDao {
    public boolean engineeringRecord(int eid,String record);
    public List<EngineeringRecord> findER(int eid);
    public boolean deER(int rid);
    public boolean deAER(int eid);
}
