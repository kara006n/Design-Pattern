package ObserverDesignPatter.Observable;

import java.util.ArrayList;
import java.util.List;

import ObserverDesignPatter.Observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StockObservable {
	
	public List<NotificationAlertObserver> observerList = new ArrayList<>();
	public int stockCount = 0;

	@Override
	public void add(NotificationAlertObserver observer) {
		observerList.add(observer);

	}

	@Override
	public void remove(NotificationAlertObserver observer) {
		observerList.remove(observer);

	}

	@Override
	public void notifySubscriber() {
		for(NotificationAlertObserver observer : observerList) {
			observer.update();
		}

	}

	@Override
	public void setStockCount(int newStockAdded) {
		if(stockCount == 0) {
			notifySubscriber();
		}
		
		stockCount = stockCount + newStockAdded;

	}

	@Override
	public int getStockCount() {
		return stockCount;
	}

}
