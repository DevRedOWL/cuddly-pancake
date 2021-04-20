package net.alhazmy13.mediapicker.Image;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.alhazmy13.mediapicker.C5079R;
import net.alhazmy13.mediapicker.FileProcessing;
import net.alhazmy13.mediapicker.Image.ImagePicker;
import net.alhazmy13.mediapicker.Image.ImageTags;
import net.alhazmy13.mediapicker.Utility;

public class ImageActivity extends AppCompatActivity {
    /* access modifiers changed from: private */
    public AlertDialog alertDialog;
    private File destination;
    private List<String> listOfImgs;
    private Uri mImageUri;
    /* access modifiers changed from: private */
    public ImageConfig mImgConfig;

    public static Intent getCallingIntent(Context context, ImageConfig imageConfig) {
        Intent intent = new Intent(context, ImageActivity.class);
        intent.putExtra("IMG_CONFIG", imageConfig);
        return intent;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            this.mImgConfig = (ImageConfig) intent.getSerializableExtra("IMG_CONFIG");
        }
        if (bundle == null) {
            pickImageWrapper();
            this.listOfImgs = new ArrayList();
        }
        if (this.mImgConfig.debug) {
            Log.d(ImageTags.Tags.TAG, this.mImgConfig.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        AlertDialog alertDialog2 = this.alertDialog;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        super.onStop();
    }

    private void pickImage() {
        Utility.createFolder(this.mImgConfig.directory);
        String str = this.mImgConfig.directory;
        this.destination = new File(str, Utility.getRandomString() + this.mImgConfig.extension.getValue());
        int i = C50775.$SwitchMap$net$alhazmy13$mediapicker$Image$ImagePicker$Mode[this.mImgConfig.mode.ordinal()];
        if (i == 1) {
            startActivityFromCamera();
        } else if (i != 2) {
            if (i == 3) {
                showFromCameraOrGalleryAlert();
            }
        } else if (!this.mImgConfig.allowMultiple || !this.mImgConfig.allowOnlineImages) {
            startActivityFromGallery();
        } else {
            startActivityFromGalleryMultiImg();
        }
    }

    /* renamed from: net.alhazmy13.mediapicker.Image.ImageActivity$5 */
    static /* synthetic */ class C50775 {
        static final /* synthetic */ int[] $SwitchMap$net$alhazmy13$mediapicker$Image$ImagePicker$Mode = new int[ImagePicker.Mode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                net.alhazmy13.mediapicker.Image.ImagePicker$Mode[] r0 = net.alhazmy13.mediapicker.Image.ImagePicker.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$net$alhazmy13$mediapicker$Image$ImagePicker$Mode = r0
                int[] r0 = $SwitchMap$net$alhazmy13$mediapicker$Image$ImagePicker$Mode     // Catch:{ NoSuchFieldError -> 0x0014 }
                net.alhazmy13.mediapicker.Image.ImagePicker$Mode r1 = net.alhazmy13.mediapicker.Image.ImagePicker.Mode.CAMERA     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$net$alhazmy13$mediapicker$Image$ImagePicker$Mode     // Catch:{ NoSuchFieldError -> 0x001f }
                net.alhazmy13.mediapicker.Image.ImagePicker$Mode r1 = net.alhazmy13.mediapicker.Image.ImagePicker.Mode.GALLERY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$net$alhazmy13$mediapicker$Image$ImagePicker$Mode     // Catch:{ NoSuchFieldError -> 0x002a }
                net.alhazmy13.mediapicker.Image.ImagePicker$Mode r1 = net.alhazmy13.mediapicker.Image.ImagePicker.Mode.CAMERA_AND_GALLERY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.alhazmy13.mediapicker.Image.ImageActivity.C50775.<clinit>():void");
        }
    }

    private void showFromCameraOrGalleryAlert() {
        this.alertDialog = new AlertDialog.Builder(this).setTitle(getString(C5079R.string.media_picker_select_from)).setPositiveButton(getString(C5079R.string.media_picker_camera), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (ImageActivity.this.mImgConfig.debug) {
                    Log.d(ImageTags.Tags.TAG, "Alert Dialog - Start From Camera");
                }
                ImageActivity.this.startActivityFromCamera();
                ImageActivity.this.alertDialog.dismiss();
            }
        }).setNegativeButton(getString(C5079R.string.media_picker_gallery), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (ImageActivity.this.mImgConfig.debug) {
                    Log.d(ImageTags.Tags.TAG, "Alert Dialog - Start From Gallery");
                }
                if (ImageActivity.this.mImgConfig.allowMultiple) {
                    ImageActivity.this.startActivityFromGalleryMultiImg();
                } else {
                    ImageActivity.this.startActivityFromGallery();
                }
                ImageActivity.this.alertDialog.dismiss();
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                if (ImageActivity.this.mImgConfig.debug) {
                    Log.d(ImageTags.Tags.TAG, "Alert Dialog - Canceled");
                }
                ImageActivity.this.alertDialog.dismiss();
                ImageActivity.this.finish();
            }
        }).create();
        AlertDialog alertDialog2 = this.alertDialog;
        if (alertDialog2 != null) {
            alertDialog2.show();
        }
    }

    /* access modifiers changed from: private */
    public void startActivityFromGallery() {
        this.mImgConfig.isImgFromCamera = false;
        Intent intent = new Intent("android.intent.action.PICK");
        intent.putExtra("android.intent.extra.LOCAL_ONLY", !this.mImgConfig.allowOnlineImages);
        intent.setType("image/*");
        startActivityForResult(intent, 43);
        if (this.mImgConfig.debug) {
            Log.d(ImageTags.Tags.TAG, "Gallery Start with Single Image mode");
        }
    }

    /* access modifiers changed from: private */
    public void startActivityFromGalleryMultiImg() {
        this.mImgConfig.isImgFromCamera = false;
        Intent intent = new Intent();
        intent.putExtra("android.intent.extra.LOCAL_ONLY", !this.mImgConfig.allowOnlineImages);
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        intent.setAction("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), 5341);
        if (this.mImgConfig.debug) {
            Log.d(ImageTags.Tags.TAG, "Gallery Start with Multiple Images mode");
        }
    }

    /* access modifiers changed from: private */
    public void startActivityFromCamera() {
        this.mImgConfig.isImgFromCamera = true;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        this.mImageUri = FileProvider.getUriForFile(this, getApplicationContext().getPackageName() + ".provider", this.destination);
        intent.putExtra("output", this.mImageUri);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), 1888);
        if (this.mImgConfig.debug) {
            Log.d(ImageTags.Tags.TAG, "Camera Start");
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Uri uri = this.mImageUri;
        if (uri != null) {
            bundle.putString(ImageTags.Tags.CAMERA_IMAGE_URI, uri.toString());
            bundle.putSerializable("IMG_CONFIG", this.mImgConfig);
        }
        AlertDialog alertDialog2 = this.alertDialog;
        bundle.putBoolean(ImageTags.Tags.IS_ALERT_SHOWING, alertDialog2 == null ? false : alertDialog2.isShowing());
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.containsKey(ImageTags.Tags.CAMERA_IMAGE_URI)) {
            this.mImageUri = Uri.parse(bundle.getString(ImageTags.Tags.CAMERA_IMAGE_URI));
            this.destination = new File(this.mImageUri.getPath());
            this.mImgConfig = (ImageConfig) bundle.getSerializable("IMG_CONFIG");
        }
        if (bundle.getBoolean(ImageTags.Tags.IS_ALERT_SHOWING, false)) {
            AlertDialog alertDialog2 = this.alertDialog;
            if (alertDialog2 == null) {
                pickImage();
            } else {
                alertDialog2.show();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.mImgConfig.debug) {
            Log.d(ImageTags.Tags.TAG, "onActivityResult() called with: requestCode = [" + i + "], resultCode = [" + i2 + "], data = [" + intent + "]");
        }
        if (i2 != -1) {
            Intent intent2 = new Intent();
            intent2.setAction(ImageTags.Action.SERVICE_ACTION);
            intent2.putExtra("PICK_ERROR", "user did not select any image");
            sendBroadcast(intent2);
            finish();
        } else if (i == 43) {
            processOneImage(intent);
        } else if (i == 1888) {
            new CompressImageTask(this.destination.getAbsolutePath(), this.mImgConfig, this).execute(new Void[0]);
        } else if (i == 5341) {
            processMutliPhoto(intent);
        }
    }

    private void processMutliPhoto(Intent intent) {
        if (intent.getClipData() == null) {
            processOneImage(intent);
            return;
        }
        this.listOfImgs = ImageProcessing.processMultiImage(this, intent);
        List<String> list = this.listOfImgs;
        if (list == null || list.size() <= 0) {
            String clipData = intent.getClipData().toString();
            if (clipData != null && clipData.contains("com.google.android.apps.photos")) {
                ClipData clipData2 = intent.getClipData();
                for (int i = 0; i < clipData2.getItemCount(); i++) {
                    this.listOfImgs.add(FileProcessing.getPath(this, clipData2.getItemAt(i).getUri()));
                }
                new CompressImageTask(this.listOfImgs, this.mImgConfig, this).execute(new Void[0]);
                return;
            }
            return;
        }
        new CompressImageTask(this.listOfImgs, this.mImgConfig, this).execute(new Void[0]);
    }

    public void processOneImage(Intent intent) {
        try {
            Uri data = intent.getData();
            if (data == null) {
                return;
            }
            if (data.toString().contains("com.google.android.apps.docs.storage")) {
                new SaveImageFromGoogleDriveTask(getCacheDir().getPath(), this.mImgConfig, data, this).execute(new Void[0]);
            } else {
                new CompressImageTask(FileProcessing.getPath(this, data), this.mImgConfig, this).execute(new Void[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public void finishActivity(List<String> list) {
        Intent intent = new Intent();
        intent.putExtra(ImagePicker.EXTRA_IMAGE_PATH, (Serializable) list);
        setResult(-1, intent);
        finish();
    }

    private void pickImageWrapper() {
        if (Build.VERSION.SDK_INT >= 23) {
            ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            if ((this.mImgConfig.mode == ImagePicker.Mode.CAMERA || this.mImgConfig.mode == ImagePicker.Mode.CAMERA_AND_GALLERY) && !addPermission(arrayList2, "android.permission.CAMERA")) {
                arrayList.add(getString(C5079R.string.media_picker_camera));
            }
            if (!addPermission(arrayList2, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                arrayList.add(getString(C5079R.string.media_picker_read_Write_external_storage));
            }
            if (arrayList2.size() <= 0) {
                pickImage();
            } else if (arrayList.size() > 0) {
                StringBuilder sb = new StringBuilder(getString(C5079R.string.media_picker_you_need_to_grant_access_to) + ((String) arrayList.get(0)));
                for (int i = 1; i < arrayList.size(); i++) {
                    sb.append(", ");
                    sb.append((String) arrayList.get(i));
                }
                showMessageOKCancel(sb.toString(), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ImageActivity imageActivity = ImageActivity.this;
                        List list = arrayList2;
                        ActivityCompat.requestPermissions(imageActivity, (String[]) list.toArray(new String[list.size()]), 123);
                    }
                });
            } else {
                ActivityCompat.requestPermissions(this, (String[]) arrayList2.toArray(new String[arrayList2.size()]), 123);
            }
        } else {
            pickImage();
        }
    }

    private void showMessageOKCancel(String str, DialogInterface.OnClickListener onClickListener) {
        new AlertDialog.Builder(this).setMessage(str).setPositiveButton(getString(C5079R.string.media_picker_ok), onClickListener).setNegativeButton(getString(C5079R.string.media_picker_cancel), (DialogInterface.OnClickListener) null).create().show();
    }

    private boolean addPermission(List<String> list, String str) {
        if (ActivityCompat.checkSelfPermission(this, str) == 0) {
            return true;
        }
        list.add(str);
        return ActivityCompat.shouldShowRequestPermissionRationale(this, str);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 123) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("android.permission.CAMERA", 0);
        hashMap.put("android.permission.WRITE_EXTERNAL_STORAGE", 0);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            hashMap.put(strArr[i2], Integer.valueOf(iArr[i2]));
        }
        if (((Integer) hashMap.get("android.permission.CAMERA")).intValue() == 0 && ((Integer) hashMap.get("android.permission.WRITE_EXTERNAL_STORAGE")).intValue() == 0) {
            pickImage();
        } else {
            Toast.makeText(this, getString(C5079R.string.media_picker_some_permission_is_denied), 0).show();
        }
    }

    private static class CompressImageTask extends AsyncTask<Void, Void, Void> {
        private List<String> destinationPaths = new ArrayList();
        private final List<String> listOfImgs;
        private WeakReference<ImageActivity> mContext;
        private final ImageConfig mImgConfig;

        CompressImageTask(List<String> list, ImageConfig imageConfig, ImageActivity imageActivity) {
            this.listOfImgs = list;
            this.mContext = new WeakReference<>(imageActivity);
            this.mImgConfig = imageConfig;
        }

        CompressImageTask(String str, ImageConfig imageConfig, ImageActivity imageActivity) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            this.listOfImgs = arrayList;
            this.mContext = new WeakReference<>(imageActivity);
            this.mImgConfig = imageConfig;
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(Void... voidArr) {
            File file;
            for (String file2 : this.listOfImgs) {
                File file3 = new File(file2);
                if (this.mImgConfig.isImgFromCamera) {
                    file = file3;
                } else {
                    String str = this.mImgConfig.directory;
                    file = new File(str, Utility.getRandomString() + this.mImgConfig.extension.getValue());
                }
                this.destinationPaths.add(file.getAbsolutePath());
                try {
                    Utility.compressAndRotateIfNeeded(file3, file, this.mImgConfig.compressLevel.getValue(), this.mImgConfig.reqWidth, this.mImgConfig.reqHeight);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            ImageActivity imageActivity = (ImageActivity) this.mContext.get();
            if (imageActivity != null) {
                imageActivity.finishActivity(this.destinationPaths);
                Intent intent = new Intent();
                intent.setAction(ImageTags.Action.SERVICE_ACTION);
                intent.putExtra(ImageTags.Tags.IMAGE_PATH, (Serializable) this.destinationPaths);
                imageActivity.sendBroadcast(intent);
            }
        }
    }

    private static class SaveImageFromGoogleDriveTask extends AsyncTask<Void, Void, Void> {
        private List<String> destinationPaths = new ArrayList();
        private List<Uri> destinationUris;
        boolean filenotfoundexecption;
        private final List<String> listOfImgs;
        private WeakReference<ImageActivity> mContext;
        private final ImageConfig mImgConfig;

        SaveImageFromGoogleDriveTask(String str, ImageConfig imageConfig, Uri uri, ImageActivity imageActivity) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            this.listOfImgs = arrayList;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(uri);
            this.destinationUris = arrayList2;
            this.mContext = new WeakReference<>(imageActivity);
            this.mImgConfig = imageConfig;
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(Void... voidArr) {
            for (int i = 0; i < this.listOfImgs.size(); i++) {
                String str = this.listOfImgs.get(i);
                try {
                    String str2 = str + "/" + ("drive_img_" + System.currentTimeMillis() + ".jpg");
                    if (saveFile(this.destinationUris.get(i), str2)) {
                        this.destinationPaths.add(str2);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            new CompressImageTask(this.destinationPaths, this.mImgConfig, (ImageActivity) this.mContext.get()).execute(new Void[0]);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            r5.filenotfoundexecption = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
            return false;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean saveFile(android.net.Uri r6, java.lang.String r7) throws java.io.IOException {
            /*
                r5 = this;
                r0 = 0
                r5.filenotfoundexecption = r0
                r1 = 1
                java.lang.ref.WeakReference<net.alhazmy13.mediapicker.Image.ImageActivity> r2 = r5.mContext     // Catch:{ FileNotFoundException -> 0x0015 }
                java.lang.Object r2 = r2.get()     // Catch:{ FileNotFoundException -> 0x0015 }
                net.alhazmy13.mediapicker.Image.ImageActivity r2 = (net.alhazmy13.mediapicker.Image.ImageActivity) r2     // Catch:{ FileNotFoundException -> 0x0015 }
                android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0015 }
                java.io.InputStream r6 = r2.openInputStream(r6)     // Catch:{ FileNotFoundException -> 0x0015 }
                goto L_0x001c
            L_0x0015:
                r6 = move-exception
                r6.printStackTrace()
                r5.filenotfoundexecption = r1
                r6 = 0
            L_0x001c:
                int r2 = r6.available()     // Catch:{ NullPointerException -> 0x0042 }
                java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x003f }
                r3.<init>(r6)     // Catch:{ IOException -> 0x003f }
                java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x003f }
                java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x003f }
                r4.<init>(r7, r0)     // Catch:{ IOException -> 0x003f }
                r6.<init>(r4)     // Catch:{ IOException -> 0x003f }
                byte[] r7 = new byte[r2]     // Catch:{ IOException -> 0x003f }
                r3.read(r7)     // Catch:{ IOException -> 0x003f }
            L_0x0034:
                r6.write(r7)     // Catch:{ IOException -> 0x003f }
                int r2 = r3.read(r7)     // Catch:{ IOException -> 0x003f }
                r4 = -1
                if (r2 != r4) goto L_0x0034
                goto L_0x0044
            L_0x003f:
                r5.filenotfoundexecption = r1     // Catch:{ NullPointerException -> 0x0042 }
                return r0
            L_0x0042:
                r5.filenotfoundexecption = r1
            L_0x0044:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: net.alhazmy13.mediapicker.Image.ImageActivity.SaveImageFromGoogleDriveTask.saveFile(android.net.Uri, java.lang.String):boolean");
        }
    }
}
