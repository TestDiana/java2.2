public class Main {
    public static void main(String[] args) {
        int startAccountBalanceWithPenny = 100_00;
        int refill = 100_00;
        int limit = 1000_00;
        int finishAccountBalance;
        if (refill > limit) {
            finishAccountBalance = startAccountBalanceWithPenny + refill / 100;
        } else {
            finishAccountBalance = startAccountBalanceWithPenny;
        }
        System.out.println(finishAccountBalance);
    }
}
