package domain;

import java.sql.Timestamp;

public class DeRecord {
    private int id;
    private Timestamp time;
    private String record;

    public int getId() {
        return id;
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

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public void setRecord(String record) {
        this.record = record;
    }
}
