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

    public CPUMetric(MetricMetadata metricMetadata, List<CPUCore> cpuCores) {
        this.metricMetadata = metricMetadata;
        this.cpuCores = cpuCores;
    }

    public MetricMetadata getMetricMetadata() {
        return metricMetadata;
    }

    public List<CPUCore> getCpuCores() {
        return cpuCores;
    }

}