package src.solid;

public abstract class UserAbstract {

    protected String name;

    protected UserAbstract(String name) {
        this.name = name;
    }

    public abstract String getName();
}
