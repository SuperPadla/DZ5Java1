import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        int count = service.numberInTheRange(-150, 5);
        System.out.println(count);
    }
}
