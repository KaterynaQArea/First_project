package HW_lesson6;

public class PhoneBill {
    public static void main(String[] args) {
        GetPhoneBill getPhoneBill = new GetPhoneBill(11, 1000, 100, 5, 6);
        System.out.println("Phone bill: " + getPhoneBill.getPhoneBill() + "hrn");
    }
}

class GetPhoneBill {
    private double pay;

    public GetPhoneBill(double gig, int minutes, int sms, int minutes1, int minutes2) {
        this.pay = CalculatePhoneBill(gig, minutes, sms, minutes1, minutes2);
    }

    public double getPhoneBill() {
        return pay;
    }

    double internet(double gig) {
        if (gig > 8) {
            double overGb = gig - 8;
            pay = overGb * 2 * 50;
        }
        return pay;
    }

    double calls(int minutes) {
        if (minutes <= 500) {
            pay = minutes * 0.5;
        } else {
            int overMinutes = minutes - 500;
            pay = 250 + overMinutes * 0.75;
        }
        return pay;
    }

    double sms(int sms) {
        if (sms <= 50) {
            pay = sms;
        } else {
            int overSms = sms - 50;
            pay = 50 + overSms * 1.5;
        }
        return pay;
    }

    double callsAbroadZone1(int minutes) {
        pay = minutes * 1.5;
        return pay;
    }

    double callsAbroadZone2(int minutes) {
        pay = minutes * 2;
        return pay;
    }

    double CalculatePhoneBill(double gig, int minutes, int sms, int minutes1, int minutes2) {
        double payForInternet = internet(gig);
        double payForCalls = calls(minutes);
        double payForSms = sms(sms);
        double payCallsAbroadZone1 = callsAbroadZone1(minutes1);
        double payCallsAbroadZone2 = callsAbroadZone2(minutes2);
        return (payForInternet + payForCalls + payForSms + payCallsAbroadZone1 + payCallsAbroadZone2) +
                (payForInternet + payForCalls + payForSms + payCallsAbroadZone1 + payCallsAbroadZone2) / 100 * 7;
    }
}
