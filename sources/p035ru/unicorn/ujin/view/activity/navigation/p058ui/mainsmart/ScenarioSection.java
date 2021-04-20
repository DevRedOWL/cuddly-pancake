package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.loopeer.shadow.ShadowView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.OnScenarioClick;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario;
import p035ru.unicorn.ujin.view.activity.navigation.helper.SimpleHelper;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.ScenarioSection */
public class ScenarioSection extends SingleSection<List<Scenario>, ViewHolder> implements View.OnClickListener, View.OnLongClickListener {
    private List<Scenario> child;
    private int currentActive;
    private LinearLayout layout;
    private LinearLayout layout2;
    private List<Scenario> main;
    private boolean needToRedraw = false;
    private PublishProcessor<Integer> onClick = PublishProcessor.create();
    private OnScenarioClick onScenarioClick;

    public int getLayoutId() {
        return R.layout.item_scenario_section;
    }

    public PublishProcessor<Integer> getOnClick() {
        return this.onClick;
    }

    public ScenarioSection(OnScenarioClick onScenarioClick2) {
        this.onScenarioClick = onScenarioClick2;
    }

    public int getCurrentActive() {
        return this.currentActive;
    }

    public void setCurrentActive(int i) {
        this.currentActive = i;
    }

    public void setData(List<Scenario> list) {
        super.setData(list);
        this.main = Scenario.getData(list, "0");
        this.child = Scenario.getDataByParent(list, "1", this.main.get(0).getState().getState().intValue() == 1 ? 1 : 2);
        if (this.main.get(1).getState().getState().intValue() == 1) {
            this.currentActive = -1;
            for (int i = 0; i < this.child.size(); i++) {
                if (this.child.get(i).getState().getState().intValue() == 1) {
                    this.currentActive = i;
                }
            }
            return;
        }
        this.currentActive = -1;
        notifySectionChanged();
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, List<Scenario> list, List<Object> list2) {
        int i;
        ViewHolder viewHolder2 = viewHolder;
        if (viewHolder2.f6789ll.getChildCount() > 0) {
            viewHolder2.f6789ll.removeAllViews();
        }
        int i2 = 0;
        while (true) {
            int size = this.main.size();
            i = R.id.icon;
            boolean z = true;
            if (i2 >= size) {
                break;
            }
            if (this.main.get(i2).getState().getState().intValue() != 1) {
                z = false;
            }
            String name = this.main.get(i2).getName();
            View createView = createView(viewHolder2.f6789ll, Boolean.valueOf(z));
            createView.setTag(R.string.setup_key, Integer.valueOf(i2));
            boolean z2 = z;
            setIconProps((ImageView) createView.findViewById(R.id.icon), name, z2, R.color.brandMain, R.color.brandTextPrimary);
            setTitleProps(name, (TextView) createView.findViewById(R.id.state), z2, R.color.brandMain, R.color.brandTextPrimary);
            viewHolder2.f6789ll.addView(createView);
            this.layout2 = viewHolder2.f6789ll;
            i2++;
        }
        if (viewHolder2.ll_child.getChildCount() > 0) {
            viewHolder2.ll_child.removeAllViews();
        }
        View view = null;
        int i3 = 0;
        while (i3 < this.child.size()) {
            boolean z3 = this.child.get(i3).getState().getState().intValue() == 1;
            String name2 = this.child.get(i3).getName();
            View createView2 = createView(viewHolder2.ll_child, Boolean.valueOf(z3));
            createView2.setTag(R.string.setup_key, Integer.valueOf(i3));
            View view2 = z3 ? createView2 : view;
            boolean z4 = z3;
            setIconProps((ImageView) createView2.findViewById(i), name2, z4, R.color.brandMain, R.color.brandTextPrimary);
            setTitleProps(name2, (TextView) createView2.findViewById(R.id.state), z4, R.color.brandMain, R.color.brandTextPrimary);
            this.layout = viewHolder2.ll_child;
            viewHolder2.ll_child.addView(createView2);
            i3++;
            view = view2;
            i = R.id.icon;
        }
        if (view != null) {
            ((LinearLayout) viewHolder2.childScrollView.getChildAt(0)).requestChildFocus(view, view);
        }
    }

    private int getWidthX(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private void setTitleProps(String str, TextView textView, boolean z, int i, int i2) {
        textView.setText(str);
        Resources resources = textView.getResources();
        if (!z) {
            i = i2;
        }
        textView.setTextColor(resources.getColor(i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setIconProps(android.widget.ImageView r2, java.lang.String r3, boolean r4, int r5, int r6) {
        /*
            r1 = this;
            java.lang.String r3 = r3.toLowerCase()
            int r0 = r3.hashCode()
            switch(r0) {
                case -1581810374: goto L_0x0048;
                case -553890945: goto L_0x003e;
                case 33124848: goto L_0x0034;
                case 33401926: goto L_0x002a;
                case 33584285: goto L_0x0020;
                case 1025033231: goto L_0x0016;
                case 1443124339: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0052
        L_0x000c:
            java.lang.String r0 = "мы ушли"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0052
            r3 = 5
            goto L_0x0053
        L_0x0016:
            java.lang.String r0 = "вечер"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0052
            r3 = 3
            goto L_0x0053
        L_0x0020:
            java.lang.String r0 = "утро"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0052
            r3 = 0
            goto L_0x0053
        L_0x002a:
            java.lang.String r0 = "ночь"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0052
            r3 = 2
            goto L_0x0053
        L_0x0034:
            java.lang.String r0 = "день"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0052
            r3 = 1
            goto L_0x0053
        L_0x003e:
            java.lang.String r0 = "мы пришли"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0052
            r3 = 6
            goto L_0x0053
        L_0x0048:
            java.lang.String r0 = "имитация присутствия"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0052
            r3 = 4
            goto L_0x0053
        L_0x0052:
            r3 = -1
        L_0x0053:
            r0 = 2131231350(0x7f080276, float:1.8078779E38)
            switch(r3) {
                case 0: goto L_0x0087;
                case 1: goto L_0x0080;
                case 2: goto L_0x0079;
                case 3: goto L_0x0072;
                case 4: goto L_0x006b;
                case 5: goto L_0x0064;
                case 6: goto L_0x005d;
                default: goto L_0x0059;
            }
        L_0x0059:
            r2.setImageResource(r0)
            goto L_0x008a
        L_0x005d:
            r3 = 2131231286(0x7f080236, float:1.8078649E38)
            r2.setImageResource(r3)
            goto L_0x008a
        L_0x0064:
            r3 = 2131231287(0x7f080237, float:1.807865E38)
            r2.setImageResource(r3)
            goto L_0x008a
        L_0x006b:
            r3 = 2131231311(0x7f08024f, float:1.80787E38)
            r2.setImageResource(r3)
            goto L_0x008a
        L_0x0072:
            r3 = 2131231352(0x7f080278, float:1.8078783E38)
            r2.setImageResource(r3)
            goto L_0x008a
        L_0x0079:
            r3 = 2131231318(0x7f080256, float:1.8078714E38)
            r2.setImageResource(r3)
            goto L_0x008a
        L_0x0080:
            r3 = 2131231293(0x7f08023d, float:1.8078663E38)
            r2.setImageResource(r3)
            goto L_0x008a
        L_0x0087:
            r2.setImageResource(r0)
        L_0x008a:
            android.content.res.Resources r3 = r2.getResources()
            if (r4 == 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r5 = r6
        L_0x0092:
            int r3 = r3.getColor(r5)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.ScenarioSection.setIconProps(android.widget.ImageView, java.lang.String, boolean, int, int):void");
    }

    private View createView(View view, Boolean bool) {
        Context context = view.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_scenario_, (ViewGroup) view, false);
        if (bool.booleanValue()) {
            ((ShadowView) inflate.findViewById(R.id.cl)).setShadowColor(context.getResources().getColor(R.color.brandMain));
        } else {
            ((ShadowView) inflate.findViewById(R.id.cl)).setShadowColor(context.getResources().getColor(R.color.textHint));
        }
        inflate.setOnClickListener(this);
        inflate.setOnLongClickListener(this);
        return inflate;
    }

    private void setStrokeColor(View view, int i, int i2, boolean z) {
        view.findViewById(R.id.constraint).setBackgroundResource(z ? R.drawable.bg_stroke_active : R.drawable.bg_stroke_disactive);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void showIconAndTitle(java.lang.String r5, android.widget.ImageView r6, android.widget.TextView r7, boolean r8) {
        /*
            r4 = this;
            java.lang.String r0 = r5.toLowerCase()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1581810374: goto L_0x0048;
                case -553890945: goto L_0x003e;
                case 33124848: goto L_0x0034;
                case 33401926: goto L_0x002a;
                case 33584285: goto L_0x0020;
                case 1025033231: goto L_0x0016;
                case 1443124339: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0052
        L_0x000c:
            java.lang.String r1 = "мы ушли"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 5
            goto L_0x0053
        L_0x0016:
            java.lang.String r1 = "вечер"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 3
            goto L_0x0053
        L_0x0020:
            java.lang.String r1 = "утро"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 0
            goto L_0x0053
        L_0x002a:
            java.lang.String r1 = "ночь"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 2
            goto L_0x0053
        L_0x0034:
            java.lang.String r1 = "день"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 1
            goto L_0x0053
        L_0x003e:
            java.lang.String r1 = "мы пришли"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 6
            goto L_0x0053
        L_0x0048:
            java.lang.String r1 = "имитация присутствия"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 4
            goto L_0x0053
        L_0x0052:
            r0 = -1
        L_0x0053:
            r1 = 2131231350(0x7f080276, float:1.8078779E38)
            switch(r0) {
                case 0: goto L_0x0087;
                case 1: goto L_0x0080;
                case 2: goto L_0x0079;
                case 3: goto L_0x0072;
                case 4: goto L_0x006b;
                case 5: goto L_0x0064;
                case 6: goto L_0x005d;
                default: goto L_0x0059;
            }
        L_0x0059:
            r6.setImageResource(r1)
            goto L_0x008a
        L_0x005d:
            r0 = 2131231286(0x7f080236, float:1.8078649E38)
            r6.setImageResource(r0)
            goto L_0x008a
        L_0x0064:
            r0 = 2131231287(0x7f080237, float:1.807865E38)
            r6.setImageResource(r0)
            goto L_0x008a
        L_0x006b:
            r0 = 2131231311(0x7f08024f, float:1.80787E38)
            r6.setImageResource(r0)
            goto L_0x008a
        L_0x0072:
            r0 = 2131231352(0x7f080278, float:1.8078783E38)
            r6.setImageResource(r0)
            goto L_0x008a
        L_0x0079:
            r0 = 2131231318(0x7f080256, float:1.8078714E38)
            r6.setImageResource(r0)
            goto L_0x008a
        L_0x0080:
            r0 = 2131231293(0x7f08023d, float:1.8078663E38)
            r6.setImageResource(r0)
            goto L_0x008a
        L_0x0087:
            r6.setImageResource(r1)
        L_0x008a:
            android.content.res.Resources r0 = r6.getResources()
            r1 = 2131099729(0x7f060051, float:1.781182E38)
            r2 = 2131099731(0x7f060053, float:1.7811823E38)
            if (r8 == 0) goto L_0x009a
            r3 = 2131099729(0x7f060051, float:1.781182E38)
            goto L_0x009d
        L_0x009a:
            r3 = 2131099731(0x7f060053, float:1.7811823E38)
        L_0x009d:
            int r0 = r0.getColor(r3)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            r6.setColorFilter(r0, r3)
            r7.setText(r5)
            android.content.res.Resources r5 = r6.getResources()
            if (r8 == 0) goto L_0x00b0
            goto L_0x00b3
        L_0x00b0:
            r1 = 2131099731(0x7f060053, float:1.7811823E38)
        L_0x00b3:
            int r5 = r5.getColor(r1)
            r7.setTextColor(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.ScenarioSection.showIconAndTitle(java.lang.String, android.widget.ImageView, android.widget.TextView, boolean):void");
    }

    public void onClick(View view) {
        boolean z = true;
        if (view.getId() != R.id.image) {
            this.needToRedraw = true;
            LinearLayout linearLayout = this.layout;
            if (linearLayout != null) {
                int indexOfChild = linearLayout.indexOfChild(view);
                int indexOfChild2 = this.layout2.indexOfChild(view);
                if (indexOfChild != -1 || indexOfChild2 == -1) {
                    if (indexOfChild != -1 && indexOfChild2 == -1) {
                        int intValue = this.child.get(indexOfChild).getId().intValue();
                        if (this.child.get(indexOfChild).getState().getState().intValue() == 1) {
                            this.currentActive = -1;
                        } else {
                            this.currentActive = indexOfChild;
                        }
                        SimpleHelper.playTrack((String) (this.child.get(indexOfChild).getState().getState().intValue() == 1 ? this.child.get(indexOfChild).getAudio().last() : this.child.get(indexOfChild).getAudio().first()), view.getContext());
                        OnScenarioClick onScenarioClick2 = this.onScenarioClick;
                        List list = (List) getData();
                        if (this.currentActive == -1) {
                            z = false;
                        }
                        onScenarioClick2.onChangeScenario(intValue, list, z);
                        notifySectionChanged();
                    }
                } else if (this.layout2 != null) {
                    int intValue2 = this.main.get(indexOfChild2).getId().intValue();
                    if (this.main.get(indexOfChild2).getState().getState().intValue() == 1) {
                        this.currentActive = -1;
                    } else {
                        this.currentActive = indexOfChild2;
                    }
                    SimpleHelper.playTrack((String) (this.main.get(indexOfChild2).getState().getState().intValue() == 1 ? this.main.get(indexOfChild2).getAudio().last() : this.main.get(indexOfChild2).getAudio().first()), view.getContext());
                    OnScenarioClick onScenarioClick3 = this.onScenarioClick;
                    List list2 = (List) getData();
                    if (this.currentActive == -1) {
                        z = false;
                    }
                    onScenarioClick3.onChangeScenario(intValue2, list2, z);
                    notifySectionChanged();
                }
            }
        } else {
            this.onClick.onNext(1);
        }
    }

    public boolean onLongClick(View view) {
        LinearLayout linearLayout = this.layout;
        if (linearLayout == null) {
            return false;
        }
        int indexOfChild = linearLayout.indexOfChild(view);
        int indexOfChild2 = this.layout2.indexOfChild(view);
        if (indexOfChild != -1 || indexOfChild2 == -1) {
            if (indexOfChild == -1 || indexOfChild2 != -1) {
                return false;
            }
            int intValue = this.child.get(indexOfChild).getId().intValue();
            String name = this.child.get(indexOfChild).getName();
            if (this.child.get(indexOfChild).getState().getState().intValue() == 1) {
                this.currentActive = -1;
            } else {
                this.currentActive = indexOfChild;
            }
            this.onScenarioClick.onSccenarioLongClick(intValue, name);
            return false;
        } else if (this.layout2 == null) {
            return false;
        } else {
            int intValue2 = this.main.get(indexOfChild2).getId().intValue();
            String name2 = this.main.get(indexOfChild2).getName();
            if (this.main.get(indexOfChild2).getState().getState().intValue() == 1) {
                this.currentActive = -1;
            } else {
                this.currentActive = indexOfChild2;
            }
            this.onScenarioClick.onSccenarioLongClick(intValue2, name2);
            return false;
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.ScenarioSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        HorizontalScrollView childScrollView;

        /* renamed from: ll */
        LinearLayout f6789ll;
        LinearLayout ll_child;

        public ViewHolder(View view) {
            super(view);
            this.f6789ll = (LinearLayout) view.findViewById(R.id.ll_scroll);
            this.ll_child = (LinearLayout) view.findViewById(R.id.ll_scroll_child);
            this.childScrollView = (HorizontalScrollView) view.findViewById(R.id.childScrollView);
        }
    }
}
