package dao;

import domain.SmallRecord;

import java.util.List;

/**
 * @author LONG
 */
public interface SmallRecordDao {
    public boolean smallRecord(int sid,String record);
    public List<SmallRecord> findSmallRecord(int sid);
    public boolean deSR(int id);
    public boolean deASR(int sid);
}
