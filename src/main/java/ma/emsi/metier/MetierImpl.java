package ma.emsi.metier;

import ma.emsi.dao.DataImpl;
import ma.emsi.dao.IData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{
    @Autowired
    @Qualifier("data")
    public IData idata;

    /*public MetierImpl(IData idata){
        this.idata = idata;
    }*/
    @Override
    public double calcule() {
        double data = idata.getData();
        double result = data * 15.6;
        return result;
    }

    public void setIdata(DataImpl dataImpl){
        this.idata = dataImpl;
    }
}
