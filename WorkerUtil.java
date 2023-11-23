package domain;

import domain.Worker;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author LONG
 * 用来对于封装worker或封装成worker
 */
public class WorkerUtil {
    public static Worker requestToWorker(HttpServletRequest request){
        Worker worker = new Worker();
        worker.setNumber(request.getParameter("number"));
        worker.setPassword(request.getParameter("password"));
        worker.setName(request.getParameter("name"));
        if(request.getParameter("gender")!=null){
            worker.setGender(Integer.parseInt(request.getParameter("gender")));
        }
        if(request.getParameter("hiredate")!=null){
            worker.setHiredate(Date.valueOf(request.getParameter("hiredate")));
        }
        if(request.getParameter("position")!=null){
            worker.setPosition_id(Integer.parseInt(request.getParameter("position")));
        }
        worker.setPhone_number(request.getParameter("phone_number"));
        worker.setPortrait(request.getParameter("portrait"));

        return worker;

    }

    public static Worker resultsetToWorker(ResultSet resultSet){
        Worker worker = new Worker();
        try {
            worker.setNumber(resultSet.getString("number"));
            worker.setPassword(resultSet.getString("password"));
            worker.setHiredate(resultSet.getDate("hiredate"));
            worker.setPhone_number(resultSet.getString("phone_number"));
            worker.setGender(resultSet.getInt("gender"));
            worker.setName(resultSet.getString("name"));
            worker.setPosition_id(resultSet.getInt("position_id"));
            worker.setPortrait(resultSet.getString("portrait"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return worker;
    }
}
