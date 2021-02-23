package com.wojia.application.pojo;

import java.util.Date;

/**
 * @Author 慕琪
 * @Date 2021/2/22 10:33
 * @Version 1.0
 **/
public class Product {
    private Integer pid;
    private String pname;
    private double market_price;
    private double shop_price;
    private String image;
    private String pdesc;
    private int is_hot;
    private Date pdate;
    private int csid;

    public Product() {
    }

    public Product(Integer pid, String pname, double market_price, double shop_price, String image, String pdesc, int is_hot, Date pdate, int csid) {
        this.pid = pid;
        this.pname = pname;
        this.market_price = market_price;
        this.shop_price = shop_price;
        this.image = image;
        this.pdesc = pdesc;
        this.is_hot = is_hot;
        this.pdate = pdate;
        this.csid = csid;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", market_price=" + market_price +
                ", shop_price=" + shop_price +
                ", image='" + image + '\'' +
                ", pdesc='" + pdesc + '\'' +
                ", is_hot=" + is_hot +
                ", pdate=" + pdate +
                ", csid=" + csid +
                '}';
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getMarket_price() {
        return market_price;
    }

    public void setMarket_price(double market_price) {
        this.market_price = market_price;
    }

    public double getShop_price() {
        return shop_price;
    }

    public void setShop_price(double shop_price) {
        this.shop_price = shop_price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    public int getIs_hot() {
        return is_hot;
    }

    public void setIs_hot(int is_hot) {
        this.is_hot = is_hot;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public int getCsid() {
        return csid;
    }

    public void setCsid(int csid) {
        this.csid = csid;
    }
}
