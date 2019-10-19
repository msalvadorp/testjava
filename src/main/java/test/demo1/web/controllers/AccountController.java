package test.demo1.web.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.demo1.services.CustomerService;
//import test.demo1.services.CustomerServiceImpl;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    @Qualifier("V2")
    private CustomerService customerService;


    @GetMapping
    public HttpEntity<String> getDefault(){

        return ResponseEntity.ok(customerService.toUpper("Miguel"));
    }

    @GetMapping(path = "/demo")
    public HttpEntity<String> getDemo(){
        return ResponseEntity.ok("demo");
    }


    @GetMapping(path = "/correo")
    public HttpEntity<String> enviarCorreo(){

        return ResponseEntity.ok(customerService.enviarCorreo2("mensaje"));
    }


}
