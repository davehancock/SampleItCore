package com.djh.sampleit.memory.model;

import com.djh.sampleit.metadata.MetricMetadata;

/**
 * @author David Hancock
 */
public class MemoryMetric {

    private MetricMetadata metricMetadata;

    private long totalMemory;

    private long totalAvailableMemory;

    public MemoryMetric() {
    }

    public MemoryMetric(MetricMetadata metricMetadata, long totalMemory, long totalAvailableMemory) {
        this.metricMetadata = metricMetadata;
        this.totalMemory = totalMemory;
        this.totalAvailableMemory = totalAvailableMemory;
    }

    public MetricMetadata getMetricMetadata() {
        return metricMetadata;
    }

    public long getTotalMemory() {
        return totalMemory;
    }

    public long getTotalAvailableMemory() {
        return totalAvailableMemory;
    }

}
