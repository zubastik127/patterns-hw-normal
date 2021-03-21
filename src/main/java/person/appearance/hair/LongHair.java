package person.appearance.hair;

public class LongHair extends Hair {

    private final String color;

    public LongHair(final String color) {
        this.color = color;
    }

    @Override
    public final String toString() {
        return "длинные, " + color;
    }
}
