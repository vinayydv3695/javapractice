import java.util.Scanner;

public class sc {
    public static void main(String[] args) {
        Scanner punpun = new Scanner(System.in);

        System.out.println("Are you single?");
        boolean isSingle = punpun.hasNextBoolean();
        punpun.nextLine();

        System.out.println("Who is your girlfriend?");
        String girlfriend = punpun.nextLine();

        System.out.println("punpun loves " + girlfriend);
    }
}


