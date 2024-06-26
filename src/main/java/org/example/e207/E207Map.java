package org.example.e207;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Create Hash Map.
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
Using EntrySet print the key and values pairs using iterator only
replace with below key THREE--> ASEL and key FIVE-->SUMAIR
Using EntrySet print the key and values pairs using iterator only
**Output:**
HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL
 */
public class E207Map {
    public static void main(String[] args) {

        Map<String,String > map = new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        System.out.println("HashMap Before Replace :");
        Iterator<Map.Entry<String,String >> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String ,String > entry = iterator.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("------------------");
        System.out.println("HashMap After Replace :");

        map.replace("FIVE","EEE","SUMAIR");
        map.replace("THREE","CCC","ASEL");
        for(Map.Entry<String,String > entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}

