package delivery.adress.place.prefectures.kanagawa;

import delivery.adress.place.prefectures.postCode.PostCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kanagawa{
    private final List<KanagawaList> town;

    public Kanagawa(){
        town = new ArrayList<>();
        town.addAll(Arrays.asList(KanagawaList.values()));
    }

    public PostCode getPostCode(KanagawaList town){
        return town.postCode(town);
    }

    @Override
    public String toString() {
        return "神奈川県";
    }
}
