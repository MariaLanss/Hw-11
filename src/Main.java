public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        //Високосным является каждый четвертый год, но не является каждый сотый.
        //Високосным считается каждый четырехсотый год.
        int year = 2022;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год.");
        } else {
            System.out.println(year + " год - невисокосный год.");
        }
    }

    public static void task2() {
        int clientDeviceYear = 2015;
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.print("Установите приложение для iOS");
            if (clientDeviceYear >= 2015) {
                System.out.print(" по ссылке");
            } else {
                System.out.print(" облегченную версию по ссылке");
            }
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println();
    }

    public static void task3() {
       int deliveryDistance = 95;
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