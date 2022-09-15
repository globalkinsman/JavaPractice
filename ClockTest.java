package Chapter2;

public class ClockTest {

    public static void main(String[] args){

        Clock myClock = new Clock(00,00,00);

        System.out.printf("The time is: %d:%d:%d", myClock.displayTime());

    }
}
