package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.face;

import android.view.TextureView;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.GoldenEye;
import p033co.infinum.goldeneye.config.CameraInfo;
import p033co.infinum.goldeneye.models.Facing;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.databinding.FragmentPassFaceSecondBinding;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0003J\b\u0010\u000f\u001a\u00020\u0006H\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J-\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00062\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010\u001bJ\u0012\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001e"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/face/PassCreateFaceSecondFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM;", "Lru/unicorn/databinding/FragmentPassFaceSecondBinding;", "()V", "CAMERA_REQUEST_PASS", "", "goldenEye", "Lco/infinum/goldeneye/GoldenEye;", "getGoldenEye", "()Lco/infinum/goldeneye/GoldenEye;", "goldenEye$delegate", "Lkotlin/Lazy;", "findBackCamera", "", "getLayoutRes", "getMyToolbarTitle", "", "getPhotoPermission", "onFileChoose", "filePath", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "viewModell", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.face.PassCreateFaceSecondFragment */
/* compiled from: PassCreateFaceSecondFragment.kt */
public final class PassCreateFaceSecondFragment extends BaseBindingFragment<PassProfileVM, FragmentPassFaceSecondBinding> {
    private final int CAMERA_REQUEST_PASS = 143;
    private HashMap _$_findViewCache;
    private final Lazy goldenEye$delegate = LazyKt.lazy(new PassCreateFaceSecondFragment$goldenEye$2(this));

    /* access modifiers changed from: private */
    public final GoldenEye getGoldenEye() {
        return (GoldenEye) this.goldenEye$delegate.getValue();
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

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_pass_face_second;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(PassProfileVM passProfileVM) {
        getPhotoPermission();
        ((FragmentPassFaceSecondBinding) getViewDataBinding()).confirm.setOnClickListener(new PassCreateFaceSecondFragment$onViewCreated$1(this));
        ((FragmentPassFaceSecondBinding) getViewDataBinding()).makePhoto.setOnClickListener(new PassCreateFaceSecondFragment$onViewCreated$2(this, passProfileVM));
    }

    /* access modifiers changed from: private */
    public final void getPhotoPermission() {
        if (ContextCompat.checkSelfPermission(getBaseActivity(), "android.permission.CAMERA") == 0) {
            findBackCamera();
        } else {
            ActivityCompat.requestPermissions(getBaseActivity(), new String[]{"android.permission.CAMERA"}, this.CAMERA_REQUEST_PASS);
        }
    }

    private final void findBackCamera() {
        Object obj;
        boolean z;
        Iterator it = getGoldenEye().getAvailableCameras().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CameraInfo) obj).getFacing() == Facing.FRONT) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        CameraInfo cameraInfo = (CameraInfo) obj;
        if (cameraInfo != null) {
            GoldenEye goldenEye = getGoldenEye();
            TextureView textureView = (TextureView) _$_findCachedViewById(C5619R.C5622id.previewVideoView);
            Intrinsics.checkNotNullExpressionValue(textureView, "previewVideoView");
            goldenEye.open(textureView, cameraInfo, new C5916x626c3331(this));
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "permissions");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (!(!(iArr.length == 0)) || iArr[0] != 0) {
            showErrorMessage(getString(R.string.error_permission_not_granted));
        } else {
            findBackCamera();
        }
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_my_pass);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_my_pass)");
        return string;
    }
}
