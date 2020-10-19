public class Main {
    public static void main(String[] args) {
        int StartAccountBalanceWithPenny = 100_00;
        int Refill = 2000_00;
        int Bonus;
        int Limit = 1000_00;
        int FinishAccounBalance;
        if (Refill > Limit) {
            FinishAccounBalance = StartAccountBalanceWithPenny + Refill / 100;
        } else {
            FinishAccounBalance = StartAccountBalanceWithPenny;
        }
        System.out.println(FinishAccounBalance);
    }
}
