// File: MobileApp.java
public class MobileApp implements Observer {
    private String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(double newPrice) {
        System.out.println("[" + appName + " - Mobile] New Stock Price: $" + newPrice);
    }

    @Override
    public String toString() {
        return appName + " MobileApp";
    }
}
