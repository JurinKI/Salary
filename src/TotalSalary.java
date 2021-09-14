
public class TotalSalary  {
	private String idmanager;
	private String name;
	private int salary;
	private double sales;

	public TotalSalary ( ) {
        
    }
	
	public  TotalSalary (String idmanager , String name,int salary ) {
        this.idmanager = idmanager;
        this.name = name;
		this.salary = salary;
    }
	public  TotalSalary (String idmanager , String name,int salary,double sales ) {
        this.idmanager = idmanager;
        this.name = name;
		this.salary = salary;
		this.sales = sales;
    }

	
	public String getidmanager() {
		return this.idmanager;
	}


	public String getname() {
		return this.name;
	}


	public int getsalary() {
		return this.salary;
	}
	
	public double getsales() {
		return this.sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}



	public double salary() {
		double sum = 0;
		
        if(this.sales<=50000) {
            sum = this.salary+(this.sales*0.05);
        }else
            sum = this.salary+(this.sales*0.10);
		if(sum<12000){
			sum=12000;
		}
		return sum;
	}
	
	public String toString() {
		return  "   ManagerName :   " + this.name ;
	}
	
}
