public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int year = 2015;
        checkLeapYear(year);
        // Задача 2
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        checkOS(clientOS, clientDeviceYear);
        // Задача 3
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        numberOfDeliveryDays(deliveryDistance);
    }


    public static void checkLeapYear(int year) {
        //Високосным является каждый четвертый год, но не является каждый сотый.
        //Високосным считается каждый четырехсотый год.
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год.");
        } else {
            System.out.println(year + " год - невисокосный год.");
        }
    }

    public static void checkOS(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void numberOfDeliveryDays(int deliveryDistance) {
        int numberInterval = (deliveryDistance - 20) / 40;
        int d = (deliveryDistance - 20) % 40;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет сутки");
        } else if (d > 0) {
            System.out.println("Доставка займет " + (numberInterval + 2) + " суток");
        } else {
            System.out.println("Доставка займет " + (numberInterval + 1) + " суток");
        }
    }
}