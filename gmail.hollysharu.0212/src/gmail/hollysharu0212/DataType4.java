package gmail.hollysharu0212;

public class DataType4 {

	public static void main(String[] args) {
		int a=10;
		int b=11;
		//a와 b가 사용하고 있는 데이터의 위치 확인 - 2개의 값이 다르므로 다른 코드 출력 
		System.out.println("a: "+System.identityHashCode(a));
		System.out.println("b: "+System.identityHashCode(b));

		//b와 동일한 값을 가리키므로 b와 같은 코드 출력 
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

		//값은 같지만 자료형이 달라서 다른 코드 출력 
		long g=10;
		long h=10;
		System.out.println("g: "+System.identityHashCode(g));
		System.out.println("h: "+System.identityHashCode(h));
		
	}
}
