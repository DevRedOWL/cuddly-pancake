package p035ru.unicorn.ujin.view.activity.navigation.p058ui.device;

import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.HardwareSignal;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.VersionData */
class VersionData {
    private String manual;
    private String version;

    public VersionData(String str, String str2) {
        this.version = str;
        this.manual = str2;
    }

    public static VersionData getData(Hardware hardware) {
        String manual2 = hardware.getManual();
        RealmList<HardwareSignal> signals = hardware.getSignals();
        String str = null;
        if (signals == null || signals.isEmpty()) {
            return null;
        }
        for (int i = 0; i < signals.size(); i++) {
            if (signals.get(i).getName().equals("ver")) {
                str = signals.get(i).getValue();
            }
        }
        return new VersionData(str, manual2);
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getManual() {
        return this.manual;
    }

    public void setManual(String str) {
        this.manual = str;
    }

    public boolean hasManual() {
        return this.manual != null;
    }

    public boolean hasVersion() {
        return this.version != null;
    }
}
