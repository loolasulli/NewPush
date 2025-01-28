package mentor15.Singleton;

public class Main {
    public static void main(String[] args) {

        AppConfig instance = AppConfig.getInstance();
        System.out.println(instance.getLanguage());
        System.out.println(instance);

        AppConfig appConfig = AppConfig.getInstance();
        appConfig.setLanguage("Russian");
        System.out.println(appConfig.getLanguage());
        System.out.println(appConfig);

    }
}
