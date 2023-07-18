package week1.day2;

public class Mobile {
	
	public void sendSMS() {
		System.out.println("From Oppo");
	}

	public long makeCall(long phone) {
		
		return phone;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile device=new Mobile();
device.sendSMS();
long makeCall = device.makeCall(123456789);
System.out.println(makeCall);
//System.out.println(device.makeCall(123456789));

	}

}
