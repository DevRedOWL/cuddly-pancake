package p035ru.unicorn.ujin.view.activity.navigation.p058ui.base;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.base.NavigationBaseFragment */
public abstract class NavigationBaseFragment extends BaseFragment {
    Toolbar toolbar;

    public abstract void setToolbarOptions(Toolbar toolbar2);

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    public void onResume() {
        super.onResume();
        if (this.toolbar == null) {
            this.toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
        }
        setToolbarOptions(this.toolbar);
    }
}
