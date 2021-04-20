package org.mobileid.access.key;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.parameter.DefinitionParametersKt;
import org.koin.core.qualifier.Qualifier;
import p008c.p009a.p024e.p030e.C0983a;
import p008c.p009a.p024e.p030e.C0984b;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u0000 M2\u00020\u0001:\u0001MB;\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\b\u0002\u0010I\u001a\u00020\f¢\u0006\u0004\bJ\u0010KBC\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\bJ\u0010LJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JV\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001dJ\u001a\u0010!\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020\u0002H\u0010¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010%\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010\u000eJ\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u0002H\u0010¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020\u000f¢\u0006\u0004\b*\u0010\u0011J\u000f\u0010+\u001a\u00020\u0002H\u0016¢\u0006\u0004\b+\u0010\u0004J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\u0016\u00100\u001a\u00020\f8P@\u0010X\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u000eR\"\u0010\u0017\u001a\u00020\f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0017\u00101\u001a\u0004\b2\u0010\u000e\"\u0004\b3\u00104R\u0019\u0010\u0015\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u00105\u001a\u0004\b6\u0010\nR\u0019\u0010\u0016\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u00105\u001a\u0004\b7\u0010\nR\u0016\u00109\u001a\u00020\u00028V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0004R\u001c\u0010\u0012\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\b;\u0010\u0004R\"\u0010\u0018\u001a\u00020\u000f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010<\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b=\u0010>R\u001c\u0010\u0013\u001a\u00020\u00028\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\u0013\u0010:\u001a\u0004\b?\u0010\u0004R\"\u0010\u0014\u001a\u00020\u00028\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010:\u001a\u0004\b@\u0010\u0004\"\u0004\bA\u0010BR\u001d\u0010H\u001a\u00020C8B@\u0002X\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006N"}, mo51343d2 = {"Lorg/mobileid/access/key/TimeKey;", "Lorg/mobileid/access/key/Key;", "", "component1", "()Ljava/lang/String;", "component2$aclib_api2_6826_release", "component2", "component3", "Ljava/util/Date;", "component4", "()Ljava/util/Date;", "component5", "", "component6", "()I", "", "component7", "()Z", "id", "mobileId", "name", "dateFrom", "dateTill", "color", "isDefault", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;IZ)Lorg/mobileid/access/key/TimeKey;", "", "dateFromSeconds", "()J", "dateTillSeconds", "", "other", "equals", "(Ljava/lang/Object;)Z", "formSaveValue$aclib_api2_6826_release", "formSaveValue", "hashCode", "prefix", "isKeyPrefix$aclib_api2_6826_release", "(Ljava/lang/String;)Z", "isKeyPrefix", "started", "toString", "Lorg/mobileid/access/key/KeyAction;", "validate", "()Lorg/mobileid/access/key/KeyAction;", "getAccessPointType$aclib_api2_6826_release", "accessPointType", "I", "getColor", "setColor", "(I)V", "Ljava/util/Date;", "getDateFrom", "getDateTill", "getDefaultKeyName", "defaultKeyName", "Ljava/lang/String;", "getId", "Z", "setDefault", "(Z)V", "getMobileId$aclib_api2_6826_release", "getName", "setName", "(Ljava/lang/String;)V", "Lorg/mobileid/time_key/validator/TimeKeyValidator;", "timeKeyValidator$delegate", "Lkotlin/Lazy;", "getTimeKeyValidator", "()Lorg/mobileid/time_key/validator/TimeKeyValidator;", "timeKeyValidator", "priority", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJI)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;IZ)V", "Companion", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class TimeKey extends Key {
    public static final int COLOR_POSITION = 2;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int DATE_FROM_POSITION = 1;
    public static final int DATE_TILL_POSITION = 2;
    public static final int DEFAULT_COLOR = -1;
    public static final String DEFAULT_NAME = "Time key";
    public static final String DEFAULT_PREFIX = "T";
    public static final int IS_DEFAULT_POSITION = 3;
    public static final int KEY_NAME_POSITION = 0;
    public static final char KEY_PARTS_DELIMITER = '\u001e';
    public static final int KEY_PARTS_SIZE = 3;
    public static final int MOBILE_ID_POSITION = 0;
    public static final char SAVED_VALUE_DELIMITER = '\u001f';
    public static final int SAVE_VALUE_SIZE = 4;
    public static final int TIME_KEY_DATA_POSITION = 1;
    public int color;
    public final Date dateFrom;
    public final Date dateTill;

    /* renamed from: id */
    public final String f6375id;
    public boolean isDefault;
    public final String mobileId;
    public String name;
    public final Lazy timeKeyValidator$delegate;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\f\n\u0002\b\n\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\r8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\r8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00068\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010 \u001a\u00020\r8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0016\u0010!\u001a\u00020\r8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\r8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u0016\u0010&\u001a\u00020\r8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u0016\u0010'\u001a\u00020\"8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b'\u0010$R\u0016\u0010(\u001a\u00020\r8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u0016\u0010)\u001a\u00020\r8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b)\u0010\u0019¨\u0006,"}, mo51343d2 = {"Lorg/mobileid/access/key/TimeKey$Companion;", "", "seconds", "Ljava/util/Date;", "dateFromSeconds", "(J)Ljava/util/Date;", "", "id", "value", "Lorg/mobileid/access/key/TimeKey;", "fromStorage", "(Ljava/lang/String;Ljava/lang/String;)Lorg/mobileid/access/key/TimeKey;", "mobileId", "", "color", "", "isDefault", "timeKeyData", "fromTimeKeyData", "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;)Lorg/mobileid/access/key/TimeKey;", "isStorageTimeKeyId", "(Ljava/lang/String;)Z", "prefix", "isTimeKeyPrefix", "COLOR_POSITION", "I", "DATE_FROM_POSITION", "DATE_TILL_POSITION", "DEFAULT_COLOR", "DEFAULT_NAME", "Ljava/lang/String;", "DEFAULT_PREFIX", "IS_DEFAULT_POSITION", "KEY_NAME_POSITION", "", "KEY_PARTS_DELIMITER", "C", "KEY_PARTS_SIZE", "MOBILE_ID_POSITION", "SAVED_VALUE_DELIMITER", "SAVE_VALUE_SIZE", "TIME_KEY_DATA_POSITION", "<init>", "()V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final Date dateFromSeconds(long j) {
            return new Date(new Timestamp(j * ((long) 1000)).getTime());
        }

        private final TimeKey fromTimeKeyData(String str, String str2, int i, boolean z, String str3) {
            List split$default = StringsKt.split$default((CharSequence) str3, new char[]{TimeKey.KEY_PARTS_DELIMITER}, false, 0, 6, (Object) null);
            return new TimeKey(str, str2, (String) split$default.get(0), dateFromSeconds(Long.parseLong((String) split$default.get(1))), dateFromSeconds(Long.parseLong((String) split$default.get(2))), i, z);
        }

        public final TimeKey fromStorage(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(str2, "value");
            List split$default = StringsKt.split$default((CharSequence) str2, new char[]{31}, false, 0, 6, (Object) null);
            return fromTimeKeyData(str, (String) split$default.get(0), Integer.parseInt((String) split$default.get(2)), Boolean.parseBoolean((String) split$default.get(3)), (String) split$default.get(1));
        }

        public final boolean isStorageTimeKeyId(String str) {
            Intrinsics.checkNotNullParameter(str, "id");
            return StringsKt.startsWith$default(str, "T", false, 2, (Object) null);
        }

        public final boolean isTimeKeyPrefix(String str) {
            Intrinsics.checkNotNullParameter(str, "prefix");
            return StringsKt.startsWith$default(str, "T", false, 2, (Object) null);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {}, mo51343d2 = {}, mo51344k = 3, mo51345mv = {1, 4, 0}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C0983a.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[1] = 1;
            int[] iArr2 = $EnumSwitchMapping$0;
            iArr2[0] = 2;
            iArr2[2] = 3;
            iArr2[3] = 4;
        }
    }

    /* renamed from: org.mobileid.access.key.TimeKey$a */
    public static final class C5493a extends Lambda implements Function0<DefinitionParameters> {

        /* renamed from: a */
        public final /* synthetic */ TimeKey f6376a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5493a(TimeKey timeKey) {
            super(0);
            this.f6376a = timeKey;
        }

        public Object invoke() {
            return DefinitionParametersKt.parametersOf(this.f6376a);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TimeKey(String str, String str2, String str3, long j, long j2, int i) {
        this(str, str2, str3, Companion.dateFromSeconds(j), Companion.dateFromSeconds(j2), i, false, 64, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "mobileId");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TimeKey(String str, String str2, String str3, long j, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j, j2, (i2 & 32) != 0 ? -1 : i);
    }

    public TimeKey(String str, String str2, String str3, Date date, Date date2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "mobileId");
        Intrinsics.checkNotNullParameter(str3, "name");
        Intrinsics.checkNotNullParameter(date, "dateFrom");
        Intrinsics.checkNotNullParameter(date2, "dateTill");
        this.f6375id = str;
        this.mobileId = str2;
        this.name = str3;
        this.dateFrom = date;
        this.dateTill = date2;
        this.color = i;
        this.isDefault = z;
        Koin koin = GlobalContext.get().getKoin();
        this.timeKeyValidator$delegate = LazyKt.lazy(new TimeKey$$special$$inlined$inject$1(koin.getRootScope(), (Qualifier) null, new C5493a(this)));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TimeKey(String str, String str2, String str3, Date date, Date date2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, date, date2, (i2 & 32) != 0 ? -1 : i, (i2 & 64) != 0 ? false : z);
    }

    public static /* synthetic */ TimeKey copy$default(TimeKey timeKey, String str, String str2, String str3, Date date, Date date2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = timeKey.getId();
        }
        if ((i2 & 2) != 0) {
            str2 = timeKey.getMobileId$aclib_api2_6826_release();
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = timeKey.getName();
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            date = timeKey.dateFrom;
        }
        Date date3 = date;
        if ((i2 & 16) != 0) {
            date2 = timeKey.dateTill;
        }
        Date date4 = date2;
        if ((i2 & 32) != 0) {
            i = timeKey.getColor();
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            z = timeKey.isDefault();
        }
        return timeKey.copy(str, str4, str5, date3, date4, i3, z);
    }

    private final C0984b getTimeKeyValidator() {
        return (C0984b) this.timeKeyValidator$delegate.getValue();
    }

    public final String component1() {
        return getId();
    }

    public final String component2$aclib_api2_6826_release() {
        return getMobileId$aclib_api2_6826_release();
    }

    public final String component3() {
        return getName();
    }

    public final Date component4() {
        return this.dateFrom;
    }

    public final Date component5() {
        return this.dateTill;
    }

    public final int component6() {
        return getColor();
    }

    public final boolean component7() {
        return isDefault();
    }

    public final TimeKey copy(String str, String str2, String str3, Date date, Date date2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "mobileId");
        Intrinsics.checkNotNullParameter(str3, "name");
        Intrinsics.checkNotNullParameter(date, "dateFrom");
        Intrinsics.checkNotNullParameter(date2, "dateTill");
        return new TimeKey(str, str2, str3, date, date2, i, z);
    }

    public final long dateFromSeconds() {
        return this.dateFrom.getTime() / ((long) 1000);
    }

    public final long dateTillSeconds() {
        return this.dateTill.getTime() / ((long) 1000);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) TimeKey.class, (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            TimeKey timeKey = (TimeKey) obj;
            return !(Intrinsics.areEqual((Object) getId(), (Object) timeKey.getId()) ^ true) && !(Intrinsics.areEqual((Object) getMobileId$aclib_api2_6826_release(), (Object) timeKey.getMobileId$aclib_api2_6826_release()) ^ true) && !(Intrinsics.areEqual((Object) getName(), (Object) timeKey.getName()) ^ true) && !(Intrinsics.areEqual((Object) this.dateFrom, (Object) timeKey.dateFrom) ^ true) && !(Intrinsics.areEqual((Object) this.dateTill, (Object) timeKey.dateTill) ^ true) && getColor() == timeKey.getColor() && isDefault() == timeKey.isDefault();
        }
        throw new NullPointerException("null cannot be cast to non-null type org.mobileid.access.key.TimeKey");
    }

    public String formSaveValue$aclib_api2_6826_release() {
        String str;
        String[] strArr = new String[4];
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                str = getMobileId$aclib_api2_6826_release();
            } else if (i == 1) {
                str = toString();
            } else if (i == 2) {
                str = String.valueOf(getColor());
            } else if (i == 3) {
                str = String.valueOf(isDefault());
            } else {
                throw new IllegalStateException("Unsupported position in saved value " + i);
            }
            strArr[i] = str;
        }
        return ArraysKt.joinToString$default((Object[]) strArr, (CharSequence) String.valueOf(31), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    public int getAccessPointType$aclib_api2_6826_release() {
        return 1;
    }

    public int getColor() {
        return this.color;
    }

    public final Date getDateFrom() {
        return this.dateFrom;
    }

    public final Date getDateTill() {
        return this.dateTill;
    }

    public String getDefaultKeyName() {
        return DEFAULT_NAME;
    }

    public String getId() {
        return this.f6375id;
    }

    public String getMobileId$aclib_api2_6826_release() {
        return this.mobileId;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((((((((getId().hashCode() * 31) + getMobileId$aclib_api2_6826_release().hashCode()) * 31) + getName().hashCode()) * 31) + this.dateFrom.hashCode()) * 31) + this.dateTill.hashCode()) * 31) + getColor()) * 31) + Boolean.valueOf(isDefault()).hashCode();
    }

    public boolean isDefault() {
        return this.isDefault;
    }

    public boolean isKeyPrefix$aclib_api2_6826_release(String str) {
        Intrinsics.checkNotNullParameter(str, "prefix");
        return Companion.isTimeKeyPrefix(str);
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

    public final boolean started() {
        return getTimeKeyValidator().mo13040a() != C0983a.NOT_STARTED;
    }

    public String toString() {
        String str;
        Date date;
        String[] strArr = new String[3];
        for (int i = 0; i < 3; i++) {
            if (i != 0) {
                if (i == 1) {
                    date = this.dateFrom;
                } else if (i == 2) {
                    date = this.dateTill;
                } else {
                    throw new IllegalStateException("Unsupported position in time key data " + i);
                }
                str = String.valueOf(date.getTime() / ((long) 1000));
            } else {
                str = getName();
            }
            strArr[i] = str;
        }
        return ArraysKt.joinToString$default((Object[]) strArr, (CharSequence) String.valueOf(KEY_PARTS_DELIMITER), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    public KeyAction validate() {
        int ordinal = getTimeKeyValidator().mo13040a().ordinal();
        if (ordinal == 0) {
            return KeyAction.USE;
        }
        if (ordinal == 1) {
            return KeyAction.NO_ACTION;
        }
        if (ordinal == 2) {
            return KeyAction.REMOVE;
        }
        if (ordinal == 3) {
            return KeyAction.SHOW_PHONE_TIME_INVALID;
        }
        throw new NoWhenBranchMatchedException();
    }
}
