public class Emp
{
	String ename;
	double esalary;

	void addsalary()
	{   
//		�Զ��庯������ʵ�������󼴿ɷ���ʵ������
		double salary;
//	    �ֲ�����������ʱ���ᱨ��
		salary=1000;
		
		esalary=esalary+salary;
//	  �ֲ�������ʹ��ʱ�����ȸ�ֵ
		System.out.println("Ա�� "+ename+" ������Ϊ��"+salary+"���չ���Ϊ��"+esalary);


	}
	
	public static void main(String[] args)
	{
//		main �����з���ʵ��������Ҫ��ʵ��������
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
