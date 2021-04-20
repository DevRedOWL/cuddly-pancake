package p035ru.unicorn.ujin.view.customViews.dynamic.button;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.ResourceV2;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.customViews.dynamic.BaseViewHolder;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0004J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/button/BaseButtonHolder;", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "itemView", "Landroid/view/View;", "adapter", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "(Landroid/view/View;Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;)V", "getAdapter", "()Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryAdapter;", "viewModel", "Lru/unicorn/ujin/view/customViews/dynamic/button/DynamicFormViewModel;", "getViewModel", "()Lru/unicorn/ujin/view/customViews/dynamic/button/DynamicFormViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "apiCall", "", "item", "Lru/unicorn/ujin/view/dialogs/dataEntry/ButtonField;", "bindButton", "dynamicBackgroundButton", "Lru/unicorn/ujin/view/customViews/DynamicBackgroundButton;", "isValidToClick", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.button.BaseButtonHolder */
/* compiled from: BaseButtonHolder.kt */
public abstract class BaseButtonHolder extends BaseViewHolder {
    private final DataEntryAdapter adapter;
    private final Lazy viewModel$delegate;

    public final DynamicFormViewModel getViewModel() {
        return (DynamicFormViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseButtonHolder(View view, DataEntryAdapter dataEntryAdapter) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(dataEntryAdapter, "adapter");
        this.adapter = dataEntryAdapter;
        this.viewModel$delegate = LazyKt.lazy(new BaseButtonHolder$viewModel$2(view));
    }

    public final DataEntryAdapter getAdapter() {
        return this.adapter;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindButton(p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r12, p035ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField r13) {
        /*
            r11 = this;
            java.lang.String r0 = "dynamicBackgroundButton"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = r13.getText()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r12.setText(r0)
            java.lang.String r0 = r13.getStyle()
            int r1 = r0.hashCode()
            java.lang.String r2 = "stroke"
            java.lang.String r3 = "filled"
            r4 = -891980232(0xffffffffcad57638, float:-6994716.0)
            r5 = -1274499742(0xffffffffb408ad62, float:-1.2729063E-7)
            if (r1 == r5) goto L_0x0036
            if (r1 == r4) goto L_0x002a
            goto L_0x0042
        L_0x002a:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0042
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton$Type r0 = p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton.Type.OUTLINED
            r12.setType(r0)
            goto L_0x0047
        L_0x0036:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0042
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton$Type r0 = p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton.Type.PRIMARY
            r12.setType(r0)
            goto L_0x0047
        L_0x0042:
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton$Type r0 = p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton.Type.PRIMARY
            r12.setType(r0)
        L_0x0047:
            java.lang.String r0 = r13.getColor()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0055
            r0 = 1
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = r13.getColor()
            int r0 = android.graphics.Color.parseColor(r0)
            java.lang.String r1 = r13.getColor()
            int r1 = android.graphics.Color.parseColor(r1)
            int r1 = p035ru.unicorn.ujin.util.AppUtils.getDarkenColor(r1)
            java.lang.String r6 = r13.getColor()
            int r6 = android.graphics.Color.parseColor(r6)
            int r6 = p035ru.unicorn.ujin.util.AppUtils.getLightenColor(r6)
            java.lang.String r7 = r13.getStyle()
            int r8 = r7.hashCode()
            r9 = 2131099730(0x7f060052, float:1.7811821E38)
            java.lang.String r10 = "context"
            if (r8 == r5) goto L_0x0099
            if (r8 == r4) goto L_0x008a
            goto L_0x00af
        L_0x008a:
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x00af
            java.lang.String r2 = r13.getColor()
            int r2 = android.graphics.Color.parseColor(r2)
            goto L_0x00be
        L_0x0099:
            boolean r2 = r7.equals(r3)
            if (r2 == 0) goto L_0x00af
            android.content.Context r2 = r12.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r10)
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r9)
            goto L_0x00be
        L_0x00af:
            android.content.Context r2 = r12.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r10)
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r9)
        L_0x00be:
            r12.setCustomColors(r0, r1, r6, r2)
        L_0x00c1:
            ru.unicorn.ujin.view.dialogs.dataEntry.Actions r0 = r13.getActions()
            ru.unicorn.ujin.view.dialogs.dataEntry.ClickAction r0 = r0.getClick()
            java.lang.String r0 = r0.getType()
            if (r0 != 0) goto L_0x00d0
            goto L_0x0136
        L_0x00d0:
            int r1 = r0.hashCode()
            switch(r1) {
                case -601540331: goto L_0x0124;
                case 116079: goto L_0x0111;
                case 106642798: goto L_0x00fe;
                case 715430714: goto L_0x00eb;
                case 966916451: goto L_0x00d8;
                default: goto L_0x00d7;
            }
        L_0x00d7:
            goto L_0x0136
        L_0x00d8:
            java.lang.String r1 = "api_call"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0136
            ru.unicorn.ujin.view.customViews.dynamic.button.BaseButtonHolder$bindButton$$inlined$apply$lambda$5 r0 = new ru.unicorn.ujin.view.customViews.dynamic.button.BaseButtonHolder$bindButton$$inlined$apply$lambda$5
            r0.<init>(r12, r11, r13)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r12.setOnClickListener(r0)
            goto L_0x0136
        L_0x00eb:
            java.lang.String r1 = "custom_click"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0136
            ru.unicorn.ujin.view.customViews.dynamic.button.BaseButtonHolder$bindButton$$inlined$apply$lambda$1 r0 = new ru.unicorn.ujin.view.customViews.dynamic.button.BaseButtonHolder$bindButton$$inlined$apply$lambda$1
            r0.<init>(r12, r11, r13)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r12.setOnClickListener(r0)
            goto L_0x0136
        L_0x00fe:
            java.lang.String r1 = "phone"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0136
            ru.unicorn.ujin.view.customViews.dynamic.button.BaseButtonHolder$bindButton$$inlined$apply$lambda$4 r0 = new ru.unicorn.ujin.view.customViews.dynamic.button.BaseButtonHolder$bindButton$$inlined$apply$lambda$4
            r0.<init>(r12, r11, r13)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r12.setOnClickListener(r0)
            goto L_0x0136
        L_0x0111:
            java.lang.String r1 = "url"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0136
            ru.unicorn.ujin.view.customViews.dynamic.button.BaseButtonHolder$bindButton$$inlined$apply$lambda$2 r0 = new ru.unicorn.ujin.view.customViews.dynamic.button.BaseButtonHolder$bindButton$$inlined$apply$lambda$2
            r0.<init>(r12, r11, r13)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r12.setOnClickListener(r0)
            goto L_0x0136
        L_0x0124:
            java.lang.String r1 = "url_callback"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0136
            ru.unicorn.ujin.view.customViews.dynamic.button.BaseButtonHolder$bindButton$$inlined$apply$lambda$3 r0 = new ru.unicorn.ujin.view.customViews.dynamic.button.BaseButtonHolder$bindButton$$inlined$apply$lambda$3
            r0.<init>(r12, r11, r13)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r12.setOnClickListener(r0)
        L_0x0136:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.customViews.dynamic.button.BaseButtonHolder.bindButton(ru.unicorn.ujin.view.customViews.DynamicBackgroundButton, ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField):void");
    }

    /* access modifiers changed from: private */
    public final void apiCall(ButtonField buttonField) {
        String data;
        String str;
        String str2;
        Map<String, String> params;
        ClickActionData data2 = buttonField.getActions().getClick().getData();
        if (data2 != null && (data = data2.getData()) != null) {
            Function2<SingleLiveEvent<ResourceV2<Object>>, String, Unit> apiCallObserveV2 = buttonField.getApiCallObserveV2();
            SingleLiveEvent<ResourceV2<Object>> sendDynamicRequestV2 = getViewModel().getSendDynamicRequestV2();
            ClickActionData data3 = buttonField.getActions().getClick().getData();
            if (data3 == null || (str = data3.getHandleAction()) == null) {
                str = "Успешно";
            }
            apiCallObserveV2.invoke(sendDynamicRequestV2, str);
            Function2<SingleLiveEvent<Resource<Object>>, String, Unit> apiCallObserveV1 = buttonField.getApiCallObserveV1();
            SingleLiveEvent<Resource<Object>> sendDynamicRequestV1 = getViewModel().getSendDynamicRequestV1();
            ClickActionData data4 = buttonField.getActions().getClick().getData();
            if (data4 == null || (str2 = data4.getHandleAction()) == null) {
                str2 = "Успешно";
            }
            apiCallObserveV1.invoke(sendDynamicRequestV1, str2);
            DynamicFormViewModel viewModel = getViewModel();
            HashMap hashMap = new HashMap();
            ClickActionData data5 = buttonField.getActions().getClick().getData();
            if (!(data5 == null || (params = data5.getParams()) == null)) {
                Collection arrayList = new ArrayList(params.size());
                for (Map.Entry next : params.entrySet()) {
                    arrayList.add((String) hashMap.put(next.getKey(), next.getValue()));
                }
                List list = (List) arrayList;
            }
            Map<String, String> paramsMap = this.adapter.getParamsMap(0);
            Collection arrayList2 = new ArrayList(paramsMap.size());
            for (Map.Entry next2 : paramsMap.entrySet()) {
                if (((CharSequence) next2.getKey()).length() > 0) {
                    hashMap.put(next2.getKey(), next2.getValue());
                }
                arrayList2.add(Unit.INSTANCE);
            }
            List list2 = (List) arrayList2;
            Unit unit = Unit.INSTANCE;
            Map map = hashMap;
            ClickActionData data6 = buttonField.getActions().getClick().getData();
            viewModel.sendDynamicRequest(data, map, data6 != null ? data6.getDataFields() : null);
        }
    }

    /* access modifiers changed from: private */
    public final boolean isValidToClick(ButtonField buttonField) {
        ArrayList<String> fieldsToBeValid;
        ClickActionData data = buttonField.getActions().getClick().getData();
        if (data == null || (fieldsToBeValid = data.getFieldsToBeValid()) == null) {
            BaseButtonHolder baseButtonHolder = this;
            return true;
        } else if (fieldsToBeValid.isEmpty() || this.adapter.isFieldsValid(fieldsToBeValid)) {
            return true;
        } else {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            builder.setMessage((CharSequence) view2.getContext().getString(R.string.fillAllRequiredFields)).setPositiveButton((int) R.string.ok, (DialogInterface.OnClickListener) BaseButtonHolder$isValidToClick$1$1.INSTANCE).show();
            return false;
        }
    }
}
