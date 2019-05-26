package week4;

// Class name should start with big letter
public class SummaryOfFundamentals {

    // this is default constructor. you don't need to write default constructor
    public SummaryOfFundamentals() {

    }

    // public is access modifier
    // void is return type. void means no returning
    // forLoopAndIfCondition is method name. method name should start with small letter
    public void forLoopAndIfCondition() {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");

        System.out.println();

        // print 1-5 except 3
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // if i == 3, then skip that step of for loop
            }

            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // ClassName className = new ClassName();
        SummaryOfFundamentals summaryOfFundamentals = new SummaryOfFundamentals();

        // call forLoopAndIfCondition method by using instance of class
        summaryOfFundamentals.forLoopAndIfCondition();
    }
}
