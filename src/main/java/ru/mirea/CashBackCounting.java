package ru.mirea;

public class CashBackCounting {
    private final int BOUNDARY = 1000;
    public int remain(int amount) {
        if (amount % BOUNDARY == 0) {
            return 0;
        } else {
            return BOUNDARY - (amount % BOUNDARY);
        }
    }

}
