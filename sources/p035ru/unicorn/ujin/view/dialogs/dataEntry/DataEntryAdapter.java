package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.internal.LinkedTreeMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.ResourceV2;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.enums.FieldInputType;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.customViews.dynamic.BaseViewHolder;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00016B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016J\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\"2\u0006\u0010 \u001a\u00020\u001eJ\u0011\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019¢\u0006\u0002\u0010$J\u001e\u0010%\u001a\u00020\u00162\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00150'j\b\u0012\u0004\u0012\u00020\u0015`(J\u0006\u0010)\u001a\u00020\u0016J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001eH\u0016J\u0018\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u001eH\u0016J \u00101\u001a\u00020+2\u0006\u0010 \u001a\u00020\u001e2\u0006\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u0015H\u0002J\u0018\u00104\u001a\u00020+2\u0006\u0010 \u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u0015H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR*\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016`\u0017X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0019X\u000e¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019X\u000e¢\u0006\u0004\n\u0002\u0010\u001c¨\u00067"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "dataEntryList", "", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "(Ljava/util/List;)V", "v1Response", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/data/realm/Resource;", "", "getV1Response", "()Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "setV1Response", "(Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;)V", "v2Response", "Lru/unicorn/ujin/data/realm/ResourceV2;", "getV2Response", "setV2Response", "validMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "validValues", "", "[Ljava/lang/Boolean;", "values", "[Ljava/lang/String;", "getItemCount", "", "getItemViewType", "position", "getParamsMap", "", "getValuesList", "()[Ljava/lang/String;", "isFieldsValid", "fieldsToBeValid", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "isFormValid", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setValidFlag", "flag", "name", "setValue", "value", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter */
/* compiled from: DataEntryAdapter.kt */
public final class DataEntryAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final List<Field> dataEntryList;
    private SingleLiveEvent<Resource<Object>> v1Response;
    private SingleLiveEvent<ResourceV2<Object>> v2Response;
    private HashMap<String, Boolean> validMap;
    private Boolean[] validValues;
    private String[] values;

    @JvmStatic
    public static final DataEntryAdapter parseHashMap(ArrayList<HashMap<String, Object>> arrayList, Function2<? super SingleLiveEvent<Resource<Object>>, ? super String, Unit> function2, Function2<? super SingleLiveEvent<ResourceV2<Object>>, ? super String, Unit> function22, Function2<? super EditText, ? super EditText, Unit> function23, Function1<? super EditText, Unit> function1) {
        return Companion.parseHashMap(arrayList, function2, function22, function23, function1);
    }

    @JvmStatic
    public static final ArrayList<Field> parseHashMapReturnFieldList(ArrayList<HashMap<String, Object>> arrayList, Function2<? super SingleLiveEvent<Resource<Object>>, ? super String, Unit> function2, Function2<? super SingleLiveEvent<ResourceV2<Object>>, ? super String, Unit> function22, Function2<? super EditText, ? super EditText, Unit> function23, Function1<? super EditText, Unit> function1) {
        return Companion.parseHashMapReturnFieldList(arrayList, function2, function22, function23, function1);
    }

    public DataEntryAdapter(List<? extends Field> list) {
        Intrinsics.checkNotNullParameter(list, "dataEntryList");
        this.dataEntryList = list;
        int size = this.dataEntryList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = "";
        }
        this.values = strArr;
        int size2 = this.dataEntryList.size();
        Boolean[] boolArr = new Boolean[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            boolArr[i2] = false;
        }
        this.validValues = boolArr;
        this.validMap = new HashMap<>();
    }

    public final SingleLiveEvent<ResourceV2<Object>> getV2Response() {
        return this.v2Response;
    }

    public final void setV2Response(SingleLiveEvent<ResourceV2<Object>> singleLiveEvent) {
        this.v2Response = singleLiveEvent;
    }

    public final SingleLiveEvent<Resource<Object>> getV1Response() {
        return this.v1Response;
    }

    public final void setV1Response(SingleLiveEvent<Resource<Object>> singleLiveEvent) {
        this.v1Response = singleLiveEvent;
    }

    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        return FieldInputType.Companion.getViewHolder(i, viewGroup, this);
    }

    public void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "holder");
        baseViewHolder.setOnValueChanged(new DataEntryAdapter$onBindViewHolder$1(this, i));
        baseViewHolder.setSetValidFlag(new DataEntryAdapter$onBindViewHolder$2(this, i));
        baseViewHolder.bind(this.dataEntryList.get(i));
    }

    public int getItemViewType(int i) {
        return FieldInputType.Companion.getType(this.dataEntryList.get(i)).getHolderType();
    }

    public int getItemCount() {
        return this.dataEntryList.size();
    }

    public final Map<String, String> getParamsMap(int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = this.dataEntryList.size();
        while (i < size) {
            linkedHashMap.put(this.dataEntryList.get(i).getName(), this.values[i]);
            i++;
        }
        return linkedHashMap;
    }

    public final String[] getValuesList() {
        return this.values;
    }

    /* access modifiers changed from: private */
    public final void setValue(int i, String str) {
        this.values[i] = str;
    }

    /* access modifiers changed from: private */
    public final void setValidFlag(int i, boolean z, String str) {
        this.validValues[i] = Boolean.valueOf(z);
        if (str.length() > 0) {
            this.validMap.put(str, Boolean.valueOf(z));
        }
    }

    public final boolean isFormValid() {
        for (Boolean booleanValue : this.validValues) {
            if (!booleanValue.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean isFieldsValid(ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "fieldsToBeValid");
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!Intrinsics.areEqual((Object) this.validMap.get(it.next()), (Object) true)) {
                return false;
            }
        }
        return true;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jh\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062$\u0010\b\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b0\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\t2$\u0010\r\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\tH\u0002JÂ\u0001\u0010\u000f\u001a\u00020\u00102>\u0010\u0011\u001a:\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00130\u0012j$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0013j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001`\u0015`\u00142$\u0010\b\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b0\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\t2$\u0010\r\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\t2\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\t2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u0019H\u0007JÚ\u0001\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0012j\b\u0012\u0004\u0012\u00020\u001b`\u00142>\u0010\u0011\u001a:\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00130\u0012j$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0013j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001`\u0015`\u00142$\u0010\b\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b0\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\t2$\u0010\r\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\t2\u001c\b\u0002\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f\u0018\u00010\u0019H\u0007J(\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u001eH\u0002¨\u0006\u001f"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter$Companion;", "", "()V", "parseButtonMap", "Lru/unicorn/ujin/view/dialogs/dataEntry/ButtonField;", "map", "", "", "v1Response", "Lkotlin/Function2;", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/data/realm/Resource;", "", "v2Response", "Lru/unicorn/ujin/data/realm/ResourceV2;", "parseHashMap", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "fieldsList", "Ljava/util/ArrayList;", "Ljava/util/HashMap;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "setupVehicleNumberKeyboard", "Landroid/widget/EditText;", "disableVehicleNumberKeyboard", "Lkotlin/Function1;", "parseHashMapReturnFieldList", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "parseLinkedTreeMap", "linkedTreeMap", "Lcom/google/gson/internal/LinkedTreeMap;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter$Companion */
    /* compiled from: DataEntryAdapter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final DataEntryAdapter parseHashMap(ArrayList<HashMap<String, Object>> arrayList, Function2<? super SingleLiveEvent<Resource<Object>>, ? super String, Unit> function2, Function2<? super SingleLiveEvent<ResourceV2<Object>>, ? super String, Unit> function22, Function2<? super EditText, ? super EditText, Unit> function23, Function1<? super EditText, Unit> function1) {
            Intrinsics.checkNotNullParameter(arrayList, "fieldsList");
            Intrinsics.checkNotNullParameter(function2, "v1Response");
            Intrinsics.checkNotNullParameter(function22, "v2Response");
            Intrinsics.checkNotNullParameter(function23, "setupVehicleNumberKeyboard");
            Intrinsics.checkNotNullParameter(function1, "disableVehicleNumberKeyboard");
            return new DataEntryAdapter(parseHashMapReturnFieldList(arrayList, function2, function22, function23, function1));
        }

        public static /* synthetic */ ArrayList parseHashMapReturnFieldList$default(Companion companion, ArrayList arrayList, Function2 function2, Function2 function22, Function2 function23, Function1 function1, int i, Object obj) {
            if ((i & 8) != 0) {
                function23 = null;
            }
            Function2 function24 = function23;
            if ((i & 16) != 0) {
                function1 = null;
            }
            return companion.parseHashMapReturnFieldList(arrayList, function2, function22, function24, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:425:0x0814 A[Catch:{ Exception -> 0x0855 }] */
        /* JADX WARNING: Removed duplicated region for block: B:427:0x0818 A[Catch:{ Exception -> 0x0855 }] */
        /* JADX WARNING: Removed duplicated region for block: B:455:0x084d A[SYNTHETIC] */
        @kotlin.jvm.JvmStatic
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.ArrayList<p035ru.unicorn.ujin.view.dialogs.dataEntry.Field> parseHashMapReturnFieldList(java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r34, kotlin.jvm.functions.Function2<? super p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent<p035ru.unicorn.ujin.data.realm.Resource<java.lang.Object>>, ? super java.lang.String, kotlin.Unit> r35, kotlin.jvm.functions.Function2<? super p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent<p035ru.unicorn.ujin.data.realm.ResourceV2<java.lang.Object>>, ? super java.lang.String, kotlin.Unit> r36, kotlin.jvm.functions.Function2<? super android.widget.EditText, ? super android.widget.EditText, kotlin.Unit> r37, kotlin.jvm.functions.Function1<? super android.widget.EditText, kotlin.Unit> r38) {
            /*
                r33 = this;
                r0 = r34
                r1 = r35
                r2 = r36
                java.lang.String r3 = "fieldsList"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
                java.lang.String r3 = "v1Response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
                java.lang.String r3 = "v2Response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r6 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r5)
                r4.<init>(r6)
                java.util.Collection r4 = (java.util.Collection) r4
                java.util.Iterator r0 = r0.iterator()
            L_0x002d:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L_0x087e
                java.lang.Object r6 = r0.next()
                java.util.HashMap r6 = (java.util.HashMap) r6
                java.util.HashMap r7 = new java.util.HashMap     // Catch:{ Exception -> 0x085d }
                r7.<init>()     // Catch:{ Exception -> 0x085d }
                java.util.Map r7 = (java.util.Map) r7     // Catch:{ Exception -> 0x085d }
                java.util.Set r8 = r6.keySet()     // Catch:{ Exception -> 0x085d }
                java.lang.String r9 = "it.keys"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)     // Catch:{ Exception -> 0x085d }
                java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch:{ Exception -> 0x085d }
                java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x085d }
                int r10 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r8, r5)     // Catch:{ Exception -> 0x085d }
                r9.<init>(r10)     // Catch:{ Exception -> 0x085d }
                java.util.Collection r9 = (java.util.Collection) r9     // Catch:{ Exception -> 0x085d }
                java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x085d }
            L_0x005a:
                boolean r10 = r8.hasNext()     // Catch:{ Exception -> 0x085d }
                java.lang.String r11 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>"
                if (r10 == 0) goto L_0x007c
                java.lang.Object r7 = r8.next()     // Catch:{ Exception -> 0x085d }
                java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x085d }
                java.lang.Object r7 = r6.get(r7)     // Catch:{ Exception -> 0x085d }
                if (r7 == 0) goto L_0x0076
                java.util.Map r7 = (java.util.Map) r7     // Catch:{ Exception -> 0x085d }
                kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x085d }
                r9.add(r10)     // Catch:{ Exception -> 0x085d }
                goto L_0x005a
            L_0x0076:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085d }
                r6.<init>(r11)     // Catch:{ Exception -> 0x085d }
                throw r6     // Catch:{ Exception -> 0x085d }
            L_0x007c:
                java.util.List r9 = (java.util.List) r9     // Catch:{ Exception -> 0x085d }
                ru.unicorn.ujin.view.dialogs.dataEntry.DividerField r8 = new ru.unicorn.ujin.view.dialogs.dataEntry.DividerField     // Catch:{ Exception -> 0x085d }
                r9 = 0
                r8.<init>(r9)     // Catch:{ Exception -> 0x085d }
                ru.unicorn.ujin.view.dialogs.dataEntry.Field r8 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r8     // Catch:{ Exception -> 0x085d }
                java.util.Set r6 = r6.keySet()     // Catch:{ Exception -> 0x085d }
                java.lang.String r10 = "edit_text"
                java.util.Set r10 = kotlin.collections.SetsKt.setOf(r10)     // Catch:{ Exception -> 0x085d }
                boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r10)     // Catch:{ Exception -> 0x085d }
                java.lang.String r12 = "null cannot be cast to non-null type kotlin.Boolean"
                java.lang.String r13 = "default_value"
                java.lang.String r14 = "type"
                java.lang.String r15 = "null cannot be cast to non-null type kotlin.String"
                java.lang.String r16 = ""
                if (r10 == 0) goto L_0x010f
                ru.unicorn.ujin.view.dialogs.dataEntry.EditField r6 = new ru.unicorn.ujin.view.dialogs.dataEntry.EditField     // Catch:{ Exception -> 0x085d }
                java.lang.Object r8 = r7.get(r14)     // Catch:{ Exception -> 0x085d }
                if (r8 == 0) goto L_0x00a9
                goto L_0x00ab
            L_0x00a9:
                r8 = r16
            L_0x00ab:
                if (r8 == 0) goto L_0x0109
                r18 = r8
                java.lang.String r18 = (java.lang.String) r18     // Catch:{ Exception -> 0x085d }
                java.lang.String r8 = "hint"
                java.lang.Object r8 = r7.get(r8)     // Catch:{ Exception -> 0x085d }
                if (r8 == 0) goto L_0x00ba
                goto L_0x00bc
            L_0x00ba:
                r8 = r16
            L_0x00bc:
                if (r8 == 0) goto L_0x0103
                r19 = r8
                java.lang.String r19 = (java.lang.String) r19     // Catch:{ Exception -> 0x085d }
                java.lang.String r8 = "value"
                java.lang.Object r8 = r7.get(r8)     // Catch:{ Exception -> 0x085d }
                if (r8 == 0) goto L_0x00cb
                goto L_0x00cd
            L_0x00cb:
                r8 = r16
            L_0x00cd:
                if (r8 == 0) goto L_0x00fd
                r20 = r8
                java.lang.String r20 = (java.lang.String) r20     // Catch:{ Exception -> 0x085d }
                java.lang.Object r8 = r7.get(r13)     // Catch:{ Exception -> 0x085d }
                if (r8 == 0) goto L_0x00da
                goto L_0x00dc
            L_0x00da:
                r8 = r16
            L_0x00dc:
                if (r8 == 0) goto L_0x00f7
                r21 = r8
                java.lang.String r21 = (java.lang.String) r21     // Catch:{ Exception -> 0x085d }
                r17 = r6
                r22 = r37
                r23 = r38
                r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x085d }
                r8 = r6
                ru.unicorn.ujin.view.dialogs.dataEntry.Field r8 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r8     // Catch:{ Exception -> 0x085d }
            L_0x00ee:
                r18 = r0
                r19 = r3
                r20 = r4
            L_0x00f4:
                r3 = r15
                goto L_0x051d
            L_0x00f7:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085d }
                r6.<init>(r15)     // Catch:{ Exception -> 0x085d }
                throw r6     // Catch:{ Exception -> 0x085d }
            L_0x00fd:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085d }
                r6.<init>(r15)     // Catch:{ Exception -> 0x085d }
                throw r6     // Catch:{ Exception -> 0x085d }
            L_0x0103:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085d }
                r6.<init>(r15)     // Catch:{ Exception -> 0x085d }
                throw r6     // Catch:{ Exception -> 0x085d }
            L_0x0109:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085d }
                r6.<init>(r15)     // Catch:{ Exception -> 0x085d }
                throw r6     // Catch:{ Exception -> 0x085d }
            L_0x010f:
                java.lang.String r10 = "title"
                java.util.Set r10 = kotlin.collections.SetsKt.setOf(r10)     // Catch:{ Exception -> 0x085d }
                boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r10)     // Catch:{ Exception -> 0x085d }
                java.lang.String r9 = "text"
                if (r10 == 0) goto L_0x0176
                ru.unicorn.ujin.view.dialogs.dataEntry.TitleField r6 = new ru.unicorn.ujin.view.dialogs.dataEntry.TitleField     // Catch:{ Exception -> 0x085d }
                java.lang.Object r8 = r7.get(r9)     // Catch:{ Exception -> 0x085d }
                if (r8 == 0) goto L_0x0126
                goto L_0x0128
            L_0x0126:
                r8 = r16
            L_0x0128:
                if (r8 == 0) goto L_0x0170
                java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x085d }
                java.lang.Object r9 = r7.get(r14)     // Catch:{ Exception -> 0x085d }
                if (r9 == 0) goto L_0x0133
                goto L_0x0135
            L_0x0133:
                java.lang.String r9 = "primary"
            L_0x0135:
                if (r9 == 0) goto L_0x016a
                java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x085d }
                java.lang.String r10 = "align"
                java.lang.Object r10 = r7.get(r10)     // Catch:{ Exception -> 0x085d }
                if (r10 == 0) goto L_0x0142
                goto L_0x0144
            L_0x0142:
                java.lang.String r10 = "start"
            L_0x0144:
                if (r10 == 0) goto L_0x0164
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x085d }
                java.lang.String r11 = "justify"
                java.lang.Object r11 = r7.get(r11)     // Catch:{ Exception -> 0x085d }
                if (r11 == 0) goto L_0x0151
                goto L_0x0153
            L_0x0151:
                java.lang.String r11 = "default"
            L_0x0153:
                if (r11 == 0) goto L_0x015e
                java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x085d }
                r6.<init>(r8, r9, r10, r11)     // Catch:{ Exception -> 0x085d }
                r8 = r6
                ru.unicorn.ujin.view.dialogs.dataEntry.Field r8 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r8     // Catch:{ Exception -> 0x085d }
                goto L_0x00ee
            L_0x015e:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085d }
                r6.<init>(r15)     // Catch:{ Exception -> 0x085d }
                throw r6     // Catch:{ Exception -> 0x085d }
            L_0x0164:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085d }
                r6.<init>(r15)     // Catch:{ Exception -> 0x085d }
                throw r6     // Catch:{ Exception -> 0x085d }
            L_0x016a:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085d }
                r6.<init>(r15)     // Catch:{ Exception -> 0x085d }
                throw r6     // Catch:{ Exception -> 0x085d }
            L_0x0170:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085d }
                r6.<init>(r15)     // Catch:{ Exception -> 0x085d }
                throw r6     // Catch:{ Exception -> 0x085d }
            L_0x0176:
                java.util.Set r10 = kotlin.collections.SetsKt.setOf(r9)     // Catch:{ Exception -> 0x085d }
                boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r10)     // Catch:{ Exception -> 0x085d }
                if (r10 == 0) goto L_0x01da
                ru.unicorn.ujin.view.dialogs.dataEntry.TextField r6 = new ru.unicorn.ujin.view.dialogs.dataEntry.TextField     // Catch:{ Exception -> 0x085d }
                java.lang.Object r8 = r7.get(r9)     // Catch:{ Exception -> 0x085d }
                if (r8 == 0) goto L_0x0189
                goto L_0x018b
            L_0x0189:
                r8 = r16
            L_0x018b:
                if (r8 == 0) goto L_0x01d4
                java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x085d }
                java.lang.Object r9 = r7.get(r14)     // Catch:{ Exception -> 0x085d }
                if (r9 == 0) goto L_0x0196
                goto L_0x0198
            L_0x0196:
                java.lang.String r9 = "primary"
            L_0x0198:
                if (r9 == 0) goto L_0x01ce
                java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x085d }
                java.lang.String r10 = "align"
                java.lang.Object r10 = r7.get(r10)     // Catch:{ Exception -> 0x085d }
                if (r10 == 0) goto L_0x01a5
                goto L_0x01a7
            L_0x01a5:
                java.lang.String r10 = "start"
            L_0x01a7:
                if (r10 == 0) goto L_0x01c8
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x085d }
                java.lang.String r11 = "justify"
                java.lang.Object r11 = r7.get(r11)     // Catch:{ Exception -> 0x085d }
                if (r11 == 0) goto L_0x01b4
                goto L_0x01b6
            L_0x01b4:
                java.lang.String r11 = "default"
            L_0x01b6:
                if (r11 == 0) goto L_0x01c2
                java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x085d }
                r6.<init>(r8, r9, r10, r11)     // Catch:{ Exception -> 0x085d }
                r8 = r6
                ru.unicorn.ujin.view.dialogs.dataEntry.Field r8 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r8     // Catch:{ Exception -> 0x085d }
                goto L_0x00ee
            L_0x01c2:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085d }
                r6.<init>(r15)     // Catch:{ Exception -> 0x085d }
                throw r6     // Catch:{ Exception -> 0x085d }
            L_0x01c8:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085d }
                r6.<init>(r15)     // Catch:{ Exception -> 0x085d }
                throw r6     // Catch:{ Exception -> 0x085d }
            L_0x01ce:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085d }
                r6.<init>(r15)     // Catch:{ Exception -> 0x085d }
                throw r6     // Catch:{ Exception -> 0x085d }
            L_0x01d4:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085d }
                r6.<init>(r15)     // Catch:{ Exception -> 0x085d }
                throw r6     // Catch:{ Exception -> 0x085d }
            L_0x01da:
                java.lang.String r10 = "gallery"
                java.util.Set r10 = kotlin.collections.SetsKt.setOf(r10)     // Catch:{ Exception -> 0x085d }
                boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r10)     // Catch:{ Exception -> 0x085d }
                if (r10 == 0) goto L_0x02f6
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x02ef }
                r6.<init>()     // Catch:{ Exception -> 0x02ef }
                java.lang.String r8 = "images"
                java.lang.Object r8 = r7.get(r8)     // Catch:{ Exception -> 0x02ef }
                if (r8 == 0) goto L_0x02e3
                java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ Exception -> 0x02ef }
                java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch:{ Exception -> 0x02ef }
                java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x02ef }
                int r10 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r8, r5)     // Catch:{ Exception -> 0x02ef }
                r9.<init>(r10)     // Catch:{ Exception -> 0x02ef }
                java.util.Collection r9 = (java.util.Collection) r9     // Catch:{ Exception -> 0x02ef }
                java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x02ef }
            L_0x0206:
                boolean r10 = r8.hasNext()     // Catch:{ Exception -> 0x02ef }
                if (r10 == 0) goto L_0x0292
                java.lang.Object r10 = r8.next()     // Catch:{ Exception -> 0x02ef }
                com.google.gson.internal.LinkedTreeMap r10 = (com.google.gson.internal.LinkedTreeMap) r10     // Catch:{ Exception -> 0x02ef }
                java.util.Set r11 = r10.keySet()     // Catch:{ Exception -> 0x02ef }
                java.lang.String r13 = "meta_data"
                boolean r11 = r11.contains(r13)     // Catch:{ Exception -> 0x02ef }
                if (r11 == 0) goto L_0x0231
                java.lang.String r11 = "meta_data"
                java.lang.Object r11 = r10.get(r11)     // Catch:{ Exception -> 0x085d }
                if (r11 == 0) goto L_0x0229
                java.util.Map r11 = (java.util.Map) r11     // Catch:{ Exception -> 0x085d }
                goto L_0x0232
            L_0x0229:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085d }
                java.lang.String r7 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Double>"
                r6.<init>(r7)     // Catch:{ Exception -> 0x085d }
                throw r6     // Catch:{ Exception -> 0x085d }
            L_0x0231:
                r11 = 0
            L_0x0232:
                if (r11 == 0) goto L_0x0268
                ru.unicorn.ujin.view.dialogs.dataEntry.ImageMeta r13 = new ru.unicorn.ujin.view.dialogs.dataEntry.ImageMeta     // Catch:{ Exception -> 0x02ef }
                java.lang.String r14 = "width"
                java.lang.Object r14 = r11.get(r14)     // Catch:{ Exception -> 0x02ef }
                java.lang.Double r14 = (java.lang.Double) r14     // Catch:{ Exception -> 0x02ef }
                if (r14 == 0) goto L_0x0248
                r18 = r6
                double r5 = r14.doubleValue()     // Catch:{ Exception -> 0x085d }
                int r5 = (int) r5
                goto L_0x024b
            L_0x0248:
                r18 = r6
                r5 = -1
            L_0x024b:
                java.lang.String r6 = "height"
                java.lang.Object r6 = r11.get(r6)     // Catch:{ Exception -> 0x02ef }
                java.lang.Double r6 = (java.lang.Double) r6     // Catch:{ Exception -> 0x02ef }
                if (r6 == 0) goto L_0x025f
                r19 = r3
                r20 = r4
                double r3 = r6.doubleValue()     // Catch:{ Exception -> 0x0858 }
                int r3 = (int) r3     // Catch:{ Exception -> 0x0858 }
                goto L_0x0264
            L_0x025f:
                r19 = r3
                r20 = r4
                r3 = -1
            L_0x0264:
                r13.<init>(r5, r3)     // Catch:{ Exception -> 0x0858 }
                goto L_0x026f
            L_0x0268:
                r19 = r3
                r20 = r4
                r18 = r6
                r13 = 0
            L_0x026f:
                ru.unicorn.ujin.view.dialogs.dataEntry.Image r3 = new ru.unicorn.ujin.view.dialogs.dataEntry.Image     // Catch:{ Exception -> 0x0858 }
                java.lang.String r4 = "url"
                java.lang.Object r4 = r10.get(r4)     // Catch:{ Exception -> 0x0858 }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0858 }
                r3.<init>(r4, r13)     // Catch:{ Exception -> 0x0858 }
                r4 = r18
                boolean r3 = r4.add(r3)     // Catch:{ Exception -> 0x0858 }
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0858 }
                r9.add(r3)     // Catch:{ Exception -> 0x0858 }
                r6 = r4
                r3 = r19
                r4 = r20
                r5 = 10
                goto L_0x0206
            L_0x0292:
                r19 = r3
                r20 = r4
                r4 = r6
                java.util.List r9 = (java.util.List) r9     // Catch:{ Exception -> 0x0858 }
                kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x0858 }
                java.lang.String r3 = "auto_swipe"
                boolean r3 = r7.containsKey(r3)     // Catch:{ Exception -> 0x0858 }
                if (r3 == 0) goto L_0x02b8
                java.lang.String r3 = "auto_swipe"
                java.lang.Object r3 = r7.get(r3)     // Catch:{ Exception -> 0x0858 }
                if (r3 == 0) goto L_0x02b2
                java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0858 }
                boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x0858 }
                goto L_0x02b9
            L_0x02b2:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0858 }
                r3.<init>(r12)     // Catch:{ Exception -> 0x0858 }
                throw r3     // Catch:{ Exception -> 0x0858 }
            L_0x02b8:
                r3 = 0
            L_0x02b9:
                java.lang.String r5 = "clickable"
                boolean r5 = r7.containsKey(r5)     // Catch:{ Exception -> 0x0858 }
                if (r5 == 0) goto L_0x02d6
                java.lang.String r5 = "clickable"
                java.lang.Object r5 = r7.get(r5)     // Catch:{ Exception -> 0x0858 }
                if (r5 == 0) goto L_0x02d0
                java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ Exception -> 0x0858 }
                boolean r5 = r5.booleanValue()     // Catch:{ Exception -> 0x0858 }
                goto L_0x02d7
            L_0x02d0:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0858 }
                r3.<init>(r12)     // Catch:{ Exception -> 0x0858 }
                throw r3     // Catch:{ Exception -> 0x0858 }
            L_0x02d6:
                r5 = 1
            L_0x02d7:
                ru.unicorn.ujin.view.dialogs.dataEntry.GalleryField r6 = new ru.unicorn.ujin.view.dialogs.dataEntry.GalleryField     // Catch:{ Exception -> 0x0858 }
                r6.<init>(r4, r3, r5)     // Catch:{ Exception -> 0x0858 }
                r8 = r6
                ru.unicorn.ujin.view.dialogs.dataEntry.Field r8 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r8     // Catch:{ Exception -> 0x0858 }
                r18 = r0
                goto L_0x00f4
            L_0x02e3:
                r19 = r3
                r20 = r4
                java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0858 }
                java.lang.String r4 = "null cannot be cast to non-null type kotlin.collections.ArrayList<com.google.gson.internal.LinkedTreeMap<kotlin.String, kotlin.String>> /* = java.util.ArrayList<com.google.gson.internal.LinkedTreeMap<kotlin.String, kotlin.String>> */"
                r3.<init>(r4)     // Catch:{ Exception -> 0x0858 }
                throw r3     // Catch:{ Exception -> 0x0858 }
            L_0x02ef:
                r20 = r4
                r18 = r0
                r0 = r3
                goto L_0x0862
            L_0x02f6:
                r19 = r3
                r20 = r4
                java.lang.String r3 = "contacts"
                java.util.Set r3 = kotlin.collections.SetsKt.setOf(r3)     // Catch:{ Exception -> 0x0858 }
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r3)     // Catch:{ Exception -> 0x0858 }
                java.lang.String r4 = "zoom"
                java.lang.String r5 = "y"
                java.lang.String r10 = "x"
                r18 = r0
                java.lang.String r0 = "map"
                r21 = 0
                if (r3 == 0) goto L_0x03ed
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x085a }
                r3.<init>()     // Catch:{ Exception -> 0x085a }
                java.lang.String r6 = "contacts"
                java.lang.Object r6 = r7.get(r6)     // Catch:{ Exception -> 0x085a }
                if (r6 == 0) goto L_0x03e5
                java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ Exception -> 0x085a }
                java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ Exception -> 0x085a }
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x085a }
                r9 = 10
                int r11 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r9)     // Catch:{ Exception -> 0x085a }
                r8.<init>(r11)     // Catch:{ Exception -> 0x085a }
                java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ Exception -> 0x085a }
                java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x085a }
            L_0x0334:
                boolean r9 = r6.hasNext()     // Catch:{ Exception -> 0x085a }
                if (r9 == 0) goto L_0x03d5
                java.lang.Object r9 = r6.next()     // Catch:{ Exception -> 0x085a }
                com.google.gson.internal.LinkedTreeMap r9 = (com.google.gson.internal.LinkedTreeMap) r9     // Catch:{ Exception -> 0x085a }
                java.lang.Object r11 = r9.get(r14)     // Catch:{ Exception -> 0x085a }
                java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x085a }
                java.lang.String r13 = "data"
                java.lang.Object r13 = r9.get(r13)     // Catch:{ Exception -> 0x085a }
                java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x085a }
                boolean r23 = r9.containsKey(r0)     // Catch:{ Exception -> 0x085a }
                if (r23 == 0) goto L_0x03b6
                java.lang.Object r9 = r9.get(r0)     // Catch:{ Exception -> 0x085a }
                if (r9 == 0) goto L_0x03ae
                com.google.gson.internal.LinkedTreeMap r9 = (com.google.gson.internal.LinkedTreeMap) r9     // Catch:{ Exception -> 0x085a }
                ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint r29 = new ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint     // Catch:{ Exception -> 0x085a }
                java.lang.Object r23 = r9.get(r10)     // Catch:{ Exception -> 0x085a }
                java.lang.Double r23 = (java.lang.Double) r23     // Catch:{ Exception -> 0x085a }
                if (r23 == 0) goto L_0x0367
                goto L_0x036b
            L_0x0367:
                java.lang.Double r23 = java.lang.Double.valueOf(r21)     // Catch:{ Exception -> 0x085a }
            L_0x036b:
                r30 = r6
                r31 = r14
                r6 = r23
                java.lang.String r14 = "it[MapPoint.JsonFields.x…                   ?: 0.0"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r14)     // Catch:{ Exception -> 0x085a }
                double r24 = r6.doubleValue()     // Catch:{ Exception -> 0x085a }
                java.lang.Object r6 = r9.get(r5)     // Catch:{ Exception -> 0x085a }
                java.lang.Double r6 = (java.lang.Double) r6     // Catch:{ Exception -> 0x085a }
                if (r6 == 0) goto L_0x0383
                goto L_0x0387
            L_0x0383:
                java.lang.Double r6 = java.lang.Double.valueOf(r21)     // Catch:{ Exception -> 0x085a }
            L_0x0387:
                java.lang.String r14 = "it[MapPoint.JsonFields.y…                   ?: 0.0"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r14)     // Catch:{ Exception -> 0x085a }
                double r26 = r6.doubleValue()     // Catch:{ Exception -> 0x085a }
                java.lang.Object r6 = r9.get(r4)     // Catch:{ Exception -> 0x085a }
                java.lang.Double r6 = (java.lang.Double) r6     // Catch:{ Exception -> 0x085a }
                if (r6 == 0) goto L_0x0399
                goto L_0x039d
            L_0x0399:
                java.lang.Double r6 = java.lang.Double.valueOf(r21)     // Catch:{ Exception -> 0x085a }
            L_0x039d:
                r32 = r15
                double r14 = r6.doubleValue()     // Catch:{ Exception -> 0x085a }
                float r6 = (float) r14     // Catch:{ Exception -> 0x085a }
                r23 = r29
                r28 = r6
                r23.<init>(r24, r26, r28)     // Catch:{ Exception -> 0x085a }
                r6 = r29
                goto L_0x03bd
            L_0x03ae:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085a }
                java.lang.String r3 = "null cannot be cast to non-null type com.google.gson.internal.LinkedTreeMap<kotlin.String, kotlin.Double>"
                r0.<init>(r3)     // Catch:{ Exception -> 0x085a }
                throw r0     // Catch:{ Exception -> 0x085a }
            L_0x03b6:
                r30 = r6
                r31 = r14
                r32 = r15
                r6 = 0
            L_0x03bd:
                ru.unicorn.ujin.view.dialogs.dataEntry.Contact r9 = new ru.unicorn.ujin.view.dialogs.dataEntry.Contact     // Catch:{ Exception -> 0x085a }
                r9.<init>(r11, r13, r6)     // Catch:{ Exception -> 0x085a }
                boolean r6 = r3.add(r9)     // Catch:{ Exception -> 0x085a }
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x085a }
                r8.add(r6)     // Catch:{ Exception -> 0x085a }
                r6 = r30
                r14 = r31
                r15 = r32
                goto L_0x0334
            L_0x03d5:
                r32 = r15
                java.util.List r8 = (java.util.List) r8     // Catch:{ Exception -> 0x085a }
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x085a }
                ru.unicorn.ujin.view.dialogs.dataEntry.ContactsField r0 = new ru.unicorn.ujin.view.dialogs.dataEntry.ContactsField     // Catch:{ Exception -> 0x085a }
                r0.<init>(r3)     // Catch:{ Exception -> 0x085a }
                r8 = r0
                ru.unicorn.ujin.view.dialogs.dataEntry.Field r8 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r8     // Catch:{ Exception -> 0x085a }
                goto L_0x051b
            L_0x03e5:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085a }
                java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.ArrayList<com.google.gson.internal.LinkedTreeMap<kotlin.String, kotlin.String>> /* = java.util.ArrayList<com.google.gson.internal.LinkedTreeMap<kotlin.String, kotlin.String>> */"
                r0.<init>(r3)     // Catch:{ Exception -> 0x085a }
                throw r0     // Catch:{ Exception -> 0x085a }
            L_0x03ed:
                r32 = r15
                java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)     // Catch:{ Exception -> 0x085a }
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r0)     // Catch:{ Exception -> 0x085a }
                if (r0 == 0) goto L_0x0506
                java.lang.String r0 = "center"
                java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x085a }
                if (r0 == 0) goto L_0x04fe
                com.google.gson.internal.LinkedTreeMap r0 = (com.google.gson.internal.LinkedTreeMap) r0     // Catch:{ Exception -> 0x085a }
                ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint r3 = new ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint     // Catch:{ Exception -> 0x085a }
                java.lang.Object r6 = r0.get(r10)     // Catch:{ Exception -> 0x085a }
                if (r6 == 0) goto L_0x040c
                goto L_0x0410
            L_0x040c:
                java.lang.Double r6 = java.lang.Double.valueOf(r21)     // Catch:{ Exception -> 0x085a }
            L_0x0410:
                java.lang.String r8 = "null cannot be cast to non-null type kotlin.Double"
                if (r6 == 0) goto L_0x04f8
                java.lang.Double r6 = (java.lang.Double) r6     // Catch:{ Exception -> 0x085a }
                double r24 = r6.doubleValue()     // Catch:{ Exception -> 0x085a }
                java.lang.Object r6 = r0.get(r5)     // Catch:{ Exception -> 0x085a }
                if (r6 == 0) goto L_0x0421
                goto L_0x0425
            L_0x0421:
                java.lang.Double r6 = java.lang.Double.valueOf(r21)     // Catch:{ Exception -> 0x085a }
            L_0x0425:
                if (r6 == 0) goto L_0x04f2
                java.lang.Double r6 = (java.lang.Double) r6     // Catch:{ Exception -> 0x085a }
                double r26 = r6.doubleValue()     // Catch:{ Exception -> 0x085a }
                java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x085a }
                if (r0 == 0) goto L_0x0434
                goto L_0x0438
            L_0x0434:
                java.lang.Double r0 = java.lang.Double.valueOf(r21)     // Catch:{ Exception -> 0x085a }
            L_0x0438:
                if (r0 == 0) goto L_0x04ec
                java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ Exception -> 0x085a }
                double r13 = r0.doubleValue()     // Catch:{ Exception -> 0x085a }
                float r0 = (float) r13     // Catch:{ Exception -> 0x085a }
                r23 = r3
                r28 = r0
                r23.<init>(r24, r26, r28)     // Catch:{ Exception -> 0x085a }
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x085a }
                r0.<init>()     // Catch:{ Exception -> 0x085a }
                java.lang.String r6 = "points"
                java.lang.Object r6 = r7.get(r6)     // Catch:{ Exception -> 0x085a }
                if (r6 == 0) goto L_0x04e4
                java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ Exception -> 0x085a }
                java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ Exception -> 0x085a }
                java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x085a }
                r11 = 10
                int r13 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r11)     // Catch:{ Exception -> 0x085a }
                r9.<init>(r13)     // Catch:{ Exception -> 0x085a }
                java.util.Collection r9 = (java.util.Collection) r9     // Catch:{ Exception -> 0x085a }
                java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x085a }
            L_0x046a:
                boolean r11 = r6.hasNext()     // Catch:{ Exception -> 0x085a }
                if (r11 == 0) goto L_0x04d7
                java.lang.Object r11 = r6.next()     // Catch:{ Exception -> 0x085a }
                com.google.gson.internal.LinkedTreeMap r11 = (com.google.gson.internal.LinkedTreeMap) r11     // Catch:{ Exception -> 0x085a }
                ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint r13 = new ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint     // Catch:{ Exception -> 0x085a }
                java.lang.Object r14 = r11.get(r10)     // Catch:{ Exception -> 0x085a }
                if (r14 == 0) goto L_0x047f
                goto L_0x0483
            L_0x047f:
                java.lang.Double r14 = java.lang.Double.valueOf(r21)     // Catch:{ Exception -> 0x085a }
            L_0x0483:
                if (r14 == 0) goto L_0x04d1
                java.lang.Double r14 = (java.lang.Double) r14     // Catch:{ Exception -> 0x085a }
                double r24 = r14.doubleValue()     // Catch:{ Exception -> 0x085a }
                java.lang.Object r14 = r11.get(r5)     // Catch:{ Exception -> 0x085a }
                if (r14 == 0) goto L_0x0492
                goto L_0x0496
            L_0x0492:
                java.lang.Double r14 = java.lang.Double.valueOf(r21)     // Catch:{ Exception -> 0x085a }
            L_0x0496:
                if (r14 == 0) goto L_0x04cb
                java.lang.Double r14 = (java.lang.Double) r14     // Catch:{ Exception -> 0x085a }
                double r26 = r14.doubleValue()     // Catch:{ Exception -> 0x085a }
                java.lang.Object r11 = r11.get(r4)     // Catch:{ Exception -> 0x085a }
                if (r11 == 0) goto L_0x04a5
                goto L_0x04a9
            L_0x04a5:
                java.lang.Double r11 = java.lang.Double.valueOf(r21)     // Catch:{ Exception -> 0x085a }
            L_0x04a9:
                if (r11 == 0) goto L_0x04c5
                java.lang.Double r11 = (java.lang.Double) r11     // Catch:{ Exception -> 0x085a }
                double r14 = r11.doubleValue()     // Catch:{ Exception -> 0x085a }
                float r11 = (float) r14     // Catch:{ Exception -> 0x085a }
                r23 = r13
                r28 = r11
                r23.<init>(r24, r26, r28)     // Catch:{ Exception -> 0x085a }
                boolean r11 = r0.add(r13)     // Catch:{ Exception -> 0x085a }
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x085a }
                r9.add(r11)     // Catch:{ Exception -> 0x085a }
                goto L_0x046a
            L_0x04c5:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085a }
                r0.<init>(r8)     // Catch:{ Exception -> 0x085a }
                throw r0     // Catch:{ Exception -> 0x085a }
            L_0x04cb:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085a }
                r0.<init>(r8)     // Catch:{ Exception -> 0x085a }
                throw r0     // Catch:{ Exception -> 0x085a }
            L_0x04d1:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085a }
                r0.<init>(r8)     // Catch:{ Exception -> 0x085a }
                throw r0     // Catch:{ Exception -> 0x085a }
            L_0x04d7:
                java.util.List r9 = (java.util.List) r9     // Catch:{ Exception -> 0x085a }
                kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x085a }
                ru.unicorn.ujin.view.dialogs.dataEntry.MapField r4 = new ru.unicorn.ujin.view.dialogs.dataEntry.MapField     // Catch:{ Exception -> 0x085a }
                r4.<init>(r3, r0)     // Catch:{ Exception -> 0x085a }
                r8 = r4
                ru.unicorn.ujin.view.dialogs.dataEntry.Field r8 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r8     // Catch:{ Exception -> 0x085a }
                goto L_0x051b
            L_0x04e4:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085a }
                java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.ArrayList<com.google.gson.internal.LinkedTreeMap<kotlin.String, kotlin.Any>> /* = java.util.ArrayList<com.google.gson.internal.LinkedTreeMap<kotlin.String, kotlin.Any>> */"
                r0.<init>(r3)     // Catch:{ Exception -> 0x085a }
                throw r0     // Catch:{ Exception -> 0x085a }
            L_0x04ec:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085a }
                r0.<init>(r8)     // Catch:{ Exception -> 0x085a }
                throw r0     // Catch:{ Exception -> 0x085a }
            L_0x04f2:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085a }
                r0.<init>(r8)     // Catch:{ Exception -> 0x085a }
                throw r0     // Catch:{ Exception -> 0x085a }
            L_0x04f8:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085a }
                r0.<init>(r8)     // Catch:{ Exception -> 0x085a }
                throw r0     // Catch:{ Exception -> 0x085a }
            L_0x04fe:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085a }
                java.lang.String r3 = "null cannot be cast to non-null type com.google.gson.internal.LinkedTreeMap<kotlin.String, kotlin.Any>"
                r0.<init>(r3)     // Catch:{ Exception -> 0x085a }
                throw r0     // Catch:{ Exception -> 0x085a }
            L_0x0506:
                java.lang.String r0 = "button"
                java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)     // Catch:{ Exception -> 0x085a }
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r0)     // Catch:{ Exception -> 0x085a }
                if (r0 == 0) goto L_0x0521
                ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter$Companion r0 = p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter.Companion     // Catch:{ Exception -> 0x085a }
                ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField r0 = r0.parseButtonMap(r7, r1, r2)     // Catch:{ Exception -> 0x085a }
                r8 = r0
                ru.unicorn.ujin.view.dialogs.dataEntry.Field r8 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r8     // Catch:{ Exception -> 0x085a }
            L_0x051b:
                r3 = r32
            L_0x051d:
                r4 = 10
                goto L_0x080c
            L_0x0521:
                java.lang.String r0 = "two_buttons"
                java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)     // Catch:{ Exception -> 0x085a }
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r0)     // Catch:{ Exception -> 0x085a }
                if (r0 == 0) goto L_0x0562
                ru.unicorn.ujin.view.dialogs.dataEntry.TwoButtonsField r0 = new ru.unicorn.ujin.view.dialogs.dataEntry.TwoButtonsField     // Catch:{ Exception -> 0x085a }
                ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter$Companion r3 = p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter.Companion     // Catch:{ Exception -> 0x085a }
                java.lang.String r4 = "left_button"
                java.lang.Object r4 = r7.get(r4)     // Catch:{ Exception -> 0x085a }
                if (r4 == 0) goto L_0x055c
                java.util.Map r4 = (java.util.Map) r4     // Catch:{ Exception -> 0x085a }
                ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField r3 = r3.parseButtonMap(r4, r1, r2)     // Catch:{ Exception -> 0x085a }
                ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter$Companion r4 = p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter.Companion     // Catch:{ Exception -> 0x085a }
                java.lang.String r5 = "right_button"
                java.lang.Object r5 = r7.get(r5)     // Catch:{ Exception -> 0x085a }
                if (r5 == 0) goto L_0x0556
                java.util.Map r5 = (java.util.Map) r5     // Catch:{ Exception -> 0x085a }
                ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField r4 = r4.parseButtonMap(r5, r1, r2)     // Catch:{ Exception -> 0x085a }
                r0.<init>(r3, r4)     // Catch:{ Exception -> 0x085a }
                r8 = r0
                ru.unicorn.ujin.view.dialogs.dataEntry.Field r8 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r8     // Catch:{ Exception -> 0x085a }
                goto L_0x051b
            L_0x0556:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085a }
                r0.<init>(r11)     // Catch:{ Exception -> 0x085a }
                throw r0     // Catch:{ Exception -> 0x085a }
            L_0x055c:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085a }
                r0.<init>(r11)     // Catch:{ Exception -> 0x085a }
                throw r0     // Catch:{ Exception -> 0x085a }
            L_0x0562:
                ru.unicorn.ujin.view.dialogs.dataEntry.DividerField$JsonFields r0 = p035ru.unicorn.ujin.view.dialogs.dataEntry.DividerField.JsonFields.INSTANCE     // Catch:{ Exception -> 0x085a }
                java.lang.String r0 = r0.getFieldName()     // Catch:{ Exception -> 0x085a }
                java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)     // Catch:{ Exception -> 0x085a }
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r0)     // Catch:{ Exception -> 0x085a }
                if (r0 == 0) goto L_0x0587
                ru.unicorn.ujin.view.dialogs.dataEntry.DividerField r0 = new ru.unicorn.ujin.view.dialogs.dataEntry.DividerField     // Catch:{ Exception -> 0x085a }
                ru.unicorn.ujin.view.dialogs.dataEntry.DividerField$JsonFields r3 = p035ru.unicorn.ujin.view.dialogs.dataEntry.DividerField.JsonFields.INSTANCE     // Catch:{ Exception -> 0x085a }
                java.lang.String r3 = r3.getHeight()     // Catch:{ Exception -> 0x085a }
                java.lang.Object r3 = r7.get(r3)     // Catch:{ Exception -> 0x085a }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x085a }
                r0.<init>(r3)     // Catch:{ Exception -> 0x085a }
                r8 = r0
                ru.unicorn.ujin.view.dialogs.dataEntry.Field r8 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r8     // Catch:{ Exception -> 0x085a }
                goto L_0x051b
            L_0x0587:
                ru.unicorn.ujin.view.dialogs.dataEntry.KortrosCarouselField$JsonFields r0 = p035ru.unicorn.ujin.view.dialogs.dataEntry.KortrosCarouselField.JsonFields.INSTANCE     // Catch:{ Exception -> 0x085a }
                java.lang.String r0 = r0.getFieldName()     // Catch:{ Exception -> 0x085a }
                java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)     // Catch:{ Exception -> 0x085a }
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r0)     // Catch:{ Exception -> 0x085a }
                if (r0 == 0) goto L_0x05a1
                ru.unicorn.ujin.view.dialogs.dataEntry.KortrosCarouselField r0 = new ru.unicorn.ujin.view.dialogs.dataEntry.KortrosCarouselField     // Catch:{ Exception -> 0x085a }
                r0.<init>()     // Catch:{ Exception -> 0x085a }
                r8 = r0
                ru.unicorn.ujin.view.dialogs.dataEntry.Field r8 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r8     // Catch:{ Exception -> 0x085a }
                goto L_0x051b
            L_0x05a1:
                ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField$JsonFields r0 = p035ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField.JsonFields.INSTANCE     // Catch:{ Exception -> 0x085a }
                java.lang.String r0 = r0.getFieldName()     // Catch:{ Exception -> 0x085a }
                java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)     // Catch:{ Exception -> 0x085a }
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r0)     // Catch:{ Exception -> 0x085a }
                if (r0 == 0) goto L_0x069d
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x0699 }
                r0.<init>()     // Catch:{ Exception -> 0x0699 }
                java.util.Set r3 = r7.keySet()     // Catch:{ Exception -> 0x0699 }
                ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField$JsonFields r4 = p035ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField.JsonFields.INSTANCE     // Catch:{ Exception -> 0x0699 }
                java.lang.String r4 = r4.getSelectValues()     // Catch:{ Exception -> 0x0699 }
                boolean r3 = r3.contains(r4)     // Catch:{ Exception -> 0x0699 }
                if (r3 == 0) goto L_0x05de
                ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField$JsonFields r3 = p035ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField.JsonFields.INSTANCE     // Catch:{ Exception -> 0x085a }
                java.lang.String r3 = r3.getSelectValues()     // Catch:{ Exception -> 0x085a }
                java.lang.Object r3 = r7.get(r3)     // Catch:{ Exception -> 0x085a }
                if (r3 == 0) goto L_0x05d6
                r9 = r3
                java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ Exception -> 0x085a }
                goto L_0x05df
            L_0x05d6:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x085a }
                java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.collections.Map<kotlin.String, kotlin.String>> /* = java.util.ArrayList<kotlin.collections.Map<kotlin.String, kotlin.String>> */"
                r0.<init>(r3)     // Catch:{ Exception -> 0x085a }
                throw r0     // Catch:{ Exception -> 0x085a }
            L_0x05de:
                r9 = 0
            L_0x05df:
                if (r9 == 0) goto L_0x0636
                java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch:{ Exception -> 0x0699 }
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0699 }
                r4 = 10
                int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r9, r4)     // Catch:{ Exception -> 0x0855 }
                r3.<init>(r5)     // Catch:{ Exception -> 0x0855 }
                java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ Exception -> 0x0855 }
                java.util.Iterator r5 = r9.iterator()     // Catch:{ Exception -> 0x0855 }
            L_0x05f4:
                boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x0855 }
                if (r6 == 0) goto L_0x0633
                java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x0855 }
                java.util.Map r6 = (java.util.Map) r6     // Catch:{ Exception -> 0x0855 }
                ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue r8 = new ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue     // Catch:{ Exception -> 0x0855 }
                ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue$JsonFields r9 = p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue.JsonFields.INSTANCE     // Catch:{ Exception -> 0x0855 }
                java.lang.String r9 = r9.getValue()     // Catch:{ Exception -> 0x0855 }
                java.lang.Object r9 = r6.get(r9)     // Catch:{ Exception -> 0x0855 }
                java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0855 }
                if (r9 == 0) goto L_0x0611
                goto L_0x0613
            L_0x0611:
                r9 = r16
            L_0x0613:
                ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue$JsonFields r10 = p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue.JsonFields.INSTANCE     // Catch:{ Exception -> 0x0855 }
                java.lang.String r10 = r10.getText()     // Catch:{ Exception -> 0x0855 }
                java.lang.Object r6 = r6.get(r10)     // Catch:{ Exception -> 0x0855 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0855 }
                if (r6 == 0) goto L_0x0622
                goto L_0x0624
            L_0x0622:
                r6 = r16
            L_0x0624:
                r8.<init>(r9, r6)     // Catch:{ Exception -> 0x0855 }
                boolean r6 = r0.add(r8)     // Catch:{ Exception -> 0x0855 }
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x0855 }
                r3.add(r6)     // Catch:{ Exception -> 0x0855 }
                goto L_0x05f4
            L_0x0633:
                java.util.List r3 = (java.util.List) r3     // Catch:{ Exception -> 0x0855 }
                goto L_0x0638
            L_0x0636:
                r4 = 10
            L_0x0638:
                ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField r3 = new ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField     // Catch:{ Exception -> 0x0855 }
                ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField$JsonFields r5 = p035ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField.JsonFields.INSTANCE     // Catch:{ Exception -> 0x0855 }
                java.lang.String r5 = r5.getTitle()     // Catch:{ Exception -> 0x0855 }
                java.lang.Object r5 = r7.get(r5)     // Catch:{ Exception -> 0x0855 }
                if (r5 == 0) goto L_0x0647
                goto L_0x0649
            L_0x0647:
                r5 = r16
            L_0x0649:
                java.lang.String r22 = r5.toString()     // Catch:{ Exception -> 0x0855 }
                ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField$JsonFields r5 = p035ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField.JsonFields.INSTANCE     // Catch:{ Exception -> 0x0855 }
                java.lang.String r5 = r5.getDefaultValue()     // Catch:{ Exception -> 0x0855 }
                java.lang.Object r5 = r7.get(r5)     // Catch:{ Exception -> 0x0855 }
                if (r5 == 0) goto L_0x065a
                goto L_0x065c
            L_0x065a:
                r5 = r16
            L_0x065c:
                java.lang.String r23 = r5.toString()     // Catch:{ Exception -> 0x0855 }
                ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField$JsonFields r5 = p035ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField.JsonFields.INSTANCE     // Catch:{ Exception -> 0x0855 }
                java.lang.String r5 = r5.getType()     // Catch:{ Exception -> 0x0855 }
                java.lang.Object r5 = r7.get(r5)     // Catch:{ Exception -> 0x0855 }
                if (r5 == 0) goto L_0x066d
                goto L_0x0673
            L_0x066d:
                ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField$Type r5 = p035ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField.Type.INSTANCE     // Catch:{ Exception -> 0x0855 }
                java.lang.String r5 = r5.getDefault()     // Catch:{ Exception -> 0x0855 }
            L_0x0673:
                java.lang.String r25 = r5.toString()     // Catch:{ Exception -> 0x0855 }
                ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField$JsonFields r5 = p035ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField.JsonFields.INSTANCE     // Catch:{ Exception -> 0x0855 }
                java.lang.String r5 = r5.getStyle()     // Catch:{ Exception -> 0x0855 }
                java.lang.Object r5 = r7.get(r5)     // Catch:{ Exception -> 0x0855 }
                if (r5 == 0) goto L_0x0684
                goto L_0x068a
            L_0x0684:
                ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField$Style r5 = p035ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField.Style.INSTANCE     // Catch:{ Exception -> 0x0855 }
                java.lang.String r5 = r5.getDefault()     // Catch:{ Exception -> 0x0855 }
            L_0x068a:
                java.lang.String r26 = r5.toString()     // Catch:{ Exception -> 0x0855 }
                r21 = r3
                r24 = r0
                r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x0855 }
                r8 = r3
                ru.unicorn.ujin.view.dialogs.dataEntry.Field r8 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r8     // Catch:{ Exception -> 0x0855 }
                goto L_0x06dd
            L_0x0699:
                r4 = 10
                goto L_0x0855
            L_0x069d:
                r4 = 10
                ru.unicorn.ujin.view.dialogs.dataEntry.CheckboxField$JsonFields r0 = p035ru.unicorn.ujin.view.dialogs.dataEntry.CheckboxField.JsonFields.INSTANCE     // Catch:{ Exception -> 0x0855 }
                java.lang.String r0 = r0.getFieldName()     // Catch:{ Exception -> 0x0855 }
                java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)     // Catch:{ Exception -> 0x0855 }
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r0)     // Catch:{ Exception -> 0x0855 }
                if (r0 == 0) goto L_0x06e1
                ru.unicorn.ujin.view.dialogs.dataEntry.CheckboxField r0 = new ru.unicorn.ujin.view.dialogs.dataEntry.CheckboxField     // Catch:{ Exception -> 0x0855 }
                ru.unicorn.ujin.view.dialogs.dataEntry.CheckboxField$JsonFields r3 = p035ru.unicorn.ujin.view.dialogs.dataEntry.CheckboxField.JsonFields.INSTANCE     // Catch:{ Exception -> 0x0855 }
                java.lang.String r3 = r3.getText()     // Catch:{ Exception -> 0x0855 }
                java.lang.Object r3 = r7.get(r3)     // Catch:{ Exception -> 0x0855 }
                if (r3 == 0) goto L_0x06be
                goto L_0x06c0
            L_0x06be:
                r3 = r16
            L_0x06c0:
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0855 }
                ru.unicorn.ujin.view.dialogs.dataEntry.CheckboxField$JsonFields r5 = p035ru.unicorn.ujin.view.dialogs.dataEntry.CheckboxField.JsonFields.INSTANCE     // Catch:{ Exception -> 0x0855 }
                java.lang.String r5 = r5.getUrl()     // Catch:{ Exception -> 0x0855 }
                java.lang.Object r5 = r7.get(r5)     // Catch:{ Exception -> 0x0855 }
                if (r5 == 0) goto L_0x06d1
                goto L_0x06d3
            L_0x06d1:
                r5 = r16
            L_0x06d3:
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0855 }
                r0.<init>(r3, r5)     // Catch:{ Exception -> 0x0855 }
                r8 = r0
                ru.unicorn.ujin.view.dialogs.dataEntry.Field r8 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r8     // Catch:{ Exception -> 0x0855 }
            L_0x06dd:
                r3 = r32
                goto L_0x080c
            L_0x06e1:
                java.lang.String r0 = "bank_loan"
                java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)     // Catch:{ Exception -> 0x0855 }
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r0)     // Catch:{ Exception -> 0x0855 }
                if (r0 == 0) goto L_0x0741
                ru.unicorn.ujin.view.dialogs.dataEntry.BankLoanTitleField r0 = new ru.unicorn.ujin.view.dialogs.dataEntry.BankLoanTitleField     // Catch:{ Exception -> 0x0855 }
                java.lang.String r3 = "logo_url"
                java.lang.Object r3 = r7.get(r3)     // Catch:{ Exception -> 0x0855 }
                if (r3 == 0) goto L_0x06f8
                goto L_0x06fa
            L_0x06f8:
                r3 = r16
            L_0x06fa:
                java.lang.String r22 = r3.toString()     // Catch:{ Exception -> 0x0855 }
                java.lang.String r3 = "title"
                java.lang.Object r3 = r7.get(r3)     // Catch:{ Exception -> 0x0855 }
                if (r3 == 0) goto L_0x0707
                goto L_0x0709
            L_0x0707:
                r3 = r16
            L_0x0709:
                java.lang.String r23 = r3.toString()     // Catch:{ Exception -> 0x0855 }
                java.lang.Object r3 = r7.get(r9)     // Catch:{ Exception -> 0x0855 }
                if (r3 == 0) goto L_0x0714
                goto L_0x0716
            L_0x0714:
                r3 = r16
            L_0x0716:
                java.lang.String r24 = r3.toString()     // Catch:{ Exception -> 0x0855 }
                java.lang.String r3 = "text_color"
                java.lang.Object r3 = r7.get(r3)     // Catch:{ Exception -> 0x0855 }
                if (r3 == 0) goto L_0x0723
                goto L_0x0725
            L_0x0723:
                r3 = r16
            L_0x0725:
                java.lang.String r25 = r3.toString()     // Catch:{ Exception -> 0x0855 }
                java.lang.String r3 = "description"
                java.lang.Object r3 = r7.get(r3)     // Catch:{ Exception -> 0x0855 }
                if (r3 == 0) goto L_0x0732
                goto L_0x0734
            L_0x0732:
                r3 = r16
            L_0x0734:
                java.lang.String r26 = r3.toString()     // Catch:{ Exception -> 0x0855 }
                r21 = r0
                r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x0855 }
                r8 = r0
                ru.unicorn.ujin.view.dialogs.dataEntry.Field r8 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r8     // Catch:{ Exception -> 0x0855 }
                goto L_0x06dd
            L_0x0741:
                ru.unicorn.ujin.view.dialogs.dataEntry.VideoField$JsonFields r0 = p035ru.unicorn.ujin.view.dialogs.dataEntry.VideoField.JsonFields.INSTANCE     // Catch:{ Exception -> 0x0855 }
                java.lang.String r0 = r0.getFieldName()     // Catch:{ Exception -> 0x0855 }
                java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)     // Catch:{ Exception -> 0x0855 }
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r0)     // Catch:{ Exception -> 0x0855 }
                if (r0 == 0) goto L_0x0781
                ru.unicorn.ujin.view.dialogs.dataEntry.VideoField r0 = new ru.unicorn.ujin.view.dialogs.dataEntry.VideoField     // Catch:{ Exception -> 0x0855 }
                ru.unicorn.ujin.view.dialogs.dataEntry.VideoField$JsonFields r3 = p035ru.unicorn.ujin.view.dialogs.dataEntry.VideoField.JsonFields.INSTANCE     // Catch:{ Exception -> 0x0855 }
                java.lang.String r3 = r3.getPreview()     // Catch:{ Exception -> 0x0855 }
                java.lang.Object r3 = r7.get(r3)     // Catch:{ Exception -> 0x0855 }
                if (r3 == 0) goto L_0x0760
                goto L_0x0762
            L_0x0760:
                r3 = r16
            L_0x0762:
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0855 }
                ru.unicorn.ujin.view.dialogs.dataEntry.VideoField$JsonFields r5 = p035ru.unicorn.ujin.view.dialogs.dataEntry.VideoField.JsonFields.INSTANCE     // Catch:{ Exception -> 0x0855 }
                java.lang.String r5 = r5.getUrl()     // Catch:{ Exception -> 0x0855 }
                java.lang.Object r5 = r7.get(r5)     // Catch:{ Exception -> 0x0855 }
                if (r5 == 0) goto L_0x0773
                goto L_0x0775
            L_0x0773:
                r5 = r16
            L_0x0775:
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0855 }
                r0.<init>(r3, r5)     // Catch:{ Exception -> 0x0855 }
                r8 = r0
                ru.unicorn.ujin.view.dialogs.dataEntry.Field r8 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r8     // Catch:{ Exception -> 0x0855 }
                goto L_0x06dd
            L_0x0781:
                java.lang.String r0 = "calendar"
                java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)     // Catch:{ Exception -> 0x0855 }
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r0)     // Catch:{ Exception -> 0x0855 }
                if (r0 == 0) goto L_0x0804
                ru.unicorn.ujin.view.dialogs.dataEntry.DatePickerField r0 = new ru.unicorn.ujin.view.dialogs.dataEntry.DatePickerField     // Catch:{ Exception -> 0x0855 }
                java.lang.String r3 = "hint"
                java.lang.Object r3 = r7.get(r3)     // Catch:{ Exception -> 0x0855 }
                if (r3 == 0) goto L_0x0798
                goto L_0x079a
            L_0x0798:
                r3 = r16
            L_0x079a:
                if (r3 == 0) goto L_0x07fc
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0855 }
                java.lang.String r5 = "value"
                java.lang.Object r5 = r7.get(r5)     // Catch:{ Exception -> 0x0855 }
                if (r5 == 0) goto L_0x07a7
                goto L_0x07a9
            L_0x07a7:
                r5 = r16
            L_0x07a9:
                if (r5 == 0) goto L_0x07f4
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0855 }
                boolean r6 = r7.containsKey(r13)     // Catch:{ Exception -> 0x0855 }
                if (r6 == 0) goto L_0x07ca
                java.lang.Object r6 = r7.get(r13)     // Catch:{ Exception -> 0x0855 }
                if (r6 == 0) goto L_0x07ba
                goto L_0x07bc
            L_0x07ba:
                r6 = r16
            L_0x07bc:
                if (r6 == 0) goto L_0x07c2
                r9 = r6
                java.util.Calendar r9 = (java.util.Calendar) r9     // Catch:{ Exception -> 0x0855 }
                goto L_0x07cb
            L_0x07c2:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0855 }
                java.lang.String r3 = "null cannot be cast to non-null type java.util.Calendar"
                r0.<init>(r3)     // Catch:{ Exception -> 0x0855 }
                throw r0     // Catch:{ Exception -> 0x0855 }
            L_0x07ca:
                r9 = 0
            L_0x07cb:
                java.lang.String r6 = "min_value"
                boolean r6 = r7.containsKey(r6)     // Catch:{ Exception -> 0x0855 }
                if (r6 == 0) goto L_0x07eb
                java.lang.String r6 = "min_value"
                java.lang.Object r6 = r7.get(r6)     // Catch:{ Exception -> 0x0855 }
                if (r6 == 0) goto L_0x07dc
                goto L_0x07de
            L_0x07dc:
                r6 = r16
            L_0x07de:
                if (r6 == 0) goto L_0x07e3
                java.util.Calendar r6 = (java.util.Calendar) r6     // Catch:{ Exception -> 0x0855 }
                goto L_0x07ec
            L_0x07e3:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0855 }
                java.lang.String r3 = "null cannot be cast to non-null type java.util.Calendar"
                r0.<init>(r3)     // Catch:{ Exception -> 0x0855 }
                throw r0     // Catch:{ Exception -> 0x0855 }
            L_0x07eb:
                r6 = 0
            L_0x07ec:
                r0.<init>(r3, r5, r9, r6)     // Catch:{ Exception -> 0x0855 }
                r8 = r0
                ru.unicorn.ujin.view.dialogs.dataEntry.Field r8 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r8     // Catch:{ Exception -> 0x0855 }
                goto L_0x06dd
            L_0x07f4:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0855 }
                r3 = r32
                r0.<init>(r3)     // Catch:{ Exception -> 0x0855 }
                throw r0     // Catch:{ Exception -> 0x0855 }
            L_0x07fc:
                r3 = r32
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0855 }
                r0.<init>(r3)     // Catch:{ Exception -> 0x0855 }
                throw r0     // Catch:{ Exception -> 0x0855 }
            L_0x0804:
                r3 = r32
                ru.unicorn.ujin.view.dialogs.dataEntry.DividerField r0 = new ru.unicorn.ujin.view.dialogs.dataEntry.DividerField     // Catch:{ Exception -> 0x0855 }
                r5 = 0
                r0.<init>(r5)     // Catch:{ Exception -> 0x0855 }
            L_0x080c:
                java.lang.String r0 = "name"
                java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x0855 }
                if (r0 == 0) goto L_0x0816
                r16 = r0
            L_0x0816:
                if (r16 == 0) goto L_0x084d
                r0 = r16
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0855 }
                r8.setName(r0)     // Catch:{ Exception -> 0x0855 }
                java.lang.String r0 = "required"
                java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x0855 }
                if (r0 == 0) goto L_0x0828
                goto L_0x082d
            L_0x0828:
                r0 = 0
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0855 }
            L_0x082d:
                if (r0 == 0) goto L_0x0845
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0855 }
                boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0855 }
                r8.setRequired(r0)     // Catch:{ Exception -> 0x0855 }
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x0855 }
                r0 = r19
                boolean r3 = r0.add(r8)     // Catch:{ Exception -> 0x0864 }
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0864 }
                goto L_0x0870
            L_0x0845:
                r0 = r19
                java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0864 }
                r3.<init>(r12)     // Catch:{ Exception -> 0x0864 }
                throw r3     // Catch:{ Exception -> 0x0864 }
            L_0x084d:
                r0 = r19
                java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0864 }
                r5.<init>(r3)     // Catch:{ Exception -> 0x0864 }
                throw r5     // Catch:{ Exception -> 0x0864 }
            L_0x0855:
                r0 = r19
                goto L_0x0864
            L_0x0858:
                r18 = r0
            L_0x085a:
                r0 = r19
                goto L_0x0862
            L_0x085d:
                r18 = r0
                r0 = r3
                r20 = r4
            L_0x0862:
                r4 = 10
            L_0x0864:
                java.lang.String r3 = "Dynamic Field Parser"
                java.lang.String r5 = "Cannot parse map: TODOTODO"
                int r3 = android.util.Log.d(r3, r5)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            L_0x0870:
                r5 = r3
                r3 = r20
                r3.add(r5)
                r4 = r3
                r5 = 10
                r3 = r0
                r0 = r18
                goto L_0x002d
            L_0x087e:
                r0 = r3
                r3 = r4
                r4 = r3
                java.util.List r4 = (java.util.List) r4
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter.Companion.parseHashMapReturnFieldList(java.util.ArrayList, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1):java.util.ArrayList");
        }

        /* JADX WARNING: Removed duplicated region for block: B:112:0x01d2  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x01e6  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x01f2  */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x0216  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final p035ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField parseButtonMap(java.util.Map<java.lang.String, ? extends java.lang.Object> r21, kotlin.jvm.functions.Function2<? super p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent<p035ru.unicorn.ujin.data.realm.Resource<java.lang.Object>>, ? super java.lang.String, kotlin.Unit> r22, kotlin.jvm.functions.Function2<? super p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent<p035ru.unicorn.ujin.data.realm.ResourceV2<java.lang.Object>>, ? super java.lang.String, kotlin.Unit> r23) {
            /*
                r20 = this;
                r0 = r21
                java.util.Set r1 = r21.keySet()
                java.lang.String r2 = "actions"
                boolean r1 = r1.contains(r2)
                java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>"
                if (r1 == 0) goto L_0x001f
                java.lang.Object r1 = r0.get(r2)
                if (r1 == 0) goto L_0x0019
                java.util.Map r1 = (java.util.Map) r1
                goto L_0x0020
            L_0x0019:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r3)
                throw r0
            L_0x001f:
                r1 = 0
            L_0x0020:
                r2 = 1
                if (r1 == 0) goto L_0x003a
                java.lang.String r5 = "click"
                boolean r6 = r1.containsKey(r5)
                if (r6 != r2) goto L_0x003a
                java.lang.Object r1 = r1.get(r5)
                if (r1 == 0) goto L_0x0034
                java.util.Map r1 = (java.util.Map) r1
                goto L_0x003b
            L_0x0034:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r3)
                throw r0
            L_0x003a:
                r1 = 0
            L_0x003b:
                if (r1 == 0) goto L_0x0055
                java.lang.String r5 = "data"
                boolean r6 = r1.containsKey(r5)
                if (r6 != r2) goto L_0x0055
                java.lang.Object r5 = r1.get(r5)
                if (r5 == 0) goto L_0x004f
                r3 = r5
                java.util.Map r3 = (java.util.Map) r3
                goto L_0x0056
            L_0x004f:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r3)
                throw r0
            L_0x0055:
                r3 = 0
            L_0x0056:
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                if (r3 == 0) goto L_0x0080
                ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData$JsonFields r6 = p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData.JsonFields.INSTANCE
                java.lang.String r6 = r6.getParams()
                boolean r6 = r3.containsKey(r6)
                if (r6 != r2) goto L_0x0080
                ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData$JsonFields r6 = p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData.JsonFields.INSTANCE
                java.lang.String r6 = r6.getParams()
                java.lang.Object r6 = r3.get(r6)
                if (r6 == 0) goto L_0x0078
                java.util.Map r6 = (java.util.Map) r6
                goto L_0x0081
            L_0x0078:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>"
                r0.<init>(r1)
                throw r0
            L_0x0080:
                r6 = 0
            L_0x0081:
                if (r6 == 0) goto L_0x00bc
                java.util.Set r7 = r6.keySet()
                if (r7 == 0) goto L_0x00bc
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r8 = new java.util.ArrayList
                r9 = 10
                int r9 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r7, r9)
                r8.<init>(r9)
                java.util.Collection r8 = (java.util.Collection) r8
                java.util.Iterator r7 = r7.iterator()
            L_0x009c:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x00ba
                java.lang.Object r9 = r7.next()
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r10 = r6.get(r9)
                java.lang.String r10 = java.lang.String.valueOf(r10)
                java.lang.Object r9 = r5.put(r9, r10)
                java.lang.String r9 = (java.lang.String) r9
                r8.add(r9)
                goto L_0x009c
            L_0x00ba:
                java.util.List r8 = (java.util.List) r8
            L_0x00bc:
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                if (r3 == 0) goto L_0x00f4
                java.util.Set r7 = r3.keySet()
                if (r7 == 0) goto L_0x00f4
                ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData$JsonFields r8 = p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData.JsonFields.INSTANCE
                java.lang.String r8 = r8.getDataFields()
                boolean r7 = r7.contains(r8)
                if (r7 != r2) goto L_0x00f4
                r6 = r20
                ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter$Companion r6 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter.Companion) r6
                ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData$JsonFields r7 = p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData.JsonFields.INSTANCE
                java.lang.String r7 = r7.getDataFields()
                java.lang.Object r7 = r3.get(r7)
                if (r7 == 0) goto L_0x00ec
                com.google.gson.internal.LinkedTreeMap r7 = (com.google.gson.internal.LinkedTreeMap) r7
                java.util.HashMap r6 = r6.parseLinkedTreeMap(r7)
                goto L_0x00f4
            L_0x00ec:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type com.google.gson.internal.LinkedTreeMap<kotlin.String, kotlin.Any>"
                r0.<init>(r1)
                throw r0
            L_0x00f4:
                r8 = r6
                ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField r17 = new ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField
                java.lang.String r6 = "text"
                java.lang.Object r6 = r0.get(r6)
                java.lang.String r7 = ""
                if (r6 == 0) goto L_0x0102
                goto L_0x0103
            L_0x0102:
                r6 = r7
            L_0x0103:
                java.lang.String r10 = r6.toString()
                java.lang.String r6 = "style"
                java.lang.Object r6 = r0.get(r6)
                if (r6 == 0) goto L_0x0110
                goto L_0x0112
            L_0x0110:
                java.lang.String r6 = "filled"
            L_0x0112:
                java.lang.String r11 = r6.toString()
                java.lang.String r6 = "color"
                java.lang.Object r0 = r0.get(r6)
                if (r0 == 0) goto L_0x011f
                goto L_0x0120
            L_0x011f:
                r0 = r7
            L_0x0120:
                java.lang.String r12 = r0.toString()
                ru.unicorn.ujin.view.dialogs.dataEntry.Actions r13 = new ru.unicorn.ujin.view.dialogs.dataEntry.Actions
                ru.unicorn.ujin.view.dialogs.dataEntry.ClickAction r0 = new ru.unicorn.ujin.view.dialogs.dataEntry.ClickAction
                if (r1 == 0) goto L_0x0139
                java.lang.String r6 = "type"
                java.lang.Object r1 = r1.get(r6)
                if (r1 == 0) goto L_0x0133
                goto L_0x0134
            L_0x0133:
                r1 = r7
            L_0x0134:
                java.lang.String r1 = r1.toString()
                goto L_0x013a
            L_0x0139:
                r1 = r7
            L_0x013a:
                ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData r14 = new ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData
                if (r3 == 0) goto L_0x0163
                java.util.Set r6 = r3.keySet()
                if (r6 == 0) goto L_0x0163
                ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData$JsonFields r9 = p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData.JsonFields.INSTANCE
                java.lang.String r9 = r9.getHandleAction()
                boolean r6 = r6.contains(r9)
                if (r6 != r2) goto L_0x0163
                ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData$JsonFields r6 = p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData.JsonFields.INSTANCE
                java.lang.String r6 = r6.getHandleAction()
                java.lang.Object r6 = r3.get(r6)
                if (r6 == 0) goto L_0x015d
                goto L_0x015e
            L_0x015d:
                r6 = r7
            L_0x015e:
                java.lang.String r6 = r6.toString()
                goto L_0x0164
            L_0x0163:
                r6 = 0
            L_0x0164:
                java.lang.String r9 = "null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */"
                if (r3 == 0) goto L_0x018f
                java.util.Set r15 = r3.keySet()
                if (r15 == 0) goto L_0x018f
                ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData$JsonFields r16 = p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData.JsonFields.INSTANCE
                java.lang.String r4 = r16.getFields()
                boolean r4 = r15.contains(r4)
                if (r4 != r2) goto L_0x018f
                ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData$JsonFields r4 = p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData.JsonFields.INSTANCE
                java.lang.String r4 = r4.getFields()
                java.lang.Object r4 = r3.get(r4)
                if (r4 == 0) goto L_0x0189
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                goto L_0x0190
            L_0x0189:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r9)
                throw r0
            L_0x018f:
                r4 = 0
            L_0x0190:
                if (r3 == 0) goto L_0x01bb
                java.util.Set r15 = r3.keySet()
                if (r15 == 0) goto L_0x01bb
                ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData$JsonFields r16 = p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData.JsonFields.INSTANCE
                r19 = r7
                java.lang.String r7 = r16.getFieldsToBeValid()
                boolean r7 = r15.contains(r7)
                if (r7 != r2) goto L_0x01bd
                ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData$JsonFields r7 = p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData.JsonFields.INSTANCE
                java.lang.String r7 = r7.getFieldsToBeValid()
                java.lang.Object r7 = r3.get(r7)
                if (r7 == 0) goto L_0x01b5
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                goto L_0x01be
            L_0x01b5:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r9)
                throw r0
            L_0x01bb:
                r19 = r7
            L_0x01bd:
                r7 = 0
            L_0x01be:
                if (r3 == 0) goto L_0x01e6
                java.util.Set r9 = r3.keySet()
                if (r9 == 0) goto L_0x01e6
                ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData$JsonFields r15 = p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData.JsonFields.INSTANCE
                java.lang.String r15 = r15.getData()
                boolean r9 = r9.contains(r15)
                if (r9 != r2) goto L_0x01e6
                ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData$JsonFields r9 = p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData.JsonFields.INSTANCE
                java.lang.String r9 = r9.getData()
                java.lang.Object r9 = r3.get(r9)
                if (r9 == 0) goto L_0x01df
                goto L_0x01e1
            L_0x01df:
                r9 = r19
            L_0x01e1:
                java.lang.String r9 = r9.toString()
                goto L_0x01e7
            L_0x01e6:
                r9 = 0
            L_0x01e7:
                r15 = r5
                java.util.Map r15 = (java.util.Map) r15
                if (r3 == 0) goto L_0x0216
                java.util.Set r5 = r3.keySet()
                if (r5 == 0) goto L_0x0216
                ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData$JsonFields r16 = p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData.JsonFields.INSTANCE
                r21 = r12
                java.lang.String r12 = r16.getConfirmMessage()
                boolean r5 = r5.contains(r12)
                if (r5 != r2) goto L_0x0218
                ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData$JsonFields r2 = p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData.JsonFields.INSTANCE
                java.lang.String r2 = r2.getConfirmMessage()
                java.lang.Object r2 = r3.get(r2)
                if (r2 == 0) goto L_0x020d
                goto L_0x020f
            L_0x020d:
                r2 = r19
            L_0x020f:
                java.lang.String r2 = r2.toString()
                r18 = r2
                goto L_0x021a
            L_0x0216:
                r21 = r12
            L_0x0218:
                r18 = 0
            L_0x021a:
                r2 = r14
                r3 = r6
                r5 = r7
                r6 = r9
                r7 = r15
                r9 = r18
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                r0.<init>(r1, r14)
                r13.<init>(r0)
                ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter$Companion$parseButtonMap$2 r0 = p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter$Companion$parseButtonMap$2.INSTANCE
                r14 = r0
                kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
                r9 = r17
                r12 = r21
                r15 = r23
                r16 = r22
                r9.<init>(r10, r11, r12, r13, r14, r15, r16)
                return r17
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter.Companion.parseButtonMap(java.util.Map, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2):ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField");
        }

        private final HashMap<String, Object> parseLinkedTreeMap(LinkedTreeMap<String, Object> linkedTreeMap) {
            HashMap<String, Object> hashMap = new HashMap<>();
            for (Map.Entry next : linkedTreeMap.entrySet()) {
                if ((next.getValue() instanceof String) && Intrinsics.areEqual(next.getValue(), (Object) "")) {
                    hashMap.put(next.getKey(), next.getValue());
                } else if (next.getValue() instanceof LinkedTreeMap) {
                    Object key = next.getKey();
                    Companion companion = this;
                    Object value = next.getValue();
                    if (value != null) {
                        hashMap.put(key, companion.parseLinkedTreeMap((LinkedTreeMap) value));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.google.gson.internal.LinkedTreeMap<kotlin.String, kotlin.Any>");
                    }
                } else {
                    continue;
                }
            }
            return hashMap;
        }
    }
}
