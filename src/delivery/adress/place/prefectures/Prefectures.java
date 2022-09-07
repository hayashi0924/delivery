package delivery.adress.place.prefectures;

import delivery.adress.place.prefectures.chiba.Chiba;
import delivery.adress.place.prefectures.kanagawa.Kanagawa;
import delivery.adress.place.prefectures.tokyo.Tokyo;

import java.util.HashMap;
import java.util.Map;

public class Prefectures {
    private final Map<List, Chiba> chiba;
    private final Map<List, Kanagawa> kanagawa;
    private final Map<List, Tokyo> tokyo;

    public Prefectures(){
        chiba = new HashMap<>();
        kanagawa = new HashMap<>();
        tokyo = new HashMap<>();

        chiba.put(List.CHIBA, new Chiba());
        kanagawa.put(List.KANAGAWA, new Kanagawa());
        tokyo.put(List.TOKYO, new Tokyo());
    }
}
