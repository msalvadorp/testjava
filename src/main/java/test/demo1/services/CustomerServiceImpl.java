package test.demo1.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CustomerServiceImpl implements  CustomerService {


    @Override
    public String toUpper(String dato) {
        return dato.toUpperCase();
    }

    @Override
    public String enviarCorreo2(String mensaje) {
        return "Demo";
    }
}
