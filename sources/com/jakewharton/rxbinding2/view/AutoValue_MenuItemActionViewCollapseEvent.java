package com.jakewharton.rxbinding2.view;

import android.view.MenuItem;

final class AutoValue_MenuItemActionViewCollapseEvent extends MenuItemActionViewCollapseEvent {
    private final MenuItem menuItem;

    AutoValue_MenuItemActionViewCollapseEvent(MenuItem menuItem2) {
        if (menuItem2 != null) {
            this.menuItem = menuItem2;
            return;
        }
        throw new NullPointerException("Null menuItem");
    }

    public MenuItem menuItem() {
        return this.menuItem;
    }

    public String toString() {
        return "MenuItemActionViewCollapseEvent{menuItem=" + this.menuItem + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MenuItemActionViewCollapseEvent) {
            return this.menuItem.equals(((MenuItemActionViewCollapseEvent) obj).menuItem());
        }
        return false;
    }

    public int hashCode() {
        return this.menuItem.hashCode() ^ 1000003;
    }
}
