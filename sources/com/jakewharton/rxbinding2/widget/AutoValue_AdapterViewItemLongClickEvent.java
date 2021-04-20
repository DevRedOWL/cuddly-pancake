package com.jakewharton.rxbinding2.widget;

import android.view.View;
import android.widget.AdapterView;

final class AutoValue_AdapterViewItemLongClickEvent extends AdapterViewItemLongClickEvent {
    private final View clickedView;

    /* renamed from: id */
    private final long f2288id;
    private final int position;
    private final AdapterView<?> view;

    AutoValue_AdapterViewItemLongClickEvent(AdapterView<?> adapterView, View view2, int i, long j) {
        if (adapterView != null) {
            this.view = adapterView;
            if (view2 != null) {
                this.clickedView = view2;
                this.position = i;
                this.f2288id = j;
                return;
            }
            throw new NullPointerException("Null clickedView");
        }
        throw new NullPointerException("Null view");
    }

    public AdapterView<?> view() {
        return this.view;
    }

    public View clickedView() {
        return this.clickedView;
    }

    public int position() {
        return this.position;
    }

    /* renamed from: id */
    public long mo36735id() {
        return this.f2288id;
    }

    public String toString() {
        return "AdapterViewItemLongClickEvent{view=" + this.view + ", clickedView=" + this.clickedView + ", position=" + this.position + ", id=" + this.f2288id + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdapterViewItemLongClickEvent)) {
            return false;
        }
        AdapterViewItemLongClickEvent adapterViewItemLongClickEvent = (AdapterViewItemLongClickEvent) obj;
        if (!this.view.equals(adapterViewItemLongClickEvent.view()) || !this.clickedView.equals(adapterViewItemLongClickEvent.clickedView()) || this.position != adapterViewItemLongClickEvent.position() || this.f2288id != adapterViewItemLongClickEvent.mo36735id()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f2288id;
        return ((((((this.view.hashCode() ^ 1000003) * 1000003) ^ this.clickedView.hashCode()) * 1000003) ^ this.position) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }
}
