package com.jakewharton.rxbinding2.widget;

import android.view.View;
import android.widget.AdapterView;

final class AutoValue_AdapterViewItemClickEvent extends AdapterViewItemClickEvent {
    private final View clickedView;

    /* renamed from: id */
    private final long f2287id;
    private final int position;
    private final AdapterView<?> view;

    AutoValue_AdapterViewItemClickEvent(AdapterView<?> adapterView, View view2, int i, long j) {
        if (adapterView != null) {
            this.view = adapterView;
            if (view2 != null) {
                this.clickedView = view2;
                this.position = i;
                this.f2287id = j;
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
    public long mo36729id() {
        return this.f2287id;
    }

    public String toString() {
        return "AdapterViewItemClickEvent{view=" + this.view + ", clickedView=" + this.clickedView + ", position=" + this.position + ", id=" + this.f2287id + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdapterViewItemClickEvent)) {
            return false;
        }
        AdapterViewItemClickEvent adapterViewItemClickEvent = (AdapterViewItemClickEvent) obj;
        if (!this.view.equals(adapterViewItemClickEvent.view()) || !this.clickedView.equals(adapterViewItemClickEvent.clickedView()) || this.position != adapterViewItemClickEvent.position() || this.f2287id != adapterViewItemClickEvent.mo36729id()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f2287id;
        return ((((((this.view.hashCode() ^ 1000003) * 1000003) ^ this.clickedView.hashCode()) * 1000003) ^ this.position) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }
}
