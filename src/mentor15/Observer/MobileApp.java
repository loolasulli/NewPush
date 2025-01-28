package mentor15.Observer;

public class MobileApp implements Subscriber {

    @Override
    public void update(String news) {
        System.out.println("Mobile App: Breaking News - [news]");
    }
}
