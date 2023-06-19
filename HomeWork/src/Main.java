package src;

import src.solid.Persister;
import src.solid.Report;
import src.solid.User;
import src.solid.UserAbstract;

public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		new Report(user).report();
		new Persister(user).save();
	}
}