
public class Zhouqi


{
	int s;
	public static void main(String[] args)
	{
		Zhouqi s1 = new Zhouqi();
		s1.s=100;
		
		Zhouqi s2 = new Zhouqi();
		s2.s=100;
		
		s2=s1;
		Zhouqi s3=s2;
		s2.s=80;
		
		System.out.println("------"+s2.s);
		
		System.out.println("------"+s3.s);
		
	}
}
