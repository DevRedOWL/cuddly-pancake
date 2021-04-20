package com.jaredrummler.materialspinner;

import android.content.Context;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.List;

final class MaterialSpinnerAdapterWrapper extends MaterialSpinnerBaseAdapter {
    private final ListAdapter listAdapter;

    public MaterialSpinnerAdapterWrapper(Context context, ListAdapter listAdapter2) {
        super(context);
        this.listAdapter = listAdapter2;
    }

    public int getCount() {
        int count = this.listAdapter.getCount();
        return (count == 1 || isHintEnabled()) ? count : count - 1;
    }

    public Object getItem(int i) {
        if (isHintEnabled()) {
            return this.listAdapter.getItem(i);
        }
        if (i < getSelectedIndex() || this.listAdapter.getCount() == 1) {
            return this.listAdapter.getItem(i);
        }
        return this.listAdapter.getItem(i + 1);
    }

    public Object get(int i) {
        return this.listAdapter.getItem(i);
    }

    public List<Object> getItems() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.listAdapter.getCount(); i++) {
            arrayList.add(this.listAdapter.getItem(i));
        }
        return arrayList;
    }
}
