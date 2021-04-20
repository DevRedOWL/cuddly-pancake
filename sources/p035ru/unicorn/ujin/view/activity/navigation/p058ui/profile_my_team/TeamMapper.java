package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my_team.TeamMapper */
public class TeamMapper implements Diffable<TeamMapper> {
    private String chatId;
    private String comment;
    private String fio;
    private Format format;
    private String fullname;

    /* renamed from: id */
    private Integer f6852id;
    private String name;
    private String patronymic;
    private String phone;
    private String position;
    private String surname;

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my_team.TeamMapper$Format */
    public enum Format {
        SIMPLE,
        FULL
    }

    public static TeamMapper mapTo(UserProfile userProfile) {
        Integer id = userProfile.getUserdata().getId();
        String fullname2 = ((UserData) Objects.requireNonNull(userProfile.getUserdata())).getFullname();
        String str = "";
        String phone2 = userProfile.getUserdata().getPhone() != null ? userProfile.getUserdata().getPhone() : str;
        if (userProfile.getPosition() != null) {
            str = userProfile.getPosition().getTitle();
        }
        return new TeamMapper(id, fullname2, phone2, str);
    }

    public TeamMapper(Integer num, String str, String str2, String str3) {
        this.f6852id = num;
        this.fio = str;
        this.phone = str2;
        this.position = str3;
        this.format = (!StringUtils.isBlank(str) || !StringUtils.isBlank(str3)) ? Format.FULL : Format.SIMPLE;
    }

    public static List<TeamMapper> mapTo(List<UserProfile> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(mapTo(list.get(i)));
        }
        return arrayList;
    }

    public boolean areItemsTheSame(TeamMapper teamMapper) {
        Integer num = this.f6852id;
        return num == null || num.equals(teamMapper.f6852id);
    }

    public boolean areContentsTheSame(TeamMapper teamMapper) {
        return this.phone.equals(teamMapper.phone);
    }

    public Integer getId() {
        return this.f6852id;
    }

    public void setId(Integer num) {
        this.f6852id = num;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String str) {
        this.surname = str;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public void setPatronymic(String str) {
        this.patronymic = str;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String str) {
        this.fullname = str;
    }

    public String getFio() {
        return this.fio;
    }

    public void setFio(String str) {
        this.fio = str;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String str) {
        this.phone = str;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String str) {
        this.position = str;
    }

    public Format getFormat() {
        return this.format;
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }
}
