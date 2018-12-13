package com.javen.model;

import org.apache.ibatis.session.RowBounds;

public class PageInfo extends RowBounds {
    public  PageInfo(int pageNo ,int pageRows){
        super(pageNo,pageRows);
    }
    public PageInfo(int offset ,int limit, String orderStr){
        super(offset,limit);
        this.orderStr=orderStr;
    }
    private Long total = 0l;
    private String orderStr = "";

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getOrderStr() {
        return orderStr;
    }

    public void setOrderStr(String orderStr) {
        this.orderStr = orderStr;
    }
}
