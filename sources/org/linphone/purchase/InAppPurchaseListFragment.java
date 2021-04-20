package org.linphone.purchase;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.List;
import org.linphone.C5321R;

public class InAppPurchaseListFragment extends Fragment implements AdapterView.OnItemClickListener {
    private ListView inappList;
    /* access modifiers changed from: private */
    public LayoutInflater mInflater;
    /* access modifiers changed from: private */
    public List<Purchasable> mPurchasableItems;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mInflater = layoutInflater;
        View inflate = layoutInflater.inflate(C5321R.layout.in_app_list, viewGroup, false);
        this.mPurchasableItems = InAppPurchaseActivity.instance().getPurchasedItems();
        this.inappList = (ListView) inflate.findViewById(C5321R.C5324id.inapp_list);
        if (this.mPurchasableItems != null) {
            this.inappList.setAdapter(new InAppListAdapter());
            this.inappList.setOnItemClickListener(this);
        }
        return inflate;
    }

    class InAppListAdapter extends BaseAdapter {
        public long getItemId(int i) {
            return (long) i;
        }

        InAppListAdapter() {
        }

        public int getCount() {
            return InAppPurchaseListFragment.this.mPurchasableItems.size();
        }

        public Object getItem(int i) {
            return InAppPurchaseListFragment.this.mPurchasableItems.get(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = InAppPurchaseListFragment.this.mInflater.inflate(C5321R.layout.in_app_purchase_item, viewGroup, false);
            }
            Purchasable purchasable = (Purchasable) InAppPurchaseListFragment.this.mPurchasableItems.get(i);
            ((TextView) view.findViewById(C5321R.C5324id.purchase_title)).setText(purchasable.getTitle());
            ((TextView) view.findViewById(C5321R.C5324id.purchase_description)).setText(purchasable.getDescription());
            ((TextView) view.findViewById(C5321R.C5324id.purchase_price)).setText(purchasable.getPrice());
            view.setTag(purchasable);
            return view;
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        InAppPurchaseActivity.instance().displayPurchase((Purchasable) view.getTag());
    }
}
