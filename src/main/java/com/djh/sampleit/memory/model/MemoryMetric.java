package com.djh.sampleit.memory.model;

import com.djh.sampleit.metadata.MetricMetadata;

/**
 * @author David Hancock
 */
public class MemoryMetric{

    private long totalMemoryCapacity;

    private long totalMemoryUsed;

    public MemoryMetric(){
    }

    public long getTotalMemoryUsed() {
        return totalMemoryUsed;
    }

    public void setTotalMemoryUsed(long totalMemoryUsed) {
        this.totalMemoryUsed = totalMemoryUsed;
    }

    public long getTotalMemoryCapacity() {
        return totalMemoryCapacity;
    }

    public void setTotalMemoryCapacity(long totalMemoryCapacity) {
        this.totalMemoryCapacity = totalMemoryCapacity;
    }

}
