import java.util.Random;
import java.util.Scanner;

    public class Sensors {
        public static void main(String[] args) {

            int humidity = 30;
            Random r = new Random();
            int number = r.nextInt(0, 50);
            System.out.println("Влажность воздуха: " + number);
            if (number >= humidity) {
                System.out.println("Кактус не надо поливать");
            } else {
                System.out.println("Кактус надо полить");

            }

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите месяц: ");
            String mouth = sc.next();


            switch (mouth) {
                case "Декабрь" -> System.out.println("Полейте цветок через месяц ");
                case "Январь" -> System.out.println("Полейте цветок через месяц ");
                case "Февраль" -> System.out.println("Полейте цветок через месяц ");
                case "Март" -> System.out.println("Полейте цветок через неделю ");
                case "Апрель" -> System.out.println("Полейте цветок через неделю ");
                case "Май" -> System.out.println("Полейте цветок через неделю ");
                case "Июнь" -> System.out.println("Полейте цветок через два дня ");
                case "Июль" -> System.out.println("Полейте цветок через два дня ");
                case "Август" -> System.out.println("Полейте цветок через два дня ");
                case "Сентябрь" -> System.out.println("Полейте цветок через неделю ");
                case "Октябрь" -> System.out.println("Полейте цветок через неделю ");
                case "Ноябрь" -> System.out.println("Полейте цветок через неделю ");
                default -> System.out.println("Введен некорректный месяц");
            }

        }

    }

