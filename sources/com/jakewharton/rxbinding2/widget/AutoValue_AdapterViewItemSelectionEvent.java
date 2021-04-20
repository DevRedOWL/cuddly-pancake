package com.jakewharton.rxbinding2.widget;

import android.view.View;
import android.widget.AdapterView;

final class AutoValue_AdapterViewItemSelectionEvent extends AdapterViewItemSelectionEvent {

    /* renamed from: id */
    private final long f2289id;
    private final int position;
    private final View selectedView;
    private final AdapterView<?> view;

    AutoValue_AdapterViewItemSelectionEvent(AdapterView<?> adapterView, View view2, int i, long j) {
        if (adapterView != null) {
            this.view = adapterView;
            if (view2 != null) {
                this.selectedView = view2;
                this.position = i;
                this.f2289id = j;
                return;
            }
            throw new NullPointerException("Null selectedView");
        }
        throw new NullPointerException("Null view");
    }

    public AdapterView<?> view() {
        return this.view;
    }

    public View selectedView() {
        return this.selectedView;
    }

    public int position() {
        return this.position;
    }

    /* renamed from: id */
    public long mo36740id() {
        return this.f2289id;
    }

    public String toString() {
        return "AdapterViewItemSelectionEvent{view=" + this.view + ", selectedView=" + this.selectedView + ", position=" + this.position + ", id=" + this.f2289id + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdapterViewItemSelectionEvent)) {
            return false;
        }
        AdapterViewItemSelectionEvent adapterViewItemSelectionEvent = (AdapterViewItemSelectionEvent) obj;
        if (!this.view.equals(adapterViewItemSelectionEvent.view()) || !this.selectedView.equals(adapterViewItemSelectionEvent.selectedView()) || this.position != adapterViewItemSelectionEvent.position() || this.f2289id != adapterViewItemSelectionEvent.mo36740id()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f2289id;
        return ((((((this.view.hashCode() ^ 1000003) * 1000003) ^ this.selectedView.hashCode()) * 1000003) ^ this.position) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }
}
