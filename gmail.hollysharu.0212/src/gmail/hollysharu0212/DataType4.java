package gmail.hollysharu0212;

public class DataType4 {

	public static void main(String[] args) {
		int a=10;
		int b=11;
		//a�� b�� ����ϰ� �ִ� �������� ��ġ Ȯ�� - 2���� ���� �ٸ��Ƿ� �ٸ� �ڵ� ��� 
		System.out.println("a: "+System.identityHashCode(a));
		System.out.println("b: "+System.identityHashCode(b));

		//b�� ������ ���� ����Ű�Ƿ� b�� ���� �ڵ� ��� 
		int c=11;
		System.out.println("c: "+System.identityHashCode(c));
		
		System.out.println("==============================");

		double d=10.123456;
		double e=10.123456;
		double f=10.123456;
		System.out.println("d: "+System.identityHashCode(d));
		System.out.println("e: "+System.identityHashCode(e));
		System.out.println("f: "+System.identityHashCode(f));
		
		System.out.println("==============================");

		//���� ������ �ڷ����� �޶� �ٸ� �ڵ� ��� 
		long g=10;
		long h=10;
		System.out.println("g: "+System.identityHashCode(g));
		System.out.println("h: "+System.identityHashCode(h));
		
	}
}
