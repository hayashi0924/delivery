package delivery.adress.prefecture.cityList.tokyo;

import delivery.adress.prefecture.City;
import delivery.adress.prefecture.postCode.PostCode;

public enum TokyoList implements City {
    KATUSHIKAKU("葛飾区", new PostCode("333-1111")),
    KOUTOUKU("江東区", new PostCode("333-2222")),
    ;
    private final String name;
    private final PostCode postCode;

    TokyoList(final String name, final PostCode postCode){
        this.name = name;
        this.postCode = postCode;
    }

    public PostCode postCode(){
        return this.postCode;
    }

    @Override
    public String address() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + "〒：" + postCode.toString();
    }
}
