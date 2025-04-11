package hw05;

class Song {
	String title, singer, year, lang;
	
	public Song(String title, String singer, String year, String lang) {
		this.title = title;
		this.singer = singer;
		this.year = year;
		this.lang = lang;
	}
	
	void show() {
		System.out.printf("%s년 %s의 %s가 부른 %s", year, lang, singer, title);
	}
}

public class Ch4_5 {
	public static void main(String[] args) {
		Song song = new Song("가로수 그늘 아래 서면", "이문세", "1988", "한국");
		song.show();
	}
}
