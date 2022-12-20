package ConceptAndCoding.ObserverPattern.src.Observer;

import ConceptAndCoding.ObserverPattern.src.Observable.StockObservable;

public class EmailObserver implements Observer{
    String email;
    StockObservable observable; // Adding observable here, so that it can

    public EmailObserver(String email, StockObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmailToObserver();
    }

    public void sendEmailToObserver(){
        System.out.println("Sending email to user email - "+  email + "  Hurray!!! New stock in account. Order now - " );
    }
}
