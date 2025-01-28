package mentor15.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsProvider {
    List<Subscriber> subscribers = new ArrayList<>();
    String news;

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    public void publishNews(String news) {
        this.news = news;
        notifySubscribers();
    }
}