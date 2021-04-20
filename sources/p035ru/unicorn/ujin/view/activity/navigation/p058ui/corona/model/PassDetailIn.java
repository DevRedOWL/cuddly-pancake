package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.util.Flavors;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassDetailIn;", "", "pass", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Pass;", "(Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Pass;)V", "getPass", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Pass;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.model.PassDetailIn */
/* compiled from: PassDetailIn.kt */
public final class PassDetailIn {
    @SerializedName("pass")
    private final Pass pass;

    public static /* synthetic */ PassDetailIn copy$default(PassDetailIn passDetailIn, Pass pass2, int i, Object obj) {
        if ((i & 1) != 0) {
            pass2 = passDetailIn.pass;
        }
        return passDetailIn.copy(pass2);
    }

    public final Pass component1() {
        return this.pass;
    }

    public final PassDetailIn copy(Pass pass2) {
        Intrinsics.checkNotNullParameter(pass2, Flavors.PASS);
        return new PassDetailIn(pass2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PassDetailIn) && Intrinsics.areEqual((Object) this.pass, (Object) ((PassDetailIn) obj).pass);
        }
        return true;
    }

    public int hashCode() {
        Pass pass2 = this.pass;
        if (pass2 != null) {
            return pass2.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "PassDetailIn(pass=" + this.pass + ")";
    }

    public PassDetailIn(Pass pass2) {
        Intrinsics.checkNotNullParameter(pass2, Flavors.PASS);
        this.pass = pass2;
    }

    public final Pass getPass() {
        return this.pass;
    }
}
