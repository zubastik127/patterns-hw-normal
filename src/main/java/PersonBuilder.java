import person.Fio;
import person.Person;
import person.Phone;
import person.Physical;
import person.appearance.Appearance;

public class PersonBuilder {

    private final String id;
    private Fio fio;
    private Physical phys;
    private Appearance appearance;
    private Phone phone;

    public PersonBuilder(final String id) {
        this.id = id;
    }

    public final PersonBuilder withFio(final Fio fio) {
        this.fio = fio;
        return this;
    }

    public final PersonBuilder withPhys(final Physical phys) {
        this.phys = phys;
        return this;
    }

    public final PersonBuilder withAppearance(final Appearance appearance) {
        this.appearance = appearance;
        return this;
    }

    public final PersonBuilder withPhone(final Phone phone) {
        this.phone = phone;
        return this;
    }

    public final Person build() {
        final Person person = new Person();
        person.id = this.id;
        person.fio = this.fio;
        person.phys = this.phys;
        person.appearance = this.appearance;
        person.phone = this.phone;

        return person;
    }
}
