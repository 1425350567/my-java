//��װ
public class Per
{   //
	// ���� ʵ������ �Ǿ�̬����
	private String name;
	// ���� ʵ������ �Ǿ�̬����
	private int age;
	// ������ ��̬���� ����� ����������
	static String cityName;
	
//	��java����ͨ��set��get���������жԷ�װ�����ݷ��ʣ�
//	������ݷ��ʵİ�ȫ��,
//  �����е�˽�е����Խ��з���������(set/get|������������ĸ��д)
//	ͨ�����������ж����ݵķ��ʣ�ͨ���������ǿ����������ƣ����ݽ��а�ȫ���ơ�

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
			System.out.println("�����䲻�Ϸ�");
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
// p1.name="С��";
// p1.age=20;
// Per.cityName="�Ͼ�";
// p1.show();
// }
//
//
//
// }
