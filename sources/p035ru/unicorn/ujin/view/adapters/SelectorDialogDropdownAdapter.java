package p035ru.unicorn.ujin.view.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.view.adapters.SelectorDialogDropdownAdapter */
public class SelectorDialogDropdownAdapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<String> data;
    String homeTag = null;
    View.OnClickListener itemClickListener;
    ArrayList<String> tags = new ArrayList<>();

    public SelectorDialogDropdownAdapter(ArrayList<String> arrayList, ArrayList<String> arrayList2, String str, View.OnClickListener onClickListener) {
        this.data = arrayList;
        this.tags = arrayList2;
        this.homeTag = str;
        this.itemClickListener = onClickListener;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_town_spinner, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.bind(i);
    }

    public int getItemCount() {
        return this.data.size();
    }

    /* renamed from: ru.unicorn.ujin.view.adapters.SelectorDialogDropdownAdapter$ViewHolder */
    class ViewHolder extends RecyclerView.ViewHolder {
        ViewHolder(View view) {
            super(view);
        }

        /* access modifiers changed from: package-private */
        public void bind(int i) {
            ((TextView) this.itemView).setText(SelectorDialogDropdownAdapter.this.data.get(i));
            if (SelectorDialogDropdownAdapter.this.tags == null || SelectorDialogDropdownAdapter.this.tags.size() <= i) {
                this.itemView.setTag(Integer.valueOf(i));
            } else {
                String str = SelectorDialogDropdownAdapter.this.tags.get(i);
                this.itemView.setTag(str);
                if (str.equals(SelectorDialogDropdownAdapter.this.homeTag)) {
                    ((TextView) this.itemView).setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_home, 0, 0, 0);
                    ((TextView) this.itemView).setTextColor(this.itemView.getContext().getResources().getColor(R.color.brandMain));
                }
            }
            this.itemView.setOnClickListener(SelectorDialogDropdownAdapter.this.itemClickListener);
        }
    }
}
