import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.RowFilter.Entry;
public class FirstTask {
    static Scanner in = new Scanner(System.in);
    static String text;
public static void main(String[] args) {
    HashMap<String, String> hashMap = new HashMap<>();
    fillHashMap(hashMap);
    System.out.println(hashMap);
    Find(hashMap);

}

public static void fillHashMap(HashMap<String, String> hashMap){
    System.out.println("Would you like to add new informarion?\n1 is for Yes\n2 is No ");
    Scanner in = new Scanner(System.in);
    String answer = in.next();
    while (answer.equals("1")){
        System.out.println("Enter a name: ");
        String name = in.next();
        System.out.println("Enter: " + name + "`s " + "number: ");
        String number = in.next();
        hashMap.put(number, name);
        System.out.println("For exit print `2`\n else print `1`");
        answer = in.next();
    }
    }
    public static void Find(HashMap<String, String> hashMap){
        System.out.println("Enter a name to find a number: ");
        String name = in.next();
        Set<Map.Entry<String,String>> entrySet = hashMap.entrySet();
        for (HashMap.Entry<String, String> pair : entrySet){
            if (name.equals(pair.getValue())){
                System.out.println(name + "` " + "numbers are: ");
                System.out.println(pair.getKey());
            }
        }
    }
}
