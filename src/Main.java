public class Main {
    public static void main(String[] args) {
        int startingBalance = 600; // начальный баланс клиента
        int amount = 1900; // сумма пополнения

        int bonus = 0; // начальное значение бонуса

        if (amount > 1000) {
            bonus = (amount / 100); // рассчитываем бонус
        }

        int totalBalance = startingBalance + amount + bonus;

        System.out.println("Итоговая сумма на счету клиента: " + totalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus + " рублей");
    }
}
