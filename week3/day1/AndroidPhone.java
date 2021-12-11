package week3.day1;

public class AndroidPhone extends Mobile{
	
	public void takeVideo() {
		System.out.println("Video taken from Android");

	}
	
	public static void main(String[] args) {
		
		AndroidPhone ap = new AndroidPhone();
		
		ap.sendMsg();
		
	}

}
