import java.nio.charset.Charset;
import java.util.Scanner;

public final class Controller {

    private static Controller instance2;

    private Controller() {
    }

    public static Controller getInstance2() {
        if (instance2 == null) {
            instance2 = new Controller();
        }
        return instance2;
    }

    private final InputProcessor processor = new InputProcessor();

    public void launch() {
        final Scanner scanner = new Scanner(System.in, Charset.defaultCharset()); //Charset - кодировка
        String input;
        while (true) {
            System.out.println("Введите 4 цифры от 0 до 9 без пробелов (Q для выхода)");
            input = scanner.nextLine();
            if ("q".equalsIgnoreCase(input)) {
                break;
            } else {
                System.out.println(processor.processInput(input));
                System.out.println("------------");
            }
        }
        scanner.close();
    }
}
