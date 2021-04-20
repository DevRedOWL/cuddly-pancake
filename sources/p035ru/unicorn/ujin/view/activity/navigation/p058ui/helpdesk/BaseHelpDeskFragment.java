package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.view.fragments.BaseFragment;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.BaseHelpDeskFragment */
public abstract class BaseHelpDeskFragment extends BaseFragment {
    public static final String ARG_STAGE = "arg_stage";
    public static final int ARG_STAGE_CREATE = 1;
    public static final int ARG_STAGE_LIST = 0;

    public abstract BaseHelpDeskFragment start(int i);
}
