package p035ru.unicorn.ujin.view.dialogs;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.adapters.SelectorDialogDropdownAdapter;

/* renamed from: ru.unicorn.ujin.view.dialogs.SelectorDialog */
public class SelectorDialog extends DialogFragment {
    private View.OnClickListener clickListener;
    private ArrayList<String> data;
    private String homeTag;
    private ArrayList<String> tags = new ArrayList<>();

    public void setClickListener(View.OnClickListener onClickListener) {
        this.clickListener = onClickListener;
    }

    public void setData(ArrayList<String> arrayList) {
        this.data = arrayList;
    }

    public void setTags(ArrayList<String> arrayList) {
        this.tags = arrayList;
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setLayout(-1, -1);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        View inflate = layoutInflater.inflate(R.layout.dialog_spinner_dropdown, viewGroup);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recyclerTowns);
        recyclerView.setLayoutManager(new LinearLayoutManager(inflate.getContext(), 1, false));
        recyclerView.setAdapter(new SelectorDialogDropdownAdapter(this.data, this.tags, this.homeTag, new View.OnClickListener() {
            public final void onClick(View view) {
                SelectorDialog.this.lambda$onCreateView$0$SelectorDialog(view);
            }
        }));
        inflate.findViewById(R.id.textCancel).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                SelectorDialog.this.lambda$onCreateView$1$SelectorDialog(view);
            }
        });
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$SelectorDialog(View view) {
        this.clickListener.onClick(view);
        dismiss();
    }

    public /* synthetic */ void lambda$onCreateView$1$SelectorDialog(View view) {
        dismiss();
    }

    public void setHomeTag(String str) {
        this.homeTag = str;
    }
}
