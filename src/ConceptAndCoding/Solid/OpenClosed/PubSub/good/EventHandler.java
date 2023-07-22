package ConceptAndCoding.Solid.OpenClosed.PubSub.good;

import ConceptAndCoding.Solid.OpenClosed.PubSub.Event;

import java.util.List;

public class EventHandler {
    private List<Subscriber> subscribers;

    private void handleEvent(Event event){
        for(Subscriber subscriber: subscribers){
            subscriber.handle(event);
        }

        // This code is Open for extension, but closed for modification
    }

    // Code for registering and unregistering from subscriber list
}
