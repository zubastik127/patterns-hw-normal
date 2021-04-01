import generators.AppearanceGenerator;
import generators.FioGenerator;
import generators.PhoneGenerator;
import generators.PhysGenerator;
import person.Person;
import person.Phone;

public class PersonFactory {

    public static Person getRandomPerson(final String input) {

        final FioGenerator fioGenerator = new FioGenerator();
        fioGenerator.generateParams(Integer.parseInt(input));

        final PhysGenerator physGenerator = new PhysGenerator();
        physGenerator.generateParams(Integer.parseInt(input));

        final AppearanceGenerator appearanceGenerator = new AppearanceGenerator();
        appearanceGenerator.generateParams(Integer.parseInt(input));

        Phone phone = null;
        // добавляем телефон, только если введённый код не палиндром
        if (!input.equals(new StringBuilder(input).reverse().toString())) {
            final PhoneGenerator phoneGenerator = new PhoneGenerator();
            phoneGenerator.generateParams(Integer.parseInt(input));
            phone = phoneGenerator.buildResponse();
        }

        return new PersonBuilder(input)
                .withFio(fioGenerator.buildResponse())
                .withPhys(physGenerator.buildResponse())
                .withAppearance(appearanceGenerator.buildResponse())
                .withPhone(phone)
                .build();
    }
}
