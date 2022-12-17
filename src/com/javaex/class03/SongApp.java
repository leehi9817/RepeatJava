package com.javaex.class03;

public class SongApp {
	
	public static void main(String args[]) {
		
		Song s01 = new Song("좋은날","아이유","Real","이민수",2010,3);
		Song s02 = new Song("거짓말","BIGBANG","Always","G-DRAGON",2007,2);
		Song s03 = new Song();
		
		s03.setTitle("벚꽃엔딩");
		s03.setArtist("버스커버스커");
		s03.setAlbum("버스커버스커1집");
		s03.setComposer("장범준");
		s03.setYear(2012);
		s03.setTrack(4);
		
		s01.showInfo();
		s02.showInfo();
		s03.showInfo();
	}
}
