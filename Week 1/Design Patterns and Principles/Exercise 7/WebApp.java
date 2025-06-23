// File: WebApp.java
public class WebApp implements Observer {
    private String appName;

    public WebApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(double newPrice) {
        System.out.println("[" + appName + " - Web] New Stock Price: $" + newPrice);
    }

    @Override
    public String toString() {
        return appName + " WebApp";
    }
}
