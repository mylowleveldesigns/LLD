package ConceptAndCoding.Solid.OpenClosed.PubSub.bad;

import ConceptAndCoding.Solid.OpenClosed.PubSub.Event;

public class EventHandler {
    private AnalyticsSubscriber analyticsSubscriber;
    private LogsSubscriber logsSubscriber;

    public void handleEvent(Event event){
        analyticsSubscriber.analyze(event);
        logsSubscriber.logEvent(event);

        // Every time there is a new subscriber, we will have to modify this method and the subscriber event here
        // Which is not a good design
    }
}
