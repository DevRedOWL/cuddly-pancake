package com.yandex.metrica.impl.p039ob;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.ParcelUuid;
import android.util.SparseArray;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.dj */
public class C3338dj {

    /* renamed from: a */
    private final C4228wh f3059a;

    /* renamed from: b */
    private final C4226wf f3060b;

    public C3338dj() {
        this(new C4227wg(), new C4226wf());
    }

    /* renamed from: a */
    public JSONObject mo39907a(int i) throws JSONException {
        return new JSONObject().put("error_code", i);
    }

    /* renamed from: a */
    public JSONObject mo39908a(ScanResult scanResult, Integer num) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (num != null) {
            jSONObject.put("callback_type", num);
        }
        jSONObject.put("event_timestamp", this.f3059a.mo41769b());
        jSONObject.put("rssi", scanResult.getRssi());
        jSONObject.put("observed_scan_result_offset", this.f3060b.mo41763a(scanResult.getTimestampNanos(), TimeUnit.NANOSECONDS));
        if (C3306cx.m2857a(26)) {
            jSONObject.put("ad_ssid", scanResult.getAdvertisingSid());
            jSONObject.put("periodic_ad_interval", scanResult.getPeriodicAdvertisingInterval());
            jSONObject.put("primary_phy", scanResult.getPrimaryPhy());
            jSONObject.put("secondary_phy", scanResult.getSecondaryPhy());
            jSONObject.put("tx_power", scanResult.getTxPower());
        }
        ScanRecord scanRecord = scanResult.getScanRecord();
        if (scanRecord != null) {
            m3015a(scanRecord, jSONObject);
        }
        BluetoothDevice device = scanResult.getDevice();
        if (device != null) {
            m3014a(device, jSONObject);
        }
        return jSONObject;
    }

    /* renamed from: a */
    private void m3014a(BluetoothDevice bluetoothDevice, JSONObject jSONObject) throws JSONException {
        jSONObject.put("device_address", bluetoothDevice.getAddress());
    }

    /* renamed from: a */
    private void m3015a(ScanRecord scanRecord, JSONObject jSONObject) throws JSONException {
        jSONObject.put("device_name", scanRecord.getDeviceName());
        if (scanRecord.getManufacturerSpecificData() != null) {
            jSONObject.put("manufacturer_data", m3012a(scanRecord.getManufacturerSpecificData()));
        }
        if (scanRecord.getServiceData() != null) {
            jSONObject.put("service_data", m3013a(scanRecord.getServiceData()));
        }
        jSONObject.put("packet_tx_power_level", scanRecord.getTxPowerLevel());
    }

    /* renamed from: a */
    private JSONObject m3012a(SparseArray<byte[]> sparseArray) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < sparseArray.size(); i++) {
            jSONObject.put(String.valueOf(sparseArray.keyAt(i)), C3303cu.m2821a(sparseArray.valueAt(i)));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private JSONObject m3013a(Map<ParcelUuid, byte[]> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            jSONObject.put(((ParcelUuid) next.getKey()).toString(), C3303cu.m2821a((byte[]) next.getValue()));
        }
        return jSONObject;
    }

    C3338dj(C4228wh whVar, C4226wf wfVar) {
        this.f3059a = whVar;
        this.f3060b = wfVar;
    }
}
