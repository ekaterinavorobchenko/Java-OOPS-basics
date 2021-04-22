package InterfaceConcept;

public class Developing implements Bankingclient,Domainclient {
    public static void main(String[] args){
        Developing d = new Developing();
        d.login();
        d.paycreditcard();
        d.transferbalance();
        d.login();
        Bankingclient dr = new Developing();
        //dr.login();
        Domainclient ds = new Developing();
        ds.ivestment();

    }

    @Override
    public void paycreditcard() {
        System.out.println("Paycredit implemeted");

    }

    @Override
    public void transferbalance() {
        System.out.println("transfer balance implemeted");

    }

    @Override
    public void checkingbalance() {
        System.out.println("checking balance implemeted");
    }
    public void login()
    {
        System.out.println("loggedin");
    }

    @Override
    public void ivestment() {
        System.out.println("investing something");
    }
}
