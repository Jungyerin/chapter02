package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1;
		
		try{
			int b=100/a;  //예외가 발생하면 그 밑의 코드는 실행되지 않는다. 0으로 나눠서 예외를 던짐
		}catch(ArithmeticException ex){
			//ex.printStackTrace();
			//1. 사과
			System.out.println("죄송합니다."); //아무것도 써주지 않으면 에러가 난지도 모르기 떄문에 좋지 않음.
			//2. 로그 남기기
			System.out.println("로그 : "+ex);
			//3. 종료
			return;
		}finally{
			//자원 정리
			System.out.println("자원정리");
		}
		
		//예외 처리를 해주면 그 밑의 코드는 실행이 됨.
		System.out.println("some more code");

	}

}
