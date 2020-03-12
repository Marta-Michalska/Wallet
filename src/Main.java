import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      /*  Scanner scan = new Scanner(System.in);
        System.out.println("Jeśli chcesz pobrać pieniądze wpisz '-', a jeśli dodać pieniądze do portfela wpisz '+'");
        String decision = scan.nextLine();

        if (decision == "+") {
            System.out.println("Jaką kwotę chcesz dodać?");
            double add = scan.nextDouble();


        }*/

      PortfelDziecka portfelBrajanka = new PortfelDziecka(100));
        portfelBrajanka.addMoney(50);


        System.out.println(portfelBrajanka);


    }
}
