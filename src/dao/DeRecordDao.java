package dao;

import domain.DeRecord;

import java.util.List;

public interface DeRecordDao {
    public boolean deRecord(String record);
    public List<DeRecord> AllDeRecord();
}
