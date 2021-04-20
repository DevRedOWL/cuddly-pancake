package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
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
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.api.response.chats.FileUploadData;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.util.FileUtil;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.CreateTicketFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TabLayoutSimple;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms.TitleSection;
import p035ru.unicorn.ujin.view.service.DownloadService;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.CreateTicketFragment */
public class CreateTicketFragment extends BaseSectionFragment<HelpDeskViewModel> {
    private static final int REQUEST_IMAGE_CAPTURE = 1230;
    public static final int REQUEST_READ_FILE = 1100;
    private AttachFileSection attachFileSection;
    private DownLoadSection downloadSection;
    private HelpDeskViewModel helpdeskViewModel;
    private TabLayout tabLayout;
    private CreateTicketSection textAndTitleSection;
    private TitleSection titleSection;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_base_with_tabs;
    }

    public void onCreateView(View view) {
        this.tabLayout = (TabLayout) view.findViewById(R.id.tab);
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        return getString(R.string.label_helpdesk);
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        if (this.titleSection == null) {
            this.titleSection = new TitleSection(false, 16);
            this.titleSection.setCustomLayout(R.layout.title_section_custom);
            this.titleSection.setData(new SomeString(getString(R.string.ticket_description)));
        }
        if (this.textAndTitleSection == null) {
            this.textAndTitleSection = new CreateTicketSection();
            this.textAndTitleSection.setData(new SomeString("sdf"));
            this.textAndTitleSection.setPlaceholderText(getResources().getString(R.string.service_ticket_text_placeholder));
        }
        if (this.attachFileSection == null) {
            this.attachFileSection = new AttachFileSection();
            this.attachFileSection.getOnClickAddFile().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CreateTicketFragment.this.onAddFileClick((String) obj);
                }
            });
            this.attachFileSection.getOnCloseFile().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CreateTicketFragment.this.onDeleteAttach((SomeString) obj);
                }
            });
            this.attachFileSection.getOnClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CreateTicketFragment.this.makeAction((String) obj);
                }
            });
        }
        if (this.downloadSection == null) {
            this.downloadSection = new DownLoadSection();
            this.downloadSection.getOnClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CreateTicketFragment.this.onDownloadClick((ServiceFile) obj);
                }
            });
            this.downloadSection.show(false);
        }
        this.sectionedAdapter.addSection(this.titleSection);
        this.sectionedAdapter.addSection(this.textAndTitleSection);
        this.sectionedAdapter.addSection(this.downloadSection);
        this.sectionedAdapter.addSection(this.attachFileSection);
    }

    public void onViewCreated(HelpDeskViewModel helpDeskViewModel) {
        helpDeskViewModel.getAvailableTypes();
        helpDeskViewModel.getTicketTypeList().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                CreateTicketFragment.this.initTabs((List) obj);
            }
        });
        this.helpdeskViewModel = (HelpDeskViewModel) ViewModelProviders.m10of((Fragment) this).get(HelpDeskViewModel.class);
        this.helpdeskViewModel.getUploadFileSingleEvent().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                CreateTicketFragment.this.onUploadFile((Resource) obj);
            }
        });
        this.helpdeskViewModel.getLiveFileIdList().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                CreateTicketFragment.this.showAttachIcon((HashSet) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void initTabs(List<ServiceTicketType> list) {
        if (this.tabLayout.getTabCount() == 0) {
            for (int i = 0; i < list.size(); i++) {
                String title = list.get(i).getTitle();
                TabLayout tabLayout2 = this.tabLayout;
                tabLayout2.addTab(tabLayout2.newTab().setText((CharSequence) title));
                if (i == 0) {
                    this.titleSection.setData(new SomeString(list.get(0).getDescription()));
                }
            }
        }
        this.tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayoutSimple(new TabLayoutSimple.TabSelectorSimple(list) {
            private final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void onTabSelect(TabLayout.Tab tab) {
                CreateTicketFragment.this.lambda$initTabs$0$CreateTicketFragment(this.f$1, tab);
            }
        }));
    }

    public /* synthetic */ void lambda$initTabs$0$CreateTicketFragment(List list, TabLayout.Tab tab) {
        this.titleSection.setData(new SomeString(((ServiceTicketType) list.get(tab.getPosition())).getDescription()));
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
                CreateTicketFragment.this.startDownload(serviceFile);
            }

            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CreateTicketFragment.this.getActivity());
                builder.setMessage((CharSequence) CreateTicketFragment.this.getResources().getString(R.string.cameraRationaleError)).setPositiveButton((CharSequence) CreateTicketFragment.this.getResources().getString(R.string.button_OK), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        PermissionToken.this.continuePermissionRequest();
                    }
                }).setNegativeButton((CharSequence) CreateTicketFragment.this.getResources().getString(R.string.button_CANCEL), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        CreateTicketFragment.C58331.lambda$onPermissionRationaleShouldBeShown$1(PermissionToken.this, dialogInterface, i);
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
    public void onAddFileClick(String str) {
        checkPermissions();
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

    private void showFileChooser() {
        AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), getString(R.string.media_picker_what_to_attach));
        createDialogBuilder.setPositiveButton((int) R.string.media_picker_photo, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                CreateTicketFragment.this.lambda$showFileChooser$1$CreateTicketFragment(dialogInterface, i);
            }
        });
        createDialogBuilder.setNegativeButton((int) R.string.media_picker_file, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                CreateTicketFragment.this.lambda$showFileChooser$2$CreateTicketFragment(dialogInterface, i);
            }
        });
        createDialogBuilder.setNeutralButton((int) R.string.button_cancel, (DialogInterface.OnClickListener) $$Lambda$CreateTicketFragment$qUuiJDSVjUqFWZZSQpg88YGEFGY.INSTANCE);
        createDialogBuilder.create().show();
    }

    public /* synthetic */ void lambda$showFileChooser$1$CreateTicketFragment(DialogInterface dialogInterface, int i) {
        chooseFotoOrCameraDialog();
    }

    public /* synthetic */ void lambda$showFileChooser$2$CreateTicketFragment(DialogInterface dialogInterface, int i) {
        onPhotoChoose();
    }

    private void chooseFotoOrCameraDialog() {
        AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), getString(R.string.media_picker_attach_media_or_photo));
        createDialogBuilder.setPositiveButton((int) R.string.media_picker_camera, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                CreateTicketFragment.this.lambda$chooseFotoOrCameraDialog$4$CreateTicketFragment(dialogInterface, i);
            }
        });
        createDialogBuilder.setNegativeButton((int) R.string.media_picker_gallery, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                CreateTicketFragment.this.lambda$chooseFotoOrCameraDialog$5$CreateTicketFragment(dialogInterface, i);
            }
        });
        createDialogBuilder.setNeutralButton((int) R.string.button_cancel, (DialogInterface.OnClickListener) $$Lambda$CreateTicketFragment$5IpBXdyUKrqZ13wjq11S2PTmI.INSTANCE);
        createDialogBuilder.create().show();
    }

    public /* synthetic */ void lambda$chooseFotoOrCameraDialog$4$CreateTicketFragment(DialogInterface dialogInterface, int i) {
        onCameraChoose();
    }

    public /* synthetic */ void lambda$chooseFotoOrCameraDialog$5$CreateTicketFragment(DialogInterface dialogInterface, int i) {
        onPhotoChoose();
    }

    private void onPhotoChoose() {
        new ChooserDialog((Activity) getBaseActivity()).withChosenListener(new ChooserDialog.Result() {
            public final void onChoosePath(String str, File file) {
                CreateTicketFragment.this.lambda$onPhotoChoose$7$CreateTicketFragment(str, file);
            }
        }).build().show();
    }

    public /* synthetic */ void lambda$onPhotoChoose$7$CreateTicketFragment(String str, File file) {
        this.helpdeskViewModel.addFileId(str);
    }

    private void onCameraChoose() {
        Dexter.withActivity(getActivity()).withPermission("android.permission.CAMERA").withListener(new PermissionListener() {
            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                CreateTicketFragment.this.makeFoto();
            }

            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CreateTicketFragment.this.getActivity());
                builder.setMessage((CharSequence) CreateTicketFragment.this.getResources().getString(R.string.cameraRationaleError)).setPositiveButton((CharSequence) CreateTicketFragment.this.getResources().getString(R.string.button_OK), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        CreateTicketFragment.C58342.this.lambda$onPermissionDenied$0$CreateTicketFragment$2(dialogInterface, i);
                    }
                }).setNegativeButton((CharSequence) CreateTicketFragment.this.getResources().getString(R.string.button_CANCEL), (DialogInterface.OnClickListener) $$Lambda$CreateTicketFragment$2$NY2CLRtgdO5GKOkzb8LuLBlVWdI.INSTANCE);
                builder.show().setCanceledOnTouchOutside(false);
            }

            public /* synthetic */ void lambda$onPermissionDenied$0$CreateTicketFragment$2(DialogInterface dialogInterface, int i) {
                CreateTicketFragment.this.showApplicationSettings();
            }

            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CreateTicketFragment.this.getActivity());
                builder.setMessage((CharSequence) CreateTicketFragment.this.getResources().getString(R.string.cameraRationaleError)).setPositiveButton((CharSequence) CreateTicketFragment.this.getResources().getString(R.string.button_OK), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        PermissionToken.this.continuePermissionRequest();
                    }
                }).setNegativeButton((CharSequence) CreateTicketFragment.this.getResources().getString(R.string.button_CANCEL), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        CreateTicketFragment.C58342.lambda$onPermissionRationaleShouldBeShown$3(PermissionToken.this, dialogInterface, i);
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
        startActivityForResult(new Intent("android.media.action.IMAGE_CAPTURE"), REQUEST_IMAGE_CAPTURE);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == REQUEST_IMAGE_CAPTURE) {
            attachFile(intent);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.CreateTicketFragment$3 */
    static /* synthetic */ class C58353 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.CreateTicketFragment.C58353.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void onUploadFile(Resource<FileUploadData> resource) {
        if (resource != null) {
            int i = C58353.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(4);
            } else if (i == 2) {
                this.f6913pb.setVisibility(4);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            } else if (i == 3) {
                this.f6913pb.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    public void showAttachIcon(Set<SomeString> set) {
        this.attachFileSection.setData(new ArrayList(set));
    }

    /* access modifiers changed from: private */
    public void onDeleteAttach(SomeString someString) {
        this.helpdeskViewModel.removeFileById(someString);
    }

    /* access modifiers changed from: private */
    public void makeAction(String str) {
        String ticketText = this.textAndTitleSection.getTicketText();
        String ticketTitile = this.textAndTitleSection.getTicketTitile();
        ProfileLocalRepository instance = ProfileLocalRepository.Companion.getInstance();
        instance.getUser().getApartmentList();
        if (instance.isDemo()) {
            DialogHelper.showDialog(getContext(), getBaseActivity().getResources().getString(R.string.demoFunctionNotAvailable));
        } else if (!ticketText.isEmpty() || !ticketTitile.isEmpty()) {
            this.f6913pb.setVisibility(0);
            this.helpdeskViewModel.updateTicket(ticketTitile, ticketText, this.tabLayout.getSelectedTabPosition());
            this.helpdeskViewModel.getUpdateTicketSingleLiveEvent().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    CreateTicketFragment.this.onCreateResult((Resource) obj);
                }
            });
        } else {
            DialogHelper.showDialog(getContext(), getBaseActivity().getResources().getString(R.string.message_empty_field));
        }
    }

    /* access modifiers changed from: private */
    public void onCreateResult(Resource<ServiceTicket> resource) {
        if (resource != null) {
            int i = C58353.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(4);
                this.attachFileSection.setButtonCreateEnabled(true);
                AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), getString(R.string.dialog_ticket_is_create));
                createDialogBuilder.setPositiveButton((CharSequence) getString(R.string.button_ok), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        CreateTicketFragment.this.lambda$onCreateResult$8$CreateTicketFragment(dialogInterface, i);
                    }
                });
                createDialogBuilder.create().show();
            } else if (i == 2) {
                this.f6913pb.setVisibility(4);
                this.attachFileSection.setButtonCreateEnabled(true);
                AlertDialog.Builder createDialogBuilder2 = DialogHelper.createDialogBuilder(getActivity(), resource.getMessage());
                createDialogBuilder2.setPositiveButton((CharSequence) getString(R.string.button_ok), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        CreateTicketFragment.this.lambda$onCreateResult$9$CreateTicketFragment(dialogInterface, i);
                    }
                });
                createDialogBuilder2.create().show();
            } else if (i == 3) {
                this.attachFileSection.setButtonCreateEnabled(false);
                this.f6913pb.setVisibility(0);
            }
        }
    }

    public /* synthetic */ void lambda$onCreateResult$8$CreateTicketFragment(DialogInterface dialogInterface, int i) {
        backFragment();
    }

    public /* synthetic */ void lambda$onCreateResult$9$CreateTicketFragment(DialogInterface dialogInterface, int i) {
        backFragment();
    }
}
