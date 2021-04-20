package p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSFragment */
public class BMSFragment extends BaseFragment {
    /* access modifiers changed from: private */

    /* renamed from: pb */
    public ProgressBar f6743pb;
    private SimpleViewModel simpleViewModel;
    private TextView title;
    /* access modifiers changed from: private */
    public WebView wvDescription;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.bms_fragment;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.title = (TextView) inflate.findViewById(R.id.title);
        this.wvDescription = (WebView) inflate.findViewById(R.id.wvDescription);
        this.f6743pb = (ProgressBar) inflate.findViewById(R.id.pb);
        return inflate;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.simpleViewModel = (SimpleViewModel) ViewModelProviders.m10of((Fragment) this).get(SimpleViewModel.class);
        this.simpleViewModel.getBmsInfo().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                BMSFragment.this.onGetInfo((Resource) obj);
            }
        });
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSFragment$2 */
    static /* synthetic */ class C58042 {
        static final /* synthetic */ int[] $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status = new int[Resource.Status.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                ru.unicorn.ujin.data.realm.Resource$Status[] r0 = p035ru.unicorn.ujin.data.realm.Resource.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status = r0
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x0014 }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.LOADING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.SUCCESS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.ERROR     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSFragment.C58042.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void onGetInfo(Resource<BMSInfo> resource) {
        if (resource != null) {
            int i = C58042.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6743pb.setVisibility(0);
            } else if (i == 2) {
                BMSInfo data = resource.getData();
                this.title.setText(data.getTitle());
                final String format = String.format("#%06x", new Object[]{Integer.valueOf(ContextCompat.getColor(getBaseActivity(), R.color.textPrimary) & 16777215)});
                final String format2 = String.format("#%06x", new Object[]{Integer.valueOf(16777215 & ContextCompat.getColor(getBaseActivity(), R.color.brandMain))});
                this.wvDescription.getSettings().setJavaScriptEnabled(true);
                this.wvDescription.setWebViewClient(new WebViewClient() {
                    public void onPageFinished(WebView webView, String str) {
                        webView.loadUrl("javascript:(function() { document.body.style.setProperty(\"color\", \"" + format + "\");var aColl = document.getElementsByTagName('a');for(var i=0, len=aColl.length; i<len; i++) { aColl[i].style.setProperty(\"color\", \"" + format2 + "\"); }})()");
                        BMSFragment.this.f6743pb.setVisibility(8);
                        BMSFragment.this.wvDescription.setVisibility(0);
                    }
                });
                this.wvDescription.setBackgroundColor(getResources().getColor(R.color.backgroundPrimary));
                this.wvDescription.loadDataWithBaseURL("", data.getText(), "text/html", "UTF-8", "");
            } else if (i == 3) {
                this.f6743pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.label_bms));
    }
}
