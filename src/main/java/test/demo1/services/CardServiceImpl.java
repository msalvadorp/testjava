package test.demo1.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import test.demo1.config.MailProperties;

//@Service
public class CardServiceImpl implements  CardService {

    private MailProperties mailProperties;

    private final String cardType;

    @Value("${smtp.port}")
    private int port;

    @Value("${smtp.hostname}")
    private String hostName;

    public CardServiceImpl(String cardType, MailProperties mailProperties){

        this.cardType = cardType;
        this.mailProperties = mailProperties;
    }

    @Override
    public double GetBalance(String cardNumber) {
        return 100000;
    }

    @Override
    public String enviarCorreo(String contenido) {

        String lectura = String.valueOf(port);
        lectura += hostName;
        return lectura;
    }
}
