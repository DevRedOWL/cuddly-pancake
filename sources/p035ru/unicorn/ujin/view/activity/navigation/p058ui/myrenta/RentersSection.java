package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.kyleduo.switchbutton.SwitchButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.TextUtils;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p046io.reactivex.processors.PublishProcessor;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentersSection */
class RentersSection extends MultiSection<UserProfile, ViewHolder> implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private boolean canManage;
    private RealmList<Renters> renters;
    PublishProcessor<List<Renters>> rentersPublishProcessor = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_profile_team_permission;
    }

    public void onClick(View view) {
    }

    RentersSection() {
    }

    public PublishProcessor<List<Renters>> getRentersPublishProcessor() {
        return this.rentersPublishProcessor;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, UserProfile userProfile, int i, List<Object> list) {
        String str;
        String str2;
        if (i == 0) {
            viewHolder.label.setText("Пригласить всех сотрудников");
            viewHolder.description.setVisibility(8);
            viewHolder.phone.setVisibility(8);
        } else {
            viewHolder.switchButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            viewHolder.switchButton.setCheckedImmediately(hasInRenters(userProfile.getUserdata().getId()));
            if (userProfile.getUserdata().getPhone() == null) {
                viewHolder.label.setText(TextUtils.formatPhoneNumber(userProfile.getUserdata().getPhone()));
                viewHolder.description.setVisibility(8);
                viewHolder.phone.setVisibility(8);
            } else {
                TextView textView = viewHolder.label;
                if (StringUtils.isBlank(userProfile.getUserdata().getFullname())) {
                    str = viewHolder.itemView.getResources().getString(R.string.undefined_name);
                } else {
                    str = userProfile.getUserdata().getFullname();
                }
                textView.setText(str);
                TextView textView2 = viewHolder.description;
                if (StringUtils.isBlank(userProfile.getUserdata().getPatronymic())) {
                    str2 = viewHolder.itemView.getResources().getString(R.string.undefined_position);
                } else {
                    str2 = userProfile.getPosition().getTitle();
                }
                textView2.setText(str2);
                viewHolder.phone.setText(TextUtils.formatPhoneNumber(userProfile.getUserdata().getPhone()));
                viewHolder.description.setVisibility(0);
                viewHolder.phone.setVisibility(0);
            }
        }
        if (this.canManage) {
            viewHolder.switchButton.setOnCheckedChangeListener(this);
            return;
        }
        viewHolder.switchButton.setEnabled(false);
        viewHolder.switchButton.setFocusable(false);
    }

    private boolean hasInRenters(Integer num) {
        try {
            if (this.renters != null) {
                if (!this.renters.isEmpty()) {
                    for (int i = 0; i < this.renters.size(); i++) {
                        if (this.renters.get(i).getUserdataId().equals(num)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public void setRenters(RealmList<Renters> realmList) {
        this.renters = realmList;
    }

    public void setCanManage(boolean z) {
        this.canManage = z;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ViewHolder viewHolder = (ViewHolder) compoundButton.getTag();
        if (viewHolder != null) {
            int adapterPositionForViewHolder = getAdapterPositionForViewHolder(viewHolder);
            if (adapterPositionForViewHolder != 0) {
                Renters renters2 = this.renters.get(0);
                Renters renters3 = new Renters();
                renters3.setId(renters2.getId());
                renters3.setRentId(renters2.getRentId());
                renters3.setUserdataId(((UserProfile) getData(adapterPositionForViewHolder)).getUserdata().getId());
                renters3.setAddRole(z);
                getRentersPublishProcessor().onNext(Collections.singletonList(renters3));
                return;
            }
            List data = getData();
            Renters renters4 = this.renters.get(0);
            ArrayList arrayList = new ArrayList();
            for (int i = 1; i < data.size(); i++) {
                Renters renters5 = new Renters();
                renters5.setId(renters4.getId());
                renters5.setRentId(renters4.getRentId());
                renters5.setUserdataId(((UserProfile) data.get(i)).getUserdata().getId());
                renters5.setAddRole(true);
                arrayList.add(renters5);
            }
            getRentersPublishProcessor().onNext(arrayList);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentersSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView description;
        TextView label;
        TextView phone;
        SwitchButton switchButton;

        public ViewHolder(View view, View.OnClickListener onClickListener, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            super(view);
            this.label = (TextView) view.findViewById(R.id.title);
            this.description = (TextView) view.findViewById(R.id.subtitle);
            this.phone = (TextView) view.findViewById(R.id.phone);
            this.switchButton = (SwitchButton) view.findViewById(R.id.arrow);
            this.switchButton.setTag(this);
            this.switchButton.setOnCheckedChangeListener(onCheckedChangeListener);
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }
    }
}
