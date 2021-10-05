package com.app.spring;

import java.util.List;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.app.StudentDao.StudentDao;
import com.app.springEntity.Student;

public class AppTest {
	private static final int StudentId = 0;

	public static void main(String[] args) {
		ApplicationContext contex =new  AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao studentDao = contex.getBean("Student", StudentDao.class);
		/*
		 * Student student = new Student(); student.setId(105);
		 * student.setName("Shama"); student.setCity("Amravti"); int result =
		 * studentDao.insert(student); System.out.println(result + " : Row Affected");
		 */

		/*
		 * Student student1 = new Student(); student1.setId(104);
		 * student1.setName("Mayu"); student1.setCity("Amravti"); int result1 =
		 * studentDao.update(student1); System.out.println(result1 + " : Row Affected");
		 */
		/* Student student = new Student(); */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter Student Id :"); int no = sc.nextInt(); int result =
		 * studentDao.delete(no); System.out.println(result + "Student Deleted ");
		 */

		List<Student> student = studentDao.getAllStudent();
		for (Student student2 : student) {
			System.out.println(student2);
		}

	}
}
