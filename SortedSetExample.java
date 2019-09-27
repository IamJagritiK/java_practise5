
import java.util.*;
import java.util.Scanner;

public class SortedSetExample {

//    method is used to implement set interface which sorts the given randomly ordered names in
//        ascending order
public static void main(String[] args){
Scanner scan = new Scanner(System.in);

String str= scan.nextLine();
String result=sortArrayListUsingSortedSet(str);

System.out.print(result); 
}

    public static String sortArrayListUsingSortedSet(String string){
        if (string==null)return null;
        SortedSet<String> sortedSet=new TreeSet<>(Arrays.asList(string.split(" ")));

       return new ArrayList<String>(sortedSet).toString();
    }


}