package mentor15.Singleton;

public class AppConfig {
    private String language;

    private static AppConfig instance;


    public AppConfig() {
        this.language = "English";
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getLanguage() {
        return language;
    }
}
