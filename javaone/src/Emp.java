public class Emp
{
	String ename;
	double esalary;

	void addsalary()
	{
		double salary;
		
		salary=1000;
		
		esalary=esalary+salary;
		 
		System.out.println("员工 "+ename+" 奖励金为："+salary+"最终工资为："+esalary);


	}
	
	public static void main(String[] args)
	{
		Emp one=new Emp();
		
		one.ename="曹峰";
		
		
		
		
		one.esalary=5000;
		System.out.println(one.esalary);
		one.addsalary();
		
		
		Emp two=new Emp();
		two.ename="曹峰2";
		two.esalary=4000;
		
		System.out.println("工资"+two.esalary+"姓名"+two.ename);
		
		two.addsalary();
		
		
		
	}

}
