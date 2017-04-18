package chapter02;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Song song=new Song();  	//생성자가 하나라도 있으면 기본 생성자를 만들어주지 않는다.
								//기본생성자를 만들어 주면 에러가 나지 않는다.*/
		
		
		Song song=new Song("졸은날","아이유","Real","이민수",2010,3); //파라미터값이 반드시 존재하는 경우에 사용하면 좋지만, 파라미터 값을 알지 못하는 경우가 있을 때는 
																//생성자 오버로딩을 사용하여 기본 생성자를 사용하거나 파라미터 값을 줄인 생성자를 만들어서 사용한다.
		
		Song song2=new Song("She's Baby","지코");
		Song song3=new Song("얼굴 찌푸리지 말아요","하이라이트");
		
		/*song.setAlbum("Real");
		song.setArtist("아이유");
		song.setComposer("이민수");
		song.setTitle("좋은날");
		song.setTrack(3);
		song.setYear(2010);
		*/     //기본생성자가 존재할경우 setter를 이용해서 값을 지정했지만, 파라미터 값이 있는 생성자를 사용할 경우는 위와 같이 값을 setting해 줄 수 있다.
		song.show();
		song2.show();
		song3.show();

	}

}
