package com.djh.sampleit.metadata;

import java.util.Date;

/**
 * @author David Hancock
 */
public class MetricMetadata {

    private String hostname;

    private Date date;

    public MetricMetadata(){
    }

    public MetricMetadata(String hostname, Date date) {
        this.hostname = hostname;
        this.date = date;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
