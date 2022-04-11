import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareStrings {
    public static void main(String[] args) {
        System.out.println(compareString("one","two","three"));
    }
    public static String compareString(String a,String b,String c){
        List<String> strings=new ArrayList<>();
        strings.add(a);
        strings.add(b);
        strings.add(c);
        Collections.sort(strings);
        StringBuilder newStr=new StringBuilder();
        for (String s:strings
             ) {
            newStr.append(s);
        }
        return newStr.toString();

    }
}
