public class SBI extends Bank{
    @Override
    int getROI() {
        return 2;
    }

    @Override
    void deposite() {
        System.out.println("2000");
    }

    @Override
    void withdrawl() {
        System.out.println("1000");
    }
}
