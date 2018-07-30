package sunrisedutyfree.com.cdf.report.demorepository;

import sunrisedutyfree.com.cdf.report.demoentity.Test_Child;
import sunrisedutyfree.com.cdf.report.demoentity.Test_Global;

import java.util.List;

public interface Test_GlobalRepository {

    Test_Global fingTest_ChildById(int id);

    List<Test_Global> findAllTest_GlobalsByCondition(String condition);

    int saveTest_Global(Test_Global test);

    void saveTest_Globals(List<Test_Global> testList);

}
