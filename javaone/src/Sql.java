public class Sql

{
	String host;

	String username;

	String userpwd;

	String url;

	// ���캯�� ��Sql �� public Sql ��
	// 1.��������������ͬ 2.���캯��û�з���ֵ 3.ʵ���������ǹ��캯���磨int Sql��
	//
	// ���캯�����ã�
	// �����е����Խ��г�ʼ����ֵ
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
		System.out.println("------------����");
	}@Override
	protected Object clone() throws CloneNotSupportedException
	{
		// TODO Auto-generated method stub
		return super.clone();
	}
//   ���һ�������ṩ�˹��캯���������������������1�����캯����
//   ���캯�������������
//	     1.���û�й��캯��java����������ʽ�Զ��ṩһ��û�в����Ĺ��캯��
//	     2.����ж�����캯����ô�͸����������ṩ�˶�����ʻ��ơ�������캯���γ������أ����ض��壺ͬһ������������ͬ��ʵ�ֽ������

	public static void main(String[] args)
	{
		Sql db = new Sql("127.0.0.1", "student", "student", "mlssjd");
//		���캯���ڴ�������ʱ ��ʽ ���ú���
//      db.Sql();   ���캯������  ����  ���ú���
		Sql db2 = new Sql();

	}
}
