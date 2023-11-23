package domain;

import java.sql.Time;
import java.sql.Timestamp;

/**
 * @author LONG
 * 小组记录
 */
public class SmallRecord {
    private int id;
    private int sid;
    private Timestamp time;
    private String record;

    public int getId() {
        return id;
    }

    public int getSid() {
        return sid;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public Timestamp getTime() {
        return time;
    }

    public String getRecord() {
        return record;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }



    public void setRecord(String record) {
        this.record = record;
    }
}
