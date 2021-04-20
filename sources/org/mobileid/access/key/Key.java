package org.mobileid.access.key;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b&\u0018\u0000B\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010\u0004\u001a\u00020\u0001H ¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001H ¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8 @ X \u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u00020\r8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00018&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0003R\u0016\u0010\u0018\u001a\u00020\u00018&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0003R\u001c\u0010\u0019\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00018 @ X \u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0003R\u001c\u0010\"\u001a\u00020\u00018&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0003\"\u0004\b \u0010!¨\u0006%"}, mo51343d2 = {"Lorg/mobileid/access/key/Key;", "", "formSaveValue$aclib_api2_6826_release", "()Ljava/lang/String;", "formSaveValue", "prefix", "", "isKeyPrefix$aclib_api2_6826_release", "(Ljava/lang/String;)Z", "isKeyPrefix", "Lorg/mobileid/access/key/KeyAction;", "validate", "()Lorg/mobileid/access/key/KeyAction;", "", "getAccessPointType$aclib_api2_6826_release", "()I", "accessPointType", "getColor", "setColor", "(I)V", "color", "getDefaultKeyName", "defaultKeyName", "getId", "id", "isDefault", "()Z", "setDefault", "(Z)V", "getMobileId$aclib_api2_6826_release", "mobileId", "getName", "setName", "(Ljava/lang/String;)V", "name", "<init>", "()V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public abstract class Key {
    public abstract String formSaveValue$aclib_api2_6826_release();

    public abstract int getAccessPointType$aclib_api2_6826_release();

    public abstract int getColor();

    public abstract String getDefaultKeyName();

    public abstract String getId();

    public abstract String getMobileId$aclib_api2_6826_release();

    public abstract String getName();

    public abstract boolean isDefault();

    public abstract boolean isKeyPrefix$aclib_api2_6826_release(String str);

    public abstract void setColor(int i);

    public abstract void setDefault(boolean z);

    public abstract void setName(String str);

    public abstract KeyAction validate();
}
