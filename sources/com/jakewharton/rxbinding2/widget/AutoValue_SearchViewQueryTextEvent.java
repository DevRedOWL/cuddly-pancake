package com.jakewharton.rxbinding2.widget;

import android.widget.SearchView;

final class AutoValue_SearchViewQueryTextEvent extends SearchViewQueryTextEvent {
    private final boolean isSubmitted;
    private final CharSequence queryText;
    private final SearchView view;

    AutoValue_SearchViewQueryTextEvent(SearchView searchView, CharSequence charSequence, boolean z) {
        if (searchView != null) {
            this.view = searchView;
            if (charSequence != null) {
                this.queryText = charSequence;
                this.isSubmitted = z;
                return;
            }
            throw new NullPointerException("Null queryText");
        }
        throw new NullPointerException("Null view");
    }

    public SearchView view() {
        return this.view;
    }

    public CharSequence queryText() {
        return this.queryText;
    }

    public boolean isSubmitted() {
        return this.isSubmitted;
    }

    public String toString() {
        return "SearchViewQueryTextEvent{view=" + this.view + ", queryText=" + this.queryText + ", isSubmitted=" + this.isSubmitted + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchViewQueryTextEvent)) {
            return false;
        }
        SearchViewQueryTextEvent searchViewQueryTextEvent = (SearchViewQueryTextEvent) obj;
        if (!this.view.equals(searchViewQueryTextEvent.view()) || !this.queryText.equals(searchViewQueryTextEvent.queryText()) || this.isSubmitted != searchViewQueryTextEvent.isSubmitted()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.view.hashCode() ^ 1000003) * 1000003) ^ this.queryText.hashCode()) * 1000003) ^ (this.isSubmitted ? 1231 : 1237);
    }
}
