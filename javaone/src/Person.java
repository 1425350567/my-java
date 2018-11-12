public class Person
{
//	姓名  实例变量  非静态变量
	String name;
//  年龄  实例变量  非静态变量
	int age;
//  城市名  静态变量  类变量   属于整个类
	static String cityName;

	public void show()
	{
//		谁调用这个方法这个this就代表谁
		System.out.println("姓名："+this.name+","+"年龄："+this.age+","+"所在城市"+Person.cityName);

	}

public static void main(String[] args)
	{
//		访问变量必须先实例化对象
//		对实例变量的访问，就是访问值或是设置值
		Person p1 = new Person();

		p1.name = "曹峰";
		p1.age = 20;
		Person.cityName = "淮安";
		p1.show();
		
		Person p2 = new Person();
		
		p2=p1;
//      p2=p1 代表这将p1的地址赋予p2 每个值也对应赋值
		
		cityName="石头城";
//		在本类中访问静态变量，类变量，可以直接用变量名访问
		
		p2.show();
		

	}
	

}
