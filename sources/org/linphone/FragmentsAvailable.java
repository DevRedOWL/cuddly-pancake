package org.linphone;

public enum FragmentsAvailable {
    UNKNOW,
    DIALER,
    EMPTY,
    HISTORY_LIST,
    HISTORY_DETAIL,
    CONTACTS_LIST,
    CONTACT_DETAIL,
    CONTACT_EDITOR,
    ABOUT,
    ACCOUNT_SETTINGS,
    SETTINGS,
    CHAT_LIST,
    CHAT;

    public boolean shouldAnimate() {
        return true;
    }

    public boolean isRightOf(FragmentsAvailable fragmentsAvailable) {
        switch (this) {
            case HISTORY_LIST:
                if (fragmentsAvailable == UNKNOW) {
                    return true;
                }
                return false;
            case HISTORY_DETAIL:
                if (HISTORY_LIST.isRightOf(fragmentsAvailable) || fragmentsAvailable == HISTORY_LIST) {
                    return true;
                }
                return false;
            case CONTACTS_LIST:
                if (HISTORY_DETAIL.isRightOf(fragmentsAvailable) || fragmentsAvailable == HISTORY_DETAIL) {
                    return true;
                }
                return false;
            case CONTACT_DETAIL:
                if (CONTACTS_LIST.isRightOf(fragmentsAvailable) || fragmentsAvailable == CONTACTS_LIST) {
                    return true;
                }
                return false;
            case CONTACT_EDITOR:
                if (CONTACT_DETAIL.isRightOf(fragmentsAvailable) || fragmentsAvailable == CONTACT_DETAIL) {
                    return true;
                }
                return false;
            case DIALER:
                if (CONTACT_EDITOR.isRightOf(fragmentsAvailable) || fragmentsAvailable == CONTACT_EDITOR) {
                    return true;
                }
                return false;
            case CHAT_LIST:
                if (DIALER.isRightOf(fragmentsAvailable) || fragmentsAvailable == DIALER) {
                    return true;
                }
                return false;
            case SETTINGS:
                if (CHAT_LIST.isRightOf(fragmentsAvailable) || fragmentsAvailable == CHAT_LIST) {
                    return true;
                }
                return false;
            case ABOUT:
            case ACCOUNT_SETTINGS:
                if (SETTINGS.isRightOf(fragmentsAvailable) || fragmentsAvailable == SETTINGS) {
                    return true;
                }
                return false;
            case CHAT:
                return CHAT_LIST.isRightOf(fragmentsAvailable) || fragmentsAvailable == CHAT_LIST;
            default:
                return false;
        }
    }

    public boolean shouldAddItselfToTheRightOf(FragmentsAvailable fragmentsAvailable) {
        int i = C52871.$SwitchMap$org$linphone$FragmentsAvailable[ordinal()];
        if (i != 2) {
            if (i != 11) {
                if (i != 4) {
                    if (i != 5) {
                        return false;
                    }
                    if (fragmentsAvailable == CONTACTS_LIST || fragmentsAvailable == CONTACT_DETAIL || fragmentsAvailable == CONTACT_EDITOR) {
                        return true;
                    }
                    return false;
                } else if (fragmentsAvailable == CONTACTS_LIST || fragmentsAvailable == CONTACT_EDITOR || fragmentsAvailable == CONTACT_DETAIL) {
                    return true;
                } else {
                    return false;
                }
            } else if (fragmentsAvailable == CHAT_LIST || fragmentsAvailable == CHAT) {
                return true;
            } else {
                return false;
            }
        } else if (fragmentsAvailable == HISTORY_LIST || fragmentsAvailable == HISTORY_DETAIL) {
            return true;
        } else {
            return false;
        }
    }
}
