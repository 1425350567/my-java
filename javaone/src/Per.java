//封装
public class Per
{   //
	// 姓名 实例变量 非静态变量
	private String name;
	// 年龄 实例变量 非静态变量
	private int age;
	// 城市名 静态变量 类变量 属于整个类
	static String cityName;
	
//	在java里面通过set和get方法来进行对封装的数据访问，
//	提高数据访问的安全性,
//  对类中的私有的属性进行方法的设置(set/get|属性名，首字母大写)
//	通过方法来进行对数据的访问，通过方法我们可以设置限制，数据进行安全控制。

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public void setAge(int age)
	{
		if (age < 150 && age > 0)
		{
			this.age = age;
		}
		else
		{
			System.out.println("该年龄不合法");
		}
	}

	public int getAge()
	{
		if (age < 150 && age > 0)
		{
		   return this.age;
		}
		else
		{
			return 0;
		}
	}

}

// public static void main(String[] args)
// {
// Per p1=new Per();
// p1.name="小明";
// p1.age=20;
// Per.cityName="南京";
// p1.show();
// }
//
//
//
// }
