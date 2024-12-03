import ru.netology.stats.services;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();

        long expected = 180;
                long actual = service.calculateTotalSales(8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18);
        System.out.println("1." + expected + " == ? == " + actual);

        expected = 15;
        actual = service.calculateAverageSales(8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        System.out.println("2." + expected + " == ? == " + actual);
    }
}
