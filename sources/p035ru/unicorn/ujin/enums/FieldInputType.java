package p035ru.unicorn.ujin.enums;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.view.customViews.dynamic.BankLoanTitleHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.BaseViewHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.CheckboxViewHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.ContactsViewHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.DatePickerViewHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.DetailedInfoHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.DividerViewHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.EditViewHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.ImageGalleryHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.KortrosViewPagerHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.MapViewHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.PhoneEditViewHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.RadioGroupViewHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.SpinnerViewHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.TextViewHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.TitleViewHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.VideoViewHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.button.ButtonHolder;
import p035ru.unicorn.ujin.view.customViews.dynamic.button.TwoButtonsHolder;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.BankLoanTitleField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.CheckboxField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ContactsField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DatePickerField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DetailedInfoField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DividerField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.EditField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.GalleryField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.KortrosCarouselField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.TextField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.TitleField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.TwoButtonsField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.VideoField;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006 "}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType;", "", "holderType", "", "(Ljava/lang/String;II)V", "getHolderType", "()I", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "EDIT_TEXT", "SELECT", "RADIO", "CHECKBOX", "PHONE_MASKED_TEXT", "TEXT", "BUTTON", "GALLERY", "TITLE", "MAP", "CONTACTS", "DIVIDER", "VIDEO", "KORTROS_CAROUSEL", "TWO_BUTTONS", "DETAILED_INFO", "DATE_PICKER", "BANK_LOAN_TITLE", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.enums.FieldInputType */
/* compiled from: FieldInputType.kt */
public enum FieldInputType {
    ;
    
    public static final Companion Companion = null;
    private final int holderType;

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    public abstract BaseViewHolder getViewHolder(ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter);

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType$EDIT_TEXT;", "Lru/unicorn/ujin/enums/FieldInputType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldInputType$EDIT_TEXT */
    /* compiled from: FieldInputType.kt */
    static final class EDIT_TEXT extends FieldInputType {
        EDIT_TEXT(String str, int i) {
            super(str, i, 1, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_dialog_edit_text, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…edit_text, parent, false)");
            return new EditViewHolder(inflate);
        }
    }

    private FieldInputType(int i) {
        this.holderType = i;
    }

    public final int getHolderType() {
        return this.holderType;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType$SELECT;", "Lru/unicorn/ujin/enums/FieldInputType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldInputType$SELECT */
    /* compiled from: FieldInputType.kt */
    static final class SELECT extends FieldInputType {
        SELECT(String str, int i) {
            super(str, i, 2, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_dialog_spinner, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…g_spinner, parent, false)");
            return new SpinnerViewHolder(inflate);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType$RADIO;", "Lru/unicorn/ujin/enums/FieldInputType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldInputType$RADIO */
    /* compiled from: FieldInputType.kt */
    static final class RADIO extends FieldInputType {
        RADIO(String str, int i) {
            super(str, i, 3, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_dialog_radio_group, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…dio_group, parent, false)");
            return new RadioGroupViewHolder(inflate);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType$CHECKBOX;", "Lru/unicorn/ujin/enums/FieldInputType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldInputType$CHECKBOX */
    /* compiled from: FieldInputType.kt */
    static final class CHECKBOX extends FieldInputType {
        CHECKBOX(String str, int i) {
            super(str, i, 4, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_checkbox, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…_checkbox, parent, false)");
            return new CheckboxViewHolder(inflate);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType$PHONE_MASKED_TEXT;", "Lru/unicorn/ujin/enums/FieldInputType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldInputType$PHONE_MASKED_TEXT */
    /* compiled from: FieldInputType.kt */
    static final class PHONE_MASKED_TEXT extends FieldInputType {
        PHONE_MASKED_TEXT(String str, int i) {
            super(str, i, 5, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_dialog_phone_edit_text, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…edit_text, parent, false)");
            return new PhoneEditViewHolder(inflate);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType$TEXT;", "Lru/unicorn/ujin/enums/FieldInputType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldInputType$TEXT */
    /* compiled from: FieldInputType.kt */
    static final class TEXT extends FieldInputType {
        TEXT(String str, int i) {
            super(str, i, 6, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_dialog_text_view, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…text_view, parent, false)");
            return new TextViewHolder(inflate);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType$BUTTON;", "Lru/unicorn/ujin/enums/FieldInputType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldInputType$BUTTON */
    /* compiled from: FieldInputType.kt */
    static final class BUTTON extends FieldInputType {
        BUTTON(String str, int i) {
            super(str, i, 7, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_dialog_button, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…og_button, parent, false)");
            return new ButtonHolder(inflate, dataEntryAdapter);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType$GALLERY;", "Lru/unicorn/ujin/enums/FieldInputType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldInputType$GALLERY */
    /* compiled from: FieldInputType.kt */
    static final class GALLERY extends FieldInputType {
        GALLERY(String str, int i) {
            super(str, i, 8, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_image_gallery, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…e_gallery, parent, false)");
            return new ImageGalleryHolder(inflate);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType$TITLE;", "Lru/unicorn/ujin/enums/FieldInputType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldInputType$TITLE */
    /* compiled from: FieldInputType.kt */
    static final class TITLE extends FieldInputType {
        TITLE(String str, int i) {
            super(str, i, 9, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_title, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…eld_title, parent, false)");
            return new TitleViewHolder(inflate);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType$MAP;", "Lru/unicorn/ujin/enums/FieldInputType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldInputType$MAP */
    /* compiled from: FieldInputType.kt */
    static final class MAP extends FieldInputType {
        MAP(String str, int i) {
            super(str, i, 10, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_map, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…field_map, parent, false)");
            return new MapViewHolder(inflate);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType$CONTACTS;", "Lru/unicorn/ujin/enums/FieldInputType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldInputType$CONTACTS */
    /* compiled from: FieldInputType.kt */
    static final class CONTACTS extends FieldInputType {
        CONTACTS(String str, int i) {
            super(str, i, 11, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_contact_list, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…tact_list, parent, false)");
            return new ContactsViewHolder(inflate);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType$DIVIDER;", "Lru/unicorn/ujin/enums/FieldInputType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldInputType$DIVIDER */
    /* compiled from: FieldInputType.kt */
    static final class DIVIDER extends FieldInputType {
        DIVIDER(String str, int i) {
            super(str, i, 12, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_divider, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…d_divider, parent, false)");
            return new DividerViewHolder(inflate);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType$VIDEO;", "Lru/unicorn/ujin/enums/FieldInputType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldInputType$VIDEO */
    /* compiled from: FieldInputType.kt */
    static final class VIDEO extends FieldInputType {
        VIDEO(String str, int i) {
            super(str, i, 13, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_video, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…eld_video, parent, false)");
            return new VideoViewHolder(inflate);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType$KORTROS_CAROUSEL;", "Lru/unicorn/ujin/enums/FieldInputType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldInputType$KORTROS_CAROUSEL */
    /* compiled from: FieldInputType.kt */
    static final class KORTROS_CAROUSEL extends FieldInputType {
        KORTROS_CAROUSEL(String str, int i) {
            super(str, i, 14, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_kortros_viewpager, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…viewpager, parent, false)");
            return new KortrosViewPagerHolder(inflate);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType$TWO_BUTTONS;", "Lru/unicorn/ujin/enums/FieldInputType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldInputType$TWO_BUTTONS */
    /* compiled from: FieldInputType.kt */
    static final class TWO_BUTTONS extends FieldInputType {
        TWO_BUTTONS(String str, int i) {
            super(str, i, 15, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_two_buttons, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…o_buttons, parent, false)");
            return new TwoButtonsHolder(inflate, dataEntryAdapter);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType$DETAILED_INFO;", "Lru/unicorn/ujin/enums/FieldInputType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldInputType$DETAILED_INFO */
    /* compiled from: FieldInputType.kt */
    static final class DETAILED_INFO extends FieldInputType {
        DETAILED_INFO(String str, int i) {
            super(str, i, 16, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_detailed_info, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…iled_info, parent, false)");
            return new DetailedInfoHolder(inflate);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType$DATE_PICKER;", "Lru/unicorn/ujin/enums/FieldInputType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldInputType$DATE_PICKER */
    /* compiled from: FieldInputType.kt */
    static final class DATE_PICKER extends FieldInputType {
        DATE_PICKER(String str, int i) {
            super(str, i, 17, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_date_picker, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…te_picker, parent, false)");
            return new DatePickerViewHolder(inflate);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType$BANK_LOAN_TITLE;", "Lru/unicorn/ujin/enums/FieldInputType;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldInputType$BANK_LOAN_TITLE */
    /* compiled from: FieldInputType.kt */
    static final class BANK_LOAN_TITLE extends FieldInputType {
        BANK_LOAN_TITLE(String str, int i) {
            super(str, i, 18, (DefaultConstructorMarker) null);
        }

        public BaseViewHolder getViewHolder(ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_bank_loan, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…bank_loan, parent, false)");
            return new BankLoanTitleHolder(inflate);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldInputType$Companion;", "", "()V", "getType", "Lru/unicorn/ujin/enums/FieldInputType;", "field", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "getViewHolder", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "type", "", "parent", "Landroid/view/ViewGroup;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldInputType$Companion */
    /* compiled from: FieldInputType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FieldInputType getType(Field field) {
            Intrinsics.checkNotNullParameter(field, "field");
            if (field instanceof TitleField) {
                return FieldInputType.TITLE;
            }
            if (field instanceof TextField) {
                return FieldInputType.TEXT;
            }
            if (field instanceof EditField) {
                return FieldInputType.EDIT_TEXT;
            }
            if (field instanceof GalleryField) {
                return FieldInputType.GALLERY;
            }
            if (field instanceof ContactsField) {
                return FieldInputType.CONTACTS;
            }
            if (field instanceof MapField) {
                return FieldInputType.MAP;
            }
            if (field instanceof ButtonField) {
                return FieldInputType.BUTTON;
            }
            if (field instanceof RadioButtonsField) {
                return FieldInputType.RADIO;
            }
            if (field instanceof CheckboxField) {
                return FieldInputType.CHECKBOX;
            }
            if (field instanceof VideoField) {
                return FieldInputType.VIDEO;
            }
            if (field instanceof KortrosCarouselField) {
                return FieldInputType.KORTROS_CAROUSEL;
            }
            if (field instanceof DividerField) {
                return FieldInputType.DIVIDER;
            }
            if (field instanceof TwoButtonsField) {
                return FieldInputType.TWO_BUTTONS;
            }
            if (field instanceof SelectField) {
                return FieldInputType.SELECT;
            }
            if (field instanceof DetailedInfoField) {
                return FieldInputType.DETAILED_INFO;
            }
            if (field instanceof DatePickerField) {
                return FieldInputType.DATE_PICKER;
            }
            if (field instanceof BankLoanTitleField) {
                return FieldInputType.BANK_LOAN_TITLE;
            }
            return FieldInputType.DIVIDER;
        }

        public final BaseViewHolder getViewHolder(int i, ViewGroup viewGroup, DataEntryAdapter dataEntryAdapter) {
            Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
            Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
            FieldInputType[] values = FieldInputType.values();
            Collection arrayList = new ArrayList(values.length);
            for (FieldInputType fieldInputType : values) {
                if (fieldInputType.getHolderType() == i) {
                    return fieldInputType.getViewHolder(viewGroup, dataEntryAdapter);
                }
                arrayList.add(Unit.INSTANCE);
            }
            List list = (List) arrayList;
            return FieldInputType.DIVIDER.getViewHolder(viewGroup, dataEntryAdapter);
        }
    }
}
