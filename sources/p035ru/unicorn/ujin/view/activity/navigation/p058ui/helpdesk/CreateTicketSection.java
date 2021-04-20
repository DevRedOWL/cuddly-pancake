package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.CreateTicketSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.MorionTicketFragment;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.CreateTicketSection */
public class CreateTicketSection extends SingleSection<SomeString, ViewHolder> implements View.OnClickListener {
    private ArrayList<SomeString> fileList = new ArrayList<>();
    private PublishProcessor<ServiceTicket> onClick = PublishProcessor.create();
    private PublishProcessor<String> onClickAddFile = PublishProcessor.create();
    private PublishProcessor<SomeString> onCloseFile = PublishProcessor.create();
    private String placeholderText = "";
    /* access modifiers changed from: private */
    public String text = "";
    /* access modifiers changed from: private */
    public String title = "";

    public int getLayoutId() {
        return R.layout.create_ticket_section;
    }

    public PublishProcessor<ServiceTicket> getOnClick() {
        return this.onClick;
    }

    public PublishProcessor<String> getOnClickAddFile() {
        return this.onClickAddFile;
    }

    public PublishProcessor<SomeString> getOnCloseFile() {
        return this.onCloseFile;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        int intValue;
        int id = view.getId();
        if (id == R.id.btn_add_file) {
            getOnClickAddFile().onNext("");
        } else if (id != R.id.btn_create_ticket) {
            if (id == R.id.close && (intValue = ((Integer) view.getTag(R.string.setup_key)).intValue()) > -1) {
                getOnCloseFile().onNext(getFileList().get(intValue));
            }
        } else if ((view.getTag() instanceof ViewHolder) && getLayoutPositionForViewHolder((ViewHolder) view.getTag()) == -1) {
        }
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, SomeString someString, List<Object> list) {
        String str;
        Map<String, Object> values = someString.getValues();
        if (values.containsKey(MorionTicketFragment.TEXT) && (str = (String) values.get(MorionTicketFragment.TEXT)) != null && !str.isEmpty()) {
            viewHolder.text.setText(str);
            this.text = str;
        }
        viewHolder.text.addTextChangedListener(new TextChangedListener<EditText>(viewHolder.text) {
            public void onTextChanged(EditText editText, Editable editable) {
                String unused = CreateTicketSection.this.text = editText.getText().toString();
            }
        });
        viewHolder.text.setOnFocusChangeListener(new View.OnFocusChangeListener(viewHolder) {
            private final /* synthetic */ CreateTicketSection.ViewHolder f$1;

            {
                this.f$1 = r2;
            }

            public final void onFocusChange(View view, boolean z) {
                CreateTicketSection.this.lambda$bindViewHolder$0$CreateTicketSection(this.f$1, view, z);
            }
        });
        if (someString.getSomeString().equals("rent")) {
            this.title = "Аренда помещения";
            viewHolder.title.setText(this.title);
            viewHolder.text.setFocusable(true);
            viewHolder.text.requestFocus();
        }
        if (values.containsKey("arg_title")) {
            String str2 = (String) values.get("arg_title");
            viewHolder.title.setText(str2);
            this.title = str2;
        }
        viewHolder.title.addTextChangedListener(new TextChangedListener<EditText>(viewHolder.title) {
            public void onTextChanged(EditText editText, Editable editable) {
                String unused = CreateTicketSection.this.title = editText.getText().toString();
            }
        });
    }

    public /* synthetic */ void lambda$bindViewHolder$0$CreateTicketSection(ViewHolder viewHolder, View view, boolean z) {
        if (!z || this.placeholderText.isEmpty()) {
            viewHolder.text.setHint("");
        } else {
            viewHolder.text.setHint(this.placeholderText);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.CreateTicketSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        EditText text;
        EditText title;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.title = (EditText) view.findViewById(R.id.et_title_ticket);
            this.text = (EditText) view.findViewById(R.id.et_text);
        }
    }

    public ArrayList<SomeString> getFileList() {
        return this.fileList;
    }

    public String getTicketText() {
        return this.text;
    }

    public String getTicketTitile() {
        return this.title;
    }

    public void setPlaceholderText(String str) {
        this.placeholderText = str;
    }
}
