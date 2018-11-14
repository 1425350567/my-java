// 类的生命周期

// 顺序调用：静态代码块  -->  静态方法  --> 匿名代码（构造代码块） --> 构造函数 
public class Test
{
	static
	{
		System.out.println("静态代码块");
	}
	{
		System.out.println("构造代码块1+++++");
	}

	Test()
	{
		System.out.println("这是构造函数");
	}

	public void check()
	{
		System.out.println("这是实例函数");
	}
//  静态函数也称类函数。
	public static void user()
	{
		System.out.println("这是静态函数");
	}
	public static void shili()
	{
		System.out.println("这是实例函数");
	}

	{
		System.out.println("构造代码块2-----");
	}
//	入口函数
	public static void main(String[] args)
	{
//	  Test.user();
	 Test.user();

	  Test one = new Test();
//	  静态函数最先执行且执行一次
//	  创建对象时   静态代码块最先执行   然后执行构造代码块创建几个对象构造代码块就执行几次   最后执行构造函数
	  one.shili();
      Test two = new Test();
	  
	}
}
