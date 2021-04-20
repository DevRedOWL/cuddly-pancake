package p035ru.unicorn.ujin.view.customViews.citySearchView;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.Constants;
import p035ru.unicorn.ujin.data.realm.ProviderCity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001a\u001a\u00020\u000fJ\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\n\"\u0004\b\u0016\u0010\fR(\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\f¨\u0006\u001e"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/citySearchView/SearchViewField;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "onClick", "Lkotlin/Function0;", "", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "setOnClick", "(Lkotlin/jvm/functions/Function0;)V", "title", "getTitle", "setTitle", "value", "getValue", "setValue", "clearCity", "setCity", "city", "Lru/unicorn/ujin/data/realm/ProviderCity;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.citySearchView.SearchViewField */
/* compiled from: SearchViewField.kt */
public final class SearchViewField extends LinearLayout {
    private HashMap _$_findViewCache;

    /* renamed from: id */
    private String f6907id;
    public Function0<Unit> onClick;
    private String title;
    private String value;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchViewField(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R.layout.field_searchview, this, true);
        ((ConstraintLayout) _$_findCachedViewById(C5619R.C5622id.fieldLayout)).setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ SearchViewField this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(View view) {
                LocalBroadcastManager instance = LocalBroadcastManager.getInstance(context);
                Intent intent = new Intent(Constants.SEARCH_VIEW);
                intent.putExtra(Constants.SEARCH_VIEW_TITLE, this.this$0.getTitle());
                intent.putExtra(Constants.SEARCH_SELECTED_ID, this.this$0.getId());
                Unit unit = Unit.INSTANCE;
                instance.sendBroadcast(intent);
            }
        });
    }

    public final Function0<Unit> getOnClick() {
        Function0<Unit> function0 = this.onClick;
        if (function0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onClick");
        }
        return function0;
    }

    public final void setOnClick(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onClick = function0;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final String getId() {
        return this.f6907id;
    }

    public final void setId(String str) {
        this.f6907id = str;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvValue);
        Intrinsics.checkNotNullExpressionValue(textView, "tvValue");
        CharSequence charSequence = str;
        textView.setText(charSequence);
        TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvName);
        Intrinsics.checkNotNullExpressionValue(textView2, "tvName");
        boolean z = true;
        int i = 0;
        textView2.setVisibility(charSequence == null || StringsKt.isBlank(charSequence) ? 0 : 8);
        TextView textView3 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvValue);
        Intrinsics.checkNotNullExpressionValue(textView3, "tvValue");
        if (charSequence != null && !StringsKt.isBlank(charSequence)) {
            z = false;
        }
        if (z) {
            i = 8;
        }
        textView3.setVisibility(i);
    }

    public final void setCity(ProviderCity providerCity) {
        Intrinsics.checkNotNullParameter(providerCity, "city");
        this.f6907id = providerCity.getRegionId();
        setValue(providerCity.getTitle());
    }

    public final void clearCity() {
        String str = null;
        this.f6907id = str;
        setValue(str);
    }
}
