package dao.imp;

import dao.DeRecordDao;
import domain.DeRecord;
import utils.BeanListHandler;
import utils.CRUDUtil;

import java.util.List;

public class DeRecordDaoImp implements DeRecordDao {
    @Override
    public boolean deRecord(String record) {
        String sql = "insert into derecord(record) values(?)";
        int i = CRUDUtil.executeUpdate(sql, record);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<DeRecord> AllDeRecord() {
        String sql = "select * from derecord";
        List<DeRecord> deRecords = CRUDUtil.executeQuery(sql, new BeanListHandler<>(DeRecord.class));
        return deRecords;
    }
}
