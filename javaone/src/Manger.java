//��װ: 
public class Manger

{

	public static void main(String[] args)
	{
//		����һ������ֱ�ӷ�����һ����ı�����ʹ������ȱ����ȫ��
//      ����ʹ�����ݰ�ȫ��ͨ�������Ե�˽��[private]�����ã�����
//      ��������ݵķ��ʰ�ȫ�ԣ����ܹ�ֱ��ȥ���ʣ�ֱ������ֵ��
		
		Per p1 =new Per();
		p1.setName("��������");
		p1.setAge(140);
		
		System.out.println(p1.getName()+p1.getAge());
		
		
		Per.cityName="�Ͼ�";
//		�����������з��ʾ�̬���������ȼ�������
//		System.out.println(p1.name+","+Per.cityName);
		

	}

}
