package javainternship;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task2WordCount {
    public static void main(String[] args) {
 //point 1

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a text by user :");
        String text=sc.nextLine();
     //   System.out.println(text);

        // split the string and stored int o array using split function
        String[] array=text.split("\\s");

        int count=0;
        for( int i=0;i< array.length;i++)
        {
            count++;
        }
     System.out.println("tottal no of word in astring :"+ " "+count);

        ///// ignore duplicates word
        System.out.println("ignore duplicates word");
        Set<String> set=new HashSet<>();

        for(int i=0;i< array.length;i++)
        {
            if(!set.contains(array[i]))
            {
                set.add(array[i]);
            }

        }
        System.out.println("number of unique words"+" "+set.size());
    }
}
