public class Main {
    public static void main(String[] args) {
        Bank b;
        b=new PNB();
        System.out.println(b.getROI());
        b.withdrawl();
        b.deposite();
        b=new SBI();
        System.out.println(b.getROI());
        b.withdrawl();
        b.deposite();



    }
}