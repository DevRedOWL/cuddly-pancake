package p035ru.unicorn.ujin.view.activity.navigation.p058ui.empty;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.NavigationBaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.empty.EmptyFragment */
public class EmptyFragment extends NavigationBaseFragment {
    private static String ARG_ACTION_VALUE = "arc_action_value";
    private static String ARG_DESCRIPTION = "description";
    TextView label;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_empty;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public void setToolbarOptions(Toolbar toolbar) {
    }

    public static EmptyFragment start(String str, String str2) {
        EmptyFragment emptyFragment = new EmptyFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_ACTION_VALUE, str);
        bundle.putString(ARG_DESCRIPTION, str2);
        emptyFragment.setArguments(bundle);
        return emptyFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.label = (TextView) inflate.findViewById(R.id.label);
        return inflate;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.label.setText(getArguments().getString(ARG_ACTION_VALUE));
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setTextTitle(getArguments().getString(ARG_DESCRIPTION));
        if (getBaseActivity().getSupportFragmentManager().getBackStackEntryCount() > 1) {
            getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        } else {
            getBaseActivity().setToolbarLeft(ToolbarButtons.PROFILE);
        }
    }
}
