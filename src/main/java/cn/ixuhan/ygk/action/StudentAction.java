package cn.ixuhan.ygk.action;

import cn.ixuhan.ygk.model.Student;
import cn.ixuhan.ygk.service.impl.StudentImpl;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

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
    private StudentImpl studentImpl;

    @Action(value = "test")
    public String helloWorld() {
        System.out.println("action success1");
        //String id = getRequest().getParameter("id");
        Student student = studentImpl.getStudent(1);
        System.out.println(student);
        return SUCCESS;
    }
}
