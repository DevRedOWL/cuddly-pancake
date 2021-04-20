package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model;

import androidx.databinding.ObservableField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BE\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003JI\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/CreatePassDTO;", "", "text", "Landroidx/databinding/ObservableField;", "", "timeInMillis", "", "timeAsText", "adress", "(Landroidx/databinding/ObservableField;Landroidx/databinding/ObservableField;Landroidx/databinding/ObservableField;Landroidx/databinding/ObservableField;)V", "getAdress", "()Landroidx/databinding/ObservableField;", "getText", "getTimeAsText", "getTimeInMillis", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.model.CreatePassDTO */
/* compiled from: CreatePassDTO.kt */
public final class CreatePassDTO {
    private final ObservableField<String> adress;
    private final ObservableField<String> text;
    private final ObservableField<String> timeAsText;
    private final ObservableField<Long> timeInMillis;

    public CreatePassDTO() {
        this((ObservableField) null, (ObservableField) null, (ObservableField) null, (ObservableField) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CreatePassDTO copy$default(CreatePassDTO createPassDTO, ObservableField<String> observableField, ObservableField<Long> observableField2, ObservableField<String> observableField3, ObservableField<String> observableField4, int i, Object obj) {
        if ((i & 1) != 0) {
            observableField = createPassDTO.text;
        }
        if ((i & 2) != 0) {
            observableField2 = createPassDTO.timeInMillis;
        }
        if ((i & 4) != 0) {
            observableField3 = createPassDTO.timeAsText;
        }
        if ((i & 8) != 0) {
            observableField4 = createPassDTO.adress;
        }
        return createPassDTO.copy(observableField, observableField2, observableField3, observableField4);
    }

    public final ObservableField<String> component1() {
        return this.text;
    }

    public final ObservableField<Long> component2() {
        return this.timeInMillis;
    }

    public final ObservableField<String> component3() {
        return this.timeAsText;
    }

    public final ObservableField<String> component4() {
        return this.adress;
    }

    public final CreatePassDTO copy(ObservableField<String> observableField, ObservableField<Long> observableField2, ObservableField<String> observableField3, ObservableField<String> observableField4) {
        Intrinsics.checkNotNullParameter(observableField, "text");
        Intrinsics.checkNotNullParameter(observableField2, "timeInMillis");
        Intrinsics.checkNotNullParameter(observableField3, "timeAsText");
        Intrinsics.checkNotNullParameter(observableField4, "adress");
        return new CreatePassDTO(observableField, observableField2, observableField3, observableField4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatePassDTO)) {
            return false;
        }
        CreatePassDTO createPassDTO = (CreatePassDTO) obj;
        return Intrinsics.areEqual((Object) this.text, (Object) createPassDTO.text) && Intrinsics.areEqual((Object) this.timeInMillis, (Object) createPassDTO.timeInMillis) && Intrinsics.areEqual((Object) this.timeAsText, (Object) createPassDTO.timeAsText) && Intrinsics.areEqual((Object) this.adress, (Object) createPassDTO.adress);
    }

    public int hashCode() {
        ObservableField<String> observableField = this.text;
        int i = 0;
        int hashCode = (observableField != null ? observableField.hashCode() : 0) * 31;
        ObservableField<Long> observableField2 = this.timeInMillis;
        int hashCode2 = (hashCode + (observableField2 != null ? observableField2.hashCode() : 0)) * 31;
        ObservableField<String> observableField3 = this.timeAsText;
        int hashCode3 = (hashCode2 + (observableField3 != null ? observableField3.hashCode() : 0)) * 31;
        ObservableField<String> observableField4 = this.adress;
        if (observableField4 != null) {
            i = observableField4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "CreatePassDTO(text=" + this.text + ", timeInMillis=" + this.timeInMillis + ", timeAsText=" + this.timeAsText + ", adress=" + this.adress + ")";
    }

    public CreatePassDTO(ObservableField<String> observableField, ObservableField<Long> observableField2, ObservableField<String> observableField3, ObservableField<String> observableField4) {
        Intrinsics.checkNotNullParameter(observableField, "text");
        Intrinsics.checkNotNullParameter(observableField2, "timeInMillis");
        Intrinsics.checkNotNullParameter(observableField3, "timeAsText");
        Intrinsics.checkNotNullParameter(observableField4, "adress");
        this.text = observableField;
        this.timeInMillis = observableField2;
        this.timeAsText = observableField3;
        this.adress = observableField4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreatePassDTO(ObservableField observableField, ObservableField observableField2, ObservableField observableField3, ObservableField observableField4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ObservableField() : observableField, (i & 2) != 0 ? new ObservableField() : observableField2, (i & 4) != 0 ? new ObservableField() : observableField3, (i & 8) != 0 ? new ObservableField() : observableField4);
    }

    public final ObservableField<String> getText() {
        return this.text;
    }

    public final ObservableField<Long> getTimeInMillis() {
        return this.timeInMillis;
    }

    public final ObservableField<String> getTimeAsText() {
        return this.timeAsText;
    }

    public final ObservableField<String> getAdress() {
        return this.adress;
    }
}
