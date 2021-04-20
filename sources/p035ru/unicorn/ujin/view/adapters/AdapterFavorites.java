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
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import java.io.ByteArrayOutputStream;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Favourite;
import p035ru.unicorn.ujin.viewModel.RealmViewModel;

/* renamed from: ru.unicorn.ujin.view.adapters.AdapterFavorites */
public class AdapterFavorites extends BaseAdapter {
    private LayoutInflater mLayoutInflater;
    private OnItemClickListener onItemClickListener;
    TextView tvInfo;
    /* access modifiers changed from: private */
    public RealmViewModel viewModel;

    /* renamed from: ru.unicorn.ujin.view.adapters.AdapterFavorites$OnItemClickListener */
    public interface OnItemClickListener {
        void onItemClick(String str);
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener2) {
        this.onItemClickListener = onItemClickListener2;
    }

    public AdapterFavorites(Context context, RealmViewModel realmViewModel) {
        this.viewModel = realmViewModel;
        this.mLayoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public int getCount() {
        return this.viewModel.getFavouritesList().size();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = this.mLayoutInflater.inflate(R.layout.adapter_flats, viewGroup, false);
        final Favourite favourite = this.viewModel.getFavouritesList().get(i);
        inflate.setOnClickListener(new View.OnClickListener(favourite) {
            private final /* synthetic */ Favourite f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                AdapterFavorites.this.lambda$getView$0$AdapterFavorites(this.f$1, view);
            }
        });
        ((TextView) inflate.findViewById(R.id.tvComplexTitle)).setText(favourite.getComplexTitle());
        this.tvInfo = (TextView) inflate.findViewById(R.id.tvInfo);
        TextView textView = this.tvInfo;
        textView.setText(favourite.getRooms() + " ком. • " + favourite.getSquare() + " м² • этаж " + favourite.getFloor() + "/" + favourite.getFloorTotal());
        StringBuilder sb = new StringBuilder();
        sb.append(favourite.getPrice().longValue());
        sb.append("");
        StringBuffer stringBuffer = new StringBuffer(sb.toString());
        int length = stringBuffer.length();
        if (length > 3) {
            stringBuffer.insert(length - 3, " ");
        }
        if (length > 6) {
            stringBuffer.insert(length - 6, " ");
        }
        ((TextView) inflate.findViewById(R.id.tvPrice)).setText(stringBuffer.toString() + " ₽");
        if (favourite.getPriceOld() != null) {
            StringBuffer stringBuffer2 = new StringBuffer(favourite.getPriceOld() + "");
            int length2 = stringBuffer2.length();
            if (length2 > 3) {
                stringBuffer2.insert(length2 - 3, " ");
            }
            if (length2 > 6) {
                stringBuffer2.insert(length2 - 6, " ");
            }
            TextView textView2 = (TextView) inflate.findViewById(R.id.tvPriceOld);
            textView2.setText(stringBuffer2.toString() + " ₽");
            textView2.setPaintFlags(textView2.getPaintFlags() | 16);
        }
        if (favourite.getAction() != null && favourite.getAction().booleanValue()) {
            inflate.findViewById(R.id.ivAction).setVisibility(0);
        }
        ImageView imageView = (ImageView) inflate.findViewById(R.id.ivFlatHeart);
        if (favourite.getFavorites().intValue() == 1) {
            imageView.setImageResource(R.drawable.icon_favourite_on);
        } else {
            imageView.setImageResource(R.drawable.icon_favourite_off);
        }
        imageView.setOnClickListener(new View.OnClickListener(favourite) {
            private final /* synthetic */ Favourite f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                AdapterFavorites.this.lambda$getView$1$AdapterFavorites(this.f$1, view);
            }
        });
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.ivFlatPlan);
        if (favourite.getImgSmall().indexOf("clear.png") > 0) {
            imageView2.setImageResource(R.drawable.empty_image);
        } else {
            if (favourite.getImgSmallBytes() != null) {
                Glide.with((View) imageView2).load(favourite.getImgSmallBytes()).into(imageView2);
            }
            Glide.with((View) imageView2).load(favourite.getImgSmall()).listener(new RequestListener<Drawable>() {
                public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                    return false;
                }

                public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                    Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                    AdapterFavorites.this.viewModel.updateFavouriteSmallPic(favourite, byteArrayOutputStream.toByteArray());
                    return false;
                }
            }).into(imageView2);
        }
        return inflate;
    }

    public /* synthetic */ void lambda$getView$0$AdapterFavorites(Favourite favourite, View view) {
        this.onItemClickListener.onItemClick(favourite.getId());
    }

    public /* synthetic */ void lambda$getView$1$AdapterFavorites(Favourite favourite, View view) {
        removeFlatFromFavourites(ProfileLocalRepository.Companion.getInstance().getUserToken(), favourite.getId());
    }

    private void removeFlatFromFavourites(String str, String str2) {
        this.viewModel.requestUpdateFlatFavourite(str, str2, false, 0);
        notifyDataSetChanged();
    }
}
