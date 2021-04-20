package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import javax.annotation.Nullable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.util.FileUtil;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.KolyaSuccesModel;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ButtonModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.DynamicButtonSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.IButtonData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.RentDetailsFragment;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.fragments.chats.ChatFragment;
import p035ru.unicorn.ujin.view.service.DownloadService;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketFragment */
public class ServiceTicketFragment extends BaseFragment implements View.OnClickListener {
    public static final int ACTION_CANCEL_ID = 2;
    public static final int ACTION_CONFIRM_ID = 1;
    public static final int ACTION_RETURN_ID = 0;
    private static final String ARG_TICKET_CHAT_ID = "arg_ticket_chat_id";
    private static final String ARG_TICKET_FROM_PUSH = "arg_ticket_from_push";
    private static final String ARG_TICKET_ID = "arg_ticket_id";
    public static final String TICKET_STATE_ID_CLOSE = "5";
    private DynamicButtonSection cancelTicket;
    private DynamicButtonSection chatButtonSection;
    private String chatId;
    private CommentsSection commentsSection;
    private DynamicButtonSection confirmTicket;
    private DownLoadSection downloadSection;
    private HelpDeskViewModel helpdeskViewModel;
    private boolean isCancel;
    private boolean isClosed;
    private boolean isReturn;
    private boolean openFromPush;

    /* renamed from: pb */
    private ProgressBar f6779pb;
    private DynamicButtonSection returnTicket;

    /* renamed from: rv */
    private RecyclerView f6780rv;
    private SectionedAdapter sectionedAdapter;
    private ServiceTicket serviceTicket;
    private UpdateTicketSection updateTicketSection;

    private String getMessageByActionId(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "Вы хотите отменить заявку?" : "Вы хотите подтвердить и закрыть заявку?" : "Вы хотите вернуть заявку в работу?";
    }

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_helpdesk_ticket;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public void onClick(View view) {
    }

    public static ServiceTicketFragment start(String str, String str2, Boolean bool) {
        ServiceTicketFragment serviceTicketFragment = new ServiceTicketFragment();
        Bundle bundle = new Bundle();
        bundle.putString("arg_ticket_id", str);
        bundle.putString(ARG_TICKET_CHAT_ID, str2);
        bundle.putBoolean("arg_ticket_from_push", bool.booleanValue());
        serviceTicketFragment.setArguments(bundle);
        return serviceTicketFragment;
    }

    public static ServiceTicketFragment start(String str) {
        return start(str, "", false);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6780rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6779pb = (ProgressBar) inflate.findViewById(R.id.pb);
        return inflate;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        String string = getArguments().getString("arg_ticket_id");
        this.openFromPush = getArguments().getBoolean("arg_ticket_from_push", false);
        this.chatId = getArguments().getString(ARG_TICKET_CHAT_ID);
        getArguments().remove("arg_ticket_from_push");
        initAdapter();
        this.helpdeskViewModel = (HelpDeskViewModel) ViewModelProviders.m10of((Fragment) this).get(HelpDeskViewModel.class);
        this.helpdeskViewModel.getTicketsByTicketId(string);
        this.helpdeskViewModel.getTicketMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                ServiceTicketFragment.this.showSeviceTicket((Resource) obj);
            }
        });
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketFragment$2 */
    static /* synthetic */ class C58422 {
        static final /* synthetic */ int[] $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status = new int[Resource.Status.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                ru.unicorn.ujin.data.realm.Resource$Status[] r0 = p035ru.unicorn.ujin.data.realm.Resource.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status = r0
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x0014 }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.LOADING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.SUCCESS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.ERROR     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketFragment.C58422.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showSeviceTicket(Resource<ServiceTicket> resource) {
        if (resource != null) {
            int i = C58422.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6779pb.setVisibility(0);
            } else if (i == 2) {
                this.serviceTicket = resource.getData();
                if (!this.openFromPush || (Integer.valueOf(this.serviceTicket.getTicketStateId()).intValue() != 9 && !StringUtils.isNotBlank(this.chatId))) {
                    this.f6779pb.setVisibility(8);
                    this.serviceTicket.setTicketId(getArguments().getString("arg_ticket_id"));
                    addTicketActionIfNedeeded(this.serviceTicket);
                    RealmList<ServiceFile> fileList = this.serviceTicket.getFileList();
                    if (fileList == null || fileList.size() <= 0) {
                        this.downloadSection.show(false);
                    } else {
                        this.downloadSection.show(true);
                        this.downloadSection.setData(this.serviceTicket.getFileList());
                        this.updateTicketSection.setHasFiles(true);
                    }
                    this.updateTicketSection.setData(resource.getData());
                    return;
                }
                openChat(this.serviceTicket);
            } else if (i == 3) {
                this.f6779pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    private void addTicketActionIfNedeeded(ServiceTicket serviceTicket2) {
        if (serviceTicket2.getTicketStateId().equals("0") || serviceTicket2.getTicketStateTitle().toLowerCase().equals("новая")) {
            this.returnTicket.setData(new ButtonModel(getString(R.string.button_cancel_ticket)));
            this.returnTicket.getSomeAction().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    ServiceTicketFragment.this.lambda$addTicketActionIfNedeeded$0$ServiceTicketFragment((IButtonData) obj);
                }
            });
        } else if (serviceTicket2.getTicketStateId().equals("5") || serviceTicket2.getTicketStateTitle().toLowerCase().equals(getString(R.string.closed_ticket_status))) {
            createButtonForChangeTicketState();
        }
    }

    public /* synthetic */ void lambda$addTicketActionIfNedeeded$0$ServiceTicketFragment(IButtonData iButtonData) throws Exception {
        makeTicketAction(2, getTicketId());
    }

    private void createButtonForChat() {
        this.chatButtonSection.setData(new ButtonModel("Перейти в чат"));
        this.chatButtonSection.getSomeAction().firstElement().subscribe(new Consumer() {
            public final void accept(Object obj) {
                ServiceTicketFragment.this.lambda$createButtonForChat$1$ServiceTicketFragment((IButtonData) obj);
            }
        });
    }

    public /* synthetic */ void lambda$createButtonForChat$1$ServiceTicketFragment(IButtonData iButtonData) throws Exception {
        openChat(this.serviceTicket);
    }

    private void createButtonForChangeTicketState() {
        this.returnTicket.setData(new ButtonModel("Вернуть в работу"));
        this.returnTicket.getSomeAction().subscribe(new Consumer() {
            public final void accept(Object obj) {
                ServiceTicketFragment.this.lambda$createButtonForChangeTicketState$2$ServiceTicketFragment((IButtonData) obj);
            }
        });
        this.confirmTicket.setData(new ButtonModel("Подтвердить выполнение"));
        this.confirmTicket.getSomeAction().subscribe(new Consumer() {
            public final void accept(Object obj) {
                ServiceTicketFragment.this.lambda$createButtonForChangeTicketState$3$ServiceTicketFragment((IButtonData) obj);
            }
        });
    }

    public /* synthetic */ void lambda$createButtonForChangeTicketState$2$ServiceTicketFragment(IButtonData iButtonData) throws Exception {
        makeTicketAction(0, getTicketId());
    }

    public /* synthetic */ void lambda$createButtonForChangeTicketState$3$ServiceTicketFragment(IButtonData iButtonData) throws Exception {
        makeTicketAction(1, getTicketId());
    }

    private void makeTicketAction(int i, String str) {
        boolean z = false;
        this.isClosed = i == 1;
        this.isCancel = i == 2;
        if (i == 0) {
            z = true;
        }
        this.isReturn = z;
        new AlertDialog.Builder(getActivity()).setTitle((CharSequence) getString(R.string.title_attention)).setMessage((CharSequence) getMessageByActionId(i)).setPositiveButton((int) R.string.button_yes, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(i, str) {
            private final /* synthetic */ int f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                ServiceTicketFragment.this.lambda$makeTicketAction$4$ServiceTicketFragment(this.f$1, this.f$2, dialogInterface, i);
            }
        }).setNegativeButton((int) R.string.button_no, (DialogInterface.OnClickListener) $$Lambda$ServiceTicketFragment$WkkvjCcnMeiOAWV7Ucmt8wRPbk.INSTANCE).create().show();
    }

    public /* synthetic */ void lambda$makeTicketAction$4$ServiceTicketFragment(int i, String str, DialogInterface dialogInterface, int i2) {
        this.helpdeskViewModel.makeTicketAction(i, str);
        this.helpdeskViewModel.getOnMakeTicketActionLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                ServiceTicketFragment.this.onChangeTicketStatus((Resource) obj);
            }
        });
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    public void onChangeTicketStatus(Resource<KolyaSuccesModel> resource) {
        if (resource != null) {
            int i = C58422.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6779pb.setVisibility(0);
            } else if (i == 2) {
                this.f6779pb.setVisibility(8);
                if (this.isClosed) {
                    RateTicketDialog.newInstance(getTicketId(), new Function0() {
                        public final Object invoke() {
                            return ServiceTicketFragment.this.openChat();
                        }
                    }).show(getBaseActivity().getSupportFragmentManager(), "");
                } else if (this.isReturn) {
                    openChat(this.serviceTicket);
                    this.cancelTicket.show(false);
                    this.returnTicket.show(false);
                    this.confirmTicket.show(false);
                } else {
                    backFragment();
                }
            } else if (i == 3) {
                this.f6779pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    private void initAdapter() {
        this.f6780rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.sectionedAdapter = new SectionedAdapter();
        this.f6780rv.setAdapter(this.sectionedAdapter);
        if (this.updateTicketSection == null) {
            this.updateTicketSection = new UpdateTicketSection();
            this.updateTicketSection.getOnClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    ServiceTicketFragment.this.sendComment((ServiceTicket) obj);
                }
            });
            this.updateTicketSection.getOnGoChatClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    ServiceTicketFragment.this.openChat((ServiceTicket) obj);
                }
            });
            this.updateTicketSection.getOnEvaluateClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    ServiceTicketFragment.this.showRateTicketDialog((ServiceTicket) obj);
                }
            });
        }
        if (this.commentsSection == null) {
            this.commentsSection = new CommentsSection();
        }
        if (this.downloadSection == null) {
            this.downloadSection = new DownLoadSection();
            this.downloadSection.getOnClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    ServiceTicketFragment.this.onDownloadClick((ServiceFile) obj);
                }
            });
            this.downloadSection.show(false);
        }
        if (this.returnTicket == null) {
            this.returnTicket = new DynamicButtonSection();
        }
        if (this.confirmTicket == null) {
            this.confirmTicket = new DynamicButtonSection();
        }
        if (this.cancelTicket == null) {
            this.cancelTicket = new DynamicButtonSection();
        }
        if (this.chatButtonSection == null) {
            this.chatButtonSection = new DynamicButtonSection();
        }
        if (this.returnTicket == null) {
            this.returnTicket = new DynamicButtonSection();
        }
        if (this.confirmTicket == null) {
            this.confirmTicket = new DynamicButtonSection();
        }
        if (this.chatButtonSection == null) {
            this.chatButtonSection = new DynamicButtonSection();
        }
        this.sectionedAdapter.addSection(this.updateTicketSection);
        this.sectionedAdapter.addSection(this.downloadSection);
        this.sectionedAdapter.addSection(this.cancelTicket);
        this.sectionedAdapter.addSection(this.confirmTicket);
        this.sectionedAdapter.addSection(this.returnTicket);
        this.sectionedAdapter.addSection(this.chatButtonSection);
    }

    /* access modifiers changed from: private */
    public void showRateTicketDialog(ServiceTicket serviceTicket2) {
        RateTicketDialog.newInstance(serviceTicket2.getTicketId(), new Function0() {
            public final Object invoke() {
                return ServiceTicketFragment.this.openChat();
            }
        }).show(getBaseActivity().getSupportFragmentManager(), "");
    }

    /* access modifiers changed from: private */
    public Unit openChat() {
        openChat(this.serviceTicket);
        return null;
    }

    /* access modifiers changed from: private */
    public void onDownloadClick(final ServiceFile serviceFile) {
        Dexter.withActivity(getActivity()).withPermission("android.permission.WRITE_EXTERNAL_STORAGE").withListener(new PermissionListener() {
            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
            }

            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                serviceFile.getFileName();
                if (FileUtil.hasFileInFiolder(serviceFile.getFileName(), FileUtil.DOWNLOAD_PATH)) {
                    FileUtil.createFileNameIncremental(serviceFile.getFileName(), FileUtil.DOWNLOAD_PATH);
                }
                ServiceTicketFragment.this.startDownload(serviceFile);
            }

            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ServiceTicketFragment.this.getActivity());
                builder.setMessage((CharSequence) ServiceTicketFragment.this.getResources().getString(R.string.cameraRationaleError)).setPositiveButton((CharSequence) ServiceTicketFragment.this.getResources().getString(R.string.button_OK), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        PermissionToken.this.continuePermissionRequest();
                    }
                }).setNegativeButton((CharSequence) ServiceTicketFragment.this.getResources().getString(R.string.button_CANCEL), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ServiceTicketFragment.C58411.lambda$onPermissionRationaleShouldBeShown$1(PermissionToken.this, dialogInterface, i);
                    }
                });
                builder.show().setCanceledOnTouchOutside(false);
            }

            static /* synthetic */ void lambda$onPermissionRationaleShouldBeShown$1(PermissionToken permissionToken, DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                permissionToken.cancelPermissionRequest();
            }
        }).check();
    }

    /* access modifiers changed from: private */
    public void startDownload(ServiceFile serviceFile) {
        Intent intent = new Intent(getActivity(), DownloadService.class);
        intent.putExtra(DownloadService.ARG_URL, serviceFile.getFileUrl());
        intent.putExtra(DownloadService.ARG_FILE_NAME, serviceFile.getFileName());
        getActivity().startService(intent);
    }

    /* access modifiers changed from: private */
    public void sendComment(ServiceTicket serviceTicket2) {
        nextFragment(RentDetailsFragment.start(AbstractRentTicket.fromServiceTicket(AbstractRentTicket.createTicketByType(serviceTicket2.getObjectTypeName()), serviceTicket2)), false);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().removeToolbarElevation();
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.label_information));
    }

    /* access modifiers changed from: private */
    public void openChat(ServiceTicket serviceTicket2) {
        ProfileLocalRepository instance = ProfileLocalRepository.Companion.getInstance();
        if (StringUtils.isNotEmpty(serviceTicket2.getChatId())) {
            String chatId2 = serviceTicket2.getChatId();
            nextFragment(ChatFragment.newInstance(chatId2, instance.getUser().getId() + "", true), false, BaseActivity.FRAGMENT_CHAT);
            return;
        }
        Toast.makeText(getContext(), "Чата по заявке пока нет!", 1).show();
    }

    private String getTicketId() {
        return getArguments().getString("arg_ticket_id");
    }
}
