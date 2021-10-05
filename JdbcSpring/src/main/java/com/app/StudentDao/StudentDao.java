package com.app.StudentDao;

import java.util.List;

import com.app.springEntity.Student;

public interface StudentDao {

	public int insert(Student student);

	public int update(Student student);

	public int delete(int StudentId);

	public Student getStudent(int StudentId);

	public List<Student> getAllStudent();

}
