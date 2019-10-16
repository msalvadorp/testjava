package test.demo1.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.demo1.services.CardService;
import test.demo1.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController
{

    @Autowired
    @Qualifier("V2")
    private CustomerService customerService;

    @Autowired
    private CardService cardService;

    @GetMapping
    public HttpEntity<String> getDefault(){

        return ResponseEntity.ok(customerService.toUpper("Customer 1"));
    }


    @GetMapping(path = "/balance")
    public HttpEntity<Double> getBalance(){

        return ResponseEntity.ok(cardService.GetBalance("ABCD"));
    }

    @GetMapping(path = "/card")
    public HttpEntity<String> getCard(){

        return ResponseEntity.ok("card asdasdasd");
    }

}
