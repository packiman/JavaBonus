public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int balance = 300;
        int donation = 2500;

        int bonus;
        if (donation >= 1000) {
            bonus = donation / 100;
        } else {
            bonus = 0;
        }
        int result = balance + bonus + donation;
        System.out.println("Итоговый баланс: " + result);
    }
}