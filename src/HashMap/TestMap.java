package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hasmap = new HashMap<>();
        hasmap.put("a", 1);
        hasmap.put("b", 2);
        hasmap.put("c", 3);
        hasmap.put("d", 5);
        System.out.println("display entries in HasMap");
        System.out.println(hasmap + "\n");

        Map<String,Integer> treMap = new TreeMap<>();
        treMap.put("c",3);
        treMap.put("d",1);
        System.out.println("display entries in treeMap");
        System.out.println(treMap);

        Map<String,Integer> linkedHasMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHasMap.put("a",30);
        linkedHasMap.put("b",20);
        linkedHasMap.put("c",10);
        System.out.println(linkedHasMap.get("c"));


    }
}
