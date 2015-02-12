/**
 * Created by Mike on 2/12/2015.
 */

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Arraytest {

    public static Random rand;
    public static int number, maxValue, inserts, maxRange, counter, counts;
    public static int one = 1;
    public static Scanner scan;
    public static void main(String[] args)
    {
        scan = new Scanner(System.in);
        rand = new Random();
        System.out.println("Please enter the number of random numbers to be generated");
        maxValue = scan.nextInt();
        System.out.println("Please enter the number of the range to be generated example 0-10 : enter 10");
        maxRange = scan.nextInt();
        ArrayList<Integer> count = new ArrayList<Integer>();

        while (maxValue > inserts){
        number = rand.nextInt(maxRange) + one;
        count.add(number);
        inserts = count.size();
        System.out.println(number);

    }
        counter = one;
        while (maxRange >= counter) {

       count.listIterator(counter);
            System.out.println(count.listIterator(counter));
            counter = counter + one;
        }

        Collections.sort(count);
        System.out.println(count);
    }
}
