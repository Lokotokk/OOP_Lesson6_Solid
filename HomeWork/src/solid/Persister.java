package src.solid;

public class Persister implements PersisterIn {
	private UserAbstract userAbstract;
	
	public Persister(UserAbstract userAbstract){
		this.userAbstract = userAbstract;
	}
	
	public void save(){
		System.out.println("Save user: " + userAbstract.getName());
	}
}