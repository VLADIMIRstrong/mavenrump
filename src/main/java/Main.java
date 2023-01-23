import org.example.mavenrump.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int minNumber = 10;
        int maxNumber = 300;
        int count = 0;
        int myCount = service.calculateSQR(minNumber,maxNumber);
        System.out.println(myCount);
    }
}
