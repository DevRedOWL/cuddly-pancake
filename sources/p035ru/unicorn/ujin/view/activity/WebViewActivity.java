package p035ru.unicorn.ujin.view.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import okhttp3.HttpUrl;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.WebViewActivity;

/* renamed from: ru.unicorn.ujin.view.activity.WebViewActivity */
public class WebViewActivity extends AppCompatActivity {
    private static final String HTTP = "http";
    private static final String HTTPS_SCHEME = "https://";
    private static final String PDF_POSTFIX = ".pdf";
    private static final String PDF_VIEWER_URL = "https://docs.google.com/gview?embedded=true&url=";
    public static final String URL = "url";

    public static void start(Context context, String str) {
        Intent intent = new Intent(context, WebViewActivity.class);
        intent.putExtra("url", str);
        context.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_web_view);
        findViewById(R.id.imageLogo).setVisibility(0);
        findViewById(R.id.imageBack).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                WebViewActivity.this.lambda$onCreate$0$WebViewActivity(view);
            }
        });
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        final WebView webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        String stringExtra = getIntent().getStringExtra("url");
        webView.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.loadUrl(str);
                return false;
            }

            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                AlertDialog.Builder builder = new AlertDialog.Builder(WebViewActivity.this.getBaseContext());
                int primaryError = sslError.getPrimaryError();
                String str = (primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? "Ошибка сертификата SSL." : "Нет доверия органу сертификации." : "Неверное имя хоста." : "Сертификат просрочен." : "Сертификат не действителен.") + " Вы желаете продолжить просмотр?";
                builder.setTitle((CharSequence) "Ошибка сертификата SSL");
                builder.setMessage((CharSequence) str);
                builder.setPositiveButton((CharSequence) "Продолжить", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(sslErrorHandler) {
                    private final /* synthetic */ SslErrorHandler f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f$0.proceed();
                    }
                });
                builder.setNegativeButton((CharSequence) "Отменить", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(sslErrorHandler, webView) {
                    private final /* synthetic */ SslErrorHandler f$0;
                    private final /* synthetic */ WebView f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        WebViewActivity.C57841.lambda$onReceivedSslError$1(this.f$0, this.f$1, dialogInterface, i);
                    }
                });
                builder.create().show();
            }

            static /* synthetic */ void lambda$onReceivedSslError$1(SslErrorHandler sslErrorHandler, WebView webView, DialogInterface dialogInterface, int i) {
                sslErrorHandler.cancel();
                webView.stopLoading();
            }

            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                webView.loadUrl(webResourceRequest.getUrl().toString());
                return false;
            }

            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                progressBar.setVisibility(8);
                webView.setVisibility(0);
            }

            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                webView.setVisibility(8);
                progressBar.setVisibility(0);
            }
        });
        if (HttpUrl.parse(stringExtra) == null && !stringExtra.contains("http") && !StringUtils.contains((CharSequence) stringExtra, (CharSequence) "http")) {
            stringExtra = HTTPS_SCHEME + stringExtra;
        }
        if (StringUtils.isNotBlank(stringExtra) && stringExtra.contains(PDF_POSTFIX)) {
            stringExtra = PDF_VIEWER_URL + stringExtra;
        }
        webView.loadUrl(stringExtra);
    }

    public /* synthetic */ void lambda$onCreate$0$WebViewActivity(View view) {
        finish();
    }
}
