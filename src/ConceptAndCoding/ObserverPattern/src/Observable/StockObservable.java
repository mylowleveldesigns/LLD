package ConceptAndCoding.ObserverPattern.src.Observable;

import ConceptAndCoding.ObserverPattern.src.Observer.Observer;

public interface StockObservable {

    void add(Observer observer);

    void remove(Observer observer);

    void notifyObservers();

    void addToStockCount(int updatedStockCount);

    int getStockCount();
}
