package delivery.adress;

import delivery.adress.prefecture.Prefecture;

public class Recipient {

    private final Prefecture prefecture;
    private final String name;

    public Recipient(final Prefecture prefecture, final String name){
        if(!nameIsvalid(name)){
            throw new IllegalArgumentException("名前は２〜１０文字で入力してください");
        }
        this.prefecture = prefecture;
        this.name = name;
    }
    private boolean nameIsvalid(final String name) {
        return name.matches(".{2,10}");
    }
}
