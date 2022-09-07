package delivery.adress.prefecture;



import delivery.adress.prefecture.cityList.chiba.Chiba;
import delivery.adress.prefecture.cityList.chiba.ChibaList;
import delivery.adress.prefecture.cityList.tokyo.Tokyo;
import delivery.adress.prefecture.cityList.tokyo.TokyoList;

public class Prefecture {
    private final PrefectureList prefecture;
    private final City city;

    private Prefecture(PrefectureList prefecture, City city){
        this.prefecture = prefecture;
        this.city = city;
    }

    public static Prefecture Chiba(ChibaList city){
        return new Prefecture(PrefectureList.CHIBA, new Chiba(city));
    }
    public static Prefecture Tokyo(TokyoList city){
        return new Prefecture(PrefectureList.TOKYO, new Tokyo(city));
    }


}
