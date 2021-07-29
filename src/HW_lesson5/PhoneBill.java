package HW_lesson5;

public class PhoneBill {
    public static void main(String[] args) {
        MonthlyPayment payment = new MonthlyPayment();
        double internet = payment.internet(11);
        System.out.println("Payment for the internet: " + internet + " hrn");
        double calls = payment.calls(400);
        System.out.println("Payment for the calls: " + calls + " hrn");
        double sms = payment.sms(25);
        System.out.println("Payment for the sms: " + sms + " hrn");
        double abroad1 = payment.callsAbroadZone1(5);
        System.out.println("Payment for the abroad calls Zone 1: " + abroad1 + " hrn");
        double abroad2 = payment.callsAbroadZone2(3);
        System.out.println("Payment for the abroad calls Zone 1: " + abroad2 + " hrn");
        double monthlyPayment = internet + calls + sms + abroad1 + abroad2;
        double monthlyPaymentWithTax = monthlyPayment + monthlyPayment / 100 * 7;
        System.out.println("Monthly Payment: " + monthlyPaymentWithTax + " hrn");
    }
}

class MonthlyPayment {
    double pay;

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
            pay = minutes * 0.75;
        }
        return pay;
    }

    double sms(int sms) {
        if (sms <= 50) {
            pay = sms;
        } else {
            pay = sms * 1.5;
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
}
