import java.lang.*;
import java.util.*;public class UpdateArrayList {  
      public static void main (String[] args) {
       ArrayList<String> al= new ArrayList<>();
       al.add("Versha");
       al.add("Rutuza");
       al.add("Jagriti");
       al.add("Neha");
       al.add("Rajat");
       al.add("Ayush");
       Scanner sc= new Scanner(System.in);    
           System.out.println("My list before upating the element is");
       for( String s: al){
           System.out.print(s + "  ");
       }
       System.out.println("Enter the element you wanna update");
       String temp=sc.nextLine();        int tem=al.indexOf(temp);
       al.set(tem,"UpdatedValue");
       System.out.println("My list after upating the element is");
       for( String s: al){
           System.out.print(s + "  ");
       }           al.clear();
          System.out.println();
          System.out.println("My list after removing all the elements is");            System.out.print(al);    }
}