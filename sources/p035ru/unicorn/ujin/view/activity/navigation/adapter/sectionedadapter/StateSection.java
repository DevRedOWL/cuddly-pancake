package p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.BaseSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.StateSection */
public final class StateSection extends BaseSection<StateViewHolder> implements View.OnClickListener {
    private static final int STATE_EMPTY = 1;
    private static final int STATE_ERROR = 2;
    private static final int STATE_LOADING = 0;
    private boolean alone;
    private int backgroundResId;
    private String emptyAction;
    private PublishProcessor<BaseSection.Click> emptyActionClick;
    private String emptyMessage;
    private String error;
    private String errorAction;
    private PublishProcessor<BaseSection.Click> errorActionClick;
    private int state;
    private int textColor;

    public int getLayoutId() {
        return R.layout.item_state_section;
    }

    public int getSize() {
        return 1;
    }

    private StateSection(Builder builder) {
        this.alone = true;
        this.emptyActionClick = PublishProcessor.create();
        this.errorActionClick = PublishProcessor.create();
        show(false);
        this.emptyMessage = builder.emptyMessage;
        this.emptyAction = builder.emptyAction;
        this.errorAction = builder.errorAction;
        this.textColor = builder.textColor;
        this.backgroundResId = builder.backgroundResId;
        this.alone = builder.alone;
    }

    public void alone(boolean z) {
        if (this.alone != z) {
            this.alone = z;
            show(true, true);
        }
    }

    public PublishProcessor<BaseSection.Click> emptyActionClicks() {
        return this.emptyActionClick;
    }

    public PublishProcessor<BaseSection.Click> errorActionClicks() {
        return this.errorActionClick;
    }

    /* access modifiers changed from: protected */
    public StateViewHolder createViewHolder(View view) {
        return new StateViewHolder(view, this.textColor, this.backgroundResId, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(StateViewHolder stateViewHolder, int i, List<Object> list) {
        matchIfLonely(stateViewHolder);
        stateViewHolder.progress.setVisibility(this.state == 0 ? 0 : 8);
        int i2 = this.state;
        if (i2 == 0) {
            stateViewHolder.message.setVisibility(8);
            stateViewHolder.action.setVisibility(8);
        } else if (i2 == 1) {
            stateViewHolder.message.setText(this.emptyMessage);
            stateViewHolder.message.setVisibility(0);
            if (TextUtils.isEmpty(this.emptyAction)) {
                stateViewHolder.action.setVisibility(8);
                return;
            }
            stateViewHolder.action.setText(this.emptyAction);
            stateViewHolder.action.setVisibility(0);
        } else if (i2 == 2) {
            stateViewHolder.message.setText(this.error);
            stateViewHolder.message.setVisibility(0);
            if (TextUtils.isEmpty(this.errorAction)) {
                stateViewHolder.action.setVisibility(8);
                return;
            }
            stateViewHolder.action.setText(this.errorAction);
            stateViewHolder.action.setVisibility(0);
        }
    }

    public void showLoading() {
        this.state = 0;
        show(true, true);
    }

    public void setEmpty(String str, String str2) {
        this.state = 1;
        this.emptyMessage = str;
        this.emptyAction = str2;
    }

    public void showEmpty() {
        this.state = 1;
        show(true, true);
    }

    public void showEmpty(String str) {
        this.state = 1;
        this.emptyMessage = str;
        show(true, true);
    }

    public void showEmpty(String str, String str2) {
        this.state = 1;
        this.emptyMessage = str;
        this.emptyAction = str2;
        show(true, true);
    }

    public void showError(String str) {
        this.state = 2;
        this.error = str;
        show(true, true);
    }

    public boolean isLoading() {
        return this.state == 0;
    }

    public boolean isEmpty() {
        return this.state == 1;
    }

    public boolean isError() {
        return this.state == 2;
    }

    public void hide() {
        show(false);
    }

    private void matchIfLonely(StateViewHolder stateViewHolder) {
        View view = stateViewHolder.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.alone) {
            int lonelyHeight = getLonelyHeight();
            if (layoutParams.height != lonelyHeight) {
                layoutParams.height = lonelyHeight;
                view.setLayoutParams(layoutParams);
            }
        } else if (layoutParams.height != -2) {
            layoutParams.height = -2;
            view.setLayoutParams(layoutParams);
        }
    }

    public void onClick(View view) {
        if (view.getTag() instanceof StateViewHolder) {
            int i = this.state;
            if (i == 1) {
                this.emptyActionClick.onNext(BaseSection.Click.INSTANCE);
            } else if (i == 2) {
                this.errorActionClick.onNext(BaseSection.Click.INSTANCE);
            }
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.StateSection$StateViewHolder */
    public static class StateViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131361894)
        Button action;
        @BindView(2131362993)
        TextView message;
        @BindView(2131363210)
        ProgressBar progress;

        StateViewHolder(View view, int i, int i2, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.bind((Object) this, view);
            if (i != 0) {
                this.message.setTextColor(i);
            }
            if (i2 != 0) {
                view.setBackgroundResource(i2);
            }
            this.action.setTag(this);
            this.action.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.StateSection$Builder */
    public static class Builder {
        /* access modifiers changed from: private */
        public boolean alone;
        /* access modifiers changed from: private */
        public int backgroundResId;
        /* access modifiers changed from: private */
        public String emptyAction;
        /* access modifiers changed from: private */
        public String emptyMessage;
        /* access modifiers changed from: private */
        public String errorAction;
        /* access modifiers changed from: private */
        public int textColor;

        public Builder setEmptyMessage(String str) {
            this.emptyMessage = str;
            return this;
        }

        public Builder setEmptyAction(String str) {
            this.emptyAction = str;
            return this;
        }

        public Builder setErrorAction(String str) {
            this.errorAction = str;
            return this;
        }

        public Builder setTextColor(int i) {
            this.textColor = i;
            return this;
        }

        public Builder setBackgroundResId(int i) {
            this.backgroundResId = i;
            return this;
        }

        public Builder setAlone(boolean z) {
            this.alone = z;
            return this;
        }

        public StateSection build() {
            return new StateSection(this);
        }
    }
}
