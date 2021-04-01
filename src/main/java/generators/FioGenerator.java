package generators;

import person.Fio;
import utils.FileReader;
import static utils.MyMath.getDigitsSum;

public class FioGenerator implements Generator<Fio> {

    private String lastName;
    private String firstName;
    private String middleName;

    /**
     * ФИО берутся из соответствующих файлов по индексу в листе:
     * Фамилия - сумма цифр в коде
     * Имя - сумма первых двух цифр
     * Отчество - сумма последних двух цифр.
     *
     * @param code код для генерации
     */

    @Override
    public final void generateParams(final int code) {
        //final int lastNameIndex = getDigitsSum(code); - можно удалить переменную
        final String sex = (getDigitsSum(code) % 2 == 0) ? "f" : "m";

        setLastNameFromFile(getDigitsSum(code), sex);
        setFirstNameFromFile(getDigitsSum(code / 100), sex);
        setMiddleNameFromFile(getDigitsSum(code % 100), sex);
    }

    private void setLastNameFromFile(final int i, final String sex) {
        lastName = FileReader.getInstance().getLinesFromFile("lastNames_" + sex).get(i);
    }

    private void setFirstNameFromFile(final int i, final String sex) {
        firstName = FileReader.getInstance().getLinesFromFile("names_" + sex).get(i);
    }

    private void setMiddleNameFromFile(final int i, final String sex) {
        middleName = FileReader.getInstance().getLinesFromFile("middleNames_" + sex).get(i);
    }

    @Override
    public final Fio buildResponse() {
        return new Fio(lastName, firstName, middleName);
    }
}

