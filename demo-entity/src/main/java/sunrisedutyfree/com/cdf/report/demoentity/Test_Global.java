package sunrisedutyfree.com.cdf.report.demoentity;

import java.io.Serializable;

public class Test_Global implements Serializable {
    private static final long serialVersionUID = 7166116921671202086L;

    //not increment
    int id;
    String value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
