package com.klu.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int empid;
    private String empname;
    private double empsalary;
    private void setEmpId(int empid)
    {
    	this.empid=empid;
    }
    public int getEmpId() {
    	return empid;
    }
    public void setDeptName(String deptname)
    {
    	this.deptname=deptname;
    }
    public String getDeptName()
    {
    	return deptname;
    }

}
