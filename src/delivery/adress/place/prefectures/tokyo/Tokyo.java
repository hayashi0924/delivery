package delivery.adress.place.prefectures.tokyo;

import delivery.adress.place.prefectures.postCode.PostCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tokyo {
    private final List<TokyoList> town;

    public Tokyo(){
        town = new ArrayList<>();
        town.addAll(Arrays.asList(TokyoList.values()));
    }

    public PostCode postCode(TokyoList town){
        return town.postCode();
    }
    @Override
    public String toString() {
        return "東京都";
    }
}
