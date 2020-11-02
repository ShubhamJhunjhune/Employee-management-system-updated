package employeedetails;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestEmployee {
	static int  count =0;
	static Scanner sc = new Scanner(System.in);
	static int size;
	
	private static	Employee arr[] ;
	
	
	static Employee e = new Employee();
	void calSalary()
	{
		
		e.calSalary();
	}
	
	void addEmployee()
	{
		if (count <size)
		{
		System.out.println("enter the details of employee such as - id ,name ,salary,experience");
		int id = sc.nextInt();
		String name = sc.next();
		double salary = sc.nextDouble();
		int experience = sc.nextInt();
		System.out.println("enter the number of skills you have ");
		String brr []  = new String [sc.nextInt()];
		System.out.println("enter the skills ");
		for (int i =0; i<brr.length;i++)
		{
			brr[i] = sc.next();
		}
		System.out.println("enter the number of projects done");
		String crr []  = new String [sc.nextInt()];
		System.out.println("enter the project details");
		for (int i =0; i<crr.length;i++)
		{
			crr[i] = sc.next();
		}
		
		
			
				arr[count++] = new Employee(id,name,salary,brr,crr,experience);
				System.out.println("employee added successfully");
		}
		else 
		{
			System.out.println("can't add no vacancies");
		}
	}
	
	
	void showDetails()
	{
		System.out.println(" id       name           salary          experience      skills             projects ");
		for (int i=0;i<count;i++)
			if(arr[i]!= null)// now agar kisi employee ko delete kiya to waha kya aayenga null or tum usko print karonge to error ayenga to 
				// isse acha null agar ho to print hi mat karo
		{
			// reason for storing details in string skills  is jab print krenge tab %s kewal ek string print krta par apne pass array of string hai
			String skillstr = Arrays.toString(arr[i].getSkills());
			
			String projstr = Arrays.toString(arr[i].getProjects_done());
			
			System.out.printf("\n%d\t%-15s\t%6.2f\t%10d\t%-10s\t%-10s",arr[i].getEmpid(),arr[i].getEmpName(),
				arr[i].getBasic_salary(), arr[i].getExperience(),skillstr,projstr);
		}
			else 
				System.out.println("employee not exist");
	}
	
	void deleteEmployee()
	{
		System.out.println("enter the employee id");
		int id = sc.nextInt();
		boolean flag = false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=null)// reason being if you delete any employee there will be null (since it stores the reference) and it will show null pointer exception
			{
				if(arr[i].getEmpid()==id)
				{
					arr[i] = null;
					System.out.println("employee with id "+id+ "deleted successfully");
					flag = true;
					break;
				}
			}
		}// dekho jab empid equal hongi tab wo arr[i]= null mein jayenga flag = true honga or jab bahar aayenga
		// or flag ke value true hongin to if flag = flase ni chalenga or false hongi to print krenga ki not found
		if(flag== false)
			System.out.println("employee not found");
	}
	
	void modifyEmployee()
	{
		System.out.println("enter the employee id in which you want modification");
		int id = sc.nextInt();
		boolean flag = false;
		int sw =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=null)
			{
				if(arr[i].getEmpid()==id)
				{
					System.out.println("please enter what u want to modify");
					System.out.println("\n MENU \n1.empid\n2.empName\n3.salary\n4.experience\n5.skills\n6.projects\n7.exit");
					sw = sc.nextInt();
					switch(sw)
					{
					case 1:
					{
						System.out.println("enter the  new employee id");
						int eid = sc.nextInt();
						arr[i].setEmpid(eid);
						flag = true;
						break;
					}
					case 2:
					{
						System.out.println("enter the  new employee name");
						String name = sc.next();
						arr[i].setEmpName(name);
						flag = true;
						break;
					}
					case 3:
					{
						System.out.println("enter the  new salary ");
						double salary = sc.nextDouble();
						arr[i].setBasic_salary(salary);
						flag = true;
						break;
					}
					case 4:
					{
						System.out.println("etner the new experinece");
						int experience = sc.nextInt();
						arr[i].setExperience(experience);
						flag = true;
						break;
					}
					case 5:
					{
						System.out.println("enter the number of skills you have ");
						String brr []  = new String [sc.nextInt()];
						for (int j =0; j<brr.length;j++)
						{
							brr[j] = sc.next();
						}
						arr[i].setSkills(brr);
						flag = true;
						break;
					
					}
					case 6:
					{
						System.out.println("enter the number of projects done ");
						String crr []  = new String [sc.nextInt()];
						for (int j =0; j<crr.length;j++)
						{
							crr[i] = sc.next();
						}
						arr[i].setProjects_done(crr);
						flag = true;
					}
					
					System.out.println("employee with id "+id+ "modified successfully");
				
					case 7:
					{
							flag = true;
							break;
					}
				
				}

				}
				
				System.out.println("employee with id "+id+ "  modified successfully");
	
		}
		if(flag== false)
			System.out.println("employee not found");
	}
	}
	
	
	void searchEmployee()
	{
		System.out.println("enter the search criteria  ");
		System.out.println("\n MENU \n1.id\n2.name\n3.salary\n4.experience\n5.skills\n6.project\n7.exit");
		int sch=0;
		sch = sc.nextInt();
		switch (sch)
		{
		case 1 :
		{
			System.out.println("enter the  employee id");
			int eid = sc.nextInt();
			boolean flag = false;
			for (int i=0;i<arr.length;i++)
			{
				if(arr[i]!=null)
				{
					if(arr[i].getEmpid() == eid)
					{
						System.out.println(arr[i]);// to string call ase krte hai simply write arr[i] if show details were used than arr[i].showDetails likhana padta
						flag = true;
						break;
					}
				}
				
			}
			
			if(flag== false)
				System.out.println("employee not found");
			break;
	
		}
		case 2 :
		{
			System.out.println("enter the   employee name");
			String name = sc.next();
			boolean flag = false;
			for (int i=0;i<arr.length;i++)
			{
				if(arr[i]!=null)
				{
					if(arr[i].getEmpName() == name)
					{
						System.out.println(arr[i]); 
						flag = true;
						break;
					}
				}
			}
			
			if(flag== false)
				System.out.println("employee not found");
				break;
		}
		case 3 :
		{
			System.out.println("enter the   salary ");
			double salary = sc.nextDouble();
			boolean flag = false;
			for (int i=0;i<arr.length;i++)
			{
				if(arr[i]!=null)
				{
					if(arr[i].getBasic_salary() == salary)
					{
						System.out.println(arr[i]);// to string call ase krte hai simply write arr[i] if show details were used than arr[i].showDetails likhana padta
						flag = true;
						break;
					}
				}
			}
			
			if(flag== false)
				System.out.println("employee not found");
				break;
		}
		case 4:
		{
			System.out.println("etner the  experinece");
			int experience = sc.nextInt();
			boolean flag = false;
			for (int i=0;i<arr.length;i++)
			{
				if(arr[i]!=null)
				{
					if(arr[i].getExperience() == experience)
					{
						System.out.println(arr[i]);
						flag = true;
						break;
					}
				}
			}
			
			if(flag== false)
				System.out.println("employee not found");
				break;
		}
		case 6 :
		{
			System.out.println("enter the project name ");
			String n = sc.next();
			for (int i =0; i<arr.length;i++)
			{
				if(arr[i]!=null)
				{
					String project [] =  arr[i].getProjects_done();
					for(int j=0;j<project.length;j++)
					{
						if( project[j].equals(n))
						{
							System.out.println(arr[i]);
							
						}
					}
				}
			}
		
		}
		
					
			break;
		
		
		case 5:
		{
			System.out.println("enter the skills name ");
			String name = sc.next();
			for (int i =0; i<arr.length;i++)
			{
				if(arr[i]!=null)
				{
					String skill [] =  arr[i].getSkills();
					for(int j=0;j<skill.length;j++)
					{
						if( skill[j].equals(name))
						{
							System.out.println(arr[i]);
						}
					}
				}
			}
		
break;
	}
		}
	
		

	}
	
	


	public static void main(String[] args) {
		// yaha pr testemployee jo ki main method ke upar ki class hai kyuki uska data use krna hai to uske liye object banayenge isliye 
		/// Employee e2 = new Employee() n likhte hue testemployee likha
 		TestEmployee e2 = new TestEmployee();
 		System.out.println("enter the number of employee");
 		 size = sc.nextInt();
 		arr = new Employee[size];
 		
 	
		
		boolean flag = false;			
				System.out.println("\n MENU \n1.Addemp\n2.Modify\n3.deleteEmployee\n4.display\n5.SearchEmployee\n6.calsalaryforall\n7.exit");
			while (flag !=true)
			{
				System.out.println("\nenter the choice");
				 int ch = sc.nextInt();
				 switch(ch)
				 {
				 case 1: e2.addEmployee();
				 		break;
				 case 2 : e2.modifyEmployee();
				 			break;
				 case 3: e2.deleteEmployee();
				 		break;
				 case 4: e2.showDetails();
				 		break;
				 case 5 :e2.searchEmployee();
				 			break;
				 case 6 : for(int i=0;i<arr.length;i++)
				 			{
					 			if (arr[i]!=null)
					 			{
					 				System.out.println(arr[i].calSalary());
					 			}
				 			}
				 			break;
				 case 7: flag = true;
				 		break;
				 }
				 
			}
				
				
				
				
	

	}}
