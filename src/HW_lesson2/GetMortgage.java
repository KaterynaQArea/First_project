package HW_lesson2;

public class GetMortgage {
    public static void main(String[] args) {
        int profit = 60000;
        boolean result = methodProfit(profit);
        System.out.println(result);
    }
    public static boolean methodProfit(int profit){
        return profit < 50000 && profit > 20000;
        /*if (profit < 50000 && profit > 20000)
         return true;
         else
         return false;*/
    }
}
