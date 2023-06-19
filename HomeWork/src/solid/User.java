package src.solid;

public class User extends UserAbstract {

	public User(String name) {
		super(name);
	}

	@Override
	public String getName() {
		return super.name;
	}

}