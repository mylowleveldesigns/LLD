package ConceptAndCoding.Solid.OpenClosed.PubSub.good;

import ConceptAndCoding.Solid.OpenClosed.PubSub.Event;

public interface Subscriber {
    void handle(Event event);
}
