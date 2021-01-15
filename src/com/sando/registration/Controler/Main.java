package com.sando.registration.Controler;

import com.sando.register.BusinessService.DatabaseService;
import com.sando.registration.model.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DatabaseService service = new DatabaseService();
		 
		 Student stu = new Student("soro","sandona","10/01/1990","male","sando@gmail.com","21555555555","Math");
		 boolean res= service.insertStudent(stu);
		 System.out.print(res);
	}

}
