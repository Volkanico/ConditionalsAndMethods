package com.company;

public class CondAndMeth {

    public static boolean Ex1(int number) {
        boolean isPositive = true;
        if (number > 0) {
            return true;
        } else if (number <= 0) {
            isPositive = false;
        }
        return isPositive = false;
    }

    public static boolean Ex2(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int Ex3(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

    public static String Ex4(int day) {
        switch (day) {
            case 1:
                return "Dilluns";
            case 2:
                return "Dimarts";
            case 3:
                return "Dimecres";
            case 4:
                return "Dijous";
            case 5:
                return "Divendres";
            case 6:
                return "Dissabte";
            case 7:
                return "Diumenge";
            default:
                return "Number not found";
        }
    }

    public static String Ex5 (int hour) {
        if (hour >= 8 && hour < 12) {
            return "Matí";
        } else if (hour >= 17 && hour < 21) {
            return "Capvespre";
        } else if (hour >= 21 && hour < 6) {
            return "Vespre";
        } else if (hour >= 12 && hour < 17) {
            return "Migdía";
        } else {
            return "Hour not found";
        }

    }
    public static String Ex6 (int mark) {
        switch (mark) {
            case 1:
            case 2:
            case 3:
            case 4:
                return "Not enough";
            case 5:
                return "Enough";
            case 6:
            case 7:
                return "Good";
            case 8:
            case 9:
                return "At least perfect";
            case 10:
                return "Perfect";
            default:
                return "Incorrect mark";
        }
    }
}
