package p046io.anyline.plugin.meter;

import p007at.nineyards.anyline.modules.energy.EnergyScanView;

/* renamed from: io.anyline.plugin.meter.MeterScanMode */
public enum MeterScanMode {
    AUTO_ANALOG_DIGITAL_METER,
    ANALOG_METER,
    DIGITAL_METER,
    HEAT_METER_4,
    HEAT_METER_5,
    HEAT_METER_6,
    BARCODE,
    SERIAL_NUMBER,
    DIAL_METER,
    DOT_MATRIX_METER;

    public static MeterScanMode fromEnergyScanMode(EnergyScanView.ScanMode scanMode) {
        switch (scanMode) {
            case SERIAL_NUMBER:
                return SERIAL_NUMBER;
            case BARCODE:
                return BARCODE;
            case AUTO_ANALOG_DIGITAL_METER:
                return AUTO_ANALOG_DIGITAL_METER;
            case DIGITAL_METER:
                return DIGITAL_METER;
            case HEAT_METER_4:
                return HEAT_METER_4;
            case HEAT_METER_5:
                return HEAT_METER_5;
            case HEAT_METER_6:
                return HEAT_METER_6;
            case DIAL_METER:
                return DIAL_METER;
            case DOT_MATRIX_METER:
                return DOT_MATRIX_METER;
            default:
                return ANALOG_METER;
        }
    }

    public final EnergyScanView.ScanMode toEnergyScanMode() {
        switch (this) {
            case SERIAL_NUMBER:
                return EnergyScanView.ScanMode.SERIAL_NUMBER;
            case BARCODE:
                return EnergyScanView.ScanMode.BARCODE;
            case AUTO_ANALOG_DIGITAL_METER:
                return EnergyScanView.ScanMode.AUTO_ANALOG_DIGITAL_METER;
            case DIGITAL_METER:
                return EnergyScanView.ScanMode.DIGITAL_METER;
            case HEAT_METER_4:
                return EnergyScanView.ScanMode.HEAT_METER_4;
            case HEAT_METER_5:
                return EnergyScanView.ScanMode.HEAT_METER_5;
            case HEAT_METER_6:
                return EnergyScanView.ScanMode.HEAT_METER_6;
            case DIAL_METER:
                return EnergyScanView.ScanMode.DIAL_METER;
            case DOT_MATRIX_METER:
                return EnergyScanView.ScanMode.DOT_MATRIX_METER;
            default:
                return EnergyScanView.ScanMode.ANALOG_METER;
        }
    }
}
