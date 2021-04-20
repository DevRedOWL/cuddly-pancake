package com.obsez.android.lib.filechooser.tool;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.obsez.android.lib.filechooser.C2852R;
import com.obsez.android.lib.filechooser.internals.FileUtil;
import com.obsez.android.lib.filechooser.internals.UiUtil;
import com.obsez.android.lib.filechooser.internals.WrappedDrawable;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class DirAdapter extends ArrayAdapter<File> {
    private static SimpleDateFormat _formatter;
    private PorterDuffColorFilter _colorFilter;
    private Drawable _defaultFileIcon = null;
    private Drawable _defaultFolderIcon = null;
    private int _hoveredIndex;
    private List<Integer> _indexStack = new LinkedList();
    private boolean _resolveFileType = false;
    private SparseArray<File> _selected = new SparseArray<>();

    public DirAdapter(Context context, List<File> list, int i) {
        super(context, i, C2852R.C2855id.text, list);
        init((String) null);
    }

    public DirAdapter(Context context, List<File> list, int i, String str) {
        super(context, i, C2852R.C2855id.text, list);
        init(str);
    }

    public DirAdapter(Context context, List<File> list, int i, int i2) {
        super(context, i, i2, list);
        init((String) null);
    }

    private void init(String str) {
        _formatter = new SimpleDateFormat((str == null || "".equals(str.trim())) ? "yyyy/MM/dd HH:mm:ss" : str.trim());
        this._defaultFolderIcon = ContextCompat.getDrawable(getContext(), C2852R.C2854drawable.ic_folder);
        this._defaultFileIcon = ContextCompat.getDrawable(getContext(), C2852R.C2854drawable.ic_file);
        int themeAccentColor = UiUtil.getThemeAccentColor(getContext());
        this._colorFilter = new PorterDuffColorFilter(Color.argb(40, Color.red(themeAccentColor), Color.green(themeAccentColor), Color.blue(themeAccentColor)), PorterDuff.Mode.MULTIPLY);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Drawable drawable;
        Drawable drawable2;
        ViewGroup viewGroup2 = (ViewGroup) super.getView(i, view, viewGroup);
        TextView textView = (TextView) viewGroup2.findViewById(C2852R.C2855id.text);
        TextView textView2 = (TextView) viewGroup2.findViewById(C2852R.C2855id.txt_size);
        TextView textView3 = (TextView) viewGroup2.findViewById(C2852R.C2855id.txt_date);
        textView3.setVisibility(0);
        File file = (File) super.getItem(i);
        if (file == null) {
            return viewGroup2;
        }
        textView.setText(file.getName());
        if (file.isDirectory()) {
            drawable = this._defaultFolderIcon.getConstantState().newDrawable();
            textView2.setText("");
            if (file.lastModified() != 0) {
                textView3.setText(_formatter.format(new Date(file.lastModified())));
            } else {
                textView3.setVisibility(8);
            }
        } else {
            if (this._resolveFileType) {
                drawable2 = UiUtil.resolveFileTypeIcon(getContext(), Uri.fromFile(file));
                if (drawable2 != null) {
                    drawable2 = new WrappedDrawable(drawable2, 24.0f, 24.0f);
                }
            } else {
                drawable2 = null;
            }
            if (drawable2 == null) {
                drawable2 = this._defaultFileIcon;
            }
            drawable = drawable2.getConstantState().newDrawable();
            textView2.setText(FileUtil.getReadableFileSize(file.length()));
            textView3.setText(_formatter.format(new Date(file.lastModified())));
        }
        if (file.isHidden()) {
            drawable.mutate().setColorFilter(new PorterDuffColorFilter(-2130706433, PorterDuff.Mode.SRC_ATOP));
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        View findViewById = viewGroup2.findViewById(C2852R.C2855id.root);
        if (this._selected.get(file.hashCode(), (Object) null) != null) {
            findViewById.getBackground().setColorFilter(this._colorFilter);
        } else if (i == this._hoveredIndex) {
            findViewById.getBackground().setColorFilter(this._colorFilter);
        } else {
            findViewById.getBackground().clearColorFilter();
        }
        return viewGroup2;
    }

    public Drawable getDefaultFolderIcon() {
        return this._defaultFolderIcon;
    }

    public void setDefaultFolderIcon(Drawable drawable) {
        this._defaultFolderIcon = drawable;
    }

    public Drawable getDefaultFileIcon() {
        return this._defaultFileIcon;
    }

    public void setDefaultFileIcon(Drawable drawable) {
        this._defaultFileIcon = drawable;
    }

    public boolean isResolveFileType() {
        return this._resolveFileType;
    }

    public void setResolveFileType(boolean z) {
        this._resolveFileType = z;
    }

    public void setEntries(List<File> list) {
        setNotifyOnChange(false);
        super.clear();
        setNotifyOnChange(true);
        super.addAll(list);
    }

    public long getItemId(int i) {
        return (long) ((File) getItem(i)).hashCode();
    }

    public void selectItem(int i) {
        int itemId = (int) getItemId(i);
        if (this._selected.get(itemId, (Object) null) == null) {
            this._selected.append(itemId, getItem(i));
        } else {
            this._selected.delete(itemId);
        }
        notifyDataSetChanged();
    }

    public boolean isSelected(int i) {
        return isSelectedById((int) getItemId(i));
    }

    public boolean isSelectedById(int i) {
        return this._selected.get(i, (Object) null) != null;
    }

    public boolean isAnySelected() {
        return this._selected.size() > 0;
    }

    public boolean isOneSelected() {
        return this._selected.size() == 1;
    }

    public List<File> getSelected() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this._selected.size(); i++) {
            arrayList.add(this._selected.valueAt(i));
        }
        return arrayList;
    }

    public void clearSelected() {
        this._selected.clear();
    }

    public int getHoveredIndex() {
        return this._hoveredIndex;
    }

    public void setHoveredIndex(int i) {
        this._hoveredIndex = i;
    }

    public int increaseHoveredIndex() {
        this._hoveredIndex++;
        if (this._hoveredIndex >= super.getCount()) {
            this._hoveredIndex = super.getCount() - 1;
        }
        notifyDataSetInvalidated();
        return this._hoveredIndex;
    }

    public int decreaseHoveredIndex() {
        this._hoveredIndex--;
        if (this._hoveredIndex < 0) {
            this._hoveredIndex = 0;
        }
        notifyDataSetInvalidated();
        return this._hoveredIndex;
    }

    public int push() {
        this._indexStack.add(Integer.valueOf(this._hoveredIndex));
        return this._hoveredIndex;
    }

    public int push(int i) {
        this._indexStack.add(Integer.valueOf(i));
        this._hoveredIndex = i;
        return i;
    }

    public int pop() {
        if (this._indexStack.isEmpty()) {
            return -1;
        }
        List<Integer> list = this._indexStack;
        int intValue = list.get(list.size() - 1).intValue();
        List<Integer> list2 = this._indexStack;
        list2.remove(list2.size() - 1);
        this._hoveredIndex = intValue;
        return intValue;
    }

    public void popAll() {
        this._indexStack.clear();
    }
}
