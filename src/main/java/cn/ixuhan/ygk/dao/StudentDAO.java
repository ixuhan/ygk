package cn.ixuhan.ygk.dao;

import cn.ixuhan.ygk.model.Student;
import org.springframework.stereotype.Component;

/**
 * Created with Hank.
 * User: Hank
 * Date: 2016/11/8 0008
 * Time: 19:24
 * Des:
 */
@Component("studentDAO")
public interface StudentDAO {



    Student selectStudent(int id);

}
