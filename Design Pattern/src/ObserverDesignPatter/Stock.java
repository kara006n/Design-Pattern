package ObserverDesignPatter;

import ObserverDesignPatter.Observable.IphoneObservableImpl;
import ObserverDesignPatter.Observable.StockObservable;
import ObserverDesignPatter.Observer.EmailAlertObserverImpl;
import ObserverDesignPatter.Observer.MobileAlertObserverImpl;
import ObserverDesignPatter.Observer.NotificationAlertObserver;

public class Stock {
	
	public static void main(String[] args) {
		
		StockObservable iphoneStockObservable = new IphoneObservableImpl();
		
		
		NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com", iphoneStockObservable);
		NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz2@gmail.com", iphoneStockObservable);
		NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xyz_username", iphoneStockObservable);
		
		
		iphoneStockObservable.add(observer1);
		iphoneStockObservable.add(observer2);
		iphoneStockObservable.add(observer3);
		
		iphoneStockObservable.setStockCount(10);
	}

}
