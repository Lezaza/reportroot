package sunrisedutyfree.com.cdf.report.demorepository;

import sunrisedutyfree.com.cdf.report.demoentity.Test_Child;
import sunrisedutyfree.com.cdf.report.demoentity.Test_Child_Child;

import java.util.List;

public interface Test_Child_ChildRepository {

    Test_Child_Child fingTest_Child_ChildById(int id);

    List<Test_Child_Child> findAllTest_Child_ChildrenByCondition(String condition);

    int saveTest_Child_Child(Test_Child_Child test);

    void saveTest_Child_Children(List<Test_Child_Child> testList);

}
