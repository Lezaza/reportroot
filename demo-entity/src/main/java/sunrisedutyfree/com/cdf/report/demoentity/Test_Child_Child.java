package sunrisedutyfree.com.cdf.report.demoentity;

import java.io.Serializable;

public class Test_Child_Child implements Serializable {

    private static final long serialVersionUID = 8059358245080741991L;
    int id;
    int parent_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    String value;

}
