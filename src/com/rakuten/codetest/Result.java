package com.rakuten.codetest;

import java.util.Date;

public class Result {
    String daysNeeded;
    Long bigMouseDistanceDigged;
    Long smallMouseDistanceDigged;

    public String getDaysNeeded() {
        return daysNeeded;
    }

    public void setDaysNeeded(String daysNeeded) {
        this.daysNeeded = daysNeeded;
    }

    public Long getBigMouseDistanceDigged() {
        return bigMouseDistanceDigged;
    }

    public void setBigMouseDistanceDigged(Long bigMouseDistanceDigged) {
        this.bigMouseDistanceDigged = bigMouseDistanceDigged;
    }

    public Long getSmallMouseDistanceDigged() {
        return smallMouseDistanceDigged;
    }

    public void setSmallMouseDistanceDigged(Long smallMouseDistanceDigged) {
        this.smallMouseDistanceDigged = smallMouseDistanceDigged;
    }
}
