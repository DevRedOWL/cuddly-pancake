package p035ru.unicorn.ujin.enums;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.view.customViews.options.BaseOptionsViewHolder;
import p035ru.unicorn.ujin.view.customViews.options.SwitchViewHolder;
import p035ru.unicorn.ujin.view.customViews.options.TextViewHolder;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, mo51343d2 = {"Lru/unicorn/ujin/enums/OptionsType;", "", "holderType", "", "(Ljava/lang/String;II)V", "getHolderType", "()I", "getViewHolder", "Lru/unicorn/ujin/view/customViews/options/BaseOptionsViewHolder;", "parent", "Landroid/view/ViewGroup;", "TEXT", "SWITCH", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.enums.OptionsType */
/* compiled from: OptionsType.kt */
public enum OptionsType {
    ;
    
    public static final Companion Companion = null;
    private final int holderType;

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    public abstract BaseOptionsViewHolder getViewHolder(ViewGroup viewGroup);

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/enums/OptionsType$TEXT;", "Lru/unicorn/ujin/enums/OptionsType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/options/BaseOptionsViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.OptionsType$TEXT */
    /* compiled from: OptionsType.kt */
    static final class TEXT extends OptionsType {
        TEXT(String str, int i) {
            super(str, i, 1, (DefaultConstructorMarker) null);
        }

        public BaseOptionsViewHolder getViewHolder(ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_text, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…ield_text, parent, false)");
            return new TextViewHolder(inflate);
        }
    }

    private OptionsType(int i) {
        this.holderType = i;
    }

    public final int getHolderType() {
        return this.holderType;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/enums/OptionsType$SWITCH;", "Lru/unicorn/ujin/enums/OptionsType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/options/BaseOptionsViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.OptionsType$SWITCH */
    /* compiled from: OptionsType.kt */
    static final class SWITCH extends OptionsType {
        SWITCH(String str, int i) {
            super(str, i, 2, (DefaultConstructorMarker) null);
        }

        public BaseOptionsViewHolder getViewHolder(ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_switch, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…ld_switch, parent, false)");
            return new SwitchViewHolder(inflate);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, mo51343d2 = {"Lru/unicorn/ujin/enums/OptionsType$Companion;", "", "()V", "getType", "Lru/unicorn/ujin/enums/OptionsType;", "name", "", "getViewHolder", "Lru/unicorn/ujin/view/customViews/options/BaseOptionsViewHolder;", "type", "", "parent", "Landroid/view/ViewGroup;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.OptionsType$Companion */
    /* compiled from: OptionsType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OptionsType getType(String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            return OptionsType.valueOf(upperCase);
        }

        public final BaseOptionsViewHolder getViewHolder(int i, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            for (OptionsType optionsType : OptionsType.values()) {
                if (optionsType.getHolderType() == i) {
                    return optionsType.getViewHolder(viewGroup);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }
}
