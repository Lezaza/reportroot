package sunrisedutyfree.com.cdf.report.demorepository.jcpush;

import sunrisedutyfree.com.cdf.report.demoentity.jcpush.POS_REAL_SALE;

import java.util.Date;
import java.util.List;

public interface POS_REAL_SALERepository {

    int count();

    // List<POS_REAL_SALE> findPOS_REAL_SALEsByXSDATEBetween(Date s, Date e);


    // 根据销售单据号获取单据详情
    List<POS_REAL_SALE> findPOS_REAL_SALEsByXSDANJUHAO(String XSDANJUHAO);

    //
    int savePOS_REAL_SALEs(List<POS_REAL_SALE> list);

    //
    int getIncrementID();
}
