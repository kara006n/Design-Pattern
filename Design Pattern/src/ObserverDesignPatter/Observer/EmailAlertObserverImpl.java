package ObserverDesignPatter.Observer;

import ObserverDesignPatter.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
	
	StockObservable observable;
	String emailId;
	
	public EmailAlertObserverImpl(String emailId, StockObservable observable){
		
		this.observable = observable;
		this.emailId = emailId;
		
	}

	@Override
	public void update() {
		sendMail(emailId, "product is in stock hurry up!");

	}

	private void sendMail(String emailId, String msg) {
		
		System.out.println("mail sent to: "+ emailId);
		
	}

}
