
//  静态变量和静态方法都属于整个类的,所以我们把静态变量叫做类变量，
//  我们把静态方法叫做类方法

//  对静态方法和静态变量的访问规则:
//    1.类名.静态变量名
//    2.类名.静态方法名  



//    this关键字是代表这个当前对象，不能够在静态方法中使用。

public class Wo
{
	public static void main(String[] args)
	{
		Dog one=new Dog();
		one.setColorName("黄色");
		
		Dog two=new Dog();
		two.setColorName("红色");
		
		System.out.println("第一条狗的颜色："+one.getColorName()+","+"第二条狗的颜色："+two.getColorName());
		
		Dog.eat();
		
	}

}
