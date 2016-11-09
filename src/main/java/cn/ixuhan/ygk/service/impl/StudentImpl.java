package cn.ixuhan.ygk.service.impl;

import cn.ixuhan.ygk.dao.StudentDAO;
import cn.ixuhan.ygk.model.Student;
import cn.ixuhan.ygk.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created with Hank.
 * User: Hank
 * Date: 2016/11/8 0008
 * Time: 19:27
 * Des:
 */

@Component("studentImpl")
public class StudentImpl{

    @Autowired
    private StudentDAO studentDAO;

    public Student getStudent(int id) {
        return studentDAO.select(id);
    }
}
