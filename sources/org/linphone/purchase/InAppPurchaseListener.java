package org.linphone.purchase;

import java.util.ArrayList;

public interface InAppPurchaseListener {
    void onActivateAccountSuccessful(boolean z);

    void onAvailableItemsForPurchaseQueryFinished(ArrayList<Purchasable> arrayList);

    void onError(String str);

    void onPurchasedItemConfirmationQueryFinished(boolean z);

    void onPurchasedItemsQueryFinished(ArrayList<Purchasable> arrayList);

    void onRecoverAccountSuccessful(boolean z);

    void onServiceAvailableForQueries();
}
