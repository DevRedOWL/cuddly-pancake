package org.linphone.assistant;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import org.linphone.C5321R;
import org.linphone.assistant.AssistantActivity;
import org.linphone.core.DialPlan;

public class CountryListFragment extends Fragment implements AdapterView.OnItemClickListener, View.OnClickListener {
    /* access modifiers changed from: private */
    public AssistantActivity.CountryListAdapter adapter;
    private ImageView clearSearchField;
    private ListView list;
    private EditText search;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5321R.layout.assistant_country_list, viewGroup, false);
        this.adapter = AssistantActivity.instance().getCountryListAdapter();
        this.adapter.setInflater(layoutInflater);
        this.search = (EditText) inflate.findViewById(C5321R.C5324id.search_country);
        this.clearSearchField = (ImageView) inflate.findViewById(C5321R.C5324id.clearSearchField);
        this.clearSearchField.setOnClickListener(this);
        this.list = (ListView) inflate.findViewById(C5321R.C5324id.countryList);
        this.list.setAdapter(this.adapter);
        this.list.setOnItemClickListener(this);
        this.search.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                CountryListFragment.this.adapter.getFilter().filter(charSequence);
            }
        });
        this.search.setText("");
        return inflate;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        AssistantActivity.instance().country = (DialPlan) view.getTag();
        AssistantActivity.instance().onBackPressed();
    }

    public void onClick(View view) {
        if (view.getId() == C5321R.C5324id.clearSearchField) {
            this.search.setText("");
        }
    }
}
