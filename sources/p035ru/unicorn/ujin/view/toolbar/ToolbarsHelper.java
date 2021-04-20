package p035ru.unicorn.ujin.view.toolbar;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;

/* renamed from: ru.unicorn.ujin.view.toolbar.ToolbarsHelper */
public class ToolbarsHelper {
    private Context context;
    private OnClick onClick;

    /* renamed from: ru.unicorn.ujin.view.toolbar.ToolbarsHelper$OnClick */
    public interface OnClick {
        void onClickIcon();
    }

    public ToolbarsHelper(Context context2, OnClick onClick2) {
        this.onClick = onClick2;
        this.context = context2;
    }

    public ToolbarsHelper(Context context2) {
        this.context = context2;
    }

    public ArrayList<View> createSingleButton(int i) {
        ImageView imageView = new ImageView(this.context);
        if (i != 0) {
            imageView.setImageResource(i);
        }
        ArrayList<View> arrayList = new ArrayList<>();
        arrayList.add(imageView);
        return arrayList;
    }
}
