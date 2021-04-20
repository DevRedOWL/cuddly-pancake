package org.mobileid.access.key;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b&\u0018\u0000 (2\u00020\u0001:\u0002()B3\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\tJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\r8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u00020\u00078\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\"\u0010\u001c\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u000b\u001a\u00020\u00078\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b!\u0010\tR\"\u0010\"\u001a\u00020\u00078\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\t\"\u0004\b$\u0010%¨\u0006*"}, mo51343d2 = {"Lorg/mobileid/access/key/SimpleKey;", "Lorg/mobileid/access/key/Key;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "formSaveValue$aclib_api2_6826_release", "()Ljava/lang/String;", "formSaveValue", "mobileId", "(Ljava/lang/String;)Ljava/lang/String;", "", "hashCode", "()I", "toString", "Lorg/mobileid/access/key/KeyAction;", "validate", "()Lorg/mobileid/access/key/KeyAction;", "color", "I", "getColor", "setColor", "(I)V", "id", "Ljava/lang/String;", "getId", "isDefault", "Z", "()Z", "setDefault", "(Z)V", "getMobileId$aclib_api2_6826_release", "name", "getName", "setName", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "Companion", "KeyData", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public abstract class SimpleKey extends Key {
    public static final int COLOR_POSITION = 1;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int DEFAULT_COLOR = -1;
    public static final int IS_DEFAULT_POSITION = 2;
    public static final int MOBILE_ID_POSITION = 0;
    public static final int NAME_POSITION = 3;
    public static final int SAVED_VALUES_SIZE = 4;
    public static final char SAVED_VALUE_DELIMITER = '\u001f';
    public int color;

    /* renamed from: id */
    public final String f6374id;
    public boolean isDefault;
    public final String mobileId;
    public String name;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0005\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo51343d2 = {"Lorg/mobileid/access/key/SimpleKey$Companion;", "", "value", "Lorg/mobileid/access/key/SimpleKey$KeyData;", "fromStorage", "(Ljava/lang/String;)Lorg/mobileid/access/key/SimpleKey$KeyData;", "", "COLOR_POSITION", "I", "DEFAULT_COLOR", "IS_DEFAULT_POSITION", "MOBILE_ID_POSITION", "NAME_POSITION", "SAVED_VALUES_SIZE", "", "SAVED_VALUE_DELIMITER", "C", "<init>", "()V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KeyData fromStorage(String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            List split$default = StringsKt.split$default((CharSequence) str, new char[]{31}, false, 0, 6, (Object) null);
            return new KeyData((String) split$default.get(0), Integer.parseInt((String) split$default.get(1)), Boolean.parseBoolean((String) split$default.get(2)), (String) split$default.get(3));
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000B'\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0002\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0007\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0019\u0010\u000b\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0013"}, mo51343d2 = {"Lorg/mobileid/access/key/SimpleKey$KeyData;", "", "color", "I", "getColor", "()I", "", "isDefault", "Z", "()Z", "", "mobileId", "Ljava/lang/String;", "getMobileId", "()Ljava/lang/String;", "name", "getName", "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
    public static final class KeyData {
        public final int color;
        public final boolean isDefault;
        public final String mobileId;
        public final String name;

        public KeyData(String str, int i, boolean z, String str2) {
            Intrinsics.checkNotNullParameter(str, "mobileId");
            Intrinsics.checkNotNullParameter(str2, "name");
            this.mobileId = str;
            this.color = i;
            this.isDefault = z;
            this.name = str2;
        }

        public final int getColor() {
            return this.color;
        }

        public final String getMobileId() {
            return this.mobileId;
        }

        public final String getName() {
            return this.name;
        }

        public final boolean isDefault() {
            return this.isDefault;
        }
    }

    public SimpleKey(String str, String str2, String str3, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "mobileId");
        Intrinsics.checkNotNullParameter(str3, "name");
        this.f6374id = str;
        this.mobileId = str2;
        this.name = str3;
        this.color = i;
        this.isDefault = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleKey(String str, String str2, String str3, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? false : z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) getClass(), (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            SimpleKey simpleKey = (SimpleKey) obj;
            return !(Intrinsics.areEqual((Object) getId(), (Object) simpleKey.getId()) ^ true) && !(Intrinsics.areEqual((Object) getMobileId$aclib_api2_6826_release(), (Object) simpleKey.getMobileId$aclib_api2_6826_release()) ^ true) && !(Intrinsics.areEqual((Object) getName(), (Object) simpleKey.getName()) ^ true) && getColor() == simpleKey.getColor() && isDefault() == simpleKey.isDefault();
        }
        throw new NullPointerException("null cannot be cast to non-null type org.mobileid.access.key.SimpleKey");
    }

    public String formSaveValue(String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "mobileId");
        String[] strArr = new String[4];
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                str2 = str;
            } else if (i == 1) {
                str2 = String.valueOf(getColor());
            } else if (i == 2) {
                str2 = String.valueOf(isDefault());
            } else if (i == 3) {
                str2 = getName();
            } else {
                throw new IllegalStateException("Cannot resolve position " + i);
            }
            strArr[i] = str2;
        }
        return ArraysKt.joinToString$default((Object[]) strArr, (CharSequence) String.valueOf(31), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    public String formSaveValue$aclib_api2_6826_release() {
        return formSaveValue(getMobileId$aclib_api2_6826_release());
    }

    public int getColor() {
        return this.color;
    }

    public String getId() {
        return this.f6374id;
    }

    public String getMobileId$aclib_api2_6826_release() {
        return this.mobileId;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((((getId().hashCode() * 31) + getMobileId$aclib_api2_6826_release().hashCode()) * 31) + getName().hashCode()) * 31) + getColor()) * 31) + Boolean.valueOf(isDefault()).hashCode();
    }

    public boolean isDefault() {
        return this.isDefault;
    }

    public void setColor(int i) {
        this.color = i;
    }

    public void setDefault(boolean z) {
        this.isDefault = z;
    }

    public void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public String toString() {
        return getName();
    }

    public KeyAction validate() {
        return getMobileId$aclib_api2_6826_release().length() > 0 ? KeyAction.USE : KeyAction.REMOVE;
    }
}
