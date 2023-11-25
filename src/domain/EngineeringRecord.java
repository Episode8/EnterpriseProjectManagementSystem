package domain;

import java.sql.Time;
import java.sql.Timestamp;

public class EngineeringRecord {
    private int id;
    private int eid;
    private Timestamp time;
    private String record;

    public int getId() {
        return id;
    }

    public int getEid() {
        return eid;
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

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public void setRecord(String record) {
        this.record = record;
    }
}
