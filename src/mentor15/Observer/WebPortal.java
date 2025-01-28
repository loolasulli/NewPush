package mentor15.Observer;

public class WebPortal implements Subscriber {

    @Override
    public void update(String news) {
        System.out.println("Web Portal: Latest News - [news]");
    }
}
