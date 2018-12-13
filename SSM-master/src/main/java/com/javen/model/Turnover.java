package com.javen.model;

import java.math.BigDecimal;
import java.util.Date;

public class Turnover {
    private Long id;

    private BigDecimal cash;

    private BigDecimal networkCash;

    private BigDecimal totalSum;

    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public BigDecimal getNetworkCash() {
        return networkCash;
    }

    public void setNetworkCash(BigDecimal networkCash) {
        this.networkCash = networkCash;
    }

    public BigDecimal getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(BigDecimal totalSum) {
        this.totalSum = totalSum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}