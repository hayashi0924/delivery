package delivery.adress.place.prefectures.postCode;

public class PostCode {
    private final String number;

    public PostCode(final String number){
        if(!CodeRule.isValid(number)){
            throw new IllegalArgumentException("引数が不正です。文字入力で、□□□-□□□□の書式で入力をしてください");
        }
        this.number = number;
    }

    public String toString(){
        return this.number;
    }

}
