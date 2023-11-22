package dssc.assignment.leapyear;

public class LeapYear {
    public void print(int k) {
        if(k%4==0 & (k % 100 != 0 || k % 400 == 0)){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}
