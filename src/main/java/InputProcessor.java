
public class InputProcessor {

    public final String processInput(final String input) {
        String result;

        if (input.trim().matches("\\d{4}")) {
            result = PersonFactory.getRandomPerson(input).toString();
        } else {
            result = "Неверный ввод.";
        }
        return result;
    }
}
