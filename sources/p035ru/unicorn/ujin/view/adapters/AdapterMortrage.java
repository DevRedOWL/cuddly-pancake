package p035ru.unicorn.ujin.view.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Mortrage;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.viewModel.RealmViewModel;

/* renamed from: ru.unicorn.ujin.view.adapters.AdapterMortrage */
public class AdapterMortrage extends BaseAdapter {
    /* access modifiers changed from: private */
    public String complexId;
    private LayoutInflater mLayoutInflater;
    /* access modifiers changed from: private */
    public RealmViewModel viewModel;

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    public AdapterMortrage(Context context, RealmViewModel realmViewModel, String str) {
        this.viewModel = realmViewModel;
        this.complexId = str;
        this.mLayoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public int getCount() {
        return this.viewModel.getComplexInfoById(this.complexId).getMortrageList().size();
    }

    public View getView(final int i, View view, ViewGroup viewGroup) {
        View inflate = this.mLayoutInflater.inflate(R.layout.adapter_ipoteka, viewGroup, false);
        Mortrage mortrage = this.viewModel.getComplexInfoById(this.complexId).getMortrageList().get(i);
        TextView textView = (TextView) inflate.findViewById(R.id.textViewDescription);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.imageView_ipoteka_ID);
        ((TextView) inflate.findViewById(R.id.textTitle)).setText(mortrage.getTitle());
        ArrayList arrayList = new ArrayList(mortrage.getText());
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sb.append("- ");
            sb.append((String) arrayList.get(i2));
            sb.append("\n");
        }
        textView.setText(sb.toString());
        if (mortrage.getImgLogoBytes() != null) {
            GlideApp.with((View) imageView).load(mortrage.getImgLogoBytes()).into(imageView);
        }
        GlideApp.with((View) imageView).load(mortrage.getLogo()).listener((RequestListener) new RequestListener<Drawable>() {
            public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                return false;
            }

            public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                AdapterMortrage.this.viewModel.updateComplexInfoMortrageImage(AdapterMortrage.this.complexId, i, byteArrayOutputStream.toByteArray());
                return false;
            }
        }).into(imageView);
        return inflate;
    }
}
