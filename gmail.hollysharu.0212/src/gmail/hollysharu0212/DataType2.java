package gmail.hollysharu0212;

public class DataType2 {

	public static void main(String[] args) {
	
		//0.1�� 1000�� ���ϸ� 100.0�� ���;� �ϴµ� �̻��� ��� ���
		//�Ҽ��� ��Ȯ�ϰ� ǥ���� �� ���� ��찡 ����� ����
		double d=0.1;
		double sum=0.0;
		for(int i=0; i<1000; i=i+1) {
			sum=sum+d;
		}
		System.out.println("�հ�: "+sum);
		
		//�Ǽ� ������ ���� �� �ؾ� �� ���� ������ ������ �� �����ϰ� �Ǽ��� ����
		double d2=0.1;
		double sum2=0.0;
		for(int i=0; i<1000; i=i+1) {
			sum2=sum2+(d2*10);
		}
		System.out.println("�հ�: "+(sum2/10));
		
		//�Ǽ� ���� ������� false 
		boolean pan=(2.0-1.8)==0.2;
		System.out.println("�Ǽ��� �״�� �����ϸ�: "+pan); 
		
		//���� ū ���ں��� �� ū ���ڸ� �����ؼ�
		//Overflow�� �߻��ؼ� ������ ���� 				=>long �ڷ������� ����ϸ� �� 
		int n=2147483647;
		int result=n+1;
		System.out.println("overflow ���: "+result);

		//���� ���� ���ں��� �� ���� ���ڸ� ����
		//Underflow�� �߻��ؼ� ����� ���� 
		n=-2147483648;
		result=n-1;
		System.out.println("underflow ���: "+result);

		
	}

}
