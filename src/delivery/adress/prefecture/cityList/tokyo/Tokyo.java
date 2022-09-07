package delivery.adress.prefecture.cityList.tokyo;

import delivery.adress.prefecture.City;
import delivery.adress.prefecture.postCode.PostCode;

public class Tokyo implements City {
    private final delivery.adress.prefecture.cityList.tokyo.TokyoList city;

    public Tokyo(TokyoList city){
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
        if(!(o instanceof Tokyo)){
            return false;
        }
        Tokyo object = (Tokyo) o;
        if(!(this.city.equals(object.city))){
            return false;
        }
        return true;
    }
}
