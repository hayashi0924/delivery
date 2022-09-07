package delivery.adress.prefecture.postCode;

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

    public boolean equals(Object o){
        if(!(o instanceof PostCode)){
            return false;
        }
        PostCode object = (PostCode) o;
        if(!(this.number.equals(object.number))){
            return false;
        }
        return true;
    }

}
