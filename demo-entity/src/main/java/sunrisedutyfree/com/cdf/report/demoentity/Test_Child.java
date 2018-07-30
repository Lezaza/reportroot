package sunrisedutyfree.com.cdf.report.demoentity;

import java.io.Serializable;
import java.util.List;

public class Test_Child implements Serializable {

    private static final long serialVersionUID = 3301510926911824009L;

    int id;
    int parent_id;

    public List<Test_Child_Child> getChildren() {
        return children;
    }

    public void setChildren(List<Test_Child_Child> children) {
        this.children = children;
    }

    List<Test_Child_Child> children;

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
