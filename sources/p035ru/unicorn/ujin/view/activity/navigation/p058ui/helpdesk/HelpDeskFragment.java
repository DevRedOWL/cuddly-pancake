package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import com.obsez.android.lib.filechooser.ChooserDialog;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.alhazmy13.mediapicker.Image.ImagePicker;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.api.response.chats.FileUploadData;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.view.WrapContentLinearLayoutManager;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskFragment;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.HelpDeskFragment */
public class HelpDeskFragment extends BaseFragment implements View.OnClickListener {
    public static final int ACTIVE_TICKETS = 0;
    public static final int ARCHIVE_TICKETS = 5;
    public static final String ARG_STAGE = "arg_stage";
    public static final int ARG_STAGE_CREATE = 1;
    public static final int ARG_STAGE_LIST = 0;
    private static final String ARG_TICKET_ID = "arg_ticket_id";
    private static final int REQUEST_IMAGE_CAPTURE = 123;
    private AttachFileSection attachFileSection;
    /* access modifiers changed from: private */
    public Button btnNewTicket;
    private CreateTicketSection createTicketSection;
    private Intent data;
    private EmptySection emptySection;
    /* access modifiers changed from: private */
    public HelpDeskViewModel helpdeskViewModel;

    /* renamed from: pb */
    private ProgressBar f6777pb;

    /* renamed from: rv */
    private RecyclerView f6778rv;
    private SectionedAdapter sectionedAdapter;
    private TabLayout tabLayout;
    private TicketListSection ticketListSection;
    private String token;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_helpdesk;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public void onClick(View view) {
    }

    public static HelpDeskFragment start(int i) {
        HelpDeskFragment helpDeskFragment = new HelpDeskFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("arg_stage", i);
        helpDeskFragment.setArguments(bundle);
        return helpDeskFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6778rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6777pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.tabLayout = (TabLayout) inflate.findViewById(R.id.tab);
        this.btnNewTicket = (Button) inflate.findViewById(R.id.new_ticket);
        this.btnNewTicket.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                HelpDeskFragment.this.lambda$onCreateView$0$HelpDeskFragment(view);
            }
        });
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$HelpDeskFragment(View view) {
        addNewTicket();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.helpdeskViewModel = (HelpDeskViewModel) ViewModelProviders.m10of((Fragment) this).get(HelpDeskViewModel.class);
        this.helpdeskViewModel.getShowTabs().setValue(Boolean.valueOf(getArguments().getInt("arg_stage") == 0));
        this.helpdeskViewModel.getShowTabs().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                HelpDeskFragment.this.hideOrShowTabs((Boolean) obj);
            }
        });
        if (getArguments().getInt("arg_stage") == 0) {
            this.helpdeskViewModel.getTickets();
            this.helpdeskViewModel.getCurrentTab().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    HelpDeskFragment.this.filterTicket((Integer) obj);
                }
            });
        } else {
            this.helpdeskViewModel.getUploadFileSingleEvent().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    HelpDeskFragment.this.onUploadFile((Resource) obj);
                }
            });
            this.helpdeskViewModel.getLiveFileIdList().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    HelpDeskFragment.this.showAttachIcon((HashSet) obj);
                }
            });
        }
        initTabs();
        initAdapter();
    }

    /* access modifiers changed from: private */
    public void filterTicket(Integer num) {
        this.tabLayout.getTabAt(num.intValue()).select();
        this.helpdeskViewModel.getListMutableLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                HelpDeskFragment.this.showSeviceTickets((List) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void hideOrShowTabs(Boolean bool) {
        this.tabLayout.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    /* access modifiers changed from: private */
    public void showAttachIcon(Set<SomeString> set) {
        this.attachFileSection.setData(new ArrayList(set));
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.HelpDeskFragment$3 */
    static /* synthetic */ class C58403 {
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
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.LOADING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskFragment.C58403.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void onUploadFile(Resource<FileUploadData> resource) {
        if (resource != null) {
            int i = C58403.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6777pb.setVisibility(4);
            } else if (i == 2) {
                this.f6777pb.setVisibility(4);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            } else if (i == 3) {
                this.f6777pb.setVisibility(0);
            }
        }
    }

    private void initAdapter() {
        this.f6778rv.setLayoutManager(new WrapContentLinearLayoutManager(getActivity()));
        this.sectionedAdapter = new SectionedAdapter();
        this.f6778rv.setAdapter(this.sectionedAdapter);
        boolean z = getArguments().getInt("arg_stage") == 0;
        this.btnNewTicket.setVisibility(z ? 0 : 8);
        if (this.ticketListSection == null) {
            this.ticketListSection = new TicketListSection();
            this.ticketListSection.getOnClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    HelpDeskFragment.this.showTicketChat((ServiceTicket) obj);
                }
            });
            this.ticketListSection.show(z);
        }
        if (this.createTicketSection == null) {
            this.createTicketSection = new CreateTicketSection();
            this.createTicketSection.setData(new SomeString("create"));
            this.createTicketSection.show(!z);
            this.createTicketSection.getOnClickAddFile().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    HelpDeskFragment.this.onAddFileClick((String) obj);
                }
            });
            this.createTicketSection.getOnCloseFile().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    HelpDeskFragment.this.onDeleteAttach((SomeString) obj);
                }
            });
        }
        if (this.attachFileSection == null) {
            this.attachFileSection = new AttachFileSection();
            this.attachFileSection.getOnClickAddFile().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    HelpDeskFragment.this.onAddFileClick((String) obj);
                }
            });
            this.attachFileSection.getOnCloseFile().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    HelpDeskFragment.this.onDeleteAttach((SomeString) obj);
                }
            });
            this.attachFileSection.getOnClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    HelpDeskFragment.this.makeAction((String) obj);
                }
            });
            this.attachFileSection.show(!z);
        }
        if (this.emptySection == null) {
            this.emptySection = new EmptySection(false, 14);
            this.emptySection.setData(new SomeString(getString(R.string.empty_ticket_list)));
            this.emptySection.show(false);
        }
        this.sectionedAdapter.addSection(this.emptySection);
        this.sectionedAdapter.addSection(this.ticketListSection);
        this.sectionedAdapter.addSection(this.createTicketSection);
        this.sectionedAdapter.addSection(this.attachFileSection);
    }

    /* access modifiers changed from: private */
    public void showTicketChat(ServiceTicket serviceTicket) {
        nextFragment(ServiceTicketFragment.start(serviceTicket.getTicketId()), false);
    }

    /* access modifiers changed from: private */
    public void onDeleteAttach(SomeString someString) {
        this.helpdeskViewModel.removeFileById(someString);
    }

    /* access modifiers changed from: private */
    public void onAddFileClick(String str) {
        checkPermissions();
    }

    private void showFileChooser() {
        AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), getString(R.string.media_picker_what_to_attach));
        createDialogBuilder.setPositiveButton((int) R.string.media_picker_photo, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                HelpDeskFragment.this.lambda$showFileChooser$1$HelpDeskFragment(dialogInterface, i);
            }
        });
        createDialogBuilder.setNegativeButton((int) R.string.media_picker_file, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                HelpDeskFragment.this.lambda$showFileChooser$2$HelpDeskFragment(dialogInterface, i);
            }
        });
        createDialogBuilder.setNeutralButton((int) R.string.button_cancel, (DialogInterface.OnClickListener) $$Lambda$HelpDeskFragment$jrVyRpxMWqI02tuApNipC71oELg.INSTANCE);
        createDialogBuilder.create().show();
    }

    public /* synthetic */ void lambda$showFileChooser$1$HelpDeskFragment(DialogInterface dialogInterface, int i) {
        chooseFotoOrCameraDialog();
    }

    public /* synthetic */ void lambda$showFileChooser$2$HelpDeskFragment(DialogInterface dialogInterface, int i) {
        onPhotoChoose();
    }

    private void chooseFotoOrCameraDialog() {
        AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), getString(R.string.media_picker_attach_media_or_photo));
        createDialogBuilder.setPositiveButton((int) R.string.media_picker_camera, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                HelpDeskFragment.this.lambda$chooseFotoOrCameraDialog$4$HelpDeskFragment(dialogInterface, i);
            }
        });
        createDialogBuilder.setNegativeButton((int) R.string.media_picker_gallery, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                HelpDeskFragment.this.lambda$chooseFotoOrCameraDialog$5$HelpDeskFragment(dialogInterface, i);
            }
        });
        createDialogBuilder.setNeutralButton((int) R.string.button_cancel, (DialogInterface.OnClickListener) $$Lambda$HelpDeskFragment$73vrk5T1jZ25h7sI9HAQkgupwQ.INSTANCE);
        createDialogBuilder.create().show();
    }

    public /* synthetic */ void lambda$chooseFotoOrCameraDialog$4$HelpDeskFragment(DialogInterface dialogInterface, int i) {
        onCameraChoose();
    }

    public /* synthetic */ void lambda$chooseFotoOrCameraDialog$5$HelpDeskFragment(DialogInterface dialogInterface, int i) {
        onPhotoChoose();
    }

    private void onPhotoChoose() {
        new ChooserDialog((Activity) getBaseActivity()).withChosenListener(new ChooserDialog.Result() {
            public final void onChoosePath(String str, File file) {
                HelpDeskFragment.this.lambda$onPhotoChoose$7$HelpDeskFragment(str, file);
            }
        }).build().show();
    }

    public /* synthetic */ void lambda$onPhotoChoose$7$HelpDeskFragment(String str, File file) {
        this.helpdeskViewModel.addFileId(str);
    }

    private void onCameraChoose() {
        Dexter.withActivity(getActivity()).withPermission("android.permission.CAMERA").withListener(new PermissionListener() {
            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                HelpDeskFragment.this.makeFoto();
            }

            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
                AlertDialog.Builder builder = new AlertDialog.Builder(HelpDeskFragment.this.getActivity());
                builder.setMessage((CharSequence) HelpDeskFragment.this.getResources().getString(R.string.cameraRationaleError)).setPositiveButton((CharSequence) HelpDeskFragment.this.getResources().getString(R.string.button_OK), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        HelpDeskFragment.C58381.this.lambda$onPermissionDenied$0$HelpDeskFragment$1(dialogInterface, i);
                    }
                }).setNegativeButton((CharSequence) HelpDeskFragment.this.getResources().getString(R.string.button_CANCEL), (DialogInterface.OnClickListener) $$Lambda$HelpDeskFragment$1$GrcRDm9fNEHLhnvcepxo08gMVs.INSTANCE);
                builder.show().setCanceledOnTouchOutside(false);
            }

            public /* synthetic */ void lambda$onPermissionDenied$0$HelpDeskFragment$1(DialogInterface dialogInterface, int i) {
                HelpDeskFragment.this.showApplicationSettings();
            }

            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                AlertDialog.Builder builder = new AlertDialog.Builder(HelpDeskFragment.this.getActivity());
                builder.setMessage((CharSequence) HelpDeskFragment.this.getResources().getString(R.string.cameraRationaleError)).setPositiveButton((CharSequence) HelpDeskFragment.this.getResources().getString(R.string.button_OK), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        PermissionToken.this.continuePermissionRequest();
                    }
                }).setNegativeButton((CharSequence) HelpDeskFragment.this.getResources().getString(R.string.button_CANCEL), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        HelpDeskFragment.C58381.lambda$onPermissionRationaleShouldBeShown$3(PermissionToken.this, dialogInterface, i);
                    }
                });
                builder.show().setCanceledOnTouchOutside(false);
            }

            static /* synthetic */ void lambda$onPermissionRationaleShouldBeShown$3(PermissionToken permissionToken, DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                permissionToken.cancelPermissionRequest();
            }
        }).check();
    }

    /* access modifiers changed from: private */
    public void showApplicationSettings() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getActivity().getPackageName(), (String) null));
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    public void makeFoto() {
        startActivityForResult(new Intent("android.media.action.IMAGE_CAPTURE"), 123);
    }

    /* access modifiers changed from: private */
    public void makeAction(String str) {
        String ticketText = this.createTicketSection.getTicketText();
        String ticketTitile = this.createTicketSection.getTicketTitile();
        ProfileLocalRepository instance = ProfileLocalRepository.Companion.getInstance();
        instance.getUser().getApartmentList();
        if (instance.isDemo()) {
            DialogHelper.showDialog(getContext(), getBaseActivity().getResources().getString(R.string.demoFunctionNotAvailable));
        } else if (!ticketText.isEmpty() || !ticketTitile.isEmpty()) {
            this.helpdeskViewModel.updateTicket(ticketTitile, ticketText);
            this.helpdeskViewModel.getUpdateTicketSingleLiveEvent().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    HelpDeskFragment.this.onCreateResult((Resource) obj);
                }
            });
        } else {
            DialogHelper.showDialog(getContext(), getBaseActivity().getResources().getString(R.string.message_empty_field));
        }
    }

    /* access modifiers changed from: private */
    public void onCreateResult(Resource<ServiceTicket> resource) {
        if (resource != null) {
            int i = C58403.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6777pb.setVisibility(4);
                AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), getString(R.string.dialog_ticket_is_create));
                createDialogBuilder.setPositiveButton((CharSequence) getString(R.string.button_ok), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        HelpDeskFragment.this.lambda$onCreateResult$8$HelpDeskFragment(dialogInterface, i);
                    }
                });
                createDialogBuilder.create().show();
            } else if (i == 2) {
                this.f6777pb.setVisibility(4);
                AlertDialog.Builder createDialogBuilder2 = DialogHelper.createDialogBuilder(getActivity(), resource.getMessage());
                createDialogBuilder2.setPositiveButton((CharSequence) getString(R.string.button_ok), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        HelpDeskFragment.this.lambda$onCreateResult$9$HelpDeskFragment(dialogInterface, i);
                    }
                });
                createDialogBuilder2.create().show();
            } else if (i == 3) {
                this.f6777pb.setVisibility(0);
            }
        }
    }

    public /* synthetic */ void lambda$onCreateResult$8$HelpDeskFragment(DialogInterface dialogInterface, int i) {
        backFragment();
    }

    public /* synthetic */ void lambda$onCreateResult$9$HelpDeskFragment(DialogInterface dialogInterface, int i) {
        backFragment();
    }

    private void addNewTicket() {
        if ("kortros".equals(Flavor.KORTROS.getAppName())) {
            nextFragment(new CreateTicketFragment(), false);
        } else {
            nextFragment(start(1), false);
        }
    }

    /* access modifiers changed from: private */
    public void showSeviceTickets(List<ServiceTicket> list) {
        hideOrShowTabs(true);
        this.f6777pb.setVisibility(4);
        if (list.size() == 0) {
            this.emptySection.show(true);
        } else {
            this.emptySection.show(false);
        }
        this.ticketListSection.setData(ServiceTicket.filterData(list, this.helpdeskViewModel.getCurrentTab().getValue().intValue()));
        this.f6778rv.scrollToPosition(0);
    }

    private void getPhoto() {
        new ImagePicker.Builder(getActivity()).mode(ImagePicker.Mode.CAMERA_AND_GALLERY).compressLevel(ImagePicker.ComperesLevel.MEDIUM).directory(ImagePicker.Directory.DEFAULT).extension(ImagePicker.Extension.JPG).scale(600, 600).allowMultipleImages(false).enableDebuggingMode(true).build();
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        if (getArguments().getInt("arg_stage") == 0) {
            getBaseActivity().removeToolbarElevation();
        }
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.label_helpdesk));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 123) {
            attachFile(intent);
        }
    }

    private void checkPermissions() {
        if (ContextCompat.checkSelfPermission(getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            showFileChooser();
        } else {
            ActivityCompat.requestPermissions(getActivity(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 1100);
        }
    }

    private void attachFile(Intent intent) {
        this.helpdeskViewModel.addFileId(getRealPathFromURI(getImageUri(getActivity(), intent != null ? (Bitmap) intent.getExtras().get("data") : null)));
    }

    public Uri getImageUri(Context context, Bitmap bitmap) {
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new ByteArrayOutputStream());
        return Uri.parse(MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, "Title", (String) null));
    }

    public String getRealPathFromURI(Uri uri) {
        Cursor cursor = null;
        try {
            cursor = getActivity().getContentResolver().query(uri, new String[]{"_data"}, (String) null, (String[]) null, (String) null);
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
            cursor.moveToFirst();
            return cursor.getString(columnIndexOrThrow);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private void initTabs() {
        TabLayout tabLayout2 = this.tabLayout;
        tabLayout2.addTab(tabLayout2.newTab().setText((CharSequence) "Текущие заявки").setTag(0));
        TabLayout tabLayout3 = this.tabLayout;
        tabLayout3.addTab(tabLayout3.newTab().setText((CharSequence) "Архив").setTag(5));
        this.tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {
            public void onTabReselected(TabLayout.Tab tab) {
            }

            public void onTabUnselected(TabLayout.Tab tab) {
            }

            public void onTabSelected(TabLayout.Tab tab) {
                HelpDeskFragment.this.helpdeskViewModel.getCurrentTab().setValue(Integer.valueOf(tab.getPosition()));
                int intValue = Integer.valueOf(tab.getTag().toString()).intValue();
                if (intValue == 0) {
                    HelpDeskFragment.this.btnNewTicket.setVisibility(0);
                } else if (intValue == 5) {
                    HelpDeskFragment.this.btnNewTicket.setVisibility(8);
                }
            }
        });
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 1100) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                DialogHelper.showDialog((Context) getActivity(), "Отказано в доступе");
            } else {
                attachFile(this.data);
            }
        }
    }
}
