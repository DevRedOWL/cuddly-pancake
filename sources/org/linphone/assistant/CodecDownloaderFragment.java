package org.linphone.assistant;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.linphone.C5321R;
import org.linphone.LinphoneManager;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.OpenH264DownloadHelperListener;
import org.linphone.core.PayloadType;
import org.linphone.tools.OpenH264DownloadHelper;

public class CodecDownloaderFragment extends Fragment {
    /* access modifiers changed from: private */
    public ProgressBar bar;
    /* access modifiers changed from: private */
    public TextView downloaded;
    /* access modifiers changed from: private */
    public TextView downloading;
    /* access modifiers changed from: private */
    public TextView downloadingInfo;
    /* access modifiers changed from: private */
    public Handler mHandler = new Handler();

    /* renamed from: no */
    private Button f6344no;
    /* access modifiers changed from: private */

    /* renamed from: ok */
    public Button f6345ok;
    private TextView question;
    private Button yes;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5321R.layout.assistant_codec_downloader, viewGroup, false);
        this.question = (TextView) inflate.findViewById(C5321R.C5324id.question);
        this.downloading = (TextView) inflate.findViewById(C5321R.C5324id.downloading);
        this.downloaded = (TextView) inflate.findViewById(C5321R.C5324id.downloaded);
        this.yes = (Button) inflate.findViewById(C5321R.C5324id.answerYes);
        this.f6344no = (Button) inflate.findViewById(C5321R.C5324id.answerNo);
        this.f6345ok = (Button) inflate.findViewById(C5321R.C5324id.answerOk);
        this.bar = (ProgressBar) inflate.findViewById(C5321R.C5324id.progressBar);
        this.downloadingInfo = (TextView) inflate.findViewById(C5321R.C5324id.downloadingInfo);
        final OpenH264DownloadHelper openH264DownloadHelper = LinphoneManager.getInstance().getOpenH264DownloadHelper();
        openH264DownloadHelper.setOpenH264HelperListener(new OpenH264DownloadHelperListener() {
            public void OnProgress(final int i, final int i2) {
                CodecDownloaderFragment.this.mHandler.post(new Runnable() {
                    public void run() {
                        if (i <= i2) {
                            CodecDownloaderFragment.this.hideAllItems();
                            TextView access$100 = CodecDownloaderFragment.this.downloadingInfo;
                            access$100.setText(i + " / " + i2);
                            CodecDownloaderFragment.this.downloadingInfo.setVisibility(0);
                            CodecDownloaderFragment.this.downloading.setVisibility(0);
                            CodecDownloaderFragment.this.bar.setMax(i2);
                            CodecDownloaderFragment.this.bar.setProgress(i);
                            CodecDownloaderFragment.this.bar.setVisibility(0);
                            return;
                        }
                        CodecDownloaderFragment.this.hideAllItems();
                        CodecDownloaderFragment.this.downloaded.setVisibility(0);
                        if (Build.VERSION.SDK_INT >= 22) {
                            CodecDownloaderFragment.this.enabledH264(true);
                            AssistantActivity.instance().endDownloadCodec();
                            return;
                        }
                        AssistantActivity.instance().restartApplication();
                    }
                });
            }

            public void OnError(String str) {
                CodecDownloaderFragment.this.mHandler.post(new Runnable() {
                    public void run() {
                        CodecDownloaderFragment.this.hideAllItems();
                        CodecDownloaderFragment.this.downloaded.setText("Sorry an error has occurred.");
                        CodecDownloaderFragment.this.downloaded.setVisibility(0);
                        CodecDownloaderFragment.this.f6345ok.setVisibility(0);
                        CodecDownloaderFragment.this.enabledH264(false);
                        AssistantActivity.instance().endDownloadCodec();
                    }
                });
            }
        });
        this.yes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                CodecDownloaderFragment.this.hideAllItems();
                CodecDownloaderFragment.this.bar.setVisibility(0);
                openH264DownloadHelper.downloadCodec();
            }
        });
        this.f6344no.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                CodecDownloaderFragment.this.enabledH264(false);
                AssistantActivity.instance().endDownloadCodec();
            }
        });
        hideAllItems();
        if (bundle != null) {
            if (bundle.containsKey("question")) {
                this.question.setVisibility(((Integer) bundle.getSerializable("question")).intValue());
            } else {
                this.question.setVisibility(0);
            }
            if (bundle.containsKey("yes")) {
                this.yes.setVisibility(((Integer) bundle.getSerializable("yes")).intValue());
            } else {
                this.yes.setVisibility(0);
            }
            if (bundle.containsKey("no")) {
                this.f6344no.setVisibility(((Integer) bundle.getSerializable("no")).intValue());
            } else {
                this.f6344no.setVisibility(0);
            }
            if (bundle.containsKey("downloading")) {
                this.downloading.setVisibility(((Integer) bundle.getSerializable("downloading")).intValue());
            }
            if (bundle.containsKey("downloaded")) {
                this.downloaded.setVisibility(((Integer) bundle.getSerializable("downloaded")).intValue());
            }
            if (bundle.containsKey("bar")) {
                this.bar.setVisibility(((Integer) bundle.getSerializable("bar")).intValue());
            }
            if (bundle.containsKey("downloadingInfo")) {
                this.downloadingInfo.setVisibility(((Integer) bundle.getSerializable("downloadingInfo")).intValue());
            }
            if (bundle.containsKey("ok")) {
                this.f6345ok.setVisibility(((Integer) bundle.getSerializable("ok")).intValue());
            }
        } else {
            this.yes.setVisibility(0);
            this.question.setVisibility(0);
            this.f6344no.setVisibility(0);
        }
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        TextView textView = this.question;
        if (textView != null) {
            bundle.putSerializable("question", Integer.valueOf(textView.getVisibility()));
        }
        TextView textView2 = this.downloading;
        if (textView2 != null) {
            bundle.putSerializable("downloading", Integer.valueOf(textView2.getVisibility()));
        }
        TextView textView3 = this.downloaded;
        if (textView3 != null) {
            bundle.putSerializable("downloaded", Integer.valueOf(textView3.getVisibility()));
        }
        Button button = this.yes;
        if (button != null) {
            bundle.putSerializable("yes", Integer.valueOf(button.getVisibility()));
        }
        Button button2 = this.f6344no;
        if (button2 != null) {
            bundle.putSerializable("no", Integer.valueOf(button2.getVisibility()));
        }
        Button button3 = this.f6345ok;
        if (button3 != null) {
            bundle.putSerializable("ok", Integer.valueOf(button3.getVisibility()));
        }
        ProgressBar progressBar = this.bar;
        if (progressBar != null) {
            bundle.putSerializable("bar", Integer.valueOf(progressBar.getVisibility()));
        }
        TextView textView4 = this.downloadingInfo;
        if (textView4 != null) {
            bundle.putSerializable("downloadingInfo", Integer.valueOf(textView4.getVisibility()));
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: private */
    public void hideAllItems() {
        TextView textView = this.question;
        if (textView != null) {
            textView.setVisibility(4);
        }
        TextView textView2 = this.downloading;
        if (textView2 != null) {
            textView2.setVisibility(4);
        }
        TextView textView3 = this.downloaded;
        if (textView3 != null) {
            textView3.setVisibility(4);
        }
        Button button = this.yes;
        if (button != null) {
            button.setVisibility(4);
        }
        Button button2 = this.f6344no;
        if (button2 != null) {
            button2.setVisibility(4);
        }
        Button button3 = this.f6345ok;
        if (button3 != null) {
            button3.setVisibility(4);
        }
        ProgressBar progressBar = this.bar;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        TextView textView4 = this.downloadingInfo;
        if (textView4 != null) {
            textView4.setVisibility(4);
        }
    }

    /* access modifiers changed from: private */
    public void enabledH264(boolean z) {
        PayloadType payloadType = null;
        for (PayloadType payloadType2 : LinphoneManager.getLc().getVideoCodecs()) {
            if (payloadType2.getMime().equals("H264")) {
                payloadType = payloadType2;
            }
        }
        if (payloadType != null) {
            try {
                LinphoneManager.getLc().enablePayloadType(payloadType, z);
            } catch (LinphoneCoreException e) {
                e.printStackTrace();
            }
        }
    }
}
