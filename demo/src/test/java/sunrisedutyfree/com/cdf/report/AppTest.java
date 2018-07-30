package sunrisedutyfree.com.cdf.report;

import static org.junit.Assert.assertTrue;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sunrisedutyfree.com.cdf.report.demoentity.Test_Child;
import sunrisedutyfree.com.cdf.report.demorepository.TestRepository;
import sunrisedutyfree.com.cdf.report.demorepository.Test_ChildRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Autowired(required = false)
    TestRepository repository;

    @Autowired(required = false)
    Test_ChildRepository test_childRepository;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void test_Test()
    {
        System.out.println();
        System.out.println(this.sqlSessionFactory);
        System.out.println();
        System.out.println(this.repository);
        System.out.println();
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        this.repository = sqlSession.getMapper(TestRepository.class);
        System.out.println(this.repository);
        System.out.println();

        System.out.println("----------------deleteAll :" +this.repository.deleteAll());
        System.out.println("----------------fingTestById :" +this.repository.findTestById(16060));
        System.out.println("----------------findAllTestsByCondition :" + this.repository.findAllTestsByCondition("value like '%'"));

        sunrisedutyfree.com.cdf.report.demoentity.Test test =
                new sunrisedutyfree.com.cdf.report.demoentity.Test();
        test.setValue("nnnnnnnnnnnnnnnnnnnn");
        System.out.println("----------------saveTest :" + this.repository.saveTest(test) + " " + test.getId());

        List<sunrisedutyfree.com.cdf.report.demoentity.Test> testList =
                new ArrayList<>();
        for (int i=0; i < 20; i++)
        {
            sunrisedutyfree.com.cdf.report.demoentity.Test test1 =
                    new sunrisedutyfree.com.cdf.report.demoentity.Test();
            test1.setValue(i + "");
            testList.add(test1);
        }
        System.out.println("----------------saveTests :" + this.repository.saveTests(testList) + " " + testList.size());
        for (int i=0; i < testList.size(); i++)
        {
            System.out.println(testList.get(i).getId());
        }

        System.out.println(this.repository.findAllTestsByCondition(""));

        sqlSession.commit();
    }

    //test_child
    @Test
    public void test_Test_Child()
    {
        System.out.println();
        System.out.println(this.sqlSessionFactory);
        System.out.println();
        System.out.println(this.repository);
        System.out.println();
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        this.test_childRepository = sqlSession.getMapper(Test_ChildRepository.class);
        System.out.println(this.test_childRepository);
        System.out.println();

        System.out.println("------------------fingTest_ChildById :" + this.test_childRepository.fingTest_ChildById(1));

    }

}
