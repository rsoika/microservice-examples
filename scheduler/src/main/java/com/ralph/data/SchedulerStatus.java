package com.ralph.data;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Status object collecting data about the scheduler configuraiton
 * 
 * @author rsoika
 *
 */
@XmlRootElement
public class SchedulerStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    private long initalDelay;
    private long period;
   
    private long executions=0;
    private boolean lastResult=false;
    /**
     * Default constructor
     */
    public SchedulerStatus() {
        super();
    }

    public SchedulerStatus(long initalDelay, long period) {
        super();
        this.initalDelay = initalDelay;
        this.period = period;
    }

    @XmlElement
    public long getInitalDelay() {
        return initalDelay;
    }

    public void setInitalDelay(long initalDelay) {
        this.initalDelay = initalDelay;
    }

    @XmlElement
    public long getPeriod() {
        return period;
    }

    public void setPeriod(long period) {
        this.period = period;
    }

    @XmlElement
    public long getExecutions() {
        return executions;
    }

    public void setExecutions(long executions) {
        this.executions = executions;
    }

    @XmlElement
    public boolean isLastResult() {
        return lastResult;
    }

    public void setLastResult(boolean lastResult) {
        this.lastResult = lastResult;
    }

}
