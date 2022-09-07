package delivery.adress.place.prefectures.tokyo;

import delivery.adress.place.prefectures.postCode.PostCode;

enum TokyoList {
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
    public String toString() {
        return this.name + "〒：" + postCode.toString();
    }
}
