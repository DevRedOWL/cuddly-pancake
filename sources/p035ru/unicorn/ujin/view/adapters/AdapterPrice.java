package p035ru.unicorn.ujin.view.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Price;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.view.adapters.AdapterPrice */
public class AdapterPrice extends BaseAdapter {
    private LayoutInflater mLayoutInflater;
    private RealmList<Price> mListItems;

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    public AdapterPrice(Context context, RealmList<Price> realmList) {
        this.mListItems = realmList;
        this.mLayoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public int getCount() {
        return this.mListItems.size();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = this.mLayoutInflater.inflate(R.layout.adapter_price, (ViewGroup) null);
        Price price = this.mListItems.get(i);
        ((TextView) inflate.findViewById(R.id.TextView_Title_ID)).setText(price.getTitle());
        ((TextView) inflate.findViewById(R.id.TextView_Text_ID)).setText(price.getText());
        ((TextView) inflate.findViewById(R.id.textView_Count_ID)).setText(price.getCountText());
        return inflate;
    }
}
