package chapter02;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
	
	public Song(String title,String artist)
	{
		//이미 만들어 놓은 생성자를 호출하게 되면 기존의 코드를 중복없이 가지고 와서 사용할 수 있다.
		
		this(title, artist,"","",0,0); //다른 생성자를 불러와서 사용
	}
	
	//만약 생성자 오버로딩을 할때, 기존 생성자에 코드가 존재하는데 생성자를 오버로딩 할 때마다 이 코드들을 모두 복사해서 가야하는 문제점이 생김.->기존의 코드를 불러서 사용.
	
	/*public Song(){
		
	}							//생성자 오버로드*/
	
	public Song(String title, String artist, String album, String compsoer, int year, int track)
	{
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track=track;
				 
	}  //생성자를 private로 놓는 경우도 있음(싱글톤패턴)
	

	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void show(){
		
		System.out.println(
				artist+" "+
				title+"("+
				album+","+
				year+","+
				track+"번 track,"+
				composer+"작곡)");
	}
	
	
	
	

}
