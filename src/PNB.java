public class PNB extends Bank{

    @Override
    int getROI() {
        return 1;
    }

    @Override
    void deposite() {
        System.out.println("1000");

    }

    @Override
    void withdrawl() {
        System.out.println("500");
    }
}
