package gmail.hollysharu0212;

public class DataType1 {


	public static void main(String[] args) {
	/*
		//@나이를 정수로 저장할 수 있는 변수 생성
		int age;
		//변수를 선언만 하면 공간할당은 되지 않음
		//초기값을 대입해서 공간할당을 받아야만 사용가능
		//System.out.println("나이: "+age);
		
		//변수에 초기값 대입
		age=11;
		System.out.println("하루 나이: "+age);
		//초기값을 이미 대입했으므로 값을 4로 변경하는 것
		age=4;
		System.out.println("박시 나이: "+age);

		//@변수는 자신이 저장할 수 있는 크기보다 더 큰 숫자는 저장할 수 없음
		//age=200000000000;
		
		//@long 형 정수 변수를 생성하고 데이터 저장 
		long su;
		su=20000000000000L;
		
		//@문자 1개는 char에 저장 가능
		//문자는 숫자와 '문자'의 형태로도 저장 가능
		//char가 다른 정수 자료형과 다른 점은 출력할 때는 문자로 한다는 점 
		char ch;
		short s; 
		ch=65+32;
		s=65;
		System.out.println("char: "+ch); 
		System.out.println("s: "+s);
		
		//@실수 자료형은 float과 double 
		float f=3.7f; //float은 뒤에 f를 붙여서 사용 
		double d=3.7;
		
		//@boolean은 true 또는 false만 저장
		boolean b=true;
		
		//하나의 영역에 동일한 이름의 변수를 2개 이상 만들 수 없음
		//int b;
	*/
	
		//@나이와 키와 성별을 저장하는 변수를 만들고 데이터를 저장한 출력
		//성별은 M이나 F로 저장
		//나이는 정수, 키는 실수로 저장 
		char gender='M';
		int age=11;
		double height=70.5; 
		System.out.println("하루 성별: "+gender);
		System.out.println("나이: "+age+"세");
		System.out.println("키: "+height+"cm");
	
	
	}
}
