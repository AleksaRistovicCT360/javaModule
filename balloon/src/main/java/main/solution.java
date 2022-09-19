package main;

import java.util.HashMap;

public class solution {

    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();

        map.put('B',0);
        map.put('A',0);
        map.put('L',0);
        map.put('O',0);
        map.put('N',0);

        for(char i:text.toCharArray()){
                if(map.containsKey(i))
                    map.put(i, map.get(i)+1);
        }

        int min1 = Math.min(map.get('L'), map.get('O'));
        int min2 = Math.min(Math.min(map.get('A'), map.get('B')), map.get('N'));

        return Math.min(min1/2, min2);
    }

}
