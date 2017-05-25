package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by QuantumCat on 05.04.2017.
 */

@ManagedBean
@SessionScoped
public class MainBean {
    private String a;

    private String result;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void toCount() {

        this.result = new StringBuffer(a).reverse().toString();
    }
}
