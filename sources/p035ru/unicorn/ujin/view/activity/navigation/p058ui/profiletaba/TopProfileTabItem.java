package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.TopProfileTabItem */
public class TopProfileTabItem extends ConstraintLayout {
    private ImageView arrow;
    private ImageView icon;
    TextView subtitle;
    TextView title;

    public TopProfileTabItem(Context context) {
        super(context);
        init(context, (AttributeSet) null);
    }

    public TopProfileTabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public TopProfileTabItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    private void init(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.item_top_profile_field, this, true);
        this.icon = (ImageView) findViewById(R.id.icon);
        this.arrow = (ImageView) findViewById(R.id.arrow);
        this.title = (TextView) findViewById(R.id.title);
        this.subtitle = (TextView) findViewById(R.id.subtitle);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5619R.styleable.TopProfileView, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId != 0) {
                this.icon.setImageDrawable(AppCompatResources.getDrawable(context, resourceId));
            }
            this.title.setText(obtainStyledAttributes.getString(4));
            this.subtitle.setText(obtainStyledAttributes.getString(3));
            obtainStyledAttributes.recycle();
        }
    }
}
