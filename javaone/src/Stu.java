public class Stu
{   //定义全局变量。分为实例变量和静态变量。实例变量是指对象单独享有的属性，静态变量是指集体共享
	String name;
	byte age;
	static String schoolName;
	static int count;

	public static void main(String[] args)
	{  //静态方法可以直接使用静态变量
		schoolName="南京科技职业学院";
		//在main方法中   赋值实例变量必须首先实例化对象
		Stu one = new Stu();
	//  实例化之前在栈内存  实例化之后在堆内存开辟空间
		one.name="曹峰";
		System.out.println(one.name);
		
		count++;
		
		Stu two = new Stu();
		//实例化对象之后值为空
		System.out.println(two.name);
		two.name="徐韦韦";
		System.out.println(two.name);
		count++;
		//实例化对象之后静态变量取值不会改变；静态变量是单独存在于静态池中
		System.out.println(one.schoolName);
		
		one.schoolName="南科院";
		System.out.println(two.schoolName);
		
        System.out.println(count);
		

	}

}
