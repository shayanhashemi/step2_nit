import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Name = name();
        String Number = number_student();
        String[] Fav = favourite();
        printinfo(Name , Number , Fav);

    }

    public static String name() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name : ");
        String name = scanner.next();
        System.out.println("do you have a enter pasvand ? enter yes or no  ");

        String pasvand = scanner.next();
        String paswand = "";
        String finalfullname ;
        if (pasvand.equals("No") || pasvand.equals("no")) {

            finalfullname = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        }
        else{
            System.out.println("enetr your pasvand : ");
            paswand = scanner.next();

            finalfullname = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase()
               + "  "  + paswand.substring(0, 1).toUpperCase() + paswand.substring(1).toLowerCase();
        }


        return finalfullname;
    }

    public static String number_student() {
        String studentnumber;

        boolean student = false;
        Scanner num = new Scanner(System.in);
        System.out.println("enter your student number : ");
        studentnumber = num.next();

        if (studentnumber.length() > 5 && studentnumber.length() < 16) {
            student = true;

        } else {
            return (" please enter correct information");

        }
        return studentnumber;
    }

    public static String[] favourite() {

        String[] intersted = new String[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <11 ; i++) {
            while (true) {
                System.out.print("enter 10 things you like it " + i + " : ");
                intersted[i - 1] = scanner.next();
                boolean f = true;
                for (int j = 0; j < i - 1 ; j++) {
                    if (intersted[j].equals(intersted[i - 1]))
                        f = false;
                }
                if (intersted[i - 1].isEmpty() ) {
                    System.out.println("please write some thing");

                }else {
                    break;
                }
            }
        }


        return intersted;

    }

    public static void printinfo(String name , String number_student , String[] favourite){
        System.out.println("Hi.my name is "+ name);
        System.out.println("my student numbeer is "+ number_student);
        System.out.println("and here 10 of my intrest ");
        for (int i = 1; i <11 ; i++) {
            System.out.println(i + "=" + favourite[i-1]);
        }

        
    }

}