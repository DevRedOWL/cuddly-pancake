package p035ru.unicorn.ujin.view.activity.tutorial.kortrosmsf;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.view.activity.tutorial.kortrosmsf.TutorialFragment */
public class TutorialFragment extends Fragment {
    static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";
    ImageView imageView;
    int resorceID;

    static TutorialFragment newInstance(int i) {
        TutorialFragment tutorialFragment = new TutorialFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARGUMENT_PAGE_NUMBER, i);
        tutorialFragment.setArguments(bundle);
        return tutorialFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.resorceID = getArguments().getInt(ARGUMENT_PAGE_NUMBER);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.tutorial_fragment, (ViewGroup) null);
        this.imageView = (ImageView) inflate.findViewById(R.id.image);
        this.imageView.setImageResource(this.resorceID);
        return inflate;
    }
}
