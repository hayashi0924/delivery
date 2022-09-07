package delivery.adress.place.prefectures.postCode;

class CodeRule {
    static boolean isValid(String number){
        return number.matches("%d{3}-%d{4}");
    }
}
