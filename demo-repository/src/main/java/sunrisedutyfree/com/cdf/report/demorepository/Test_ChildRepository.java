package sunrisedutyfree.com.cdf.report.demorepository;

import sunrisedutyfree.com.cdf.report.demoentity.Test;
import sunrisedutyfree.com.cdf.report.demoentity.Test_Child;

import java.util.List;

public interface Test_ChildRepository {

    Test_Child fingTest_ChildById(int id);

    List<Test_Child> findAllTest_ChildrenByCondition(String condition);

    int saveTest_Child(Test_Child test);

    void saveTest_Children(List<Test_Child> testList);

}
