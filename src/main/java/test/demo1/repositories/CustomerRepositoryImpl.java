package test.demo1.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepoitory {


    @Override
    public String saludar(String nombre) {
        return "Bienvenido " + nombre;
    }
}
