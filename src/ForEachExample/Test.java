package ForEachExample;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<>();
        hashMap.put(23,"Ravi");
        hashMap.forEach((key,value)-> System.out.println("Age and Name:"+key+"  "+value));
    }
}
