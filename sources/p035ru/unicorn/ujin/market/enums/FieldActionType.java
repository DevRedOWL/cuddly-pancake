package p035ru.unicorn.ujin.market.enums;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.view.customViews.dynamic.BaseViewHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.CheckboxViewHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.EditViewHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.RadioGroupViewHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.SpinnerViewHolder;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/market/enums/FieldActionType;", "", "holderType", "", "(Ljava/lang/String;II)V", "getHolderType", "()I", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "TEXT", "SELECT", "RADIO", "CHECKBOX", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.enums.FieldActionType */
/* compiled from: FieldActionType.kt */
public enum FieldActionType {
    ;
    
    public static final Companion Companion = null;
    private final int holderType;

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    public abstract BaseViewHolder getViewHolder(ViewGroup viewGroup);

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/market/enums/FieldActionType$TEXT;", "Lru/unicorn/ujin/market/enums/FieldActionType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.enums.FieldActionType$TEXT */
    /* compiled from: FieldActionType.kt */
    static final class TEXT extends FieldActionType {
        TEXT(String str, int i) {
            super(str, i, 1, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_form_edit_text, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…edit_text, parent, false)");
            return new EditViewHolder(inflate);
        }
    }

    private FieldActionType(int i) {
        this.holderType = i;
    }

    public final int getHolderType() {
        return this.holderType;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/market/enums/FieldActionType$SELECT;", "Lru/unicorn/ujin/market/enums/FieldActionType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.enums.FieldActionType$SELECT */
    /* compiled from: FieldActionType.kt */
    static final class SELECT extends FieldActionType {
        SELECT(String str, int i) {
            super(str, i, 2, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_form_spinner, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…m_spinner, parent, false)");
            return new SpinnerViewHolder(inflate);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/market/enums/FieldActionType$RADIO;", "Lru/unicorn/ujin/market/enums/FieldActionType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.enums.FieldActionType$RADIO */
    /* compiled from: FieldActionType.kt */
    static final class RADIO extends FieldActionType {
        RADIO(String str, int i) {
            super(str, i, 3, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_form_radio_group, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…dio_group, parent, false)");
            return new RadioGroupViewHolder(inflate);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/market/enums/FieldActionType$CHECKBOX;", "Lru/unicorn/ujin/market/enums/FieldActionType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.enums.FieldActionType$CHECKBOX */
    /* compiled from: FieldActionType.kt */
    static final class CHECKBOX extends FieldActionType {
        CHECKBOX(String str, int i) {
            super(str, i, 4, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_form_checkbox, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…_checkbox, parent, false)");
            return new CheckboxViewHolder(inflate);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, mo51343d2 = {"Lru/unicorn/ujin/market/enums/FieldActionType$Companion;", "", "()V", "getType", "Lru/unicorn/ujin/market/enums/FieldActionType;", "name", "", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "type", "", "parent", "Landroid/view/ViewGroup;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.enums.FieldActionType$Companion */
    /* compiled from: FieldActionType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FieldActionType getType(String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            return FieldActionType.valueOf(upperCase);
        }

        public final BaseViewHolder getViewHolder(int i, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            for (FieldActionType fieldActionType : FieldActionType.values()) {
                if (fieldActionType.getHolderType() == i) {
                    return fieldActionType.getViewHolder(viewGroup);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }
}
