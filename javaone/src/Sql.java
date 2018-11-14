public class Sql

{
	String host;

	String username;

	String userpwd;

	String url;

	// 构造函数 （Sql ， public Sql ）
	// 1.函数名和类名相同 2.构造函数没有返回值 3.实例方法不是构造函数如（int Sql）
	//
	// 构造函数作用：
	// 给类中的属性进行初始化赋值
	Sql(String host, String username, String userpwd, String url)
	{
		this.host = host;
		this.username = username;
		this.userpwd = userpwd;
		this.url = url;

		System.out.println(this.username + "  " + this.host + "  " + this.url
				+ "  " + this.userpwd);

	}

	public Sql()
	{
		System.out.println("------------重载");
	}@Override
	protected Object clone() throws CloneNotSupportedException
	{
		// TODO Auto-generated method stub
		return super.clone();
	}
//   如果一个类中提供了构造函数，创建对象必须依赖这1个构造函数。
//   构造函数的两种情况：
//	     1.如果没有构造函数java编译器会隐式自动提供一个没有参数的构造函数
//	     2.如果有多个构造函数那么就给创建对象提供了多个访问机制。多个构造函数形成了重载（重载定义：同一个方法名，不同的实现结果。）

	public static void main(String[] args)
	{
		Sql db = new Sql("127.0.0.1", "student", "student", "mlssjd");
//		构造函数在创建对象时 隐式 调用函数
//      db.Sql();   构造函数不能  显形  调用函数
		Sql db2 = new Sql();

	}
}
