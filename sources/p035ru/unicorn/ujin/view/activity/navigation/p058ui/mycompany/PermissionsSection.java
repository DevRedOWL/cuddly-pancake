package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;
import com.kyleduo.switchbutton.SwitchButton;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentPermissions;
import p046io.reactivex.Flowable;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.PermissionsSection */
public class PermissionsSection extends MultiSection<RentPermissions, ViewHolder> implements CompoundButton.OnCheckedChangeListener {
    private boolean isDirector;
    private boolean isMe;
    PublishProcessor<List<String>> keysPermishions = PublishProcessor.create();

    static /* synthetic */ Iterable lambda$onCheckedChanged$0(List list) throws Exception {
        return list;
    }

    public int getLayoutId() {
        return R.layout.item_permissions;
    }

    public PublishProcessor<List<String>> getKeysPermishions() {
        return this.keysPermishions;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ViewHolder viewHolder = (ViewHolder) compoundButton.getTag();
        if (viewHolder != null) {
            RentPermissions rentPermissions = (RentPermissions) getData(getAdapterPositionForViewHolder(viewHolder));
            rentPermissions.setValue(z);
            if (!rentPermissions.getPermissionKey().equals(RentPermissions.MANAGE_EMPLOYEES) || !this.isMe) {
                Flowable.just(getData()).flatMapIterable($$Lambda$PermissionsSection$pkzNb9xE4t31VNJfhK6BmlDLhAc.INSTANCE).filter($$Lambda$I054DiVLb1QQdfLpcHT4wgL7UQM.INSTANCE).map($$Lambda$VMVfIrki1N6nRZYKNFp9iMCqM.INSTANCE).toList().toFlowable().subscribe(new Consumer() {
                    public final void accept(Object obj) {
                        PermissionsSection.this.lambda$onCheckedChanged$1$PermissionsSection((List) obj);
                    }
                });
                return;
            }
            onManageEmployeesChecked(compoundButton.getContext());
            compoundButton.setChecked(true);
        }
    }

    public /* synthetic */ void lambda$onCheckedChanged$1$PermissionsSection(List list) throws Exception {
        getKeysPermishions().onNext(list);
    }

    private void onManageEmployeesChecked(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage((CharSequence) context.getResources().getString(R.string.label_manage_employees_error)).setPositiveButton((CharSequence) context.getResources().getString(R.string.button_OK), (DialogInterface.OnClickListener) $$Lambda$PermissionsSection$r0CK1aKEbBPG849t1BbfqA1NJs.INSTANCE);
        builder.show();
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, RentPermissions rentPermissions, int i, List<Object> list) {
        viewHolder.switchButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        viewHolder.switchButton.setChecked(rentPermissions.isValue());
        viewHolder.title.setText(rentPermissions.getPermissionTitle());
        if (this.isDirector) {
            viewHolder.switchButton.setOnCheckedChangeListener(this);
            return;
        }
        viewHolder.switchButton.setEnabled(false);
        viewHolder.switchButton.setFocusable(false);
    }

    public void setIsDirector(boolean z) {
        this.isDirector = z;
    }

    public void setIsMe(boolean z) {
        this.isMe = z;
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.PermissionsSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        SwitchButton switchButton;
        TextView title;

        public ViewHolder(View view, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.switchButton = (SwitchButton) view.findViewById(R.id.swich);
            this.switchButton.setOnCheckedChangeListener(onCheckedChangeListener);
            this.switchButton.setTag(this);
        }
    }
}
