package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.MyRentaSection */
public class MyRentaSection extends MultiSection<RentInfo, ViewHolder> implements View.OnClickListener {
    private boolean canBeDeleted = true;
    private PublishProcessor<RentInfo> deleteClick = PublishProcessor.create();
    private PublishProcessor<RentInfo> manageClick = PublishProcessor.create();
    private boolean showProps = true;
    private boolean showTitle = true;
    private PublishProcessor<RentInfo> specialClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_my_renta;
    }

    public PublishProcessor<RentInfo> getSpecialClick() {
        return this.specialClick;
    }

    public PublishProcessor<RentInfo> deleteClick() {
        return this.deleteClick;
    }

    public PublishProcessor<RentInfo> manageClick() {
        return this.manageClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        int adapterPositionForViewHolder;
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null && (adapterPositionForViewHolder = getAdapterPositionForViewHolder(viewHolder)) != -1) {
            RentInfo rentInfo = (RentInfo) getData(adapterPositionForViewHolder);
            if (view.getId() == R.id.delete || view.getId() == R.id.deleteLayout) {
                this.deleteClick.onNext(rentInfo);
            } else if (view.getId() == R.id.personLayout || view.getId() == R.id.person || view.getId() == R.id.count) {
                this.manageClick.onNext(rentInfo);
            } else {
                this.specialClick.onNext(rentInfo);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bindViewHolder(p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaSection.ViewHolder r8, p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo r9, int r10, java.util.List<java.lang.Object> r11) {
        /*
            r7 = this;
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r11 = r9.getPropRenta()
            java.lang.String r11 = r11.getTitle()
            r10.append(r11)
            java.lang.String r11 = "   "
            r10.append(r11)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r11 = r9.getPropRenta()
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TypeRent r11 = r11.getTypeRent()
            java.lang.String r11 = r11.getDisplayName()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>(r10)
            android.widget.TextView r0 = r8.tvTitle
            android.content.Context r0 = r0.getContext()
            r1 = 2131231296(0x7f080240, float:1.807867E38)
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r0, r1)
            int r1 = r0.getIntrinsicWidth()
            double r1 = (double) r1
            r3 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r1 = r1 * r3
            int r1 = (int) r1
            int r2 = r0.getIntrinsicHeight()
            double r5 = (double) r2
            double r5 = r5 * r3
            int r2 = (int) r5
            r3 = 0
            r0.setBounds(r3, r3, r1, r2)
            ru.unicorn.ujin.view.customViews.CenteredImageSpan r1 = new ru.unicorn.ujin.view.customViews.CenteredImageSpan
            r1.<init>(r0)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r0 = r9.getPropRenta()
            java.lang.String r0 = r0.getTitle()
            int r0 = r10.indexOf(r0)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r2 = r9.getPropRenta()
            java.lang.String r2 = r2.getTitle()
            int r2 = r2.length()
            int r0 = r0 + r2
            int r0 = r0 + 1
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r2 = r9.getPropRenta()
            java.lang.String r2 = r2.getTitle()
            int r10 = r10.indexOf(r2)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r2 = r9.getPropRenta()
            java.lang.String r2 = r2.getTitle()
            int r2 = r2.length()
            int r10 = r10 + r2
            int r10 = r10 + 2
            r2 = 33
            r11.setSpan(r1, r0, r10, r2)
            android.widget.TextView r10 = r8.tvTitle
            r10.setText(r11)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r10 = r9.getPropRenta()
            if (r10 == 0) goto L_0x0140
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r10 = r9.getPropRenta()
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TypeRent r10 = r10.getTypeRent()
            if (r10 == 0) goto L_0x0140
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r10 = r9.getPropRenta()
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TypeRent r10 = r10.getTypeRent()
            java.lang.String r10 = r10.getName()
            if (r10 == 0) goto L_0x0140
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r10 = r9.getPropRenta()
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TypeRent r10 = r10.getTypeRent()
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = r9.realmGet$startDateHuman()
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            java.util.Calendar r11 = p035ru.unicorn.ujin.util.DateUtils.parseDate(r11, r0)
            java.lang.String r1 = r9.realmGet$finishDateHuman()
            java.util.Calendar r0 = p035ru.unicorn.ujin.util.DateUtils.parseDate(r1, r0)
            if (r11 == 0) goto L_0x0140
            if (r0 == 0) goto L_0x0140
            java.lang.String r1 = "meeting_room"
            boolean r1 = r10.equals(r1)
            java.lang.String r2 = " - "
            if (r1 != 0) goto L_0x0119
            java.lang.String r1 = "event_area"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x00eb
            goto L_0x0119
        L_0x00eb:
            java.lang.String r10 = p035ru.unicorn.ujin.util.DateUtils.formatDateFromCalendar(r11)
            java.lang.String r1 = p035ru.unicorn.ujin.util.DateUtils.formatDateFromCalendar(r0)
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x00fe
            java.lang.String r10 = p035ru.unicorn.ujin.util.DateUtils.formatDateFromCalendar(r11)
            goto L_0x0142
        L_0x00fe:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = p035ru.unicorn.ujin.util.DateUtils.formatDateFromCalendar(r11)
            r10.append(r11)
            r10.append(r2)
            java.lang.String r11 = p035ru.unicorn.ujin.util.DateUtils.formatDateFromCalendar(r0)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            goto L_0x0142
        L_0x0119:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = p035ru.unicorn.ujin.util.DateUtils.formatDateFromCalendar(r11)
            r10.append(r1)
            java.lang.String r1 = " "
            r10.append(r1)
            java.lang.String r11 = p035ru.unicorn.ujin.util.DateUtils.formatTimeFromCalendar(r11)
            r10.append(r11)
            r10.append(r2)
            java.lang.String r11 = p035ru.unicorn.ujin.util.DateUtils.formatTimeFromCalendar(r0)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            goto L_0x0142
        L_0x0140:
            java.lang.String r10 = ""
        L_0x0142:
            android.widget.TextView r11 = r8.tvPeriod
            r11.setText(r10)
            android.widget.TextView r10 = r8.tvCount
            int r11 = r9.getRentersCount()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r10.setText(r11)
            android.widget.ImageView r10 = r8.delete
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.ManagePermissions r11 = r9.getRentPermissions()
            boolean r11 = r11.isCanManage()
            r0 = 8
            if (r11 == 0) goto L_0x0163
            goto L_0x0165
        L_0x0163:
            r3 = 8
        L_0x0165:
            r10.setVisibility(r3)
            boolean r10 = r7.showProps
            if (r10 != 0) goto L_0x0180
            androidx.constraintlayout.widget.ConstraintLayout r10 = r8.personLayout
            r10.setVisibility(r0)
            android.widget.TextView r10 = r8.tvStatus
            r10.setVisibility(r0)
            android.widget.ImageView r10 = r8.ivDotStatus
            r10.setVisibility(r0)
            android.widget.ImageView r10 = r8.delete
            r10.setVisibility(r0)
        L_0x0180:
            boolean r10 = r7.canBeDeleted
            if (r10 != 0) goto L_0x0189
            android.widget.LinearLayout r10 = r8.deleteLayout
            r10.setVisibility(r0)
        L_0x0189:
            boolean r10 = r7.showTitle
            if (r10 != 0) goto L_0x0192
            android.widget.TextView r10 = r8.tvTitle
            r10.setVisibility(r0)
        L_0x0192:
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta r10 = r9.getStateRenta()
            if (r10 == 0) goto L_0x01da
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta r10 = r9.getStateRenta()
            java.lang.Integer r10 = r10.getId()
            if (r10 == 0) goto L_0x01da
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta r10 = r9.getStateRenta()
            java.lang.Integer r10 = r10.getId()
            java.lang.String r10 = r10.toString()
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentaTicketType r10 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentaTicketType.getByNumber(r10)
            if (r10 == 0) goto L_0x01da
            android.widget.ImageView r11 = r8.ivDotStatus
            android.widget.ImageView r0 = r8.ivDotStatus
            android.content.Context r0 = r0.getContext()
            int r1 = r10.getColor()
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            r11.setColorFilter(r0)
            android.widget.TextView r11 = r8.tvStatus
            android.widget.TextView r0 = r8.tvStatus
            android.content.Context r0 = r0.getContext()
            int r10 = r10.getColor()
            int r10 = androidx.core.content.ContextCompat.getColor(r0, r10)
            r11.setTextColor(r10)
        L_0x01da:
            android.widget.TextView r8 = r8.tvStatus
            java.lang.String r9 = r9.getStateDisplayName()
            r8.setText(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaSection.bindViewHolder(ru.unicorn.ujin.view.activity.navigation.ui.myrenta.MyRentaSection$ViewHolder, ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo, int, java.util.List):void");
    }

    public void setShowProps(boolean z) {
        this.showProps = z;
    }

    public void setDeleteVisibility(boolean z) {
        this.canBeDeleted = z;
    }

    public void setShowTitle(boolean z) {
        this.showTitle = z;
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.MyRentaSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView delete;
        LinearLayout deleteLayout;
        ImageView ivDotStatus;
        ImageView ivPerson;
        ConstraintLayout personLayout;
        TextView tvCount;
        TextView tvPeriod;
        TextView tvStatus;
        TextView tvTitle;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.tvPeriod = (TextView) view.findViewById(R.id.tvPeriod);
            this.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            this.tvStatus = (TextView) view.findViewById(R.id.tvStatus);
            this.ivDotStatus = (ImageView) view.findViewById(R.id.ivDotStatus);
            this.ivPerson = (ImageView) view.findViewById(R.id.person);
            this.tvCount = (TextView) view.findViewById(R.id.count);
            this.personLayout = (ConstraintLayout) view.findViewById(R.id.personLayout);
            this.deleteLayout = (LinearLayout) view.findViewById(R.id.deleteLayout);
            this.delete = (ImageView) view.findViewById(R.id.delete);
            view.setTag(this);
            view.setOnClickListener(onClickListener);
            this.delete.setTag(this);
            this.delete.setOnClickListener(onClickListener);
            this.deleteLayout.setTag(this);
            this.deleteLayout.setOnClickListener(onClickListener);
            this.personLayout.setTag(this);
            this.personLayout.setOnClickListener(onClickListener);
            this.ivPerson.setTag(this);
            this.ivPerson.setOnClickListener(onClickListener);
            this.tvCount.setTag(this);
            this.tvCount.setOnClickListener(onClickListener);
        }
    }
}
