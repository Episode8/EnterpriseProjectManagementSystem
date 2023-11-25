package dao;

import domain.EngineeringGroup;

import java.util.List;

public interface EngineeringGroupDao {
    public List<EngineeringGroup> findGroupId3(String number);
    public List<EngineeringGroup> findGroupId4(String number);
    public boolean createEG(EngineeringGroup eg);
    public boolean updateEG(EngineeringGroup eg);
    public boolean updateManager(int eid,String number);
    public boolean completeET(int eid);
    public boolean deleteEG(int eid);
}
