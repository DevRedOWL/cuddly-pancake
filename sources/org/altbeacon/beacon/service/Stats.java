package org.altbeacon.beacon.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.logging.LogManager;

public class Stats {
    private static final Stats INSTANCE = new Stats();
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("HH:mm:ss.SSS");
    private static final String TAG = "Stats";
    private boolean mEnableHistoricalLogging;
    private boolean mEnableLogging;
    private boolean mEnabled;
    private Sample mSample;
    private long mSampleIntervalMillis = 0;
    private ArrayList<Sample> mSamples;

    public static class Sample {
        public long detectionCount = 0;
        public Date firstDetectionTime;
        public Date lastDetectionTime;
        public long maxMillisBetweenDetections;
        public Date sampleStartTime;
        public Date sampleStopTime;
    }

    public static Stats getInstance() {
        return INSTANCE;
    }

    private Stats() {
        clearSamples();
    }

    public ArrayList<Sample> getSamples() {
        rollSampleIfNeeded();
        return this.mSamples;
    }

    public void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void setLoggingEnabled(boolean z) {
        this.mEnableLogging = z;
    }

    public void setHistoricalLoggingEnabled(boolean z) {
        this.mEnableHistoricalLogging = z;
    }

    public void setSampleIntervalMillis(long j) {
        this.mSampleIntervalMillis = j;
    }

    public void log(Beacon beacon) {
        rollSampleIfNeeded();
        this.mSample.detectionCount++;
        if (this.mSample.firstDetectionTime == null) {
            this.mSample.firstDetectionTime = new Date();
        }
        if (this.mSample.lastDetectionTime != null) {
            long time = new Date().getTime() - this.mSample.lastDetectionTime.getTime();
            if (time > this.mSample.maxMillisBetweenDetections) {
                this.mSample.maxMillisBetweenDetections = time;
            }
        }
        this.mSample.lastDetectionTime = new Date();
    }

    public void clearSample() {
        this.mSample = null;
    }

    public void newSampleInterval() {
        Date date = new Date();
        Sample sample = this.mSample;
        if (sample != null) {
            date = new Date(sample.sampleStartTime.getTime() + this.mSampleIntervalMillis);
            Sample sample2 = this.mSample;
            sample2.sampleStopTime = date;
            if (!this.mEnableHistoricalLogging && this.mEnableLogging) {
                logSample(sample2, true);
            }
        }
        this.mSample = new Sample();
        Sample sample3 = this.mSample;
        sample3.sampleStartTime = date;
        this.mSamples.add(sample3);
        if (this.mEnableHistoricalLogging) {
            logSamples();
        }
    }

    public void clearSamples() {
        this.mSamples = new ArrayList<>();
        newSampleInterval();
    }

    private void logSample(Sample sample, boolean z) {
        if (z) {
            LogManager.m6834d(TAG, "sample start time, sample stop time, first detection time, last detection time, max millis between detections, detection count", new Object[0]);
        }
        LogManager.m6834d(TAG, "%s, %s, %s, %s, %s, %s", formattedDate(sample.sampleStartTime), formattedDate(sample.sampleStopTime), formattedDate(sample.firstDetectionTime), formattedDate(sample.lastDetectionTime), Long.valueOf(sample.maxMillisBetweenDetections), Long.valueOf(sample.detectionCount));
    }

    private String formattedDate(Date date) {
        String format;
        if (date == null) {
            return "";
        }
        synchronized (SIMPLE_DATE_FORMAT) {
            format = SIMPLE_DATE_FORMAT.format(date);
        }
        return format;
    }

    private void logSamples() {
        boolean z = true;
        LogManager.m6834d(TAG, "--- Stats for %s samples", Integer.valueOf(this.mSamples.size()));
        Iterator<Sample> it = this.mSamples.iterator();
        while (it.hasNext()) {
            logSample(it.next(), z);
            z = false;
        }
    }

    private void rollSampleIfNeeded() {
        if (this.mSample == null || (this.mSampleIntervalMillis > 0 && new Date().getTime() - this.mSample.sampleStartTime.getTime() >= this.mSampleIntervalMillis)) {
            newSampleInterval();
        }
    }
}
