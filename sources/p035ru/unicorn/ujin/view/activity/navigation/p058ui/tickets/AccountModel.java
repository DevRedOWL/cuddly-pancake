package p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets;

import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.AccountModel */
public class AccountModel implements Diffable<AccountModel> {
    private String key;
    private String value;

    public String getKey() {
        return this.key;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public boolean areItemsTheSame(AccountModel accountModel) {
        return this.key.equals(accountModel.key);
    }

    public boolean areContentsTheSame(AccountModel accountModel) {
        return this.value.equals(accountModel.value);
    }

    public AccountModel(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public AccountModel() {
    }
}
