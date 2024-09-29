import java.util.Scanner;

public class PUMEGASUPERLIMEEEEE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //VSEM PRIVET VSEM HIII VSEM ZDRA VSEM ZDRASTVUITE!! KTO U MENYA BUDET SPISIVAT, TOT LOSHPED!

        System.out.println("tut int vvedi:");
        int intValue = scanner.nextInt();

        System.out.println("a tut double:");
        double doubleValue = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.println("a tut cheto na chirkay:");
        String stringValue = scanner.nextLine();

        System.out.println("nu dumayu za ce ti sharish (bool)(true/false):");
        boolean boolValue = scanner.nextBoolean();

         //privet)))        

        System.out.println("\nSuda chet vvedi:");
        System.out.println("tut chisli: " + intValue);
        System.out.println("s tochkoy plavayushey : " + doubleValue);
        System.out.println("cherkany che nibut: " + stringValue);
        System.out.println("nu tut zrozumilo: " + boolValue);

        //kak dela?

        System.out.println("\nyesho vot tak umeyu printf:");
        // тут я так написав, бо так простіше, хаха) іноді рофли не удобно писати
        System.out.printf("(десяткове): %d%n", intValue);
        System.out.printf("(вісімкове): %o%n", intValue);
        System.out.printf("(шістнадцяткове): %x%n", intValue);
        System.out.printf("PLavayushaya: %.2f%n", doubleValue);
        System.out.printf("Stringom davay (обмежена до 10 символів): %.10s%n", stringValue);
        System.out.printf("bool: %b%n", boolValue);

        //kak day proshyol?

        System.out.println("\nvivod cherez String.format:");
        System.out.println(String.format("(десяткове): %d", intValue));
        System.out.println(String.format("(вісімкове): %o", intValue));
        System.out.println(String.format("(шістнадцяткове): %x", intValue));
        System.out.println(String.format("PLavayushaya (до 3-х знаків після коми): %.3f", doubleValue));
        System.out.println(String.format("String (five letters ili simvolov): %.5s", stringValue));
        System.out.println(String.format("bool: %b", boolValue));

        scanner.close();



        // КОКОДЖАМБООООО АЙ АЙ АЙ
        // до речі, цей файл редачу з телефону і намагаюсь вирішити проблему з тим що консоль не переварює кирилицю
        // ну і з JavaRush я взнав що це проблема повʼізана з JDK18, тому що на JDK17 такого не було 
    }
}
