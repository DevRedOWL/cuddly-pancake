package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my;

import android.app.DatePickerDialog;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.PopupMenu;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.redmadrobot.inputmask.MaskedTextChangedListener;
import com.redmadrobot.inputmask.helper.AffinityCalculationStrategy;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.FullProfileMapper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.MyProfileEditSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileEditFieldLabel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p035ru.unicorn.ujin.view.customViews.dynamic.DatePickerViewHolder;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.MyProfileEditSection */
public class MyProfileEditSection extends MultiSection<FullProfileMapper, ViewHolder> implements View.OnClickListener {
    private static String AFFINE_NUMBER_MASK = "[A] [000] [AA] [00]";
    private static String NUMBER_MASK = "[A] [000] [AA] [000]";
    private Calendar calendar;

    public int getLayoutId() {
        return R.layout.item_profile_my_edit;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, FullProfileMapper fullProfileMapper, int i, List<Object> list) {
        viewHolder.til.setHint((CharSequence) viewHolder.itemView.getResources().getString(ProfileEditFieldLabel.Companion.getLabel(fullProfileMapper.getField())));
        boolean z = false;
        viewHolder.textWatcher.setActive(false);
        if (fullProfileMapper.getField().equals(UserProfile.Fields.gender)) {
            viewHolder.f6845et.setText(FullProfileMapper.GENDER.getViewName(fullProfileMapper.getValue()));
        } else if (!fullProfileMapper.getField().equals(CardFragment.ARG_NUMBER) || fullProfileMapper.getValue().length() < 8) {
            viewHolder.f6845et.setText(fullProfileMapper.getValue());
        } else {
            String value = fullProfileMapper.getValue();
            viewHolder.f6845et.setText(value.substring(0, 1) + " " + value.substring(1, 4) + " " + value.substring(4, 6) + " " + value.substring(6));
        }
        if (fullProfileMapper.getField().equals(CardFragment.ARG_NUMBER)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(AFFINE_NUMBER_MASK);
            MaskedTextChangedListener.Companion.installOn(viewHolder.f6845et, NUMBER_MASK, arrayList, AffinityCalculationStrategy.WHOLE_STRING, new MaskedTextChangedListener.ValueListener(i) {
                private final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void onTextChanged(boolean z, String str, String str2) {
                    MyProfileEditSection.this.lambda$bindViewHolder$0$MyProfileEditSection(this.f$1, z, str, str2);
                }
            });
        }
        viewHolder.textWatcher.setPosition(i);
        viewHolder.textWatcher.setActive(true);
        View view = viewHolder.itemView;
        if (!fullProfileMapper.getField().equals(UserProfile.Fields.gender) && !fullProfileMapper.getField().equals(UserProfile.Fields.birthday)) {
            z = true;
        }
        setFocusability(view, viewHolder, z);
    }

    public /* synthetic */ void lambda$bindViewHolder$0$MyProfileEditSection(int i, boolean z, String str, String str2) {
        ((FullProfileMapper) getData(i)).setExtractedValue(str);
        onChanged(i, 0, (Object) null);
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        FullProfileMapper fullProfileMapper;
        Date formatDateFromString;
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null && (fullProfileMapper = (FullProfileMapper) getData(getAdapterPositionForViewHolder(viewHolder))) != null) {
            if (fullProfileMapper.getField().equals(UserProfile.Fields.gender)) {
                showGenderDialog(viewHolder, FullProfileMapper.GENDER.values());
            }
            if (fullProfileMapper.getField().equals(UserProfile.Fields.birthday)) {
                if (this.calendar == null) {
                    this.calendar = Calendar.getInstance();
                }
                if (!(viewHolder.f6845et.getText() == null || viewHolder.f6845et.getText().toString().isEmpty() || (formatDateFromString = DateUtils.formatDateFromString(viewHolder.f6845et.getText().toString())) == null)) {
                    this.calendar.setTime(formatDateFromString);
                }
                showDatePickerDialog(viewHolder);
            }
        }
    }

    private void setFocusability(View view, ViewHolder viewHolder, boolean z) {
        viewHolder.til.setFocusable(z);
        viewHolder.f6845et.setFocusable(z);
        view.setFocusable(z);
    }

    private void showGenderDialog(ViewHolder viewHolder, FullProfileMapper.GENDER[] genderArr) {
        PopupMenu popupMenu = new PopupMenu(viewHolder.f6845et.getContext(), viewHolder.til);
        for (int i = 0; i < genderArr.length; i++) {
            popupMenu.getMenu().add(i, R.id.menu, i, genderArr[i].getVal());
        }
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return MyProfileEditSection.ViewHolder.this.f6845et.setText(menuItem.getTitle());
            }
        });
        popupMenu.show();
    }

    private void showDatePickerDialog(ViewHolder viewHolder) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(viewHolder.f6845et.getContext(), R.style.YCalendar, new DatePickerDialog.OnDateSetListener(viewHolder) {
            private final /* synthetic */ MyProfileEditSection.ViewHolder f$1;

            {
                this.f$1 = r2;
            }

            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                MyProfileEditSection.this.lambda$showDatePickerDialog$2$MyProfileEditSection(this.f$1, datePicker, i, i2, i3);
            }
        }, this.calendar.get(1), this.calendar.get(2), this.calendar.get(5));
        datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
        datePickerDialog.show();
    }

    public /* synthetic */ void lambda$showDatePickerDialog$2$MyProfileEditSection(ViewHolder viewHolder, DatePicker datePicker, int i, int i2, int i3) {
        this.calendar.set(1, i);
        this.calendar.set(2, i2);
        this.calendar.set(5, i3);
        viewHolder.f6845et.setText(new SimpleDateFormat(DatePickerViewHolder.DATE_FORMAT, Locale.getDefault()).format(this.calendar.getTime()));
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.MyProfileEditSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: et */
        TextInputEditText f6845et;
        ProfileTextWatcher textWatcher;
        TextInputLayout til;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.til = (TextInputLayout) view.findViewById(R.id.til);
            this.f6845et = (TextInputEditText) view.findViewById(R.id.et);
            this.til.setTag(this);
            this.til.setOnClickListener(onClickListener);
            this.f6845et.setTag(this);
            this.f6845et.setOnClickListener(onClickListener);
            this.textWatcher = new ProfileTextWatcher();
            this.f6845et.addTextChangedListener(this.textWatcher);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.MyProfileEditSection$ProfileTextWatcher */
    class ProfileTextWatcher implements TextWatcher {
        private boolean isActive;
        private int position;

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        ProfileTextWatcher() {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.isActive) {
                ((FullProfileMapper) MyProfileEditSection.this.getData(this.position)).setValue(charSequence.toString());
                MyProfileEditSection.this.onChanged(this.position, 0, (Object) null);
            }
        }

        public void setPosition(int i) {
            this.position = i;
        }

        public void setActive(boolean z) {
            this.isActive = z;
        }
    }
}
