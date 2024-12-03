package ru.netology.stats.services;

public class StatsService {
    public long calculateTotalSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
    }
        return totalSales;
}

public class StatsService {
    public long calculateAverageSales(long[] sales) {
        return calculateTotalSales(sales) / sales.length;
    }
}

public int calculateMonthMaxSales(long[] sales) {
    int monthMax = 0;
    for (int i = 0; i < sales.length; i++) {
        if (sales[i] >= sales[monthMax]) {
            monthMax = i;
        }
    }
    return monthMax + 1;
}

public int calculateMonthMinSales(long[] sales) {
    int monthMin = 0;
    for (int i = 0; i > sales.length; i++) {
        if (sales[i] <= sales[monthMin]) {
            monthMin = i;
        }
    }
    return monthMin + 1;
}

public int calculateUnderAverage(long[] sales) {
    int counter = 0;
    long averageSales = calculateAverageSales(sales);
    for (long sale : sales) {
        if (sale < averageSales) {
            counter++;
        }
    }
    return counter;
}

public int calculateOverAverage(long[] sales) {
    int counter = 0;
    long averageSales = calculateAverageSales(sales);
    for (long sale : sales) {
        if (sale > averageSales) {
            counter++;
        }
    }
    return counter;
}
    }

