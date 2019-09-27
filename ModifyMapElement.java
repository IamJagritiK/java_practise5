import java.util.HashMap;


public class ModifyMapElement {

    public static void main(String[] args){        //System.out.println(myStr);
        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("USA", "Washington");
        hm.put("UK", "London");
        
        
        String result =rotateValue(hm);
        System.out.print(result);

    }

    //     If the key `val1` has a value, set the key `val2` to have that value, and
    //         Set the key `val1` to have the value `" "` (empty string).
    public static String rotateValue(HashMap<String, String> map) {
        if (map == null) {
            return null;
        }
        String val1 =(String) map.get("USA");
        map.replace("UK",val1);
        map.replace("USA", " ");
        return map.toString();
    }
}