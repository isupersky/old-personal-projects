//Write Java code to define List.
//Insert 5 floating point numbers in List, and using an iterator,
// find the sum of the numbers in List.

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Ques1 {


    public static void main(String[] args) {
        float sum=0;
        List<Float> list = new ArrayList<>();
        for(int i= 0;i<5;i++){
//            list.add()
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a Float Number:");
            float temp = sc.nextFloat();
            list.add(temp);
            sum+=temp;

        }
        System.out.println("Sum of list is: "+sum);

        ListIterator <Float>iterator = list.listIterator();
        


    }
}
