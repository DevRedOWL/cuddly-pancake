package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.ResourceV2;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001:\u0002)*B\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t\u0012$\u0010\u000b\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\f\u0012$\u0010\u0010\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00110\r\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0002\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R8\u0010\u0010\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00110\r\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR8\u0010\u000b\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 ¨\u0006+"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/ButtonField;", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "text", "", "style", "color", "actions", "Lru/unicorn/ujin/view/dialogs/dataEntry/Actions;", "customClickListener", "Lkotlin/Function1;", "", "apiCallObserveV2", "Lkotlin/Function2;", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/data/realm/ResourceV2;", "", "apiCallObserveV1", "Lru/unicorn/ujin/data/realm/Resource;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/dialogs/dataEntry/Actions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getActions", "()Lru/unicorn/ujin/view/dialogs/dataEntry/Actions;", "setActions", "(Lru/unicorn/ujin/view/dialogs/dataEntry/Actions;)V", "getApiCallObserveV1", "()Lkotlin/jvm/functions/Function2;", "setApiCallObserveV1", "(Lkotlin/jvm/functions/Function2;)V", "getApiCallObserveV2", "setApiCallObserveV2", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "getCustomClickListener", "()Lkotlin/jvm/functions/Function1;", "setCustomClickListener", "(Lkotlin/jvm/functions/Function1;)V", "getStyle", "setStyle", "getText", "setText", "JsonFields", "Type", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField */
/* compiled from: DataEntryItem.kt */
public final class ButtonField extends Field {
    private Actions actions;
    private Function2<? super SingleLiveEvent<Resource<Object>>, ? super String, Unit> apiCallObserveV1;
    private Function2<? super SingleLiveEvent<ResourceV2<Object>>, ? super String, Unit> apiCallObserveV2;
    private String color;
    private Function1<? super String, Unit> customClickListener;
    private String style;
    private String text;

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final String getStyle() {
        return this.style;
    }

    public final void setStyle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.style = str;
    }

    public final String getColor() {
        return this.color;
    }

    public final void setColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.color = str;
    }

    public final Actions getActions() {
        return this.actions;
    }

    public final void setActions(Actions actions2) {
        Intrinsics.checkNotNullParameter(actions2, "<set-?>");
        this.actions = actions2;
    }

    public final Function1<String, Unit> getCustomClickListener() {
        return this.customClickListener;
    }

    public final void setCustomClickListener(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.customClickListener = function1;
    }

    public final Function2<SingleLiveEvent<ResourceV2<Object>>, String, Unit> getApiCallObserveV2() {
        return this.apiCallObserveV2;
    }

    public final void setApiCallObserveV2(Function2<? super SingleLiveEvent<ResourceV2<Object>>, ? super String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.apiCallObserveV2 = function2;
    }

    public final Function2<SingleLiveEvent<Resource<Object>>, String, Unit> getApiCallObserveV1() {
        return this.apiCallObserveV1;
    }

    public final void setApiCallObserveV1(Function2<? super SingleLiveEvent<Resource<Object>>, ? super String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.apiCallObserveV1 = function2;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/ButtonField$JsonFields;", "", "()V", "actions", "", "color", "fieldName", "style", "text", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField$JsonFields */
    /* compiled from: DataEntryItem.kt */
    public static final class JsonFields {
        public static final JsonFields INSTANCE = new JsonFields();
        public static final String actions = "actions";
        public static final String color = "color";
        public static final String fieldName = "button";
        public static final String style = "style";
        public static final String text = "text";

        private JsonFields() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonField(String str, String str2, String str3, Actions actions2, Function1<? super String, Unit> function1, Function2<? super SingleLiveEvent<ResourceV2<Object>>, ? super String, Unit> function2, Function2<? super SingleLiveEvent<Resource<Object>>, ? super String, Unit> function22) {
        super((String) null, false, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str2, JsonFields.style);
        Intrinsics.checkNotNullParameter(str3, "color");
        Intrinsics.checkNotNullParameter(actions2, JsonFields.actions);
        Intrinsics.checkNotNullParameter(function1, "customClickListener");
        Intrinsics.checkNotNullParameter(function2, "apiCallObserveV2");
        Intrinsics.checkNotNullParameter(function22, "apiCallObserveV1");
        this.text = str;
        this.style = str2;
        this.color = str3;
        this.actions = actions2;
        this.customClickListener = function1;
        this.apiCallObserveV2 = function2;
        this.apiCallObserveV1 = function22;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/ButtonField$Type;", "", "()V", "styleFilled", "", "styleStroked", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField$Type */
    /* compiled from: DataEntryItem.kt */
    public static final class Type {
        public static final Type INSTANCE = new Type();
        public static final String styleFilled = "filled";
        public static final String styleStroked = "stroke";

        private Type() {
        }
    }
}
