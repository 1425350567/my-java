public class Person
{
//	����  ʵ������  �Ǿ�̬����
	String name;
//  ����  ʵ������  �Ǿ�̬����
	int age;
//  ������  ��̬����  �����   ����������
	static String cityName;

	public void show()
	{
//		˭��������������this�ʹ���˭
		System.out.println("������"+this.name+","+"���䣺"+this.age+","+"���ڳ���"+Person.cityName);

	}

public static void main(String[] args)
	{
//		���ʱ���������ʵ��������
//		��ʵ�������ķ��ʣ����Ƿ���ֵ��������ֵ
		Person p1 = new Person();

		p1.name = "�ܷ�";
		p1.age = 20;
		Person.cityName = "����";
		p1.show();
		
		Person p2 = new Person();
		
		p2=p1;
//      p2=p1 �����⽫p1�ĵ�ַ����p2 ÿ��ֵҲ��Ӧ��ֵ
		
		cityName="ʯͷ��";
//		�ڱ����з��ʾ�̬�����������������ֱ���ñ���������
		
		p2.show();
		

	}
	

}
