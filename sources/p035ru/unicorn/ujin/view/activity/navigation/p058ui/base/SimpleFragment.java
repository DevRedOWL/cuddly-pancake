package p035ru.unicorn.ujin.view.activity.navigation.p058ui.base;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.SimpleAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.data.SimpleData;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.base.SimpleFragment */
public abstract class SimpleFragment extends NavigationBaseFragment {
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void initAdapter(RecyclerView recyclerView, List<SimpleData> list, boolean z, int i, SimpleAdapter simpleAdapter) {
        recyclerView.setLayoutManager(z ? new LinearLayoutManager(getActivity()) : new GridLayoutManager(getActivity(), 2));
        recyclerView.setAdapter(simpleAdapter);
        if (simpleAdapter.getItemCount() == 0) {
            simpleAdapter.setType(i);
        }
    }

    public void onPause() {
        super.onPause();
    }
}
