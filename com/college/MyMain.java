package com.college;

import com.college.student.MyStudent;
import com.college.student.studentdetails.StudentDetails;
import com.college.teacher.MyTeacher;
import com.college.teacher.teacherdetails.TeacherDetails;

public class MyMain {

    public static void main(String[] args) {
        System.out.println("I am Main");

        MyStudent ms = new MyStudent();
        ms.print();

        MyTeacher mt = new MyTeacher();
        mt.print();

        StudentDetails sd = new StudentDetails();
        sd.print();

        TeacherDetails td = new TeacherDetails();
        td.print();
    }
}
