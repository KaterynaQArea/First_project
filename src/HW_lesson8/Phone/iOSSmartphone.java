package HW_lesson8.Phone;

public class iOSSmartphone extends Phone {
    private String operatingSystem;
    private String chargerType;
    private String applicationStore;

    public iOSSmartphone() {
        setOperatingSystem();
        setChargerType();
        setApplicationStore();
    }

    @Override
    public void setOperatingSystem() {
        operatingSystem = "iOS 14";
    }

    @Override
    public void setChargerType() {
        chargerType = "Type C";
    }

    @Override
    public void setApplicationStore() {
        applicationStore = "Apple Store";
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getChargerType() {
        return chargerType;
    }

    public String getApplicationStore() {
        return applicationStore;
    }
}

