//  类与类之间的方法调用和变量调用
public class Dog
{
	private String colorName;

//   狗喜欢吃骨头 ,所有的狗都喜欢吃骨头，所以设置成静态
//   静态方法也叫做类方法
	public static void eat()
	{
		System.out.println("狗都喜欢吃骨头");
	}
//	public static  void  show()
//	{
//		System.out.println(this.colorName);
//	        静态方法中this不能使用 
//	}
	
	public void setColorName(String colorName)
	{
		this.colorName=colorName;
	}

	public String getColorName()
	{
		return this.colorName;
	}

}
