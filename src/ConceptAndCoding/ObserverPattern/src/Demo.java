package ConceptAndCoding.ObserverPattern.src;

import ConceptAndCoding.ObserverPattern.src.Observable.ObservableImpl;
import ConceptAndCoding.ObserverPattern.src.Observable.StockObservable;
import ConceptAndCoding.ObserverPattern.src.Observer.EmailObserver;
import ConceptAndCoding.ObserverPattern.src.Observer.Observer;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        StockObservable observable = new ObservableImpl();

        List<Observer> observers = Arrays.asList( new EmailObserver("xyz@test.com", observable),
                new EmailObserver("abc@test.com", observable),
                new EmailObserver("abc@pp.com", observable),
                new EmailObserver("lmn@test.com", observable));


        observers.forEach(observable::add);
        observable.addToStockCount(3);
    }
}
