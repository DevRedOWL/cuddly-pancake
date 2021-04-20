package p035ru.unicorn.ujin.view.fragments.profile;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.request.RequestListener;
import com.facebook.common.util.UriUtil;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.alhazmy13.mediapicker.Image.ImagePicker;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.fragments.BaseTitleFragment;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0017\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\u0011J\u0012\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0002J\b\u0010\u0016\u001a\u00020\tH\u0014J\"\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0010H\u0002J\b\u0010(\u001a\u00020\u0006H\u0002J\b\u0010)\u001a\u00020\u0006H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/ProfileEditFragment;", "Lru/unicorn/ujin/view/fragments/BaseTitleFragment;", "()V", "calendar", "Ljava/util/Calendar;", "checkPermission", "", "choosePhoto", "convertImageFileToBase64", "", "imageFile", "Ljava/io/File;", "getLayoutRes", "", "handleLoading", "loading", "", "(Ljava/lang/Boolean;)V", "handleProfileUpdate", "event", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "initData", "metricsScreenName", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setViewsEnabled", "enabled", "showDatePickerDialog", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.ProfileEditFragment */
/* compiled from: ProfileEditFragment.kt */
public final class ProfileEditFragment extends BaseTitleFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public Calendar calendar;

    @JvmStatic
    public static final ProfileEditFragment newInstance(String str) {
        return Companion.newInstance(str);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int getLayoutRes() {
        return R.layout.fragment_profile_edit;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Изменение профиля";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public ProfileEditFragment() {
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
        this.calendar = instance;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        super.showToolbar();
        BaseActivity baseActivity = getBaseActivity();
        View[] viewArr = new View[1];
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.item_toolbar_blue_button, getBaseActivity().llButtonsRight, false);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            textView.setText(getString(Intrinsics.areEqual((Object) getProfileViewModel().getProfileModeEdit().get(), (Object) true) ? R.string.profileSave : R.string.profileEdit));
            textView.setOnClickListener(new ProfileEditFragment$showToolbar$$inlined$apply$lambda$1(textView, this));
            Unit unit = Unit.INSTANCE;
            viewArr[0] = textView;
            baseActivity.setToolbarRight(CollectionsKt.arrayListOf(viewArr));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        kotlin.p049io.CloseableKt.closeFinally(r6, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        kotlin.p049io.CloseableKt.closeFinally(r3, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0060, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0061, code lost:
        kotlin.p049io.CloseableKt.closeFinally(r0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0064, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String convertImageFileToBase64(java.io.File r13) {
        /*
            r12 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r13)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r13 = 0
            r1 = r13
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2 = r0
            java.io.FileInputStream r2 = (java.io.FileInputStream) r2     // Catch:{ all -> 0x005e }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x005e }
            r3.<init>()     // Catch:{ all -> 0x005e }
            java.io.Closeable r3 = (java.io.Closeable) r3     // Catch:{ all -> 0x005e }
            r4 = r13
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x005e }
            r5 = r3
            java.io.ByteArrayOutputStream r5 = (java.io.ByteArrayOutputStream) r5     // Catch:{ all -> 0x0057 }
            android.util.Base64OutputStream r6 = new android.util.Base64OutputStream     // Catch:{ all -> 0x0057 }
            r7 = r5
            java.io.OutputStream r7 = (java.io.OutputStream) r7     // Catch:{ all -> 0x0057 }
            r8 = 0
            r6.<init>(r7, r8)     // Catch:{ all -> 0x0057 }
            java.io.Closeable r6 = (java.io.Closeable) r6     // Catch:{ all -> 0x0057 }
            r7 = r13
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch:{ all -> 0x0057 }
            r9 = r6
            android.util.Base64OutputStream r9 = (android.util.Base64OutputStream) r9     // Catch:{ all -> 0x0050 }
            java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ all -> 0x0050 }
            r10 = r9
            java.io.OutputStream r10 = (java.io.OutputStream) r10     // Catch:{ all -> 0x0050 }
            r11 = 2
            kotlin.p049io.ByteStreamsKt.copyTo$default(r2, r10, r8, r11, r13)     // Catch:{ all -> 0x0050 }
            r9.close()     // Catch:{ all -> 0x0050 }
            java.lang.String r13 = r5.toString()     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "outputStream.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r2)     // Catch:{ all -> 0x0050 }
            kotlin.p049io.CloseableKt.closeFinally(r6, r7)     // Catch:{ all -> 0x0057 }
            kotlin.p049io.CloseableKt.closeFinally(r3, r4)     // Catch:{ all -> 0x005e }
            kotlin.p049io.CloseableKt.closeFinally(r0, r1)
            java.lang.String r0 = "FileInputStream(imageFil…}\n            }\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r0)
            return r13
        L_0x0050:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r1 = move-exception
            kotlin.p049io.CloseableKt.closeFinally(r6, r13)     // Catch:{ all -> 0x0057 }
            throw r1     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r1 = move-exception
            kotlin.p049io.CloseableKt.closeFinally(r3, r13)     // Catch:{ all -> 0x005e }
            throw r1     // Catch:{ all -> 0x005e }
        L_0x005e:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r1 = move-exception
            kotlin.p049io.CloseableKt.closeFinally(r0, r13)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.profile.ProfileEditFragment.convertImageFileToBase64(java.io.File):java.lang.String");
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/ProfileEditFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/profile/ProfileEditFragment;", "title", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profile.ProfileEditFragment$Companion */
    /* compiled from: ProfileEditFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ProfileEditFragment newInstance(String str) {
            Intrinsics.checkNotNullParameter(str, "title");
            ProfileEditFragment profileEditFragment = new ProfileEditFragment();
            profileEditFragment.setTitle(str);
            return profileEditFragment;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        getProfileViewModel().getProfileUpdateLiveData().observe(getViewLifecycleOwner(), new ProfileEditFragment$onCreateView$1(this));
        getProfileViewModel().getShowProgressLiveData().observe(getViewLifecycleOwner(), new ProfileEditFragment$onCreateView$2(this));
        getProfileViewModel().getLoginMutableLiveData().observe(getViewLifecycleOwner(), new ProfileEditFragment$onCreateView$3(this));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: private */
    public final void handleLoading(Boolean bool) {
        showLoader(bool, (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading));
    }

    /* access modifiers changed from: private */
    public final void handleProfileUpdate(UpdateEvent updateEvent) {
        getProfileViewModel().getProfileModeEdit().set(false);
        showToolbar();
        if (updateEvent != null) {
            boolean success = updateEvent.getSuccess();
            if (success) {
                getBaseActivity().showMessage((int) R.string.profileSuccessProfileUpdate);
                backFragment();
            } else if (!success) {
                getBaseActivity().showMessage(updateEvent.getMessage());
            }
        } else {
            getBaseActivity().showMessage((int) R.string.profileErrorUpdatingProfile);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getProfileViewModel().requestUser();
        initData();
        getProfileViewModel().getUserAvatarPath().set(null);
    }

    /* access modifiers changed from: private */
    public final void initData() {
        User user = getProfileViewModel().getUser();
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etName)).setText(user.getName());
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etSurname)).setText(user.getSurname());
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPatronymic)).setText(user.getPatronymic());
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPhone)).setText(getProfileViewModel().getUserPhone());
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etEmail)).setText(user.getEmail());
        if (StringsKt.contains$default((CharSequence) user.getAvatar(), (CharSequence) UriUtil.HTTPS_SCHEME, false, 2, (Object) null)) {
            GlideApp.with((View) (AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.ivImage)).load(user.getAvatar()).listener((RequestListener) new ProfileEditFragment$initData$$inlined$also$lambda$1(user, this)).into((ImageView) (AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.ivImage));
        }
        TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etBirthday);
        textInputEditText.setFocusable(false);
        textInputEditText.setText(user.getBirthday());
    }

    /* access modifiers changed from: private */
    public final void showDatePickerDialog() {
        TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etBirthday);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "etBirthday");
        if (textInputEditText.getText() != null) {
            TextInputEditText textInputEditText2 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etBirthday);
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etBirthday");
            if (String.valueOf(textInputEditText2.getText()).length() > 0) {
                TextInputEditText textInputEditText3 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etBirthday);
                Intrinsics.checkNotNullExpressionValue(textInputEditText3, "etBirthday");
                Date formatDateFromString = DateUtils.formatDateFromString(String.valueOf(textInputEditText3.getText()));
                if (formatDateFromString != null) {
                    this.calendar.setTime(formatDateFromString);
                }
            }
        }
        TextInputEditText textInputEditText4 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etBirthday);
        Intrinsics.checkNotNullExpressionValue(textInputEditText4, "etBirthday");
        DatePickerDialog datePickerDialog = new DatePickerDialog(textInputEditText4.getContext(), R.style.YCalendarSpinner, new ProfileEditFragment$showDatePickerDialog$onDateSetListener$1(this), this.calendar.get(1), this.calendar.get(2), this.calendar.get(5));
        DatePicker datePicker = datePickerDialog.getDatePicker();
        Intrinsics.checkNotNullExpressionValue(datePicker, "datePickerDialog.datePicker");
        datePicker.setMaxDate(new Date().getTime());
        datePickerDialog.setTitle(R.string.label_birthday);
        datePickerDialog.show();
    }

    /* access modifiers changed from: private */
    public final void setViewsEnabled(boolean z) {
        getBaseActivity().setTextTitle(getString(z ? R.string.profileEditTitle : R.string.my_profile));
        TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etName);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "etName");
        textInputEditText.setEnabled(z);
        TextInputEditText textInputEditText2 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etSurname);
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etSurname");
        textInputEditText2.setEnabled(z);
        TextInputEditText textInputEditText3 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPatronymic);
        Intrinsics.checkNotNullExpressionValue(textInputEditText3, "etPatronymic");
        textInputEditText3.setEnabled(z);
        TextInputEditText textInputEditText4 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPhone);
        Intrinsics.checkNotNullExpressionValue(textInputEditText4, "etPhone");
        textInputEditText4.setEnabled(z);
        TextInputEditText textInputEditText5 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etEmail);
        Intrinsics.checkNotNullExpressionValue(textInputEditText5, "etEmail");
        textInputEditText5.setEnabled(z);
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.ivPhotoButton);
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "ivPhotoButton");
        appCompatImageView.setVisibility(z ? 0 : 8);
        ((RelativeLayout) _$_findCachedViewById(C5619R.C5622id.rvAvatar)).setOnClickListener(new ProfileEditFragment$setViewsEnabled$1(this, z));
        TextInputEditText textInputEditText6 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etBirthday);
        textInputEditText6.setEnabled(z);
        textInputEditText6.setOnClickListener(new ProfileEditFragment$setViewsEnabled$$inlined$apply$lambda$1(this, z));
    }

    /* access modifiers changed from: private */
    public final void checkPermission() {
        List arrayList = new ArrayList();
        int checkSelfPermission = ContextCompat.checkSelfPermission(getBaseActivity(), "android.permission.CAMERA");
        int checkSelfPermission2 = ContextCompat.checkSelfPermission(getBaseActivity(), "android.permission.READ_EXTERNAL_STORAGE");
        if (checkSelfPermission != 0) {
            arrayList.add("android.permission.CAMERA");
        }
        if (checkSelfPermission2 != 0) {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
        }
        if (arrayList.isEmpty()) {
            choosePhoto();
            return;
        }
        Activity baseActivity = getBaseActivity();
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            ActivityCompat.requestPermissions(baseActivity, (String[]) array, ImagePicker.IMAGE_PICKER_REQUEST_CODE);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private final void choosePhoto() {
        new ImagePicker.Builder(getActivity()).mode(ImagePicker.Mode.CAMERA_AND_GALLERY).compressLevel(ImagePicker.ComperesLevel.MEDIUM).directory(ImagePicker.Directory.DEFAULT).extension(ImagePicker.Extension.JPG).scale(600, 600).allowMultipleImages(false).enableDebuggingMode(true).build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        r4 = r4.getStringArrayListExtra(net.alhazmy13.mediapicker.Image.ImagePicker.EXTRA_IMAGE_PATH);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r2, int r3, android.content.Intent r4) {
        /*
            r1 = this;
            super.onActivityResult(r2, r3, r4)
            r0 = 42141(0xa49d, float:5.9052E-41)
            if (r2 != r0) goto L_0x0055
            r2 = -1
            if (r3 != r2) goto L_0x0055
            ru.unicorn.ujin.data.profile.ProfileViewModel r2 = r1.getProfileViewModel()
            androidx.databinding.ObservableField r3 = r2.getUserAvatarPath()
            if (r4 == 0) goto L_0x0025
            java.lang.String r0 = "EXTRA_IMAGE_PATH"
            java.util.ArrayList r4 = r4.getStringArrayListExtra(r0)
            if (r4 == 0) goto L_0x0025
            r0 = 0
            java.lang.Object r4 = r4.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0026
        L_0x0025:
            r4 = 0
        L_0x0026:
            r3.set(r4)
            androidx.databinding.ObservableField r2 = r2.getUserAvatarPath()
            java.lang.Object r2 = r2.get()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0055
            int r3 = p035ru.unicorn.C5619R.C5622id.ivImage
            android.view.View r3 = r1._$_findCachedViewById(r3)
            androidx.appcompat.widget.AppCompatImageView r3 = (androidx.appcompat.widget.AppCompatImageView) r3
            ru.unicorn.ujin.util.GlideRequests r3 = p035ru.unicorn.ujin.util.GlideApp.with((android.view.View) r3)
            java.io.File r4 = new java.io.File
            r4.<init>(r2)
            ru.unicorn.ujin.util.GlideRequest r2 = r3.load((java.io.File) r4)
            int r3 = p035ru.unicorn.C5619R.C5622id.ivImage
            android.view.View r3 = r1._$_findCachedViewById(r3)
            androidx.appcompat.widget.AppCompatImageView r3 = (androidx.appcompat.widget.AppCompatImageView) r3
            r2.into((android.widget.ImageView) r3)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.profile.ProfileEditFragment.onActivityResult(int, int, android.content.Intent):void");
    }
}
