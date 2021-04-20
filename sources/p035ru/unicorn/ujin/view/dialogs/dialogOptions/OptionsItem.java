package p035ru.unicorn.ujin.view.dialogs.dialogOptions;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001f\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dialogOptions/OptionsItem;", "", "type", "", "label", "defaultValue", "clickListener", "Lkotlin/Function1;", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "getDefaultValue", "()Ljava/lang/String;", "getLabel", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dialogOptions.OptionsItem */
/* compiled from: OptionsItem.kt */
public final class OptionsItem {
    private final Function1<Object, Unit> clickListener;
    private final String defaultValue;
    private final String label;
    private final String type;

    public static /* synthetic */ OptionsItem copy$default(OptionsItem optionsItem, String str, String str2, String str3, Function1<Object, Unit> function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionsItem.type;
        }
        if ((i & 2) != 0) {
            str2 = optionsItem.label;
        }
        if ((i & 4) != 0) {
            str3 = optionsItem.defaultValue;
        }
        if ((i & 8) != 0) {
            function1 = optionsItem.clickListener;
        }
        return optionsItem.copy(str, str2, str3, function1);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.defaultValue;
    }

    public final Function1<Object, Unit> component4() {
        return this.clickListener;
    }

    public final OptionsItem copy(String str, String str2, String str3, Function1<Object, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(str2, Constants.ScionAnalytics.PARAM_LABEL);
        Intrinsics.checkNotNullParameter(str3, "defaultValue");
        Intrinsics.checkNotNullParameter(function1, "clickListener");
        return new OptionsItem(str, str2, str3, function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionsItem)) {
            return false;
        }
        OptionsItem optionsItem = (OptionsItem) obj;
        return Intrinsics.areEqual((Object) this.type, (Object) optionsItem.type) && Intrinsics.areEqual((Object) this.label, (Object) optionsItem.label) && Intrinsics.areEqual((Object) this.defaultValue, (Object) optionsItem.defaultValue) && Intrinsics.areEqual((Object) this.clickListener, (Object) optionsItem.clickListener);
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.label;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.defaultValue;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Function1<Object, Unit> function1 = this.clickListener;
        if (function1 != null) {
            i = function1.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "OptionsItem(type=" + this.type + ", label=" + this.label + ", defaultValue=" + this.defaultValue + ", clickListener=" + this.clickListener + ")";
    }

    public OptionsItem(String str, String str2, String str3, Function1<Object, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(str2, Constants.ScionAnalytics.PARAM_LABEL);
        Intrinsics.checkNotNullParameter(str3, "defaultValue");
        Intrinsics.checkNotNullParameter(function1, "clickListener");
        this.type = str;
        this.label = str2;
        this.defaultValue = str3;
        this.clickListener = function1;
    }

    public final String getType() {
        return this.type;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getDefaultValue() {
        return this.defaultValue;
    }

    public final Function1<Object, Unit> getClickListener() {
        return this.clickListener;
    }
}
