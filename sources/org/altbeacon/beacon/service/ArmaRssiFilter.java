package org.altbeacon.beacon.service;

import org.altbeacon.beacon.logging.LogManager;

public class ArmaRssiFilter implements RssiFilter {
    private static double DEFAULT_ARMA_SPEED = 0.1d;
    private static final String TAG = "ArmaRssiFilter";
    private int armaMeasurement;
    private double armaSpeed;
    private boolean isInitialized;

    public int getMeasurementCount() {
        return 0;
    }

    public boolean noMeasurementsAvailable() {
        return false;
    }

    public ArmaRssiFilter() {
        this.armaSpeed = 0.1d;
        this.isInitialized = false;
        this.armaSpeed = DEFAULT_ARMA_SPEED;
    }

    public void addMeasurement(Integer num) {
        LogManager.m6834d(TAG, "adding rssi: %s", num);
        if (!this.isInitialized) {
            this.armaMeasurement = num.intValue();
            this.isInitialized = true;
        }
        int i = this.armaMeasurement;
        this.armaMeasurement = Double.valueOf(((double) i) - (this.armaSpeed * ((double) (i - num.intValue())))).intValue();
        LogManager.m6834d(TAG, "armaMeasurement: %s", Integer.valueOf(this.armaMeasurement));
    }

    public double calculateRssi() {
        return (double) this.armaMeasurement;
    }

    public static void setDEFAULT_ARMA_SPEED(double d) {
        DEFAULT_ARMA_SPEED = d;
    }
}
