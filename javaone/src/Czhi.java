public class Czhi
{
	int a = 100;

	void chargeA(int a)
	{
		

	}
	
	

	void chargeB(int b)
	{
		this.a=a;
	}

	public static void main(String[] args)
	{
		int a = 20;
		Czhi t = new Czhi();

		System.out.println(a + "," + t.a); // 20 100

		t.chargeA(a);

		System.out.println(a);// 20
		
		t.chargeB(a);
		
		System.out.println(a);//20
		
		t.chargeA(t.a);
		
		System.out.println(t.a);
		
		
		
		
		

	}
}
