package clase1;

public class DClases {
	public class Book{
	private String title;
	private String author;
	private String id;
	private boolean lent;
	public Book (String title,String author,String id) {
		this.author=author;
		this.title=title;
		this.id=id;
		this.lent=false;
	}
	public void bookLend() {
		this.lent=true;
	}
	public void bookReturn() {
		this.lent=false;
	}
	public void bookStatus() {
	System.out.println(this.lent ? this.title+" - Lent":this.title+" - In library");
	}
	public void getAuthor(){
		System.out.println(this.title+" - Author: "+this.author);
	}
	public void getId(){
		System.out.println(this.title+" - ID: "+this.id);
	}
	public void getTitle(){
		System.out.println(this.id+" - Title: "+this.title);
	}
	}
	public class Clock{
		private int hour;
		private int minutes;
		private int seconds;
		private String alarm;
		public Clock (int hour, int minutes, int seconds) {
			if(hour<24&&minutes<60&&seconds<60){
				this.hour=hour;
				this.minutes=minutes;
				this.seconds=seconds;
			}
		}
		public void getTime(){
			System.out.println(hour+":"+minutes+":"+seconds);
		}
		public String setAlarm(Clock) {
			alarm=this.Clock;
		}
		
	}
}