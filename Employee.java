package employeedetails;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {
	private int empid;
	private String empName;
	private double basic_salary;
	private String skills[];
	private String projects_done [];
	private int experience;
	static int counter =0;
	public Employee()
	{
		this.empid=0;
		this.empName= null;
		this.basic_salary= 0.0;
		this.skills=null;
		this.projects_done = null;
		this.experience=0;
		}

	public Employee(int empid, String empName, double basic_salary, String[] skills, String[] projects_done,
			int experience) {	
		this.empid = empid;
		this.empName = empName;
		this.basic_salary = basic_salary;
		this.skills = new String[skills.length];
		for (int i=0;i<skills.length;i++)
		{
			this.skills[i] = skills[i];
		}
		this.projects_done = new String[projects_done.length];
		for(int i=0;i<projects_done.length;i++)
		{
			this.projects_done[i] = projects_done[i];
		}
		this.experience = experience;
	}
	double calSalary()
	{
		return (basic_salary + this.projects_done.length*500);
		
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getBasic_salary() {
		return basic_salary;
	}
	public void setBasic_salary(double basic_salary) {
		this.basic_salary = basic_salary;
	}
	
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = new String[skills.length];
		for (int i=0;i<skills.length;i++)
		{
			this.skills[i] = skills[i];
		}
	
	}
	public String[] getProjects_done() {
		return projects_done;
	}
	public void setProjects_done(String[] projects_done) {
		this.projects_done = new String[projects_done.length];
		for(int i=0;i<projects_done.length;i++)
		{
			this.projects_done[i] = projects_done[i];
		}
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", basic_salary=" + basic_salary
				+ ", skills=" + Arrays.toString(skills) + ", projects_done="
				+ Arrays.toString(projects_done) + ", experience=" + experience + "]";
	}

	
	}
	
	

