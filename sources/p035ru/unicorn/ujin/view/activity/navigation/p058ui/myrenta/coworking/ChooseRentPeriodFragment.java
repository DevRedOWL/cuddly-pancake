package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.coworking;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingRoomFragment;
import p035ru.unicorn.ujin.view.customViews.CalendarView;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.coworking.ChooseRentPeriodFragment */
public class ChooseRentPeriodFragment extends BaseFragment {
    public static final String ARG_TYPE_ID = "arg_type_id";
    private CalendarView begin;
    private CalendarView end;
    private long finishDate;
    private long startDate;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_choose_coworking_dates;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    private ChooseRentPeriodFragment() {
    }

    public static ChooseRentPeriodFragment start(AbstractRentTicket abstractRentTicket) {
        ChooseRentPeriodFragment chooseRentPeriodFragment = new ChooseRentPeriodFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("rent", abstractRentTicket);
        chooseRentPeriodFragment.setArguments(bundle);
        return chooseRentPeriodFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.begin = (CalendarView) inflate.findViewById(R.id.start);
        this.end = (CalendarView) inflate.findViewById(R.id.finish);
        this.begin.setTitle("Дата начала аренды");
        this.end.setTitle("Дата конца аренды");
        this.begin.setiDateChanger(new CalendarView.IDateChanger() {
            public final void onDateChanged(long j) {
                ChooseRentPeriodFragment.this.lambda$onCreateView$0$ChooseRentPeriodFragment(j);
            }
        });
        this.end.setiDateChanger(new CalendarView.IDateChanger() {
            public final void onDateChanged(long j) {
                ChooseRentPeriodFragment.this.lambda$onCreateView$1$ChooseRentPeriodFragment(j);
            }
        });
        Calendar instance = Calendar.getInstance(Locale.getDefault());
        this.begin.setStartDate(instance.getTimeInMillis());
        this.begin.setMinDate(instance.getTimeInMillis());
        instance.add(6, 1);
        this.end.setStartDate(instance.getTimeInMillis());
        this.end.setMinDate(instance.getTimeInMillis());
        instance.add(1, 2);
        this.begin.setMaxYear(instance.get(1));
        this.end.setMaxYear(instance.get(1));
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$ChooseRentPeriodFragment(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j * 1000));
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        this.startDate = instance.getTimeInMillis() / 1000;
    }

    public /* synthetic */ void lambda$onCreateView$1$ChooseRentPeriodFragment(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j * 1000));
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(13, 59);
        this.finishDate = instance.getTimeInMillis() / 1000;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle("Коворкинг");
        getBaseActivity().setToolbarRight(createText());
    }

    private ArrayList<View> createText() {
        ArrayList<View> arrayList = new ArrayList<>();
        TextView textView = new TextView(getActivity());
        textView.setText(getString(R.string.next));
        textView.setTextColor(ContextCompat.getColor(getActivity(), R.color.colorAccent));
        textView.setTextSize(17.0f);
        textView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ChooseRentPeriodFragment.this.lambda$createText$2$ChooseRentPeriodFragment(view);
            }
        });
        arrayList.add(textView);
        return arrayList;
    }

    public /* synthetic */ void lambda$createText$2$ChooseRentPeriodFragment(View view) {
        showCoworkingList();
    }

    private void showCoworkingList() {
        getArguments().getInt(ARG_TYPE_ID);
        if (this.startDate > this.finishDate) {
            DialogHelper.showDialog((Context) getActivity(), "Начальная дата не может быть меньше, чем конечная дата");
            return;
        }
        AbstractRentTicket abstractRentTicket = (AbstractRentTicket) getArguments().getParcelable("rent");
        abstractRentTicket.setStartDate(DateUtils.formatDateYYYYMMDD_HH_mm(this.startDate * 1000));
        abstractRentTicket.setFinishDate(DateUtils.formatDateYYYYMMDD_HH_mm(this.finishDate * 1000));
        nextFragment(TalkingRoomFragment.start(abstractRentTicket), false);
    }
}
