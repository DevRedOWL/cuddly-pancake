package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\u001a\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0000H\u0016R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassIn;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "id", "", "passNumber", "", "activeFrom", "activeTo", "state", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassState;", "type", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassType;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassState;Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassType;)V", "getActiveFrom", "()Ljava/lang/String;", "getActiveTo", "getId", "()I", "getPassNumber", "getState", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassState;", "getType", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassType;", "areContentsTheSame", "", "other", "areItemsTheSame", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.model.PassIn */
/* compiled from: PassListIn.kt */
public class PassIn implements Diffable<PassIn> {
    @SerializedName("active_from")
    private final String activeFrom;
    @SerializedName("active_to")
    private final String activeTo;

    /* renamed from: id */
    private final int f6756id;
    @SerializedName("pass_number")
    private final String passNumber;
    private final PassState state;
    private final PassType type;

    public boolean areContentsTheSame(PassIn passIn) {
        return false;
    }

    public PassIn(int i, String str, String str2, String str3, PassState passState, PassType passType) {
        Intrinsics.checkNotNullParameter(str, "passNumber");
        Intrinsics.checkNotNullParameter(str2, "activeFrom");
        Intrinsics.checkNotNullParameter(str3, "activeTo");
        Intrinsics.checkNotNullParameter(passState, "state");
        Intrinsics.checkNotNullParameter(passType, "type");
        this.f6756id = i;
        this.passNumber = str;
        this.activeFrom = str2;
        this.activeTo = str3;
        this.state = passState;
        this.type = passType;
    }

    public final int getId() {
        return this.f6756id;
    }

    public final String getPassNumber() {
        return this.passNumber;
    }

    public final String getActiveFrom() {
        return this.activeFrom;
    }

    public final String getActiveTo() {
        return this.activeTo;
    }

    public final PassState getState() {
        return this.state;
    }

    public final PassType getType() {
        return this.type;
    }

    public boolean areItemsTheSame(PassIn passIn) {
        return passIn != null && this.f6756id == passIn.f6756id;
    }
}
