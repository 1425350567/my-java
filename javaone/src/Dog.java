//  ������֮��ķ������úͱ�������
public class Dog
{
	private String colorName;

//   ��ϲ���Թ�ͷ ,���еĹ���ϲ���Թ�ͷ���������óɾ�̬
//   ��̬����Ҳ�����෽��
	public static void eat()
	{
		System.out.println("����ϲ���Թ�ͷ");
	}
//	public static  void  show()
//	{
//		System.out.println(this.colorName);
//	        ��̬������this����ʹ�� 
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
