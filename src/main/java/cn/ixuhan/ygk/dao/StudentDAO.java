package cn.ixuhan.ygk.dao;

import cn.ixuhan.ygk.model.Student;

/**
 * Created with Hank.
 * User: Hank
 * Date: 2016/11/8 0008
 * Time: 19:24
 * Des:
 */
public interface StudentDAO {

    int delete(int id);

    int insert(Student student);

    Student select(int id);

    int update(Student student);
}
