public class Stu
{   //����ȫ�ֱ�������Ϊʵ�������;�̬������ʵ��������ָ���󵥶����е����ԣ���̬������ָ���干��
	String name;
	byte age;
	static String schoolName;
	static int count;

	public static void main(String[] args)
	{  //��̬��������ֱ��ʹ�þ�̬����
		schoolName="�Ͼ��Ƽ�ְҵѧԺ";
		//��main������   ��ֵʵ��������������ʵ��������
		Stu one = new Stu();
	//  ʵ����֮ǰ��ջ�ڴ�  ʵ����֮���ڶ��ڴ濪�ٿռ�
		one.name="�ܷ�";
		System.out.println(one.name);
		
		count++;
		
		Stu two = new Stu();
		//ʵ��������֮��ֵΪ��
		System.out.println(two.name);
		two.name="��ΤΤ";
		System.out.println(two.name);
		count++;
		//ʵ��������֮��̬����ȡֵ����ı䣻��̬�����ǵ��������ھ�̬����
		System.out.println(one.schoolName);
		
		one.schoolName="�Ͽ�Ժ";
		System.out.println(two.schoolName);
		
        System.out.println(count);
		

	}

}
