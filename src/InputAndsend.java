import java.util.Scanner;
import java.time.LocalDate;
import java.util.Calendar;

public class InputAndsend {
	
	static boolean lateDate = false;
	
	public void  InputAndsend () {
		
		Addmember();
		
	    
	}
	
	public void Addmember() {
		
		LocalDate today = LocalDate.now();
        System.out.println("Current Date : " +today);
        
        
		// TotalSalary t = new TotalSalary();
		
		 String idmanager;
		 String name;
		 int salary;
		 double sales=5;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your ID : ");
		idmanager = in.nextLine();
        System.out.print("Enter your Name : ");
        name = in.nextLine();
        System.out.print("Enter your salary : ");
        salary = in.nextInt();
        TotalSalary t = new TotalSalary(idmanager, name,salary,sales);
        if(findtoDate()== true){
			System.out.print("Enter your sales : ");
			sales = in.nextDouble();
			t.setSales(sales);
		}
		
		// sales=t.getsales();
		toSring( idmanager, name,salary,sales);
	}
	
	
	
	public String toSring(String idmanager, String name,int salary,double sales) {
		TotalSalary t = new TotalSalary(idmanager, name,salary,sales);
		String manager = t.toString();
		if(lateDate == true) {
			manager = manager + " Amount : " + t.salary();
		}
		System.out.println(manager);
		
		return manager;
	}
	
	
	public boolean findtoDate () {
		
		LocalDate today = LocalDate.now();
		int date = today.getDayOfMonth();
		Calendar cal = Calendar.getInstance();
		int lastDateOfMonth = cal.getActualMaximum(Calendar.DATE);
		date=30; // Test if date = 30 
		if(date == lastDateOfMonth){
			lateDate = true;
			return true;
		}
		return false;
		
	}
	
	
	
}
	