import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        leapYear(1900);
        leapYear(2024);
        leapYear(1582);

        System.out.println("Задача 2");
        versionOSPhone(1, 2025);

        System.out.println("Задача 3");
        int deliveryDays = сardDeliveryTime(95);
        System.out.println("Потребуется дней: " + deliveryDays);

    }

    public static void leapYear(int year) {

        if (year < 1584) {
            System.out.println(year + " год не является високосным");
        } else {
            if ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }
    }
    public static void versionOSPhone (int clientOS, int clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static int сardDeliveryTime(int deliveryDistance){

        int deliveryDays;

        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
        } else  if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = -1;
        }
        return deliveryDays;
    }


}