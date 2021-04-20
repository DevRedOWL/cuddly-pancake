package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.squareup.picasso.Picasso;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.ImageFragment */
public class ImageFragment extends Fragment {
    static final String ARGUMENT_PAGE_NUMBER = "arg_url";
    ImageView imageView;
    String url;

    static ImageFragment newInstance(String str) {
        ImageFragment imageFragment = new ImageFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARGUMENT_PAGE_NUMBER, str);
        imageFragment.setArguments(bundle);
        return imageFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.url = getArguments().getString(ARGUMENT_PAGE_NUMBER);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.tutorial_fragment, (ViewGroup) null);
        this.imageView = (ImageView) inflate.findViewById(R.id.image);
        Picasso.get().load(this.url).placeholder((int) R.drawable.ic_svg_zaglushka).into(this.imageView);
        return inflate;
    }
}
