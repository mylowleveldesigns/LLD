package ConceptAndCoding.Solid.OpenClosed.PubSub.good;

import ConceptAndCoding.Solid.OpenClosed.PubSub.Event;

public class LogsSubscriber implements Subscriber {
    @Override
    public void handle(Event event) {
        // Code to log for event
    }
}
