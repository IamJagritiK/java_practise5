
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {

    //    Map<String,Integer> as key value pair.
    //        Input : String str = “one one -one___two,,three,one @three*one?two”;
//        Output : {"one":5 , "two":2, "three" :2}
    
    
        public static void main(String[] args){        //System.out.println(myStr);
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the string:");
            String str= scan.nextLine(); 

            String result=checkFrequency(str);
            System.out.print(result);

        }





    public static String checkFrequency(String input) {
        if (input == null) return null;
        List<String> stringList = Arrays.asList(input.split("[\\W_]+"));
        Map<String, Integer> map = new HashMap<>();
        for (String each : stringList) {
            if (map.containsKey(each)) {
                map.replace(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        return map.toString();
    }


}