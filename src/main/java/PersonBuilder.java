import person.Fio;
import person.Person;
import person.Phone;
import person.Physical;
import person.appearance.Appearance;

public class PersonBuilder {

    private final String id2;
    private Fio fio2;
    private Physical phys2;
    private Appearance appearance2;
    private Phone phone2;

    public PersonBuilder(final String id) {
        this.id2 = id;
    }

    public final PersonBuilder withFio(final Fio fio) {
        this.fio2 = fio;
        return this;
    }

    public final PersonBuilder withPhys(final Physical phys) {
        this.phys2 = phys;
        return this;
    }

    public final PersonBuilder withAppearance(final Appearance appearance) {
        this.appearance2 = appearance;
        return this;
    }

    public final PersonBuilder withPhone(final Phone phone) {
        this.phone2 = phone;
        return this;
    }

    public final Person build() {
        final Person person = new Person();
        person.id = this.id2;
        person.fio = this.fio2;
        person.phys = this.phys2;
        person.appearance = this.appearance2;
        person.phone = this.phone2;

        return person;
    }
}
