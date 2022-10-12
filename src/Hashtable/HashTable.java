package Hashtable;

import java.util.Hashtable;
import java.util.Set;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String,Integer> contacts = new Hashtable<>();
        contacts.put("Aritra",226644567);
        contacts.put("Adity",223344544);
        contacts.put("Arjun",228844567);
        contacts.put("Anushree",22399445);
        contacts.put("Sanjog",22355445);

        System.out.println(contacts.containsKey("Aritra"));
        System.out.println(contacts.get("Aritra"));

        Set<String> keys = contacts.keySet();
        for(String key:keys){
            System.out.println("Number of "+key+" is : "+contacts.get(key));
        }
    }
}
