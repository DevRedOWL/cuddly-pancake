package p035ru.unicorn.ujin.view.adapters;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.FlatInfo;
import p035ru.unicorn.ujin.data.realm.profile.ApartmentRequest;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.view.adapters.FlatInfoAdapter */
public class FlatInfoAdapter extends RecyclerView.Adapter<ViewHolder> {
    private RealmList<FlatInfo> data;

    public FlatInfoAdapter(RealmList<FlatInfo> realmList) {
        this.data = realmList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_flat_info, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.bind(this.data.get(i));
    }

    public int getItemCount() {
        return this.data.size();
    }

    /* renamed from: ru.unicorn.ujin.view.adapters.FlatInfoAdapter$ViewHolder */
    class ViewHolder extends RecyclerView.ViewHolder {
        ViewHolder(View view) {
            super(view);
        }

        /* access modifiers changed from: package-private */
        public void bind(FlatInfo flatInfo) {
            ((TextView) this.itemView.findViewById(R.id.textTitle)).setText(flatInfo.getTitle());
            ((TextView) this.itemView.findViewById(R.id.textValue)).setText(flatInfo.getSquare());
            if (!flatInfo.getTitle().equals(ApartmentRequest.Consts.INSTANCE.getSTATUS())) {
                return;
            }
            if (flatInfo.getSquare().equals(ApartmentRequest.Consts.INSTANCE.getREJECTED())) {
                ((TextView) this.itemView.findViewById(R.id.textValue)).setTextColor(Color.parseColor("#ff0000"));
            } else {
                ((TextView) this.itemView.findViewById(R.id.textValue)).setTextColor(this.itemView.getContext().getResources().getColor(R.color.brandMain));
            }
        }
    }
}
