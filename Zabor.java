import java.util.Scanner;

    import java.util.Scanner;

    public class Zabor {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите длинну забора: ");
            int number = sc.nextInt();
            int totalLengthOfTheLabel = ((15/3)*62)+(12*3);
            if (totalLengthOfTheLabel <= number) {
                System.out.println("Надпись поместится на заборе!");
            } else {
                System.out.println("Надпись на заборе не поместится!");
            }
        }
    }
