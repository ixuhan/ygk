package cn.ixuhan.ygk.action;

import cn.ixuhan.ygk.model.Student;
import cn.ixuhan.ygk.service.impl.StudentImpl;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with Hank.
 * User: Hank
 * Date: 2016/11/8
 * Time: 17:40
 * Des: This is a test class
 */
@Results({@Result(name = "success", location = "/index.jsp")})
public class StudentAction extends BaseSupport {

    @Autowired
    private StudentImpl studentimpl;

    @Action(value = "test")
    public String helloWorld() {
        System.out.println("action success");
        String id = getRequest().getParameter("id");
        Student student = studentimpl.getStudent(Integer.valueOf(id));
        System.out.println(student);
        return SUCCESS;
    }
}
