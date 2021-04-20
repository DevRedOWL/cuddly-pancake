package org.mobileid.access.key;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0003R\u0019\u0010\u0005\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\n\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0003¨\u0006\u0013"}, mo51343d2 = {"Lorg/mobileid/access/key/KeyJavaBridge;", "", "formSaveValue", "()Ljava/lang/String;", "", "accessPointType", "I", "getAccessPointType", "()I", "Lorg/mobileid/access/key/Key;", "key", "Lorg/mobileid/access/key/Key;", "getKey", "()Lorg/mobileid/access/key/Key;", "mobileId", "Ljava/lang/String;", "getMobileId", "<init>", "(Lorg/mobileid/access/key/Key;)V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class KeyJavaBridge {
    public final int accessPointType = this.key.getAccessPointType$aclib_api2_6826_release();
    public final Key key;
    public final String mobileId;

    public KeyJavaBridge(Key key2) {
        Intrinsics.checkNotNullParameter(key2, "key");
        this.key = key2;
        this.mobileId = key2.getMobileId$aclib_api2_6826_release();
    }

    public final String formSaveValue() {
        return this.key.formSaveValue$aclib_api2_6826_release();
    }

    public final int getAccessPointType() {
        return this.accessPointType;
    }

    public final Key getKey() {
        return this.key;
    }

    public final String getMobileId() {
        return this.mobileId;
    }
}
