package net.alhazmy13.mediapicker.Video;

import android.app.AlertDialog;
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
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.alhazmy13.mediapicker.C5079R;
import net.alhazmy13.mediapicker.FileProcessing;
import net.alhazmy13.mediapicker.Utility;
import net.alhazmy13.mediapicker.Video.VideoPicker;
import net.alhazmy13.mediapicker.Video.VideoTags;

public class VideoActivity extends AppCompatActivity {
    /* access modifiers changed from: private */
    public AlertDialog alertDialog;
    private File destination;
    private List<String> mListOfVideos;
    /* access modifiers changed from: private */
    public VideoConfig mVideoConfig;
    private Uri mVideoUri;

    public static Intent getCallingIntent(Context context, VideoConfig videoConfig) {
        Intent intent = new Intent(context, VideoActivity.class);
        intent.putExtra("IMG_CONFIG", videoConfig);
        return intent;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            this.mVideoConfig = (VideoConfig) intent.getSerializableExtra("IMG_CONFIG");
        }
        if (bundle == null) {
            pickVideoWrapper();
            this.mListOfVideos = new ArrayList();
        }
        if (this.mVideoConfig.debug) {
            Log.d(VideoTags.Tags.TAG, this.mVideoConfig.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        AlertDialog alertDialog2 = this.alertDialog;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        super.onPause();
    }

    private void pickVideo() {
        Utility.createFolder(this.mVideoConfig.directory);
        String str = this.mVideoConfig.directory;
        this.destination = new File(str, Utility.getRandomString() + this.mVideoConfig.extension.getValue());
        int i = C50875.$SwitchMap$net$alhazmy13$mediapicker$Video$VideoPicker$Mode[this.mVideoConfig.mode.ordinal()];
        if (i == 1) {
            startActivityFromCamera();
        } else if (i != 2) {
            if (i == 3) {
                showFromCameraOrGalleryAlert();
            }
        } else if (this.mVideoConfig.allowMultiple) {
            startActivityFromGalleryMultiImg();
        } else {
            startActivityFromGallery();
        }
    }

    /* renamed from: net.alhazmy13.mediapicker.Video.VideoActivity$5 */
    static /* synthetic */ class C50875 {
        static final /* synthetic */ int[] $SwitchMap$net$alhazmy13$mediapicker$Video$VideoPicker$Mode = new int[VideoPicker.Mode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                net.alhazmy13.mediapicker.Video.VideoPicker$Mode[] r0 = net.alhazmy13.mediapicker.Video.VideoPicker.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$net$alhazmy13$mediapicker$Video$VideoPicker$Mode = r0
                int[] r0 = $SwitchMap$net$alhazmy13$mediapicker$Video$VideoPicker$Mode     // Catch:{ NoSuchFieldError -> 0x0014 }
                net.alhazmy13.mediapicker.Video.VideoPicker$Mode r1 = net.alhazmy13.mediapicker.Video.VideoPicker.Mode.CAMERA     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$net$alhazmy13$mediapicker$Video$VideoPicker$Mode     // Catch:{ NoSuchFieldError -> 0x001f }
                net.alhazmy13.mediapicker.Video.VideoPicker$Mode r1 = net.alhazmy13.mediapicker.Video.VideoPicker.Mode.GALLERY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$net$alhazmy13$mediapicker$Video$VideoPicker$Mode     // Catch:{ NoSuchFieldError -> 0x002a }
                net.alhazmy13.mediapicker.Video.VideoPicker$Mode r1 = net.alhazmy13.mediapicker.Video.VideoPicker.Mode.CAMERA_AND_GALLERY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.alhazmy13.mediapicker.Video.VideoActivity.C50875.<clinit>():void");
        }
    }

    private void showFromCameraOrGalleryAlert() {
        this.alertDialog = new AlertDialog.Builder(this).setTitle(getString(C5079R.string.media_picker_select_from)).setPositiveButton(getString(C5079R.string.media_picker_camera), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (VideoActivity.this.mVideoConfig.debug) {
                    Log.d(VideoTags.Tags.TAG, "Alert Dialog - Start From Camera");
                }
                VideoActivity.this.startActivityFromCamera();
                VideoActivity.this.alertDialog.dismiss();
            }
        }).setNegativeButton(getString(C5079R.string.media_picker_gallery), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (VideoActivity.this.mVideoConfig.debug) {
                    Log.d(VideoTags.Tags.TAG, "Alert Dialog - Start From Gallery");
                }
                if (VideoActivity.this.mVideoConfig.allowMultiple) {
                    VideoActivity.this.startActivityFromGalleryMultiImg();
                } else {
                    VideoActivity.this.startActivityFromGallery();
                }
                VideoActivity.this.alertDialog.dismiss();
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                if (VideoActivity.this.mVideoConfig.debug) {
                    Log.d(VideoTags.Tags.TAG, "Alert Dialog - Canceled");
                }
                VideoActivity.this.alertDialog.dismiss();
                VideoActivity.this.finish();
            }
        }).create();
        this.alertDialog.show();
    }

    /* access modifiers changed from: private */
    public void startActivityFromGallery() {
        this.mVideoConfig.isImgFromCamera = false;
        Intent intent = new Intent("android.intent.action.PICK");
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        intent.setType("video/*");
        startActivityForResult(intent, 43);
        if (this.mVideoConfig.debug) {
            Log.d(VideoTags.Tags.TAG, "Gallery Start with Single video mode");
        }
    }

    /* access modifiers changed from: private */
    public void startActivityFromGalleryMultiImg() {
        this.mVideoConfig.isImgFromCamera = false;
        Intent intent = new Intent();
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        intent.setAction("android.intent.action.GET_CONTENT");
        intent.setType("video/*");
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), 5341);
        if (this.mVideoConfig.debug) {
            Log.d(VideoTags.Tags.TAG, "Gallery Start with Multiple videos mode");
        }
    }

    /* access modifiers changed from: private */
    public void startActivityFromCamera() {
        this.mVideoConfig.isImgFromCamera = true;
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        this.mVideoUri = FileProvider.getUriForFile(this, getApplicationContext().getPackageName() + ".provider", this.destination);
        intent.putExtra("output", this.mVideoUri);
        startActivityForResult(Intent.createChooser(intent, "Select Video"), 1888);
        if (this.mVideoConfig.debug) {
            Log.d(VideoTags.Tags.TAG, "Camera Start");
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Uri uri = this.mVideoUri;
        if (uri != null) {
            bundle.putString(VideoTags.Tags.CAMERA_IMAGE_URI, uri.toString());
            bundle.putSerializable("IMG_CONFIG", this.mVideoConfig);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.containsKey(VideoTags.Tags.CAMERA_IMAGE_URI)) {
            this.mVideoUri = Uri.parse(bundle.getString(VideoTags.Tags.CAMERA_IMAGE_URI));
            this.destination = new File(this.mVideoUri.getPath());
            this.mVideoConfig = (VideoConfig) bundle.getSerializable("IMG_CONFIG");
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.mVideoConfig.debug) {
            Log.d(VideoTags.Tags.TAG, "onActivityResult() called with: requestCode = [" + i + "], resultCode = [" + i2 + "], data = [" + intent + "]");
        }
        if (i2 != -1) {
            Intent intent2 = new Intent();
            intent2.setAction(VideoTags.Action.SERVICE_ACTION);
            intent2.putExtra("PICK_ERROR", "user did not select any videos");
            sendBroadcast(intent2);
            finish();
        } else if (i == 43) {
            processOneVideo(intent);
        } else if (i == 1888) {
            new CompresVideoTask(this.destination.getAbsolutePath(), this.mVideoConfig, this).execute(new Void[0]);
        } else if (i == 5341) {
            if (intent.getClipData() == null) {
                processOneVideo(intent);
                return;
            }
            this.mListOfVideos = VideoProcessing.processMultiVideos(this, intent);
            new CompresVideoTask(this.mListOfVideos, this.mVideoConfig, this).execute(new Void[0]);
        }
    }

    private void processOneVideo(Intent intent) {
        try {
            new CompresVideoTask(FileProcessing.getVideoPath(intent.getData(), this), this.mVideoConfig, this).execute(new Void[0]);
        } catch (Exception e) {
            Intent intent2 = new Intent();
            intent2.setAction(VideoTags.Action.SERVICE_ACTION);
            intent2.putExtra("PICK_ERROR", "Issue with video path: " + e.getMessage());
            sendBroadcast(intent2);
            setResult(0, intent2);
            finish();
        }
    }

    /* access modifiers changed from: private */
    public void finishActivity(List<String> list) {
        Intent intent = new Intent();
        intent.setAction(VideoTags.Action.SERVICE_ACTION);
        Serializable serializable = (Serializable) list;
        intent.putExtra(VideoTags.Tags.VIDEO_PATH, serializable);
        sendBroadcast(intent);
        Intent intent2 = new Intent();
        intent2.putExtra(VideoPicker.EXTRA_VIDEO_PATH, serializable);
        setResult(-1, intent2);
        finish();
    }

    private void pickVideoWrapper() {
        if (Build.VERSION.SDK_INT >= 23) {
            ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            if ((this.mVideoConfig.mode == VideoPicker.Mode.CAMERA || this.mVideoConfig.mode == VideoPicker.Mode.CAMERA_AND_GALLERY) && !addPermission(arrayList2, "android.permission.CAMERA")) {
                arrayList.add(getString(C5079R.string.media_picker_camera));
            }
            if (!addPermission(arrayList2, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                arrayList.add(getString(C5079R.string.media_picker_read_Write_external_storage));
            }
            if (arrayList2.size() <= 0) {
                pickVideo();
            } else if (arrayList.size() > 0) {
                StringBuilder sb = new StringBuilder(getString(C5079R.string.media_picker_you_need_to_grant_access_to) + ((String) arrayList.get(0)));
                for (int i = 1; i < arrayList.size(); i++) {
                    sb.append(", ");
                    sb.append((String) arrayList.get(i));
                }
                showMessageOKCancel(sb.toString(), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        VideoActivity videoActivity = VideoActivity.this;
                        List list = arrayList2;
                        ActivityCompat.requestPermissions(videoActivity, (String[]) list.toArray(new String[list.size()]), 123);
                    }
                });
            } else {
                ActivityCompat.requestPermissions(this, (String[]) arrayList2.toArray(new String[arrayList2.size()]), 123);
            }
        } else {
            pickVideo();
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
            pickVideo();
        } else {
            Toast.makeText(this, getString(C5079R.string.media_picker_some_permission_is_denied), 0).show();
        }
    }

    private static class CompresVideoTask extends AsyncTask<Void, Void, Void> {
        private List<String> destinationPaths = new ArrayList();
        private final List<String> listOfImgs;
        private WeakReference<VideoActivity> mContext;
        private final VideoConfig mVideoConfig;

        CompresVideoTask(List<String> list, VideoConfig videoConfig, VideoActivity videoActivity) {
            this.listOfImgs = list;
            this.mContext = new WeakReference<>(videoActivity);
            this.mVideoConfig = videoConfig;
        }

        CompresVideoTask(String str, VideoConfig videoConfig, VideoActivity videoActivity) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            this.listOfImgs = arrayList;
            this.mContext = new WeakReference<>(videoActivity);
            this.mVideoConfig = videoConfig;
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(Void... voidArr) {
            File file;
            for (String file2 : this.listOfImgs) {
                File file3 = new File(file2);
                if (this.mVideoConfig.isImgFromCamera) {
                    file = file3;
                } else {
                    String str = this.mVideoConfig.directory;
                    file = new File(str, Utility.getRandomString() + this.mVideoConfig.extension.getValue());
                    FileProcessing.copyDirectory(file3, file);
                }
                this.destinationPaths.add(file.getAbsolutePath());
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            VideoActivity videoActivity = (VideoActivity) this.mContext.get();
            if (videoActivity != null) {
                videoActivity.finishActivity(this.destinationPaths);
            }
        }
    }
}
