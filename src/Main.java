public class Main {
    public static void main(String[] args) {

        int deposit = 2_000;
        int account = 100 + deposit;
        int bonus;

        if (deposit >= 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Итоговый счет: " + account + " " + "Ваши бонусные рубли: " + bonus);
    }
}
