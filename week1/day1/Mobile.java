package week1.day1;

//cntrl + F11 -> execute class
public class Mobile {

	String mobileModel = "RedMi Note 4";

	public void makeCall() {
		System.out.println("call connected");

	}

	public void sendMsg() {
		System.out.println("message sent");

	}

	public static void main(String[] args) {

		Mobile mob = new Mobile();

		mob.makeCall();
		mob.sendMsg();

		System.out.println(mob.mobileModel);

	}

}
