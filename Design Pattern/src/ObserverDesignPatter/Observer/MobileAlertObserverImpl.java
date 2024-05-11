package ObserverDesignPatter.Observer;

import ObserverDesignPatter.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

	StockObservable observable;
	String username;
	
	public MobileAlertObserverImpl(String emailId, StockObservable observable){
		
		this.observable = observable;
		this.username = emailId;
		
	}

	@Override
	public void update() {
		sendMail(username, "product is in stock hurry up!");

	}

	private void sendMail(String username, String msg) {
		
		System.out.println("message sent to: "+ username);
		
	}
}
