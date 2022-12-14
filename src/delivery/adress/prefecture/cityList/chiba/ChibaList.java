package delivery.adress.prefecture.cityList.chiba;

import delivery.adress.prefecture.postCode.PostCode;

public enum ChibaList {
    CHIBASHI("千葉市", new PostCode("111-1111")),
    KISARAZUSHI("木更津市", new PostCode("111-2222")),
    ;
    private final String name;
    private final PostCode postCode;

    ChibaList(final String name, final PostCode postCode){
        this.name = name;
        this.postCode = postCode;
    }

    public PostCode postCode(){
        return this.postCode;
    }

    public String address() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + "〒：" + postCode.toString();
    }
}
