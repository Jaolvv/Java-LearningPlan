package com.jaolvv.StudentJDBCTemplate;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Website : https://www.jaolvv.top
 * @Date 3/26/2021 5:13 PM
 * @ClassName StudentDao
 * @Author Liu
 * 注释/说明：
 **/

public interface StudentDao {

    public void addStudent(Student student);

    public void deleteStudent(int Student);

    public void updateStudent(Student student);

    public Student findStudentById(int id);

    List<Student> findStudent();

}
