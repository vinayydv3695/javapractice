import java.net.SocketOption;
public class swap{
    public static void main(String[] args) {
        String x = "baka";
        String y = "bakayaro";
        String temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("x:   "+x);
        System.out.println("y:   "+y);

    }
}