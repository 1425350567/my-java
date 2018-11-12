public class Emp
{
	String ename;
	double esalary;

	void addsalary()
	{   
//		自定义函数无需实例化对象即可访问实例变量
		double salary;
//	    局部变量在声明时不会报错
		salary=1000;
		
		esalary=esalary+salary;
//	  局部变量在使用时必须先赋值
		System.out.println("员工 "+ename+" 奖励金为："+salary+"最终工资为："+esalary);


	}
	
	public static void main(String[] args)
	{
//		main 函数中访问实例变量需要先实例化对象
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
