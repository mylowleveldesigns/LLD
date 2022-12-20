package ConceptAndCoding.ObserverPattern.src.Observable;

import ConceptAndCoding.ObserverPattern.src.Observer.Observer;

import java.util.*;

public class ObservableImpl implements StockObservable{

    private List<Observer> observersList = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(Observer observer) {
        observersList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observersList.forEach(Observer::update);
    }

    @Override
    public void addToStockCount(int updateByCount) {
        if(stockCount == 0) {
            notifyObservers();
            // You might want to remove all observers from the list as well
        }
        stockCount = stockCount + updateByCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
