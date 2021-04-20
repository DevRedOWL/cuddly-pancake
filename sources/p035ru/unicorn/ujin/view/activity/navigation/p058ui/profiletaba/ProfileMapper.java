package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.ProfileMapper */
public class ProfileMapper implements Diffable<ProfileMapper> {
    private int iconRes;
    private String subtitle;
    private String title;

    public boolean areContentsTheSame(ProfileMapper profileMapper) {
        return false;
    }

    public boolean areItemsTheSame(ProfileMapper profileMapper) {
        return false;
    }

    public ProfileMapper(String str, String str2, int i) {
        this.title = str;
        this.subtitle = str2;
        this.iconRes = i;
    }

    public ProfileMapper(Context context, int i, int i2, int i3) {
        this(context.getString(i), context.getString(i2), i3);
    }

    public static List<ProfileMapper> getAll(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getArenda(context));
        arrayList.add(getMyTeam(context));
        arrayList.add(getArendaCustom(context, R.string.title_arenda_all));
        arrayList.add(getArendaCustom(context, R.string.title_arenda_office));
        arrayList.add(getArendaCustom(context, R.string.title_arenda_speacker));
        arrayList.add(getArendaCustom(context, R.string.title_arenda_koworking));
        return arrayList;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public int getIconRes() {
        return this.iconRes;
    }

    public void setIconRes(int i) {
        this.iconRes = i;
    }

    public static ProfileMapper getArenda(Context context) {
        return new ProfileMapper(context, R.string.title_arenda, R.string.sub_title_arenda, R.drawable.ic_svg_profile_arenda);
    }

    public static ProfileMapper getNews(Context context) {
        return new ProfileMapper(context, R.string.title_news, R.string.sub_title_news, R.drawable.ic_svg_profile_news);
    }

    public static ProfileMapper getMyTeam(Context context) {
        return new ProfileMapper(context, R.string.title_team, R.string.sub_title_team, R.drawable.ic_svg_profile_team);
    }

    private static ProfileMapper getArendaCustom(Context context, int i) {
        return new ProfileMapper(context, i, R.string.sub_title_empty, R.drawable.ic_svg_profile_arenda);
    }
}
