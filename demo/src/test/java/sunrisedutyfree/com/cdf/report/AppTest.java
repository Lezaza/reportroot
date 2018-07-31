package sunrisedutyfree.com.cdf.report;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sunrisedutyfree.com.cdf.report.demorepository.TestRepository;
import sunrisedutyfree.com.cdf.report.demorepository.Test_ChildRepository;
import sunrisedutyfree.com.cdf.report.demorepository.Test_Child_ChildRepository;
import sunrisedutyfree.com.cdf.report.demorepository.Test_GlobalRepository;
import sunrisedutyfree.com.cdf.report.demorepository.jcpush.PURCHASE_ORDER_HEADERRepository;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Autowired
    @Qualifier("sqlSessionFactoryBean_MySQL")
    SqlSessionFactory sqlSessionFactory_MySQL;

    @Autowired
    @Qualifier("sqlSessionFactoryBean_SQLServer_JCPUSH")
    SqlSessionFactory sqlSessionFactory_SQLServer_JCPUSH;

    @Autowired(required = false)
    TestRepository repository;

    @Autowired(required = false)
    Test_ChildRepository test_childRepository;

    @Autowired(required = false)
    Test_Child_ChildRepository test_child_childRepository;

    @Autowired(required = false)
    Test_GlobalRepository test_globalRepository;


    /**
     * Rigorous Test :-)
     */
    @Test
    public void test_Test()
    {
        System.out.println();
        System.out.println(this.sqlSessionFactory_MySQL);
        System.out.println();
        System.out.println(this.repository);
        System.out.println();
        SqlSession sqlSession = this.sqlSessionFactory_MySQL.openSession();
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
        SqlSession sqlSession = this.sqlSessionFactory_MySQL.openSession();
        this.test_childRepository = sqlSession.getMapper(Test_ChildRepository.class);


        // @Test Test_Child fingTest_ChildById(int id);
        System.out.println("------------------findTest_ChildById :" + this.test_childRepository.fingTest_ChildById(1));

        // @Test List<Test_Child> findAllTest_ChildrenByCondition(String condition);
        System.out.println("----------------findAllTest_ChildrenByCondition :" + this.test_childRepository.findAllTest_ChildrenByCondition("value like '%'"));

        // @Test int saveTest_Child(Test_Child test);
        sunrisedutyfree.com.cdf.report.demoentity.Test_Child test =
                new sunrisedutyfree.com.cdf.report.demoentity.Test_Child();
        test.setValue("nnnnnnnnnnnnnnnnnnnn-1");
        test.setParent_id(1);
        test.setId(100); // 如需插入成功必须手动自增加+1
        System.out.println("----------------saveTest_Child :" + this.test_childRepository.saveTest_Child(test) + " " + test.getId());

        // @Test void saveTest_Children(List<Test_Child> testList);
        List<sunrisedutyfree.com.cdf.report.demoentity.Test_Child> testList =
                new ArrayList<>();
        for (int i=0; i < 20; i++)
        {
            sunrisedutyfree.com.cdf.report.demoentity.Test_Child test1 =
                    new sunrisedutyfree.com.cdf.report.demoentity.Test_Child();
            test1.setValue(i + "");
            test1.setId(100 + i); // 自增需手动改
            test1.setParent_id(1);
            testList.add(test1);
        }

        try{

            this.test_childRepository.saveTest_Children(testList);
            System.out.println("---------------saveTest_Children All Done: " + " " + testList.size());
        }
        catch (Exception ex){

            System.out.println("----------------saveTest_Children " + "Error!!! Message: " + ex.getMessage());
        }

    }

    @Test
    public  void test_Test_Child_Child()
    {
        System.out.println();
        System.out.println("Session Factory === " + this.sqlSessionFactory_MySQL);
        System.out.println();
        System.out.println("test_child session before === " + this.test_child_childRepository);
        System.out.println();
        SqlSession sqlSession = this.sqlSessionFactory_MySQL.openSession();
        this.test_child_childRepository = sqlSession.getMapper(Test_Child_ChildRepository.class);
        System.out.println("test_child session after === " + this.test_child_childRepository);
        System.out.println();

        // @Test Test_Child_Child fingTest_Child_ChildById(int id);
        System.out.println("------------------fingTest_Child_ChildById :" + this.test_child_childRepository.fingTest_Child_ChildById(1));

        // @Test List<Test_Child_Child> findAllTest_Child_ChildrenByCondition(String condition);
        System.out.println("----------------findAllTest_Child_ChildrenByCondition :" + this.test_child_childRepository.findAllTest_Child_ChildrenByCondition("value like '%'"));

        // @Test int saveTest_Child_Child(Test_Child_Child test);
        sunrisedutyfree.com.cdf.report.demoentity.Test_Child_Child test =
                new sunrisedutyfree.com.cdf.report.demoentity.Test_Child_Child();
        test.setValue("nnnnnnnnnnnnnnnnnnnn-3");
        test.setParent_id(1);
        test.setId(100); // 如需插入成功必须手动自增加+1
        System.out.println("----------------saveTest_Child :" + this.test_child_childRepository.saveTest_Child_Child(test) + " " + test.getId());

        // @Test void saveTest_Child_Children(List<Test_Child_Child> testList);
        List<sunrisedutyfree.com.cdf.report.demoentity.Test_Child_Child> testList =
                new ArrayList<>();
        for (int i=0; i < 20; i++)
        {
            sunrisedutyfree.com.cdf.report.demoentity.Test_Child_Child test1 =
                    new sunrisedutyfree.com.cdf.report.demoentity.Test_Child_Child();
            test1.setValue(i + "");
            test1.setId(1001 + i); // 自增需手动改
            test1.setParent_id(1);
            testList.add(test1);
        }

        try{

            this.test_child_childRepository.saveTest_Child_Children(testList);
            System.out.println("---------------saveTest_Child_Children All Done: " + " " + testList.size());
        }
        catch (Exception ex){

            System.out.println("----------------saveTest_Child_Children " + "Error!!! Message: " + ex.getMessage());
        }
    }


    @Test
    public  void test_Test_Global()
    {
        System.out.println();
        System.out.println("Session Factory === " + this.sqlSessionFactory_MySQL);
        System.out.println();
        System.out.println("test_globalRepository session before === " + this.test_globalRepository);
        System.out.println();
        SqlSession sqlSession = this.sqlSessionFactory_MySQL.openSession();
        this.test_globalRepository = sqlSession.getMapper(Test_GlobalRepository.class);
        System.out.println("test_globalRepository session after === " + this.test_globalRepository);
        System.out.println();

        // @Test Test_Global fingTest_ChildById(int id);
        System.out.println("------------------fingTest_ChildById :" + this.test_globalRepository.fingTest_ChildById(1));

        // @Test List<Test_Global> findAllTest_GlobalsByCondition(String condition);
        System.out.println("----------------findAllTest_Child_ChildrenByCondition :" + this.test_globalRepository.findAllTest_GlobalsByCondition("value like '%'"));

        // @Test int saveTest_Global(Test_Global test);
        sunrisedutyfree.com.cdf.report.demoentity.Test_Global test =
                new sunrisedutyfree.com.cdf.report.demoentity.Test_Global();
        test.setId(100); // 如需插入成功必须手动自增加+1
        test.setValue("nnnnnnnnnnnnnnnnnnnn-Global");
        System.out.println("----------------saveTest_Child :" + this.test_globalRepository.saveTest_Global(test) + " " + test.getId());

        // @Test void saveTest_Globals(List<Test_Global> testList);
        List<sunrisedutyfree.com.cdf.report.demoentity.Test_Global> testList =
                new ArrayList<>();
        for (int i=0; i < 20; i++)
        {
            sunrisedutyfree.com.cdf.report.demoentity.Test_Global test1 =
                    new sunrisedutyfree.com.cdf.report.demoentity.Test_Global();
            test1.setValue(i + "-GLB");
            test1.setId(1001 + i); // 自增需手动改
            testList.add(test1);
        }

        try{

            this.test_globalRepository.saveTest_Globals(testList);
            System.out.println("---------------saveTest_Globals All Done: " + " " + testList.size());
        }
        catch (Exception ex){

            System.out.println("----------------saveTest_Globals " + "Error!!! Message: " + ex.getMessage());
        }
    }

    @Test
    public void test_SQLServer()
    {
        System.out.println(this.sqlSessionFactory_SQLServer_JCPUSH);

        System.out.println(this.sqlSessionFactory_SQLServer_JCPUSH.openSession().getConnection());

        System.out.println(
                this.sqlSessionFactory_SQLServer_JCPUSH
                        .openSession()
                        .getMapper(PURCHASE_ORDER_HEADERRepository.class
                        ).count());
    }

}