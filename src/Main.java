public class Main {
    public static void main(String[] args) {


        System.out.println("Задание 1-2");
        //Задание 1-2

        int clientOS = 1;
        int clientDeviceYear = 2014;
        boolean OS = clientOS == 0;
        if (OS) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


        System.out.println("Задание 3");
        //Задание 3

        int year = 2021;
        if (year % 4 == 0) {
            System.out.println(year + " Данный год високосный");
        } else {
            System.out.println(year + " Данный год не високосный");
        }


        System.out.println("Задание 4");
        //Задание 4

        int deliveryDistance = 95;
        if (deliveryDistance <= 19) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance <= 59) {
            System.out.println("Потребуется дней: 2");
        } else {
            System.out.println("Потребуется дней: 3");
        }
        System.out.println("Задание 5");
        //Задание 5

        int monthNumber = 12;
        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зимний месяц");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весенний месяц");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Летний месяц");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осенний месяц");
                    break;

            }
        }
    }
}