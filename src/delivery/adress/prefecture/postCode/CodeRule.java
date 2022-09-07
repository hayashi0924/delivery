package delivery.adress.prefecture.postCode;

class CodeRule {
    static boolean isValid(String number){
        return number.matches("[0-9]{3}-[0-9]{4}");
    }
}
