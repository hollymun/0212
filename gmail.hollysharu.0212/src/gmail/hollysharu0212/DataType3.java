package gmail.hollysharu0212;

public class DataType3 {

	public static void main(String[] args) {
		byte b1=10;
		byte b2=20;
		//int���� ���� ũ���� �����ͳ��� ������ �ϸ� int�� �����ؼ� ������ ������
		//������ ����� ũ�� ������ byte���� ������ �� ���� 
		//byte result=b1+b2; 
		int result=b1+b2;
		System.out.println("���: "+result);

		int x=100;
		//ǥ�������� ū �����ʹ� ���� ǥ�������� ������ ���� �� ��
		//�̷� ���, ������ �����Ϸ��� �ϸ� int�� byte�� �����ؾ� ��
		//�ڵ����� �սǿ� �����ؾ� �ԡ�
		//byte b=x; 
		
		//x�� byte�� �����ؼ� b�� ����
		byte b=(byte)x;
		System.out.println("b: "+b);
		
		//byte�� ǥ���������� �� ū �����͸� �����ؼ� ������ �սǵ� : Overflow
		x=200;  
		b=(byte)x;
		System.out.println("b: "+b);
		
		double d=3.14;
		//�Ǽ��� ������ �����Ϸ��� ������ ���� �����ͷ� �����ؾ� ��
		//�Ҽ� ������ ex)�Խ��� ��������  
		x=(int)d;
		System.out.println("x: "+x);

		int n1=15;
		int n2=2;
		//���� ǥ�������� ���� �����͸� ū ǥ�������� ���� �����ͷ� �����ϴ� ������
		//���ϴ� ����� ��� ���ؼ� 
		double r=(double)n1/n2;
		System.out.println("r: "+r);
		
		double su=5.6;
		//���� ���ڸ� �Ҽ� ù° �ڸ����� �ݿø��ؼ� ���
		//5.6�̸� 6, 5.4�� 5�� ���
		int h=(int)(su+0.5);
		System.out.println("h: "+h);
		
		su=5.46;
		
		su=su*10;
		h=(int)(su+0.5);
		su=h/10.0;
		System.out.println("su: "+su);
	
		
	}
}
