package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


import com.configure.MyConfiguration;
import com.model.Student;
import com.model.StudentDaoRowMapper;

@Component
public class StudentDao {
     
	@Autowired
	private JdbcTemplate j;
	
	public int insertStudent(Student s) {
		String sql="insert into student(sname,scity,spercentage) values (?,?,?)";
		return j.update(sql,new Object[] {s.getSname(),s.getScity(),s.getSpercentage()});
	}
	public int deleteStudent(int sid) {
		String sql="delete from student where sid=?  ";
		return j.update(sql,new Object[] {sid});
		
	}
	public Student findStudentFromSid(int sid ) {
		String sql="select sid,sname,scity,spercentage from student where sid=?";
		return j.queryForObject(sql,new StudentDaoRowMapper(),sid);
	}
	public int updateStudent(Student s) {
		String sql="update student set name=?,scity=?,spercentage=? where sid=?";
		return j.update(sql,new Object[] {s.getSname(),s.getScity(),s.getSpercentage(),s.getSid()});
	}
}
