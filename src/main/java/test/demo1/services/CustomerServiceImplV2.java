package test.demo1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import test.demo1.repositories.CustomerRepoitory;

@Service
@Qualifier("V2")
public class CustomerServiceImplV2  implements  CustomerService {

    @Autowired
    private CustomerRepoitory  customerRepoitory;

    @Override
    public String toUpper(String dato) {
        return customerRepoitory.saludar(dato.toLowerCase());
    }
}
