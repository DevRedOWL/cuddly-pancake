package org.mobileid.access.key;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.mobileid.access.key.SimpleKey;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB5\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8P@\u0010X\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, mo51343d2 = {"Lorg/mobileid/access/key/CompanyKey;", "Lorg/mobileid/access/key/SimpleKey;", "", "formSaveValue$aclib_api2_6826_release", "()Ljava/lang/String;", "formSaveValue", "", "getProfileId", "()J", "prefix", "", "isKeyPrefix$aclib_api2_6826_release", "(Ljava/lang/String;)Z", "isKeyPrefix", "", "getAccessPointType$aclib_api2_6826_release", "()I", "accessPointType", "getDefaultKeyName", "defaultKeyName", "mobileIdData", "Ljava/lang/String;", "name", "id", "color", "isDefault", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V", "Companion", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class CompanyKey extends SimpleKey {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String DEFAULT_KEY_NAME = "Company";
    public final String mobileIdData;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00018\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo51343d2 = {"Lorg/mobileid/access/key/CompanyKey$Companion;", "", "mobileIdData", "formMobileId", "(Ljava/lang/String;)Ljava/lang/String;", "id", "value", "Lorg/mobileid/access/key/CompanyKey;", "fromStorage", "(Ljava/lang/String;Ljava/lang/String;)Lorg/mobileid/access/key/CompanyKey;", "prefix", "", "isCompanyKeyPrefix", "(Ljava/lang/String;)Z", "DEFAULT_KEY_NAME", "Ljava/lang/String;", "<init>", "()V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String formMobileId(String str) {
            if (str.length() >= 40) {
                return StringsKt.substring(str, new IntRange(22, 39));
            }
            throw new IllegalStateException("Company key is not correct");
        }

        public final CompanyKey fromStorage(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(str2, "value");
            SimpleKey.KeyData fromStorage = SimpleKey.Companion.fromStorage(str2);
            return new CompanyKey(fromStorage.getName(), str, fromStorage.getColor(), fromStorage.getMobileId(), fromStorage.isDefault());
        }

        public final boolean isCompanyKeyPrefix(String str) {
            Intrinsics.checkNotNullParameter(str, "prefix");
            Integer intOrNull = StringsKt.toIntOrNull(str);
            return intOrNull != null && intOrNull.intValue() > 1000;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompanyKey(String str, String str2, int i, String str3, boolean z) {
        super(str2, Companion.formMobileId(str3), str, i, z);
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "id");
        Intrinsics.checkNotNullParameter(str3, "mobileIdData");
        this.mobileIdData = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompanyKey(String str, String str2, int i, String str3, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "Company" : str, str2, (i2 & 4) != 0 ? -1 : i, str3, (i2 & 16) != 0 ? false : z);
    }

    public String formSaveValue$aclib_api2_6826_release() {
        return formSaveValue(this.mobileIdData);
    }

    public int getAccessPointType$aclib_api2_6826_release() {
        return 3;
    }

    public String getDefaultKeyName() {
        return "Company";
    }

    public final long getProfileId() {
        String str = this.mobileIdData;
        if (str != null) {
            String substring = str.substring(18, 22);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return Long.parseLong(substring, CharsKt.checkRadix(16));
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public boolean isKeyPrefix$aclib_api2_6826_release(String str) {
        Intrinsics.checkNotNullParameter(str, "prefix");
        return Companion.isCompanyKeyPrefix(str);
    }
}
