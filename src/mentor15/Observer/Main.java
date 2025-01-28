package mentor15.Observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        Subscriber app = new MobileApp();
        Subscriber portal = new WebPortal();
        agency.addSubscriber(app);
        agency.addSubscriber(portal);
        agency.publishNews("");
        agency.removeSubscriber(app);
        agency.publishNews("");
    }
}
