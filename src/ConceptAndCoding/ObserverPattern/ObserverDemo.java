package ConceptAndCoding.ObserverPattern;

public class ObserverDemo {
    public static void main(String[] args) {
        System.out.println("Enter Text : ");
        EventSource eventSource = new EventSource();

        eventSource.addObserver(new EventSource.Observer() {
            @Override
            public void update(String event) {
                System.out.println("Received Response for observer 1 - " + event);
            }
        });

        eventSource.addObserver(event -> System.out.println("Received Response for observer 2- " + event));


        eventSource.scanSystemIn();
    }

}
