package p035ru.unicorn.ujin.view.fragments;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.Constants;
import p035ru.unicorn.ujin.data.developerPage.CarouselPhoto;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.ApartmentState;
import p035ru.unicorn.ujin.data.realm.Flat;
import p035ru.unicorn.ujin.data.realm.Pamyatka;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p035ru.unicorn.ujin.data.realm.profile.ApartmentRequest;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.UrlCarouselViewActivity;
import p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage;
import p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity;
import p035ru.unicorn.ujin.view.adapters.FlatInfoAdapter;
import p035ru.unicorn.ujin.view.fragments.dynamic.DynamicFragment;
import p035ru.unicorn.ujin.view.fragments.mortgage.MortgagePagerFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.AcceptanceDatesEvent;
import p035ru.unicorn.ujin.viewModel.events.AcceptanceStateEvent;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p035ru.unicorn.ujin.viewModel.events.UpdateFavouriteEvent;

/* renamed from: ru.unicorn.ujin.view.fragments.FlatFragment */
public class FlatFragment extends BaseFragment {
    private static final String ACCEPTANCE_DATE_FORMAT = "hh:mm dd.MM.yyyy";
    private static final String ACCEPTANCE_SCHEDULED = "accept_schedule";
    private static final String BACK_BUTTON = "backButton";
    public static final Integer BOOK = 1111;
    public static final Integer BOOK_VISIT = 12341;
    private static final String CURRENT_COMPLEX_ID = "currentComplexId";
    private static final String FLAT_ID = "flatId";
    private static final String FROM_3RD = "from3rd";
    private static final String OWN_FLAT = "ownFlat";
    private static final String READY_TO_ACCEPT = "accept_ready";
    private static final String SEARCH_POSITION = "searchPosition";
    public static final Integer VISIT = 2222;
    private boolean acceptanceDatesLoaded = false;
    private View acceptanceInfoView;
    private boolean acceptanceStateLoaded = false;
    private Boolean backButton = true;
    private int bookVisit = 0;
    private Button btnRentFlat;
    private Button btnScheduleTime;
    private Button btnSellFlat;
    private View buttonBook;
    private View buttonCall;
    private View buttonDemo;
    ImageButton buttonFavourite;
    private View buttonVisit;
    private String currentComplexId;
    /* access modifiers changed from: private */
    public Flat flat;
    public String flatId;
    private View flatLayout;
    private Boolean flatUpdated = false;
    private ImageView imageFlat;
    private ImageView ivAction;
    public boolean ownFlat;
    private ProfileLocalRepository profileLocalRepository;
    private ProgressBar progressBar;
    private RecyclerView recyclerFlatInfo;
    private Integer searchPosition;
    private TextView tvAcceptanceTitle;
    private TextView tvAddress;
    private TextView tvChangeAcceptance;
    private TextView tvNoInfo;
    private TextView tvPamyatka;
    private TextView tvPrice;
    private TextView tvPriceOld;
    private TextView tvStatus;
    private View view;

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public static FlatFragment newInstance(String str, boolean z, boolean z2, Boolean bool, Integer num, String str2) {
        FlatFragment flatFragment = new FlatFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(OWN_FLAT, z);
        bundle.putBoolean(FROM_3RD, z2);
        bundle.putString(FLAT_ID, str);
        bundle.putBoolean(BACK_BUTTON, bool.booleanValue());
        bundle.putString(CURRENT_COMPLEX_ID, str2);
        if (num != null) {
            bundle.putInt(SEARCH_POSITION, num.intValue());
        }
        flatFragment.setArguments(bundle);
        return flatFragment;
    }

    public static FlatFragment newInstance(String str, boolean z, Boolean bool, Integer num, String str2) {
        return newInstance(str, z, false, bool, num, str2);
    }

    public static FlatFragment newInstance(String str, boolean z, Boolean bool, Integer num) {
        return newInstance(str, z, false, bool, num, (String) null);
    }

    public static FlatFragment newInstance(String str, boolean z, boolean z2, Boolean bool) {
        return newInstance(str, z, false, bool, (Integer) null, (String) null);
    }

    public static FlatFragment newInstance(String str, boolean z, Boolean bool) {
        return newInstance(str, z, false, bool, (Integer) null, (String) null);
    }

    /* access modifiers changed from: protected */
    public void handleEvent(UpdateEvent updateEvent) {
        this.progressBar.setVisibility(8);
        this.flatUpdated = true;
        if (updateEvent.getSuccess()) {
            setVisibilityFlatInfo(true);
            showFlat();
            return;
        }
        setVisibilityFlatInfo(false);
    }

    private void setVisibilityFlatInfo(boolean z) {
        int i = 8;
        this.tvNoInfo.setVisibility(z ? 8 : 0);
        View view2 = this.flatLayout;
        if (z) {
            i = 0;
        }
        view2.setVisibility(i);
    }

    public void onResume() {
        super.onResume();
        if ((getBaseActivity() instanceof StageActivity) && ((StageActivity) getBaseActivity()).getAppStage() == AppStage.SMARTFLAT) {
            getBaseActivity().bottomNavigationOuterView.setVisibility(8);
            getBaseActivity().llBottomSheet.setVisibility(8);
            getBaseActivity().mainFrame.setPadding(0, 0, 0, 0);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.viewModel.getModelUpdateMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                FlatFragment.this.handleEvent((UpdateEvent) obj);
            }
        });
        this.viewModel.getFavouriteFlatUpdateMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                FlatFragment.this.handleUpdateFavouriteEvent((UpdateFavouriteEvent) obj);
            }
        });
        this.view = layoutInflater.inflate(R.layout.fragment_flat, viewGroup, false);
        this.flatId = getArguments().getString(FLAT_ID);
        this.ownFlat = getArguments().getBoolean(OWN_FLAT);
        this.backButton = Boolean.valueOf(getArguments().getBoolean(BACK_BUTTON));
        this.searchPosition = Integer.valueOf(getArguments().getInt(SEARCH_POSITION));
        this.currentComplexId = getArguments().getString(CURRENT_COMPLEX_ID);
        this.tvPrice = (TextView) this.view.findViewById(R.id.tvPrice);
        this.tvPriceOld = (TextView) this.view.findViewById(R.id.tvPriceOld);
        this.tvAddress = (TextView) this.view.findViewById(R.id.tvSubtitle);
        this.tvPamyatka = (TextView) this.view.findViewById(R.id.tvPamyatka);
        this.tvStatus = (TextView) this.view.findViewById(R.id.tvStatus);
        this.imageFlat = (ImageView) this.view.findViewById(R.id.imageView_flat_big_ID);
        this.ivAction = (ImageView) this.view.findViewById(R.id.ivAction);
        this.recyclerFlatInfo = (RecyclerView) this.view.findViewById(R.id.recyclerFlatInfo);
        this.recyclerFlatInfo.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        this.recyclerFlatInfo.setNestedScrollingEnabled(false);
        this.buttonBook = this.view.findViewById(R.id.button_book_ID);
        this.buttonVisit = this.view.findViewById(R.id.button_visit_ID);
        this.buttonCall = this.view.findViewById(R.id.buttonShowApartments);
        this.buttonCall.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                FlatFragment.this.lambda$onCreateView$0$FlatFragment(view);
            }
        });
        this.buttonDemo = this.view.findViewById(R.id.buttonDemo);
        if (!(getBaseActivity() instanceof StageActivity) || ((StageActivity) getBaseActivity()).getAppStage() != AppStage.SMARTFLAT) {
            this.buttonDemo.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    FlatFragment.this.lambda$onCreateView$1$FlatFragment(view);
                }
            });
        } else {
            this.buttonDemo.setVisibility(8);
        }
        this.btnScheduleTime = (Button) this.view.findViewById(R.id.schedule_acceptance_time);
        this.btnScheduleTime.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                FlatFragment.this.lambda$onCreateView$2$FlatFragment(view);
            }
        });
        this.acceptanceInfoView = this.view.findViewById(R.id.acceptance_info);
        this.tvAcceptanceTitle = (TextView) this.view.findViewById(R.id.acceptance_title);
        this.tvChangeAcceptance = (TextView) this.view.findViewById(R.id.change_acceptance);
        this.tvChangeAcceptance.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                FlatFragment.this.lambda$onCreateView$3$FlatFragment(view);
            }
        });
        this.tvNoInfo = (TextView) this.view.findViewById(R.id.tvNoInfoMessage);
        this.flatLayout = this.view.findViewById(R.id.flatLayout);
        this.btnSellFlat = (Button) this.view.findViewById(R.id.btnSellFlat);
        this.btnRentFlat = (Button) this.view.findViewById(R.id.btnRentFlat);
        this.progressBar = (ProgressBar) this.view.findViewById(R.id.progressBar);
        this.profileLocalRepository = ProfileLocalRepository.Companion.getInstance();
        this.flatLayout.setVisibility(8);
        this.buttonBook.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                FlatFragment.this.lambda$onCreateView$4$FlatFragment(view);
            }
        });
        this.buttonVisit.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                FlatFragment.this.lambda$onCreateView$5$FlatFragment(view);
            }
        });
        this.flatUpdated = false;
        if (this.ownFlat) {
            prepareOwnFlat();
        } else {
            prepareFlat();
        }
        return this.view;
    }

    public /* synthetic */ void lambda$onCreateView$0$FlatFragment(View view2) {
        String phoneNumber = this.flat.getPhoneNumber();
        startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + phoneNumber)));
    }

    public /* synthetic */ void lambda$onCreateView$1$FlatFragment(View view2) {
        demoClickListener();
    }

    public /* synthetic */ void lambda$onCreateView$2$FlatFragment(View view2) {
        getBaseActivity().showAcceptanceDateFragment();
    }

    public /* synthetic */ void lambda$onCreateView$3$FlatFragment(View view2) {
        getBaseActivity().showAcceptanceDateFragment();
    }

    public /* synthetic */ void lambda$onCreateView$4$FlatFragment(View view2) {
        if (getBaseActivity().flavor.getAppName().equals(Flavor.DADEVELOPMENT.getAppName())) {
            Flat flat2 = this.flat;
            if (flat2 != null && flat2.getUrl() != null) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.flat.getUrl())));
            }
        } else if (!(getBaseActivity() instanceof StageActivity)) {
            this.bookVisit = BOOK.intValue();
            showRegistrationRequiredAlert();
        } else if ((((StageActivity) getBaseActivity()).getAppStage() != AppStage.COMPLEX_CONSTRUCTION || this.profileLocalRepository.isDemo()) && (((StageActivity) getBaseActivity()).getAppStage() != AppStage.NEW_FLAT || !this.profileLocalRepository.isUserLoggedIn())) {
            this.bookVisit = BOOK.intValue();
            showRegistrationRequiredAlert();
        } else {
            this.viewModel.getRequestBookFlatMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
                public final void onChanged(Object obj) {
                    FlatFragment.this.handleBookFlatEvent((UpdateEvent) obj);
                }
            });
            if (StringUtils.isNotEmpty(this.flatId)) {
                this.viewModel.requestBookFlat(this.profileLocalRepository.getUserToken(), this.flatId);
            } else {
                getBaseActivity().showMessage((int) R.string.infoFlatError);
            }
        }
    }

    public /* synthetic */ void lambda$onCreateView$5$FlatFragment(View view2) {
        if (getBaseActivity().flavor.getAppName().equals(Flavor.DADEVELOPMENT.getAppName())) {
            nextFragment(DynamicFragment.newInstance(13, ToolbarButtons.BACK), false, BaseActivity.FRAGMENT_DYNAMIC);
        } else if (!(getBaseActivity() instanceof StageActivity)) {
            this.bookVisit = VISIT.intValue();
            showRegistrationRequiredAlert();
        } else if ((((StageActivity) getBaseActivity()).getAppStage() != AppStage.COMPLEX_CONSTRUCTION || this.profileLocalRepository.isDemo()) && (((StageActivity) getBaseActivity()).getAppStage() != AppStage.NEW_FLAT || !this.profileLocalRepository.isUserLoggedIn())) {
            this.bookVisit = VISIT.intValue();
            showRegistrationRequiredAlert();
        } else {
            this.viewModel.getRequestVisitFlatMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
                public final void onChanged(Object obj) {
                    FlatFragment.this.handleVisitFlatEvent((UpdateEvent) obj);
                }
            });
            if (StringUtils.isNotEmpty(this.flatId)) {
                this.viewModel.requestVisitFlat(this.profileLocalRepository.getUserToken(), this.flatId);
            } else {
                getBaseActivity().showMessage((int) R.string.infoFlatError);
            }
        }
    }

    private void showRegistrationRequiredAlert() {
        new AlertDialog.Builder(getContext()).setMessage((int) R.string.youNeedToLogIn).setPositiveButton((int) R.string.login, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                FlatFragment.this.lambda$showRegistrationRequiredAlert$6$FlatFragment(dialogInterface, i);
            }
        }).setNegativeButton((int) R.string.cancel, (DialogInterface.OnClickListener) $$Lambda$FlatFragment$RaAfRmxaBEm4giAJROtGKxHueoE.INSTANCE).show();
    }

    public /* synthetic */ void lambda$showRegistrationRequiredAlert$6$FlatFragment(DialogInterface dialogInterface, int i) {
        registerAndProceed();
    }

    private void registerAndProceed() {
        getBaseActivity().showRegistrationActivity(BOOK_VISIT);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != BOOK_VISIT.intValue() || i2 != 2002) {
            return;
        }
        if (this.bookVisit == BOOK.intValue()) {
            this.viewModel.getRequestBookFlatMutableLiveData().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    FlatFragment.this.handleBookFlatEvent((UpdateEvent) obj);
                }
            });
            this.viewModel.requestBookFlat(this.profileLocalRepository.getUserToken(), this.flatId);
            return;
        }
        this.viewModel.getRequestVisitFlatMutableLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                FlatFragment.this.handleVisitFlatEvent((UpdateEvent) obj);
            }
        });
        this.viewModel.requestVisitFlat(this.profileLocalRepository.getUserToken(), this.flatId);
    }

    private void getAcceptanceDates() {
        this.acceptanceDatesLoaded = false;
        this.viewModel.requestUpdateAcceptanceDates(this.profileLocalRepository.getUserToken());
        this.viewModel.getRequestAcceptanceDatesMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                FlatFragment.this.handleEvent((AcceptanceDatesEvent) obj);
            }
        });
    }

    private void getAcceptanceState() {
        this.acceptanceStateLoaded = false;
        this.viewModel.getAcceptanceState(this.profileLocalRepository.getUserToken());
        this.viewModel.getRequestAcceptanceStateMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                FlatFragment.this.handleEvent((AcceptanceStateEvent) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void handleEvent(AcceptanceDatesEvent acceptanceDatesEvent) {
        this.acceptanceDatesLoaded = true;
        if (acceptanceDatesEvent.getSuccess() && this.acceptanceStateLoaded && this.acceptanceDatesLoaded) {
            initAcceptanceButton();
        }
    }

    /* access modifiers changed from: private */
    public void handleEvent(AcceptanceStateEvent acceptanceStateEvent) {
        this.acceptanceStateLoaded = true;
        if (acceptanceStateEvent.getSuccess() && this.acceptanceStateLoaded && this.acceptanceDatesLoaded) {
            initAcceptanceButton();
        }
    }

    private void initAcceptanceButton() {
        Calendar parseDate;
        Flat flat2;
        ApartmentState apartmentState = this.viewModel.getApartmentState();
        boolean z = !this.viewModel.getAcceptanceDates().isEmpty();
        if (acceptanceEnabledForFlat(this.flatId) && apartmentState != null && apartmentState.getState() != null) {
            if (z && (flat2 = this.flat) != null) {
                Pamyatka pamyatka = flat2.getPamyatka();
                if (StringUtils.isAnyEmpty(pamyatka.getPamyatkaUrl(), pamyatka.getPamyatkaTitle())) {
                    this.tvPamyatka.setVisibility(8);
                } else {
                    this.tvPamyatka.setVisibility(0);
                    this.tvPamyatka.setText(this.flat.getPamyatka().getPamyatkaTitle());
                    this.tvPamyatka.setOnClickListener(new View.OnClickListener() {
                        public final void onClick(View view) {
                            FlatFragment.this.lambda$initAcceptanceButton$8$FlatFragment(view);
                        }
                    });
                }
                if (this.flat.getButtonTexts() != null) {
                    if (StringUtils.isNotEmpty(this.flat.getButtonTexts().getCallButtonText())) {
                        ((TextView) this.buttonCall.findViewById(R.id.tvCall)).setText(this.flat.getButtonTexts().getCallButtonText());
                        this.buttonCall.setVisibility(0);
                    }
                    this.btnScheduleTime.setText(this.flat.getButtonTexts().getAcceptanceButtonText());
                }
            }
            String state = apartmentState.getState();
            char c = 65535;
            int hashCode = state.hashCode();
            if (hashCode != -1987048532) {
                if (hashCode == 1540044782 && state.equals(ACCEPTANCE_SCHEDULED)) {
                    c = 1;
                }
            } else if (state.equals(READY_TO_ACCEPT)) {
                c = 0;
            }
            if (c != 0) {
                if (c == 1) {
                    if (apartmentState.getAcceptanceDate() == null && z) {
                        this.btnScheduleTime.setVisibility(0);
                    }
                    if (apartmentState.getAcceptanceDate() != null && (parseDate = DateUtils.parseDate(apartmentState.getAcceptanceDate(), ACCEPTANCE_DATE_FORMAT)) != null) {
                        boolean z2 = !DateUtils.isPastDate(parseDate) && !DateUtils.isSameDate(parseDate, Calendar.getInstance());
                        if (!DateUtils.isPastDate(parseDate)) {
                            this.acceptanceInfoView.setVisibility(0);
                            this.tvAcceptanceTitle.setText(getResources().getString(R.string.acceptanceInfo, new Object[]{apartmentState.getAcceptanceDate()}));
                        }
                        if (z2 && z) {
                            this.tvChangeAcceptance.setVisibility(0);
                        }
                    }
                }
            } else if (z) {
                this.btnScheduleTime.setVisibility(0);
            }
        }
    }

    public /* synthetic */ void lambda$initAcceptanceButton$8$FlatFragment(View view2) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.flat.getPamyatka().getPamyatkaUrl())));
    }

    public void onPause() {
        this.viewModel.getRequestAcceptanceDatesMutableLiveData().removeObservers(getViewLifecycleOwner());
        this.viewModel.getRequestAcceptanceStateMutableLiveData().removeObservers(getViewLifecycleOwner());
        super.onPause();
    }

    private boolean acceptanceEnabledForFlat(String str) {
        User user = this.profileLocalRepository.getUser();
        if (user.getApartmentList().size() == 0) {
            return false;
        }
        Iterator<Apartment> it = user.getApartmentList().iterator();
        while (it.hasNext()) {
            Apartment next = it.next();
            if (next.getUid().equals(str) && next.getAcceptingEnabled().intValue() == 1) {
                return true;
            }
        }
        return false;
    }

    private void hideAcceptanceInfo() {
        this.btnScheduleTime.setVisibility(8);
        this.acceptanceInfoView.setVisibility(8);
        this.tvChangeAcceptance.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public void handleBookFlatEvent(UpdateEvent updateEvent) {
        showMessage(updateEvent.getMessage());
    }

    /* access modifiers changed from: private */
    public void handleVisitFlatEvent(UpdateEvent updateEvent) {
        showMessage(updateEvent.getMessage());
    }

    /* access modifiers changed from: private */
    public void handleSellFlatEvent(UpdateEvent updateEvent) {
        this.progressBar.setVisibility(8);
        if (updateEvent.getSuccess()) {
            showMessage(getResources().getString(R.string.sell_success_message));
        } else {
            showMessage(updateEvent.getMessage());
        }
    }

    private void handleRentFlatEvent(UpdateEvent updateEvent) {
        this.progressBar.setVisibility(8);
        if (updateEvent.getSuccess()) {
            showMessage(getResources().getString(R.string.sell_success_message));
        } else {
            showMessage(updateEvent.getMessage());
        }
    }

    private void prepareOwnFlat() {
        this.buttonBook.setVisibility(8);
        this.buttonVisit.setVisibility(8);
        this.buttonCall.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) getResources().getDimension(R.dimen.flatActionButtonHeight)));
        this.buttonCall.setVisibility(8);
        this.tvPrice.setVisibility(8);
        this.btnSellFlat.setVisibility(8);
        this.btnRentFlat.setVisibility(8);
        showFlat();
        getFlat();
    }

    private void prepareFlat() {
        this.btnSellFlat.setVisibility(8);
        this.btnRentFlat.setVisibility(8);
        showToolbar();
        handleUpdateFavouriteEvent(new UpdateFavouriteEvent(true, "", this.flatId));
        showFlat();
        getFlat();
    }

    private void getFlat() {
        if (StringUtils.isNotEmpty(this.flatId)) {
            if (this.flat == null) {
                this.progressBar.setVisibility(0);
            }
            this.flatUpdated = false;
            this.viewModel.requestUpdateFlatById(this.profileLocalRepository.getUserToken(), this.flatId);
            return;
        }
        setVisibilityFlatInfo(false);
    }

    private void showFlat() {
        this.flat = this.viewModel.getFlatById(this.flatId);
        if (this.flat != null) {
            this.flatLayout.setVisibility(0);
            initAcceptanceButton();
            getBaseActivity().setTextTitle(this.flat.getComplexTitle());
            this.tvAddress.setText(StringUtils.isNotEmpty(this.flat.getAddress()) ? this.flat.getAddress() : this.flat.getComplexTitle());
            getActivity().setTitle(this.flat.getComplexTitle());
            StringBuffer stringBuffer = new StringBuffer(this.flat.getPrice().longValue() + "");
            int length = stringBuffer.length();
            if (length > 3) {
                stringBuffer.insert(length - 3, " ");
            }
            if (length > 6) {
                stringBuffer.insert(length - 6, " ");
            }
            TextView textView = this.tvPrice;
            textView.setText(stringBuffer.toString() + " ₽");
            if (StringUtils.isNotEmpty(this.flat.getPriceOld())) {
                StringBuffer stringBuffer2 = new StringBuffer(this.flat.getPriceOld());
                int length2 = stringBuffer2.length();
                if (length2 > 3) {
                    stringBuffer2.insert(length2 - 3, " ");
                }
                if (length2 > 6) {
                    stringBuffer2.insert(length2 - 6, " ");
                }
                TextView textView2 = this.tvPriceOld;
                textView2.setText(stringBuffer2.toString() + " ₽");
                this.tvPriceOld.setPaintFlags(this.tvPrice.getPaintFlags() | 16);
            }
            if (this.flat.getAction() != null && this.flat.getAction().booleanValue()) {
                this.ivAction.setVisibility(0);
            }
            if (this.flat.getFlatInfoList() != null) {
                this.recyclerFlatInfo.setAdapter(new FlatInfoAdapter(this.flat.getFlatInfoList()));
                int i = 0;
                while (true) {
                    if (i >= this.flat.getFlatInfoList().size()) {
                        break;
                    } else if (!this.flat.getFlatInfoList().get(i).getTitle().equals(ApartmentRequest.Consts.INSTANCE.getSTATUS()) || !this.flatUpdated.booleanValue()) {
                        i++;
                    } else if (this.flat.getFlatInfoList().get(i).getSquare().equals(ApartmentRequest.Consts.INSTANCE.getREJECTED())) {
                        this.tvStatus.setVisibility(0);
                        this.tvStatus.setText(R.string.statusRejected);
                    } else if (this.flat.getFlatInfoList().get(i).getSquare().equals(ApartmentRequest.Consts.INSTANCE.getON_UK())) {
                        this.tvStatus.setVisibility(0);
                        this.tvStatus.setText(R.string.statusOnProoving);
                    }
                }
            }
            if (this.flat.getImgBig().indexOf("clear.png") > 0) {
                this.imageFlat.setImageResource(R.drawable.empty_image);
            } else {
                if (this.flat.getImgBigBytes() != null) {
                    Glide.with((View) this.imageFlat).load(this.flat.getImgBigBytes()).into(this.imageFlat);
                }
                this.imageFlat.setVisibility(0);
                Glide.with((View) this.imageFlat).load(this.flat.getImgBig()).listener(new RequestListener<Drawable>() {
                    public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                        return false;
                    }

                    public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                        FlatFragment.this.viewModel.updateFlatBigPic(FlatFragment.this.flat, byteArrayOutputStream.toByteArray());
                        return false;
                    }
                }).into(this.imageFlat);
            }
            if (!this.ownFlat || !this.flat.getSellEnabled().booleanValue()) {
                this.btnSellFlat.setVisibility(8);
            } else {
                this.btnSellFlat.setVisibility(0);
                this.btnSellFlat.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        FlatFragment.this.lambda$showFlat$9$FlatFragment(view);
                    }
                });
            }
            if (!this.ownFlat || !this.flat.getRentEnabled().booleanValue()) {
                this.btnRentFlat.setVisibility(8);
            } else {
                this.btnRentFlat.setVisibility(0);
                this.btnRentFlat.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        FlatFragment.this.lambda$showFlat$10$FlatFragment(view);
                    }
                });
            }
            if (!this.ownFlat && this.flat.getComplexID() != null && !this.flat.getComplexID().isEmpty()) {
                getChildFragmentManager().beginTransaction().add((int) R.id.mortgageBlockFragment, (Fragment) MortgagePagerFragment.Companion.newInstance(this.flat.getComplexID(), false), "fragmentMortgagePager").commitAllowingStateLoss();
            }
        }
        this.imageFlat.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                FlatFragment.this.lambda$showFlat$11$FlatFragment(view);
            }
        });
        hideAcceptanceInfo();
        getAcceptanceState();
        getAcceptanceDates();
    }

    public /* synthetic */ void lambda$showFlat$9$FlatFragment(View view2) {
        this.progressBar.setVisibility(0);
        this.viewModel.getRequestSellFlatMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                FlatFragment.this.handleSellFlatEvent((UpdateEvent) obj);
            }
        });
        this.viewModel.requestSellFlat(this.profileLocalRepository.getUserToken(), this.flatId);
    }

    public /* synthetic */ void lambda$showFlat$10$FlatFragment(View view2) {
        this.progressBar.setVisibility(0);
        this.viewModel.getRequestRentFlatMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                FlatFragment.this.handleSellFlatEvent((UpdateEvent) obj);
            }
        });
        this.viewModel.requestRentFlat(this.profileLocalRepository.getUserToken(), this.flatId);
    }

    public /* synthetic */ void lambda$showFlat$11$FlatFragment(View view2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CarouselPhoto(this.flat.getImgBig(), "", ""));
        UrlCarouselViewActivity.start(getContext(), arrayList, (ArrayList<Integer>) null, this.flat.getAddress(), 0, false);
    }

    public void demoClickListener() {
        nextFragment(DemoHubFragment.newInstance(this.flat.getFlatsUID(), StringUtils.isBlank(this.currentComplexId) ? this.flat.getComplexID() : this.currentComplexId, this.flat.getFlatId()), false, BaseActivity.FRAGMENT_DEMO_HUB);
    }

    public void showToolbar() {
        Flat flat2 = this.flat;
        if (flat2 != null && StringUtils.isNotEmpty(flat2.getComplexTitle())) {
            getBaseActivity().setTextTitle(this.flat.getComplexTitle());
        }
        if (!this.ownFlat) {
            ArrayList arrayList = new ArrayList();
            this.buttonFavourite = (ImageButton) LayoutInflater.from(getContext()).inflate(R.layout.toolbar_button_24dp, getBaseActivity().llButtonsRight, false);
            this.buttonFavourite.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    FlatFragment.this.lambda$showToolbar$12$FlatFragment(view);
                }
            });
            Flat flat3 = this.flat;
            if (flat3 == null) {
                this.buttonFavourite.setImageResource(R.drawable.icon_favourite_off);
                this.buttonFavourite.setTag(Constants.NOT_FAVOURITE);
            } else if (flat3.getFavorites().intValue() == 1) {
                this.buttonFavourite.setImageResource(R.drawable.icon_favourite_on);
                this.buttonFavourite.setTag(Constants.FAVOURITE);
            } else {
                this.buttonFavourite.setImageResource(R.drawable.icon_favourite_off);
                this.buttonFavourite.setTag(Constants.NOT_FAVOURITE);
            }
            arrayList.add(this.buttonFavourite);
            getBaseActivity().setToolbarRight(arrayList);
        }
        if ((getBaseActivity() instanceof StageActivity) && ((StageActivity) getBaseActivity()).getAppStage() == AppStage.NEW_FLAT) {
            getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        } else if ((getBaseActivity() instanceof StageActivity) && ((StageActivity) getBaseActivity()).getAppStage() == AppStage.COMPLEX_CONSTRUCTION) {
            getBaseActivity().setToolbarLeft(ToolbarButtons.PROFILE);
        } else if ((getBaseActivity() instanceof StageActivity) && ((StageActivity) getBaseActivity()).getAppStage() == AppStage.SMARTFLAT) {
            getBaseActivity().hideBottomNavigation();
            getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        }
    }

    public /* synthetic */ void lambda$showToolbar$12$FlatFragment(View view2) {
        favouriteClickListener(this.flatId, this.buttonFavourite.getTag().toString());
    }

    private void favouriteClickListener(String str, String str2) {
        this.viewModel.requestUpdateFlatFavourite(this.profileLocalRepository.getUserToken(), str, !Constants.FAVOURITE.equals(str2), this.searchPosition.intValue());
    }

    /* access modifiers changed from: private */
    public void handleUpdateFavouriteEvent(UpdateFavouriteEvent updateFavouriteEvent) {
        if (this.ownFlat) {
            return;
        }
        if (updateFavouriteEvent.getSuccess()) {
            Flat flatById = this.viewModel.getFlatById(updateFavouriteEvent.getFlatId());
            if (flatById == null) {
                return;
            }
            if (flatById.getFavorites().intValue() == 1) {
                this.buttonFavourite.setImageResource(R.drawable.icon_favourite_on);
                this.buttonFavourite.setTag(Constants.FAVOURITE);
                return;
            }
            this.buttonFavourite.setImageResource(R.drawable.icon_favourite_off);
            this.buttonFavourite.setTag(Constants.NOT_FAVOURITE);
            return;
        }
        Toast.makeText(getContext(), updateFavouriteEvent.getMessage(), 1).show();
    }
}
