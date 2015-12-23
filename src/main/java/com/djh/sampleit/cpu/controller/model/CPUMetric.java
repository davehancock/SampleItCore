package com.djh.sampleit.cpu.controller.model;

import com.djh.sampleit.metadata.MetricMetadata;

import java.util.ArrayList;
import java.util.List;

/**
 * @author David Hancock
 */
public class CPUMetric {

    private MetricMetadata metricMetadata;

    private List<CPUCore> cpuCores = new ArrayList<>();

    public CPUMetric(){
    }

    public MetricMetadata getMetricMetadata() {
        return metricMetadata;
    }

    public void setMetricMetadata(MetricMetadata metricMetadata) {
        this.metricMetadata = metricMetadata;
    }

    public List<CPUCore> getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(List<CPUCore> cpuCores) {
        this.cpuCores = cpuCores;
    }
}