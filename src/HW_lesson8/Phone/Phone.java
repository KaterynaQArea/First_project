package HW_lesson8.Phone;

public abstract class Phone {
    public void dialing() {
        System.out.println("It's already dialing..");
    }

    public abstract void setOperatingSystem();

    public abstract void setChargerType();

    public abstract void setApplicationStore();
}
