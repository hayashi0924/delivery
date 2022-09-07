package delivery.adress.prefecture.cityList.chiba;

import delivery.adress.prefecture.City;
import delivery.adress.prefecture.postCode.PostCode;

public class Chiba implements City {

    private final ChibaList city;

    public Chiba(ChibaList city){
        this.city = city;
    }
    public PostCode postCode() {
        return this.city.postCode();
    }

    public String address() {
        return this.city.address();
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Chiba)){
            return false;
        }
        Chiba object = (Chiba) o;
        if(!(this.city.equals(object.city))){
            return false;
        }
        return true;
    }
}
