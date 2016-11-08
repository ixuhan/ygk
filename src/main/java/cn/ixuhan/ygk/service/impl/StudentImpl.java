package cn.ixuhan.ygk.service.impl;

import cn.ixuhan.ygk.dao.StudentDAO;
import cn.ixuhan.ygk.model.Student;
import cn.ixuhan.ygk.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with Hank.
 * User: Hank
 * Date: 2016/11/8 0008
 * Time: 19:27
 * Des:
 */
public class StudentImpl implements StudentService{

    @Autowired
    private StudentDAO studentDAO;

    public Student getStudent(int id) {
        return studentDAO.select(id);
    }
}
