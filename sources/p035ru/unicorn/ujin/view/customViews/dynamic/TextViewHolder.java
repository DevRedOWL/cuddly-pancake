package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/TextViewHolder;", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.TextViewHolder */
/* compiled from: TextViewHolder.kt */
public final class TextViewHolder extends BaseViewHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextViewHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bind(p035ru.unicorn.ujin.view.dialogs.dataEntry.Field r8) {
        /*
            r7 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            android.view.View r0 = r7.itemView
            if (r0 == 0) goto L_0x010d
            android.widget.TextView r0 = (android.widget.TextView) r0
            ru.unicorn.ujin.view.dialogs.dataEntry.TextField r8 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.TextField) r8
            java.lang.String r1 = r8.getText()
            r4 = 0
            r5 = 4
            r6 = 0
            java.lang.String r2 = "\n"
            java.lang.String r3 = "<br>"
            java.lang.String r1 = kotlin.text.StringsKt.replace$default((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (boolean) r4, (int) r5, (java.lang.Object) r6)
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            java.lang.String r1 = r8.getType()
            int r2 = r1.hashCode()
            r3 = -817598092(0xffffffffcf447174, float:-3.2957696E9)
            r4 = 1
            java.lang.String r5 = "context"
            if (r2 == r3) goto L_0x0080
            r3 = -314765822(0xffffffffed3d0e02, float:-3.65685E27)
            r6 = 2131099751(0x7f060067, float:1.7811864E38)
            if (r2 == r3) goto L_0x0065
            r3 = 3029637(0x2e3a85, float:4.245426E-39)
            if (r2 == r3) goto L_0x0043
            goto L_0x009d
        L_0x0043:
            java.lang.String r2 = "bold"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x009d
            android.content.Context r1 = r0.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r6)
            r0.setTextColor(r1)
            android.graphics.Typeface r1 = r0.getTypeface()
            r0.setTypeface(r1, r4)
            goto L_0x009d
        L_0x0065:
            java.lang.String r2 = "primary"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x009d
            android.content.Context r1 = r0.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r6)
            r0.setTextColor(r1)
            goto L_0x009d
        L_0x0080:
            java.lang.String r2 = "secondary"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x009d
            android.content.Context r1 = r0.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099752(0x7f060068, float:1.7811866E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
        L_0x009d:
            java.lang.String r1 = r8.getAlign()
            int r2 = r1.hashCode()
            r3 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            r5 = 8388611(0x800003, float:1.1754948E-38)
            if (r2 == r3) goto L_0x00d3
            r3 = 100571(0x188db, float:1.4093E-40)
            if (r2 == r3) goto L_0x00c4
            r3 = 109757538(0x68ac462, float:5.219839E-35)
            if (r2 == r3) goto L_0x00b8
            goto L_0x00e1
        L_0x00b8:
            java.lang.String r2 = "start"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00e1
            r0.setGravity(r5)
            goto L_0x00e4
        L_0x00c4:
            java.lang.String r2 = "end"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00e1
            r1 = 8388613(0x800005, float:1.175495E-38)
            r0.setGravity(r1)
            goto L_0x00e4
        L_0x00d3:
            java.lang.String r2 = "center"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00e1
            r1 = 17
            r0.setGravity(r1)
            goto L_0x00e4
        L_0x00e1:
            r0.setGravity(r5)
        L_0x00e4:
            java.lang.String r8 = r8.getJustify()
            int r1 = r8.hashCode()
            r2 = -229697526(0xfffffffff24f180a, float:-4.1019173E30)
            r3 = 29
            if (r1 == r2) goto L_0x00f4
            goto L_0x0104
        L_0x00f4:
            java.lang.String r1 = "fill_width"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0104
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r3) goto L_0x010c
            r0.setJustificationMode(r4)
            goto L_0x010c
        L_0x0104:
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r3) goto L_0x010c
            r8 = 0
            r0.setJustificationMode(r8)
        L_0x010c:
            return
        L_0x010d:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.customViews.dynamic.TextViewHolder.bind(ru.unicorn.ujin.view.dialogs.dataEntry.Field):void");
    }
}
