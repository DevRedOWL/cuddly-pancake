package p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets;

import android.content.Intent;
import p035ru.unicorn.ujin.view.activity.PaymentWebViewActivity;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.TicketBaseFragment */
abstract class TicketBaseFragment extends BaseFragment {
    static String FRAGMENT_PAYMENT_FORM = "fragmentPaymentForm";
    static String FRAGMENT_TICKET_DETAIL = "fragmentTicketDetail";

    TicketBaseFragment() {
    }

    public void openTicketsFragment() {
        removeFragmentFromBackStack(FRAGMENT_TICKET_DETAIL);
        removeFragmentFromBackStack(FRAGMENT_PAYMENT_FORM);
    }

    public void startPaymentActivity(String str) {
        Intent intent = new Intent(getActivity(), PaymentWebViewActivity.class);
        intent.putExtra("paymentUrl", str);
        startActivityForResult(intent, 1);
    }
}
