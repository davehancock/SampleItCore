package com.djh.sampleit.metadata;

import java.util.Date;

/**
 * @author David Hancock
 */
public class MetricMetadata {

    private Date date;

    private String hostname;

    private String macAddress;

    private String operatingSystem;

    private String originPublicIPAddress;

    public MetricMetadata() {
    }

    public MetricMetadata(Date date, String hostname, String macAddress, String operatingSystem) {
        this.date = date;
        this.hostname = hostname;
        this.macAddress = macAddress;
        this.operatingSystem = operatingSystem;
    }

    public void setOriginPublicIPAddress(String originPublicIPAddress) {
        this.originPublicIPAddress = originPublicIPAddress;
    }

    public Date getDate() {
        return date;
    }

    public String getHostname() {
        return hostname;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getOriginPublicIPAddress() {
        return originPublicIPAddress;
    }

}
