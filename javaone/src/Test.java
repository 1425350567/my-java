// �����������

// ˳����ã���̬�����  -->  ��̬����  --> �������루�������飩 --> ���캯�� 
public class Test
{
	static
	{
		System.out.println("��̬�����");
	}
	{
		System.out.println("��������1+++++");
	}

	Test()
	{
		System.out.println("���ǹ��캯��");
	}

	public void check()
	{
		System.out.println("����ʵ������");
	}
//  ��̬����Ҳ���ຯ����
	public static void user()
	{
		System.out.println("���Ǿ�̬����");
	}
	public static void shili()
	{
		System.out.println("����ʵ������");
	}

	{
		System.out.println("��������2-----");
	}
//	��ں���
	public static void main(String[] args)
	{
//	  Test.user();
	 Test.user();

	  Test one = new Test();
//	  ��̬��������ִ����ִ��һ��
//	  ��������ʱ   ��̬���������ִ��   Ȼ��ִ�й������鴴�����������������ִ�м���   ���ִ�й��캯��
	  one.shili();
      Test two = new Test();
	  
	}
}
