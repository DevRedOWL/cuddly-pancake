package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import com.obsez.android.lib.filechooser.ChooserDialog;
import com.zhihu.matisse.Matisse;
import com.zhihu.matisse.MimeType;
import com.zhihu.matisse.engine.impl.GlideEngine;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.api.response.chats.FileUploadData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.service.SimpleServiceRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.AttachFileSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ChooseSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.ServiceTicketFragment;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.ServiceTicketFragment */
public class ServiceTicketFragment extends AbstractTicketFragment {
    private static final int REQUEST_IMAGE_CAPTURE = 1230;
    public static final int REQUEST_READ_FILE = 1100;
    private boolean alreadyShown = false;
    private AttachFileSection attachFileSection;
    private boolean onChooseRentClicked = false;

    public void onViewCreated(HelpDeskViewModel helpDeskViewModel) {
    }

    public HelpDeskViewModel getViewModell() {
        return (HelpDeskViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(HelpDeskViewModel.class);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        showRes((RentInfo) null);
        showPropertyResult((IKeyValueData) null);
        getViewModell().getShowLoader().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                ServiceTicketFragment.this.showLoader((Boolean) obj);
            }
        });
        getViewModell().getCurrentRentInfo().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                ServiceTicketFragment.this.showRes((RentInfo) obj);
            }
        });
        getViewModell().getCurrentTicketProperty().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                ServiceTicketFragment.this.showPropertyResult((IKeyValueData) obj);
            }
        });
        getViewModell().getUploadFileSingleEvent().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                ServiceTicketFragment.this.onUploadFile((Resource) obj);
            }
        });
        getViewModell().getLiveFileIdList().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                ServiceTicketFragment.this.showAttachIcon((HashSet) obj);
            }
        });
        this.onChooseRentClicked = false;
        showDialog();
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        super.initSections();
        if (this.attachFileSection == null) {
            getViewModell().clearFiles();
            this.attachFileSection = new AttachFileSection();
            this.attachFileSection.getOnClickAddFile().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    ServiceTicketFragment.this.onAddFileClick((String) obj);
                }
            });
            this.attachFileSection.getOnCloseFile().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    ServiceTicketFragment.this.onDeleteAttach((SomeString) obj);
                }
            });
        }
        this.chooseTypeSection.setData(createTicketTypeData());
        this.createTicketSection.setData(createTicketTitleTextData());
        this.createTicketSection.setPlaceholderText(getResources().getString(R.string.service_ticket_text_placeholder));
        this.chooseRentSection.getOnCkick().distinct().subscribe(new Consumer() {
            public final void accept(Object obj) {
                ServiceTicketFragment.this.chooseRent((SomeString) obj);
            }
        });
        this.sectionedAdapter.addSection(this.chooseTypeSection);
        this.sectionedAdapter.addSection(this.chooseRentSection);
        this.sectionedAdapter.addSection(this.createTicketSection);
        this.sectionedAdapter.addSection(this.attachFileSection);
        this.sectionedAdapter.addSection(this.btnCreate);
    }

    private void showDialog() {
        if (!this.alreadyShown && !getBaseActivity().getSharedPreferences(getBaseActivity().getString(R.string.app_name_app), 0).getBoolean("alreadyShown", false)) {
            this.alreadyShown = true;
            DialogHelper.showDialog(getBaseActivity(), getBaseActivity().getResources().getString(R.string.message_for_ticket), R.string.button_dont_show_again, R.string.button_ok, new DialogHelper.OnButtonDialogClick() {
                public void onNegativeClick() {
                }

                public void onPositiveClick() {
                    ServiceTicketFragment.this.getBaseActivity().getSharedPreferences(ServiceTicketFragment.this.getBaseActivity().getString(R.string.app_name_app), 0).edit().putBoolean("alreadyShown", true).apply();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        return getITicket().getName();
    }

    /* access modifiers changed from: private */
    public void chooseRent(SomeString someString) {
        if (!this.onChooseRentClicked) {
            this.onChooseRentClicked = true;
            SimpleServiceRentTicket simpleServiceRentTicket = (SimpleServiceRentTicket) saveTitleAndText();
            SectionTicketType sectionTicketType = null;
            if (getITicket().getSectionId() != null) {
                sectionTicketType = SectionTicketType.getByNumber(getITicket().getSectionId());
            }
            if (sectionTicketType == null || !sectionTicketType.equals(SectionTicketType.ACCOMPLISHMENT)) {
                TicketPropertyListFragment ticketPropertyListFragment = new TicketPropertyListFragment();
                ticketPropertyListFragment.setTargetFragment(this, 500);
                nextFragment(ticketPropertyListFragment, false);
                return;
            }
            MyRentaFragment start = MyRentaFragment.start(5);
            start.setTargetFragment(this, 500);
            nextFragment(start, false);
        }
    }

    /* access modifiers changed from: private */
    public void showRes(RentInfo rentInfo) {
        if (rentInfo == null) {
            this.chooseRentSection.setData(setRentData("Выбрать помещение"));
            return;
        }
        getITicket().setId(rentInfo.getPropRenta().getId().intValue());
        this.chooseRentSection.setData(setRentData(rentInfo.getPropRenta().getTitle()));
    }

    /* access modifiers changed from: private */
    public void showPropertyResult(IKeyValueData iKeyValueData) {
        if (iKeyValueData == null || iKeyValueData.getKey() == null) {
            this.chooseRentSection.setData(setRentData("Выбрать помещение"));
            return;
        }
        getITicket().setId(Integer.parseInt(iKeyValueData.getKey()));
        this.chooseRentSection.setData(setRentData(iKeyValueData.getValue().toString()));
    }

    /* access modifiers changed from: package-private */
    public void createMyTicket(ITicket iTicket) {
        SimpleServiceRentTicket simpleServiceRentTicket = (SimpleServiceRentTicket) saveTitleAndText();
        getViewModell().sendMorionTicket(iTicket);
        getViewModell().getCreateTicket().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                ServiceTicketFragment.this.lambda$createMyTicket$0$ServiceTicketFragment((Resource) obj);
            }
        });
    }

    public /* synthetic */ void lambda$createMyTicket$0$ServiceTicketFragment(Resource resource) {
        super.onTicketCreate(resource);
    }

    private SomeString setRentData(String str) {
        SomeString someString = new SomeString(str);
        HashMap hashMap = new HashMap();
        hashMap.put("name", "Выбрать помещение");
        hashMap.put(ChooseSection.ARROW_VISABILITY, true);
        someString.setValues(hashMap);
        return someString;
    }

    public SimpleServiceRentTicket getITicket() {
        return (SimpleServiceRentTicket) getArguments().getParcelable("rent");
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
        List<String> obtainPathResult = Matisse.obtainPathResult(intent);
        if (obtainPathResult != null && !obtainPathResult.isEmpty()) {
            for (String addFileId : obtainPathResult) {
                getViewModell().addFileId(addFileId);
            }
        }
    }

    private void attachFoto(Intent intent) {
        Bitmap bitmap;
        if (intent != null && intent.getExtras() != null && (bitmap = (Bitmap) intent.getExtras().get("data")) != null) {
            getViewModell().addFileId(getRealPathFromURI(getImageUri(requireContext(), bitmap)));
        }
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
                ServiceTicketFragment.this.lambda$showFileChooser$1$ServiceTicketFragment(dialogInterface, i);
            }
        });
        createDialogBuilder.setNegativeButton((int) R.string.media_picker_file, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                ServiceTicketFragment.this.lambda$showFileChooser$2$ServiceTicketFragment(dialogInterface, i);
            }
        });
        createDialogBuilder.setNeutralButton((int) R.string.button_cancel, (DialogInterface.OnClickListener) $$Lambda$ServiceTicketFragment$mm9f2qCdXVsvJvG3y30lht8hNM.INSTANCE);
        createDialogBuilder.create().show();
    }

    public /* synthetic */ void lambda$showFileChooser$1$ServiceTicketFragment(DialogInterface dialogInterface, int i) {
        chooseFotoOrCameraDialog();
    }

    public /* synthetic */ void lambda$showFileChooser$2$ServiceTicketFragment(DialogInterface dialogInterface, int i) {
        onFileChoose();
    }

    private void onFileChoose() {
        new ChooserDialog((Activity) getBaseActivity()).withFilterRegex(false, false, "^(.(?!mp4|mov))*$").withResources(R.string.choose_file_title, R.string.media_picker_ok, R.string.cancel_label).withChosenListener(new ChooserDialog.Result() {
            public final void onChoosePath(String str, File file) {
                ServiceTicketFragment.this.lambda$onFileChoose$4$ServiceTicketFragment(str, file);
            }
        }).build().show();
    }

    public /* synthetic */ void lambda$onFileChoose$4$ServiceTicketFragment(String str, File file) {
        ((HelpDeskViewModel) this.viewModell).addFileId(str);
    }

    private void chooseFotoOrCameraDialog() {
        AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), getString(R.string.media_picker_attach_media_or_photo));
        createDialogBuilder.setPositiveButton((int) R.string.media_picker_camera, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                ServiceTicketFragment.this.lambda$chooseFotoOrCameraDialog$5$ServiceTicketFragment(dialogInterface, i);
            }
        });
        createDialogBuilder.setNegativeButton((int) R.string.media_picker_gallery, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                ServiceTicketFragment.this.lambda$chooseFotoOrCameraDialog$6$ServiceTicketFragment(dialogInterface, i);
            }
        });
        createDialogBuilder.setNeutralButton((int) R.string.button_cancel, (DialogInterface.OnClickListener) $$Lambda$ServiceTicketFragment$26S_mE9YT1BKTMy47Kd5sT2w0w.INSTANCE);
        createDialogBuilder.create().show();
    }

    public /* synthetic */ void lambda$chooseFotoOrCameraDialog$5$ServiceTicketFragment(DialogInterface dialogInterface, int i) {
        onCameraChoose();
    }

    public /* synthetic */ void lambda$chooseFotoOrCameraDialog$6$ServiceTicketFragment(DialogInterface dialogInterface, int i) {
        onPhotoChoose();
    }

    private void onPhotoChoose() {
        Matisse.from((Fragment) this).choose(MimeType.ofAll()).countable(true).maxSelectable(10).thumbnailScale(0.85f).imageEngine(new GlideEngine()).theme(R.style.ImagePickerLight).forResult(124);
    }

    private void onCameraChoose() {
        Dexter.withActivity(getActivity()).withPermission("android.permission.CAMERA").withListener(new PermissionListener() {
            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                ServiceTicketFragment.this.makeFoto();
            }

            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ServiceTicketFragment.this.getActivity());
                builder.setMessage((CharSequence) ServiceTicketFragment.this.getResources().getString(R.string.cameraRationaleError)).setPositiveButton((CharSequence) ServiceTicketFragment.this.getResources().getString(R.string.button_OK), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ServiceTicketFragment.C59342.this.lambda$onPermissionDenied$0$ServiceTicketFragment$2(dialogInterface, i);
                    }
                }).setNegativeButton((CharSequence) ServiceTicketFragment.this.getResources().getString(R.string.button_CANCEL), (DialogInterface.OnClickListener) $$Lambda$ServiceTicketFragment$2$J2xPZdxurOxqEvv_08r9oDl0ACs.INSTANCE);
                builder.show().setCanceledOnTouchOutside(false);
            }

            public /* synthetic */ void lambda$onPermissionDenied$0$ServiceTicketFragment$2(DialogInterface dialogInterface, int i) {
                ServiceTicketFragment.this.showApplicationSettings();
            }

            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ServiceTicketFragment.this.getActivity());
                builder.setMessage((CharSequence) ServiceTicketFragment.this.getResources().getString(R.string.cameraRationaleError)).setPositiveButton((CharSequence) ServiceTicketFragment.this.getResources().getString(R.string.button_OK), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        PermissionToken.this.continuePermissionRequest();
                    }
                }).setNegativeButton((CharSequence) ServiceTicketFragment.this.getResources().getString(R.string.button_CANCEL), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ServiceTicketFragment.C59342.lambda$onPermissionRationaleShouldBeShown$3(PermissionToken.this, dialogInterface, i);
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
        if (i2 != -1) {
            return;
        }
        if (i == 124) {
            attachFile(intent);
        } else if (i == REQUEST_IMAGE_CAPTURE) {
            attachFoto(intent);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.ServiceTicketFragment$3 */
    static /* synthetic */ class C59353 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.ServiceTicketFragment.C59353.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void onUploadFile(Resource<FileUploadData> resource) {
        if (resource != null) {
            int i = C59353.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
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
        getViewModell().removeFileById(someString);
    }

    private void onCreateResult(Resource<ServiceTicket> resource) {
        if (resource != null) {
            int i = C59353.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(4);
                AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), getString(R.string.dialog_ticket_is_create));
                createDialogBuilder.setPositiveButton((CharSequence) getString(R.string.button_ok), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ServiceTicketFragment.this.lambda$onCreateResult$8$ServiceTicketFragment(dialogInterface, i);
                    }
                });
                createDialogBuilder.create().show();
            } else if (i == 2) {
                this.f6913pb.setVisibility(4);
                AlertDialog.Builder createDialogBuilder2 = DialogHelper.createDialogBuilder(getActivity(), resource.getMessage());
                createDialogBuilder2.setPositiveButton((CharSequence) getString(R.string.button_ok), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ServiceTicketFragment.this.lambda$onCreateResult$9$ServiceTicketFragment(dialogInterface, i);
                    }
                });
                createDialogBuilder2.create().show();
            } else if (i == 3) {
                this.f6913pb.setVisibility(0);
            }
        }
    }

    public /* synthetic */ void lambda$onCreateResult$8$ServiceTicketFragment(DialogInterface dialogInterface, int i) {
        backFragment();
    }

    public /* synthetic */ void lambda$onCreateResult$9$ServiceTicketFragment(DialogInterface dialogInterface, int i) {
        backFragment();
    }

    /* access modifiers changed from: private */
    public void showLoader(Boolean bool) {
        this.f6913pb.setVisibility(bool.booleanValue() ? 0 : 4);
    }

    public void onPause() {
        super.onPause();
    }
}
