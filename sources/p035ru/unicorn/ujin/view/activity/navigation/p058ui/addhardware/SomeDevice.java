package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware;

import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.SomeDevice */
public class SomeDevice implements Diffable<SomeDevice> {
    private String deviceName;
    private String deviceType;
    private String deviceUrl;

    public boolean areContentsTheSame(SomeDevice someDevice) {
        return false;
    }

    public boolean areItemsTheSame(SomeDevice someDevice) {
        return false;
    }

    public SomeDevice(String str, String str2, String str3) {
        this.deviceType = str;
        this.deviceName = str2;
        this.deviceUrl = str3;
    }

    public SomeDevice(String str, String str2) {
        this.deviceType = str;
        this.deviceName = str2;
    }

    public String getDeviceUrl() {
        return this.deviceUrl;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public static SomeDevice createSomeDevice(String str, String str2, String str3) {
        if (str3 == null) {
            return new SomeDevice(str, str2);
        }
        return new SomeDevice(str, str2, str3);
    }

    public static SomeDevice createSomeDevice(String str, String str2) {
        return new SomeDevice(str, str2);
    }
}
