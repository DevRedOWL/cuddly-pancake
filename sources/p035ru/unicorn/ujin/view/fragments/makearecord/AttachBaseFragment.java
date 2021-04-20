package p035ru.unicorn.ujin.view.fragments.makearecord;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.obsez.android.lib.filechooser.ChooserDialog;
import com.zhihu.matisse.Matisse;
import com.zhihu.matisse.MimeType;
import com.zhihu.matisse.engine.impl.GlideEngine;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.fragments.base.attach.IAttachable;
import p042cz.msebera.android.httpclient.cookie.ClientCookie;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rJ\b\u0010\u0015\u001a\u00020\u0005H\u0002J\"\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0002J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0013H&J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0002J\b\u0010\u001f\u001a\u00020\u0005H\u0002¨\u0006 "}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/AttachBaseFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "Lru/unicorn/ujin/view/fragments/base/attach/IAttachable;", "()V", "attachFile", "", "data", "Landroid/content/Intent;", "attachPhoto", "checkCamaraPermission", "checkStoragePermission", "chooseFotoOrCameraDialog", "getImageUri", "Landroid/net/Uri;", "inContext", "Landroid/content/Context;", "inImage", "Landroid/graphics/Bitmap;", "getRealPathFromURI", "", "contentUri", "makeFoto", "onActivityResult", "requestCode", "", "resultCode", "onCameraChoose", "onFileChoose", "filePath", "onFileChooserClick", "onPhotoChoose", "showFileChooser", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.AttachBaseFragment */
/* compiled from: AttachBaseFragment.kt */
public abstract class AttachBaseFragment extends BaseFragment implements IAttachable {
    private HashMap _$_findViewCache;

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

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract void onFileChoose(String str);

    private final void showFileChooser() {
        AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), getString(R.string.media_picker_what_to_attach));
        createDialogBuilder.setPositiveButton((int) R.string.media_picker_photo, (DialogInterface.OnClickListener) new AttachBaseFragment$showFileChooser$1(this));
        createDialogBuilder.setNegativeButton((int) R.string.media_picker_file, (DialogInterface.OnClickListener) new AttachBaseFragment$showFileChooser$2(this));
        createDialogBuilder.setNeutralButton((int) R.string.button_CANCEL, (DialogInterface.OnClickListener) AttachBaseFragment$showFileChooser$3.INSTANCE);
        createDialogBuilder.create().show();
    }

    public void onFileChooserClick() {
        checkStoragePermission();
    }

    private final void makeFoto() {
        startActivityForResult(new Intent("android.media.action.IMAGE_CAPTURE"), 123);
    }

    /* access modifiers changed from: private */
    public final void chooseFotoOrCameraDialog() {
        AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), getString(R.string.media_picker_attach_media_or_photo));
        createDialogBuilder.setPositiveButton((int) R.string.media_picker_camera, (DialogInterface.OnClickListener) new AttachBaseFragment$chooseFotoOrCameraDialog$1(this));
        createDialogBuilder.setNegativeButton((int) R.string.media_picker_gallery, (DialogInterface.OnClickListener) new AttachBaseFragment$chooseFotoOrCameraDialog$2(this));
        createDialogBuilder.setNeutralButton((int) R.string.button_CANCEL, (DialogInterface.OnClickListener) AttachBaseFragment$chooseFotoOrCameraDialog$3.INSTANCE);
        createDialogBuilder.create().show();
    }

    /* access modifiers changed from: private */
    public final void onFileChoose() {
        new ChooserDialog((Activity) getBaseActivity()).withFilterRegex(false, false, "^(.(?!mp4|mov))*$").withResources(R.string.choose_file_title, R.string.media_picker_ok, R.string.cancel_label).withChosenListener(new AttachBaseFragment$onFileChoose$1(this)).build().show();
    }

    /* access modifiers changed from: private */
    public final void onPhotoChoose() {
        Matisse.from((Fragment) this).choose(MimeType.ofAll()).countable(true).maxSelectable(10).thumbnailScale(0.85f).imageEngine(new GlideEngine()).theme(R.style.ImagePickerLight).forResult(124);
    }

    /* access modifiers changed from: private */
    public final void onCameraChoose() {
        checkCamaraPermission();
    }

    public void checkCamaraPermission() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (ContextCompat.checkSelfPermission(activity, "android.permission.CAMERA") == 0) {
            makeFoto();
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{"android.permission.CAMERA", "android.permission.CAMERA"}, 125);
        }
    }

    public void checkStoragePermission() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (ContextCompat.checkSelfPermission(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            showFileChooser();
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 110);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 123) {
            attachFile(intent);
        }
        if (i2 == -1 && i == 124 && intent != null) {
            attachPhoto(intent);
        }
        if (i2 == -1 && i == 125 && intent != null) {
            makeFoto();
        }
    }

    private final void attachFile(Intent intent) {
        Bundle extras;
        Object obj = null;
        Bitmap bitmap = null;
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            obj = extras.get("data");
        }
        Bitmap bitmap2 = (Bitmap) obj;
        FragmentActivity activity = getActivity();
        if (activity != null && bitmap2 != null) {
            onFileChoose(getRealPathFromURI(getImageUri(activity, bitmap2)));
        }
    }

    private final void attachPhoto(Intent intent) {
        List<String> obtainPathResult = Matisse.obtainPathResult(intent);
        Collection collection = obtainPathResult;
        if (!(collection == null || collection.isEmpty())) {
            for (String next : obtainPathResult) {
                Intrinsics.checkNotNullExpressionValue(next, ClientCookie.PATH_ATTR);
                onFileChoose(next);
            }
        }
    }

    public final Uri getImageUri(Context context, Bitmap bitmap) {
        ContentResolver contentResolver;
        Uri insert;
        Intrinsics.checkNotNullParameter(context, "inContext");
        Intrinsics.checkNotNullParameter(bitmap, "inImage");
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new ByteArrayOutputStream());
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", "Title");
        contentValues.put("description", "From Camera");
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", 1);
        }
        Context context2 = getContext();
        if (context2 != null && (contentResolver = context2.getContentResolver()) != null && (insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues)) != null) {
            return insert;
        }
        Uri uri = Uri.EMPTY;
        Intrinsics.checkNotNullExpressionValue(uri, "Uri.EMPTY");
        return uri;
    }

    public final String getRealPathFromURI(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "contentUri");
        Cursor cursor = null;
        try {
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity);
            Intrinsics.checkNotNullExpressionValue(activity, "activity!!");
            cursor = activity.getContentResolver().query(uri, new String[]{"_data"}, (String) null, (String[]) null, (String) null);
            Intrinsics.checkNotNull(cursor);
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
            cursor.moveToFirst();
            String string = cursor.getString(columnIndexOrThrow);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(column_index)");
            cursor.close();
            return string;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
