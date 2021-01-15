package com.sando.register.BusinessService;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.sando.registration.model.Student;

import JDBC_connection.jDBC_ConnectionClass;


public class DatabaseService {
	
public DatabaseService() {
		
	}
	
	
	public boolean insertStudent(Student student)  {
		boolean result = false;
		try(Connection con = jDBC_ConnectionClass.getConnection()){
		String query= "{call insertStudent (?,?,?,?,?,?,?)}";
		 CallableStatement callablestatement = con.prepareCall(query);
				//String dob = STR_TO_DATE(student.getDateOfbirth(), '%d-%m-%Y');
				 
				callablestatement.setString(1, student.getLastname());
				callablestatement.setString(2, student.getFirstname());
				callablestatement.setString(3,  student.getDateOfbirth());
				callablestatement.setString(4, student.getGender());
				callablestatement.setString(5, student.getEmail());
				callablestatement.setString(6, student.getPhone());
				callablestatement.setString(7, student.getSubject());
				
				
				 // Run insertUser() store procedure
				result= callablestatement.executeUpdate()>0;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
