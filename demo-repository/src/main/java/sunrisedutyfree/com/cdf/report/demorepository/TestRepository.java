package sunrisedutyfree.com.cdf.report.demorepository;

import sunrisedutyfree.com.cdf.report.demoentity.Test;
import java.util.List;

public interface TestRepository {

    Test fingTestById(int id);

    List<Test> findAllTestsByCondition(String condition);

    int saveTest(Test test);

    int saveTests(List<Test> testList);

    int deleteAll();

}
