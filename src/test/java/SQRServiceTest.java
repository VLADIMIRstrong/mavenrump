import org.example.mavenrump.services.SQRService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test

    public void test() {

        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.calculateSQR(10, 300);

        Assertions.assertEquals(expected, actual);
    }

}
