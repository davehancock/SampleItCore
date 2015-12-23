package com.djh.sampleit.cpu.controller.model;

/**
 * @author David Hancock
 */
public class CPUCore {

    private double cpuClockSpeed;

    private int cpuTemp;

    public CPUCore(){
    }

    public double getCpuClockSpeed() {
        return cpuClockSpeed;
    }

    public void setCpuClockSpeed(double cpuClockSpeed) {
        this.cpuClockSpeed = cpuClockSpeed;
    }

}
