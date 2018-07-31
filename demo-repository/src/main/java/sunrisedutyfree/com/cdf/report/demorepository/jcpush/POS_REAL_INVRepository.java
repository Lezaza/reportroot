package sunrisedutyfree.com.cdf.report.demorepository.jcpush;

import sunrisedutyfree.com.cdf.report.demoentity.jcpush.POS_REAL_INV;

import java.util.Date;
import java.util.List;

public interface POS_REAL_INVRepository {

    int count();

    List<POS_REAL_INV> findPOS_REAL_INVsByXSDATEBetween(Date s, Date e);

    void savePOS_REAL_INVs(List<POS_REAL_INV> list);
}

