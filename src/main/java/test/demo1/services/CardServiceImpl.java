package test.demo1.services;

import org.springframework.stereotype.Service;

//@Service
public class CardServiceImpl implements  CardService {

    private final String cardType;

    public CardServiceImpl(String cardType){


        this.cardType = cardType;
    }

    @Override
    public double GetBalance(String cardNumber) {
        return 100000;
    }
}
