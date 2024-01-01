package advance.Exeception;

public class Year {
    public static void main(String[] args) {

        int year = 2016;
        boolean flag = true;

        if (year == 2016) {
            System.out.println("The year is " + year);
        }
        else if (year == 2017) {
            System.out.println("The year is " + year);
        }
        else if (year == 2018) {
            System.out.println("The year is " + year);
        }
        else {
            flag = false;
        }

        while (flag) {
            System.out.println("The year is " + year);
            flag = false;
        }
    }
}
