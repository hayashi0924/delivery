import delivery.adress.Recipient;
import delivery.adress.prefecture.Prefecture;
import delivery.adress.prefecture.cityList.tokyo.TokyoList;

public class Main {
    public static void main(String[] args) {
        //受取人の名前と住所を設定
        Recipient receiver = new Recipient(Prefecture.Tokyo(TokyoList.KOUTOUKU), "林　ハヤシ");

    }
}
