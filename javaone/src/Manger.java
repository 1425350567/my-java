//封装: 
public class Manger

{

	public static void main(String[] args)
	{
//		在另一个类中直接访问另一个类的变量，使得数据缺乏安全性
//      怎样使得数据安全，通过对属性的私有[private]的设置，这样
//      提高了数据的访问安全性，不能够直接去访问，直接设置值。
		
		Per p1 =new Per();
		p1.setName("王二麻子");
		p1.setAge(140);
		
		System.out.println(p1.getName()+p1.getAge());
		
		
		Per.cityName="南京";
//		在其他方法中访问静态变量必须先加类名；
//		System.out.println(p1.name+","+Per.cityName);
		

	}

}
