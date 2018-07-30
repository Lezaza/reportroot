package sunrisedutyfree.com.cdf.report.demoentity;

import java.io.Serializable;
import java.util.List;

public class Test implements Serializable {

    private static final long serialVersionUID = -1798725783584344904L;
    int id;
    String value;
    List<Test_Child> children;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", children=" + children +
                '}';
    }

    public void setValue(String value) {
        this.value = value;
    }
}
