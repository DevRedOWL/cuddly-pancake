package org.mobileid.access.key;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.mobileid.access.key.SimpleKey;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B7\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8P@\u0010X\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00028V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, mo51343d2 = {"Lorg/mobileid/access/key/NetworkKey;", "Lorg/mobileid/access/key/SimpleKey;", "", "prefix", "", "isKeyPrefix$aclib_api2_6826_release", "(Ljava/lang/String;)Z", "isKeyPrefix", "", "getAccessPointType$aclib_api2_6826_release", "()I", "accessPointType", "getDefaultKeyName", "()Ljava/lang/String;", "defaultKeyName", "id", "mobileId", "name", "color", "isDefault", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "Companion", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class NetworkKey extends SimpleKey {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String DEFAULT_KEY_NAME = "Network";
    public static final String DEFAULT_PREFIX = "N";
    public static final String DEFAULT_STORAGE_ID = "network";

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\nR\u0016\u0010\r\u001a\u00020\u00018\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00018\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00018\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0013"}, mo51343d2 = {"Lorg/mobileid/access/key/NetworkKey$Companion;", "", "id", "value", "Lorg/mobileid/access/key/NetworkKey;", "fromStorage", "(Ljava/lang/String;Ljava/lang/String;)Lorg/mobileid/access/key/NetworkKey;", "prefix", "", "isNetworkKeyPrefix", "(Ljava/lang/String;)Z", "storageId", "isNetworkStorageKeyId", "DEFAULT_KEY_NAME", "Ljava/lang/String;", "DEFAULT_PREFIX", "DEFAULT_STORAGE_ID", "<init>", "()V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NetworkKey fromStorage(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(str2, "value");
            SimpleKey.KeyData fromStorage = SimpleKey.Companion.fromStorage(str2);
            return new NetworkKey(str, fromStorage.getMobileId(), fromStorage.getName(), fromStorage.getColor(), fromStorage.isDefault());
        }

        public final boolean isNetworkKeyPrefix(String str) {
            Intrinsics.checkNotNullParameter(str, "prefix");
            return Intrinsics.areEqual((Object) str, (Object) "N");
        }

        public final boolean isNetworkStorageKeyId(String str) {
            Intrinsics.checkNotNullParameter(str, "storageId");
            return StringsKt.startsWith$default(str, NetworkKey.DEFAULT_STORAGE_ID, false, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetworkKey(String str, String str2, String str3, int i, boolean z) {
        super(str, str2, str3, i, z);
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "mobileId");
        Intrinsics.checkNotNullParameter(str3, "name");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkKey(String str, String str2, String str3, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? DEFAULT_STORAGE_ID : str, str2, (i2 & 4) != 0 ? DEFAULT_KEY_NAME : str3, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? false : z);
    }

    public int getAccessPointType$aclib_api2_6826_release() {
        return 1;
    }

    public String getDefaultKeyName() {
        return DEFAULT_KEY_NAME;
    }

    public boolean isKeyPrefix$aclib_api2_6826_release(String str) {
        Intrinsics.checkNotNullParameter(str, "prefix");
        return Companion.isNetworkKeyPrefix(str);
    }
}
