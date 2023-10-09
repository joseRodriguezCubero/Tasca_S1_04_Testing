package n3exercici5;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {

        HashMap<Integer,String> doNotCallExGirlFriends = new HashMap<>();


        //son telefonos falsos
        doNotCallExGirlFriends.put(654465454, "Maria");
        doNotCallExGirlFriends.put(654231546, "Yolanda");
        doNotCallExGirlFriends.put(654213456, "Maria Ros");
        doNotCallExGirlFriends.put(655124125, "Beatriz");

        System.out.println(doNotCallExGirlFriends.get(654231546));


    }
}
