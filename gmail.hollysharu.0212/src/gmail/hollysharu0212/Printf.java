package gmail.hollysharu0212;

public class Printf {

	public static void main(String[] args) {
		
		int a=8;
		int b=197;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("========================");
		
		//�ټ� �ڸ��� ������ a�� ����ϰ� ���� �ڸ��� 0���� ä��� 
		System.out.printf("%05d\n", a);
		System.out.printf("%05d\n", b);
		
		System.out.println("========================");
		double d=3.2345234;
		System.out.println(d);
		
		//�Ҽ� ��° �ڸ����� ��� - ��° �ڸ����� �ݿø�
		System.out.printf("%.3f\n", d);
		//��ü �ڸ��� Ȯ��.��° �ڸ����� ��� 
		System.out.printf("%6.3f\n", d);
		
		
	}
}
