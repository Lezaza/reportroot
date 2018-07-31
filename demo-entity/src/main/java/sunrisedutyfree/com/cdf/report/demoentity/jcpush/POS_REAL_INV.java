package sunrisedutyfree.com.cdf.report.demoentity.jcpush;

import java.io.Serializable;
import java.util.Date;


//
// 销售单据实体
//
public class POS_REAL_INV implements Serializable{

    // 数据ID
    // increment
    int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    // 销售单据号
    //
    //
    String XSDANJUHAO;

    public String getXSDANJUHAO() {
        return XSDANJUHAO;
    }

    public void setXSDANJUHAO(String XSDANJUHAO) {
        this.XSDANJUHAO = XSDANJUHAO;
    }

    //
    //
    //
    String OLDDANJUHAO;

    public String getOLDDANJUHAO() {
        return OLDDANJUHAO;
    }

    public void setOLDDANJUHAO(String OLDDANJUHAO) {
        this.OLDDANJUHAO = OLDDANJUHAO;
    }



    Float SEQNO;

    Date XSDATE;

    String POSNUMBER;

    Date RUNDATE;

    Float RCLASS;

    String SYUSER;

    Float XSSUM;

    Float SELLSUM;

    Float YSJE;

    Float DPYOUHUI;

    Float CXXSSUM;

    Float CXSELLSUM;

    Float CXYSJE;

    Float YSJE1;

    Float SSJE;

    Float ZLJE;

    Float RLJE;

    String RLCUURRID;

    Float RLCURRRATE;

    Float SHULIANG;

    String BASECURRID;

    Float FLAG;

    String YYYUSER;

    String HYJKXUHAO;

    String HYYKXUHAO;

    String JFKXUHAO;

    String GBKXUHAO;

    Float KECENG;

    Float TRANSFERNO;

    String STORENO;

    String OPFLAG;

    public Float getSEQNO() {
        return SEQNO;
    }

    public void setSEQNO(Float SEQNO) {
        this.SEQNO = SEQNO;
    }

    public Date getXSDATE() {
        return XSDATE;
    }

    public void setXSDATE(Date XSDATE) {
        this.XSDATE = XSDATE;
    }

    public String getPOSNUMBER() {
        return POSNUMBER;
    }

    public void setPOSNUMBER(String POSNUMBER) {
        this.POSNUMBER = POSNUMBER;
    }

    public Date getRUNDATE() {
        return RUNDATE;
    }

    public void setRUNDATE(Date RUNDATE) {
        this.RUNDATE = RUNDATE;
    }

    public Float getRCLASS() {
        return RCLASS;
    }

    public void setRCLASS(Float RCLASS) {
        this.RCLASS = RCLASS;
    }

    public String getSYUSER() {
        return SYUSER;
    }

    public void setSYUSER(String SYUSER) {
        this.SYUSER = SYUSER;
    }

    public Float getXSSUM() {
        return XSSUM;
    }

    public void setXSSUM(Float XSSUM) {
        this.XSSUM = XSSUM;
    }

    public Float getSELLSUM() {
        return SELLSUM;
    }

    public void setSELLSUM(Float SELLSUM) {
        this.SELLSUM = SELLSUM;
    }

    public Float getYSJE() {
        return YSJE;
    }

    public void setYSJE(Float YSJE) {
        this.YSJE = YSJE;
    }

    public Float getDPYOUHUI() {
        return DPYOUHUI;
    }

    public void setDPYOUHUI(Float DPYOUHUI) {
        this.DPYOUHUI = DPYOUHUI;
    }

    public Float getCXXSSUM() {
        return CXXSSUM;
    }

    public void setCXXSSUM(Float CXXSSUM) {
        this.CXXSSUM = CXXSSUM;
    }

    public Float getCXSELLSUM() {
        return CXSELLSUM;
    }

    public void setCXSELLSUM(Float CXSELLSUM) {
        this.CXSELLSUM = CXSELLSUM;
    }

    public Float getCXYSJE() {
        return CXYSJE;
    }

    public void setCXYSJE(Float CXYSJE) {
        this.CXYSJE = CXYSJE;
    }

    public Float getYSJE1() {
        return YSJE1;
    }

    public void setYSJE1(Float YSJE1) {
        this.YSJE1 = YSJE1;
    }

    public Float getSSJE() {
        return SSJE;
    }

    public void setSSJE(Float SSJE) {
        this.SSJE = SSJE;
    }

    public Float getZLJE() {
        return ZLJE;
    }

    public void setZLJE(Float ZLJE) {
        this.ZLJE = ZLJE;
    }

    public Float getRLJE() {
        return RLJE;
    }

    public void setRLJE(Float RLJE) {
        this.RLJE = RLJE;
    }

    public String getRLCUURRID() {
        return RLCUURRID;
    }

    public void setRLCUURRID(String RLCUURRID) {
        this.RLCUURRID = RLCUURRID;
    }

    public Float getRLCURRRATE() {
        return RLCURRRATE;
    }

    public void setRLCURRRATE(Float RLCURRRATE) {
        this.RLCURRRATE = RLCURRRATE;
    }

    public Float getSHULIANG() {
        return SHULIANG;
    }

    public void setSHULIANG(Float SHULIANG) {
        this.SHULIANG = SHULIANG;
    }

    public String getBASECURRID() {
        return BASECURRID;
    }

    public void setBASECURRID(String BASECURRID) {
        this.BASECURRID = BASECURRID;
    }

    public Float getFLAG() {
        return FLAG;
    }

    public void setFLAG(Float FLAG) {
        this.FLAG = FLAG;
    }

    public String getYYYUSER() {
        return YYYUSER;
    }

    public void setYYYUSER(String YYYUSER) {
        this.YYYUSER = YYYUSER;
    }

    public String getHYJKXUHAO() {
        return HYJKXUHAO;
    }

    public void setHYJKXUHAO(String HYJKXUHAO) {
        this.HYJKXUHAO = HYJKXUHAO;
    }

    public String getHYYKXUHAO() {
        return HYYKXUHAO;
    }

    public void setHYYKXUHAO(String HYYKXUHAO) {
        this.HYYKXUHAO = HYYKXUHAO;
    }

    public String getJFKXUHAO() {
        return JFKXUHAO;
    }

    public void setJFKXUHAO(String JFKXUHAO) {
        this.JFKXUHAO = JFKXUHAO;
    }

    public String getGBKXUHAO() {
        return GBKXUHAO;
    }

    public void setGBKXUHAO(String GBKXUHAO) {
        this.GBKXUHAO = GBKXUHAO;
    }

    public Float getKECENG() {
        return KECENG;
    }

    public void setKECENG(Float KECENG) {
        this.KECENG = KECENG;
    }

    public Float getTRANSFERNO() {
        return TRANSFERNO;
    }

    public void setTRANSFERNO(Float TRANSFERNO) {
        this.TRANSFERNO = TRANSFERNO;
    }

    public String getSTORENO() {
        return STORENO;
    }

    public void setSTORENO(String STORENO) {
        this.STORENO = STORENO;
    }

    public String getOPFLAG() {
        return OPFLAG;
    }

    public void setOPFLAG(String OPFLAG) {
        this.OPFLAG = OPFLAG;
    }

    @Override
    public String toString() {
        return "POS_REAL_INV{" +
                "ID=" + ID +
                ", XSDANJUHAO='" + XSDANJUHAO + '\'' +
                ", OLDDANJUHAO='" + OLDDANJUHAO + '\'' +
                ", SEQNO=" + SEQNO +
                ", XSDATE=" + XSDATE +
                ", POSNUMBER='" + POSNUMBER + '\'' +
                ", RUNDATE=" + RUNDATE +
                ", RCLASS=" + RCLASS +
                ", SYUSER='" + SYUSER + '\'' +
                ", XSSUM=" + XSSUM +
                ", SELLSUM=" + SELLSUM +
                ", YSJE=" + YSJE +
                ", DPYOUHUI=" + DPYOUHUI +
                ", CXXSSUM=" + CXXSSUM +
                ", CXSELLSUM=" + CXSELLSUM +
                ", CXYSJE=" + CXYSJE +
                ", YSJE1=" + YSJE1 +
                ", SSJE=" + SSJE +
                ", ZLJE=" + ZLJE +
                ", RLJE=" + RLJE +
                ", RLCUURRID='" + RLCUURRID + '\'' +
                ", RLCURRRATE=" + RLCURRRATE +
                ", SHULIANG=" + SHULIANG +
                ", BASECURRID='" + BASECURRID + '\'' +
                ", FLAG=" + FLAG +
                ", YYYUSER='" + YYYUSER + '\'' +
                ", HYJKXUHAO='" + HYJKXUHAO + '\'' +
                ", HYYKXUHAO='" + HYYKXUHAO + '\'' +
                ", JFKXUHAO='" + JFKXUHAO + '\'' +
                ", GBKXUHAO='" + GBKXUHAO + '\'' +
                ", KECENG=" + KECENG +
                ", TRANSFERNO=" + TRANSFERNO +
                ", STORENO='" + STORENO + '\'' +
                ", OPFLAG='" + OPFLAG + '\'' +
                '}';
    }
}
