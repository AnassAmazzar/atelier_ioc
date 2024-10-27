package ma.emsi.dao;

import org.springframework.stereotype.Component;

@Component("data")
public class DataImpl implements IData{

    @Override
    public double getData() {
        double data = 10;
        System.out.println("Recuperation de la base de donner :");
        return data;
    }
}
