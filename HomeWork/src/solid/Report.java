package src.solid;

public class Report implements Reportable{
    private UserAbstract userAbstract;
    public Report(UserAbstract userAbstract) {
        this.userAbstract=userAbstract;
    }
    @Override
    public void report() {
        System.out.println("Report for user: " + userAbstract.getName());
    }
}
