public class Emp
{
	String ename;
	double esalary;

	void addsalary()
	{
		double salary;
		
		salary=1000;
		
		esalary=esalary+salary;
		 
		System.out.println("Ա�� "+ename+" ������Ϊ��"+salary+"���չ���Ϊ��"+esalary);


	}
	
	public static void main(String[] args)
	{
		Emp one=new Emp();
		
		one.ename="�ܷ�";
		
		
		
		
		one.esalary=5000;
		System.out.println(one.esalary);
		one.addsalary();
		
		
		Emp two=new Emp();
		two.ename="�ܷ�2";
		two.esalary=4000;
		
		System.out.println("����"+two.esalary+"����"+two.ename);
		
		two.addsalary();
		
		
		
	}

}
