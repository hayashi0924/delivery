package delivery.adress.prefecture;

import delivery.adress.prefecture.postCode.PostCode;

public interface City {
    PostCode postCode();
    String address();
}
