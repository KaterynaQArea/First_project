package HW_lesson8.Phone;

public class SmartphoneTester {
    public static void main(String[] args) {
        iOSSmartphone iPhone = new iOSSmartphone();
        System.out.println("iPhone has the following technical characteristics:" +
                "\nCharge type: " + iPhone.getChargerType() + "\nApplication store: " + iPhone.getApplicationStore() +
                "\nOperating system: " + iPhone.getOperatingSystem());
        System.out.println();

        AndroidSmartphone onePlus = new AndroidSmartphone();
        System.out.println("OnePlus has the following technical characteristics:" +
                "\nCharge type: " + onePlus.getChargerType() + "\nApplication store: " + onePlus.getApplicationStore() +
                "\nOperating system: " + onePlus.getOperatingSystem());
    }
}
