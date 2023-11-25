package dao;

import domain.SmallGroup;
import domain.Worker;

import java.util.List;

public interface SmallGroupDao {
   public  List<SmallGroup> findGroup1(String number);//小工组
   public  List<SmallGroup> findGroup2(String number);//包工头找组
   public  List<SmallGroup> findGroup3(String number);//经理找组
   public  List<SmallGroup> findFGroup4(String number);
   public  List<Worker> findGWoker(int gid);
   public  boolean createG(SmallGroup s);
   public boolean upI(SmallGroup s);
   public boolean upCon(SmallGroup s);
   public boolean deG(int gid);
   public List<SmallGroup> findGroupOfE(int eid);
   public boolean completeT(int gid);
}
