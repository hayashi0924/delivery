package delivery.adress.place.prefectures.chiba;

import delivery.adress.place.prefectures.postCode.PostCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chiba {
    private final List<ChibaList> town;

    public Chiba(){
        town = new ArrayList<>();
        town.addAll(Arrays.asList(ChibaList.values()));
    }

    public PostCode getPostCode(ChibaList town){
        return town.postCode();
    }

    public String toString(){
        return "千葉県";
    }
}
