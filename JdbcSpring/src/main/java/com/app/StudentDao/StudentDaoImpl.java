package com.app.StudentDao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.app.springEntity.Student;

@Component("Student")
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate JdbcTemplate;

	@Override
	public int insert(Student student) {
		String query = "insert into student (id,name,city)values(?,?,?)";
		int result = this.JdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return result;
	}

	@Override
	public int update(Student student) {
		String query = "update student set name=?, city=? where id=?";
		int result = this.JdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return JdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		JdbcTemplate = jdbcTemplate;
	}

	@Override
	public int delete(int StudentId) {
		String query = "delete from student where id=?";
		int r = this.JdbcTemplate.update(query, StudentId);
		return r;
	}

	@Override
	public Student getStudent(int StudentId) {
		RowMapper<Student> rowMapper = new RowMapperImpl();
		String query = "select * from student where id=?";
		Student student = this.JdbcTemplate.queryForObject(query, rowMapper, StudentId);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		RowMapper<Student> rowMapper = new RowMapperImpl();
		String query = "select * from student ";
		List<Student> query2 = this.JdbcTemplate.query(query, rowMapper);
		return query2;
	}

}
