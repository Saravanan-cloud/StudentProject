package com.sara.dao;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;

import com.sara.beans.Student;  
  
public class StudentDao {  
JdbcTemplate template;  
  
public void setTemplate(JdbcTemplate template) {  
    this.template = template;  
}  
public int save(Student p){  
    String sql="insert into students(name,department,tamil,english,maths) values"
    		+ "('"+p.getName()+"',"+p.getDepartment()+",'"+p.getTamil()+"','"+p.getEnglish()+"','"+p.getMaths()+"')";  
    return template.update(sql);  
}  
public int update(Student p){  
    String sql="update students set name='"+p.getName()+"', department="+p.getDepartment()+",tamil='"+p.getTamil()+"',"
    		+ " english='"+p.getEnglish()+"', maths='"+p.getMaths()+"' where id="+p.getId()+"";  
    return template.update(sql);  
}  
public int delete(int id){  
    String sql="delete from students where id="+id+"";  
    return template.update(sql);  
}  
public Student getStudentsById(int id){  
    String sql="select * from students where id=?";  
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Student>(Student.class));  
}  
public List<Student> getStudents(){  
    return template.query("select * from students",new RowMapper<Student>(){  
        public Student mapRow(ResultSet rs, int row) throws SQLException {  
            Student e=new Student();  
            e.setId(rs.getInt(1));  
            e.setName(rs.getString(2));  
            e.setDepartment(rs.getString(3));  
            e.setTamil(rs.getString(4));  
            e.setEnglish(rs.getString(5));  
            e.setMaths(rs.getString(6));  
            return e;  
        }  
    });  
}  
}  