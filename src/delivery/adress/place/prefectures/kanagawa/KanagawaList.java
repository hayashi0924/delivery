package delivery.adress.place.prefectures.kanagawa;

import delivery.adress.place.prefectures.postCode.PostCode;

enum KanagawaList {
    YOKOHAMASHI("横浜市", new PostCode("222-1111")),
    KAWASAKISHI("川崎市", new PostCode("222-2222")),
    ;
    private final String name;
    private final PostCode postCode;

    KanagawaList(final String name, final PostCode postCode){
        this.name = name;
        this.postCode = postCode;
    }

    public PostCode postCode(KanagawaList town){
        return this.postCode;
    }
    @Override
    public String toString() {
        return this.name + "〒：" + postCode.toString();
    }
}
