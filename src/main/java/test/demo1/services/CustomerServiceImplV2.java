package test.demo1.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import test.demo1.config.MailProperties;
import test.demo1.repositories.CustomerRepoitory;

import java.util.Map;

@Service
@Qualifier("V2")
public class CustomerServiceImplV2  implements  CustomerService {

    private static final Logger log = LoggerFactory.getLogger(CustomerServiceImplV2.class);


    @Autowired
    private CustomerRepoitory  customerRepoitory;


    @Autowired
    private MailProperties mailProperties;


    @Override
    public String toUpper(String dato) {
        return customerRepoitory.saludar(dato.toLowerCase());
    }

    @Override
    public String enviarCorreo2(String mensaje) {
        log.info(mailProperties.getCredentials().getUsername());
        log.debug(mailProperties.getCredentials().getPassword());
        for (String item : mailProperties.getCc()             ) {
            log.debug("item = {} - {}", item, "test");
        };

        mailProperties.getCc().stream().forEach(p -> log.debug(p));

        for (Map.Entry<String, String> item: mailProperties.getHeader().entrySet()             ) {
            log.debug("key = {} - value {}", item.getKey(), item.getValue());
        }

        mailProperties.getHeader().entrySet().forEach(p -> log.debug("item  {} lave {}", p.getKey(), p.getValue()));
        log.debug(mailProperties.getCredentials().getPassword());
        return String.format("%s %s %s", mailProperties.getFrom(), mailProperties.getPort(), mailProperties.getHostname());
    }
}
