package com.oops.intefaceDemo2;

public class MainProvider {

	public static void main(String[] args) {
		Client1 client1 = new MobileProvider();
		client1.sendSMS();
		client1.receiveSMS();
		
		Client2 client2 = new MobileProvider();
		client2.sendSMS();
		client2.makeCalls();
		client2.receiveCalls();

		Client3 client3=new MobileProvider();
		client3.makeCalls();
		client3.sendSMS();
	}

}
