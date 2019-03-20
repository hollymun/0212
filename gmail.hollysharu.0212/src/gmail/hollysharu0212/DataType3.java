package gmail.hollysharu0212;

public class DataType3 {

	public static void main(String[] args) {
		byte b1=10;
		byte b2=20;
		//int보다 작은 크기의 데이터끼리 연산을 하면 int로 변경해서 연산을 수행함
		//연산의 결과가 크기 때문에 byte에는 저장할 수 없음 
		//byte result=b1+b2; 
		int result=b1+b2;
		System.out.println("결과: "+result);

		int x=100;
		//표현범위가 큰 데이터는 작은 표현범위의 변수에 대입 안 됨
		//이런 경우, 강제로 대입하려고 하면 int를 byte로 변경해야 함
		//★데이터 손실에 유의해야 함★
		//byte b=x; 
		
		//x를 byte로 변경해서 b에 대입
		byte b=(byte)x;
		System.out.println("b: "+b);
		
		//byte의 표현범위보다 더 큰 데이터를 대입해서 데이터 손실됨 : Overflow
		x=200;  
		b=(byte)x;
		System.out.println("b: "+b);
		
		double d=3.14;
		//실수를 정수에 대입하려면 강제로 정수 데이터로 변경해야 함
		//소수 버려짐 ex)게시판 페이지수  
		x=(int)d;
		System.out.println("x: "+x);

		int n1=15;
		int n2=2;
		//작은 표현범위의 숫자 데이터를 큰 표현범위의 숫자 데이터로 변경하는 이유는
		//원하는 결과를 얻기 위해서 
		double r=(double)n1/n2;
		System.out.println("r: "+r);
		
		double su=5.6;
		//위의 숫자를 소수 첫째 자리에서 반올림해서 출력
		//5.6이면 6, 5.4면 5로 출력
		int h=(int)(su+0.5);
		System.out.println("h: "+h);
		
		su=5.46;
		
		su=su*10;
		h=(int)(su+0.5);
		su=h/10.0;
		System.out.println("su: "+su);
	
		
	}
}
