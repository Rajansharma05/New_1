import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//Java String token count then split the string

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the String \n");

        if (!sc.hasNext()){
            System.out.println(0);
        }else {
            String input=sc.nextLine();
            String[]a = input.trim().split("[ !,?._'@]+");
            ArrayList<String>listOfStrings = new ArrayList<>(Arrays.asList(a));
            System.out.println(listOfStrings.size());

            for(String str:listOfStrings){
                System.out.println(str);
            }
        }



    }
}
