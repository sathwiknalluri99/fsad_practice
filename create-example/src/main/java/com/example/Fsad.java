package com.example;
import java.sql.*;

public class Fsad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/fsads52";
		String usr="root";
		String pwd="2007";
		try {
		      //Establish the connection


		       System.out.println("Connection established");
		       
		       Statement st=con.createStatement();
		       
		       String createDept =
		           "create table if not exists Department (" +
		           "dept_id int primary key auto_increment, " +
		           "dept_name varchar(30)" +
		           ")";
		       st.execute(createDept);
		       System.out.println("Department table created");
		       
		       String createEmp =
		           "create table if not exists Employee (" +
		           "emp_id int primary key auto_increment, " +
		           "emp_name varchar(30), " +
		           "salary double, " +
		           "dept_id int, " +
		           "foreign key (dept_id) references Department(dept_id)" +
		           ")";

		       st.execute(createEmp);
		       System.out.println("Employee table created");
		       //close the connection
		       con.close();
		     }
		     catch(Exception e){
		       e.printStackTrace();
		     }

	}

}
