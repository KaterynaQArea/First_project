package HW_lesson8.Phone;

public class AndroidSmartphone extends Phone {
    private String operatingSystem;
    private String chargerType;
    private String applicationStore;

    public AndroidSmartphone() {
        setOperatingSystem();
        setChargerType();
        setApplicationStore();
    }

    @Override
    public void setOperatingSystem() {
        operatingSystem = "Android 11";
    }

    @Override
    public void setChargerType() {
        chargerType = "Dash Charge";
    }

    @Override
    public void setApplicationStore() {
        applicationStore = "Play Market";
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
