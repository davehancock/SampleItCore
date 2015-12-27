package com.djh.sampleit.metadata;

import java.util.Date;

/**
 * @author David Hancock
 */
public class MetricMetadata {

    private String hostname;

    private Date date;

    private String ipAddress;

    private String operatingSystem;

    public MetricMetadata() {
    }

    public MetricMetadata(String hostname, Date date) {
        this.hostname = hostname;
        this.date = date;
    }

    public String getHostname() {
        return hostname;
    }

    public Date getDate() {
        return date;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

}
