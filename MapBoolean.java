import java.util.*;
import javax.lang.model.util.ElementScanner6;
import java.lang.*;

class MapBoolean{
   public static void main(String[] args){        //System.out.println(myStr);
       Map<String,Integer> map= new HashMap<>();
       Map<String,Integer> mapResult= new HashMap<>();
       Map<String,Boolean> mapResultt= new HashMap<>();
       String[] myStrArray= {"a","b","c","d","a","c","c"};
       int i=0;
       for(String s:myStrArray){
           map.put(s,i);
           i++;
       }
       //System.out.println(map);
       for (Map.Entry<String, Integer> entry : map.entrySet()) {
           String ss= entry.getKey();
           int count=0;
           for(String s:myStrArray){
               if(s.equals(ss)){
                   count++;
               }
           }
           mapResult.put(ss,count);
       }
       //System.out.println("Your all the elements and their number of occurence");
       for (Map.Entry<String, Integer> ent : mapResult.entrySet()) {
           if((ent.getValue()> 1))
           mapResultt.put(ent.getKey(),true);        else
       mapResultt.put(ent.getKey(),false);    }
       System.out.println(mapResultt);    }}