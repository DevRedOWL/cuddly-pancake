package com.obsez.android.lib.filechooser;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import com.obsez.android.lib.filechooser.internals.ExtFileFilter;
import com.obsez.android.lib.filechooser.internals.FileUtil;
import com.obsez.android.lib.filechooser.internals.RegexFileFilter;
import com.obsez.android.lib.filechooser.internals.UiUtil;
import com.obsez.android.lib.filechooser.tool.DirAdapter;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ChooserDialog implements AdapterView.OnItemClickListener, DialogInterface.OnClickListener, AdapterView.OnItemLongClickListener {
    private static final int CHOOSE_MODE_DELETE = 1;
    private static final int CHOOSE_MODE_NORMAL = 0;
    private static final int CHOOSE_MODE_SELECT_MULTIPLE = 2;
    private static File __normalParent = new File("..") {
        public boolean isDirectory() {
            return true;
        }

        public boolean isHidden() {
            return false;
        }

        public long lastModified() {
            return 0;
        }
    };
    private static File __primaryRoot = new File(".. Primary Storage") {
        public boolean isDirectory() {
            return true;
        }

        public boolean isHidden() {
            return false;
        }

        public long lastModified() {
            return 0;
        }
    };
    private static File __sdcardRoot = new File(".. SDCard Storage") {
        public boolean isDirectory() {
            return true;
        }

        public boolean isHidden() {
            return false;
        }

        public long lastModified() {
            return 0;
        }
    };
    private static final CanNavigateTo _defaultNavToCB = new CanNavigateTo() {
        public boolean canNavigate(File file) {
            return true;
        }
    };
    private static final CanNavigateUp _defaultNavUpCB = new CanNavigateUp() {
        public boolean canUpTo(File file) {
            return file != null && file.canRead();
        }
    };
    /* access modifiers changed from: private */
    public DirAdapter _adapter;
    private AdapterSetter _adapterSetter = null;
    /* access modifiers changed from: private */
    public AlertDialog _alertDialog;
    private DialogInterface.OnCancelListener _cancelListener2;
    /* access modifiers changed from: private */
    public int _chooseMode = 0;
    /* access modifiers changed from: private */
    public Context _context;
    /* access modifiers changed from: private */
    public int _createDirIconRes = -1;
    /* access modifiers changed from: private */
    public int _createDirRes = C2852R.string.option_create_folder;
    /* access modifiers changed from: private */
    public File _currentDir;
    private String _dateFormat;
    /* access modifiers changed from: private */
    public OnBackPressedListener _defaultLastBack = new OnBackPressedListener() {
        public void onBackPressed(AlertDialog alertDialog) {
            alertDialog.dismiss();
        }
    };
    /* access modifiers changed from: private */
    public int _deleteIconRes = -1;
    /* access modifiers changed from: private */
    public Runnable _deleteModeIndicator;
    /* access modifiers changed from: private */
    public int _deleteRes = C2852R.string.options_delete;
    /* access modifiers changed from: private */
    public boolean _dirOnly;
    private boolean _disableTitle;
    /* access modifiers changed from: private */
    public boolean _dismissOnButtonClick = true;
    /* access modifiers changed from: private */
    public boolean _enableMultiple;
    /* access modifiers changed from: private */
    public boolean _enableOptions;
    /* access modifiers changed from: private */
    public List<File> _entries = new ArrayList();
    private FileFilter _fileFilter;
    private CanNavigateTo _folderNavToCB;
    private CanNavigateUp _folderNavUpCB;
    private int _iconRes = -1;
    private int _layoutRes = -1;
    /* access modifiers changed from: private */
    public ListView _list;
    /* access modifiers changed from: private */
    public DialogInterface.OnClickListener _negativeListener;
    private int _negativeRes = C2852R.string.dialog_cancel;
    /* access modifiers changed from: private */
    public int _newFolderCancelRes = C2852R.string.new_folder_cancel;
    /* access modifiers changed from: private */
    public FileUtil.NewFolderFilter _newFolderFilter;
    /* access modifiers changed from: private */
    public int _newFolderOkRes = C2852R.string.new_folder_ok;
    /* access modifiers changed from: private */
    public View _newFolderView;
    private int _okRes = C2852R.string.title_choose;
    /* access modifiers changed from: private */
    public OnBackPressedListener _onBackPressed = new OnBackPressedListener() {
        public void onBackPressed(AlertDialog alertDialog) {
            if ((ChooserDialog.this._entries.size() > 0 && ((File) ChooserDialog.this._entries.get(0)).getName().equals("..")) || ((File) ChooserDialog.this._entries.get(0)).getName().contains(".. SDCard Storage") || ((File) ChooserDialog.this._entries.get(0)).getName().contains(".. Primary Storage")) {
                ChooserDialog chooserDialog = ChooserDialog.this;
                chooserDialog.onItemClick((AdapterView<?>) null, chooserDialog._list, 0, 0);
            } else if (ChooserDialog.this._onLastBackPressed != null) {
                ChooserDialog.this._onLastBackPressed.onBackPressed(alertDialog);
            } else {
                ChooserDialog.this._defaultLastBack.onBackPressed(alertDialog);
            }
        }
    };
    private DialogInterface.OnDismissListener _onDismissListener;
    /* access modifiers changed from: private */
    public OnBackPressedListener _onLastBackPressed;
    /* access modifiers changed from: private */
    public View _options;
    /* access modifiers changed from: private */
    public int _optionsIconRes = -1;
    /* access modifiers changed from: private */
    public Result _result = null;
    private int _rowLayoutRes = -1;
    private int _titleRes = C2852R.string.choose_file;

    @FunctionalInterface
    public interface AdapterSetter {
        void apply(DirAdapter dirAdapter);
    }

    @FunctionalInterface
    public interface CanNavigateTo {
        boolean canNavigate(File file);
    }

    @FunctionalInterface
    public interface CanNavigateUp {
        boolean canUpTo(File file);
    }

    @FunctionalInterface
    public interface OnBackPressedListener {
        void onBackPressed(AlertDialog alertDialog);
    }

    @FunctionalInterface
    public interface Result {
        void onChoosePath(String str, File file);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
    }

    public ChooserDialog() {
    }

    public ChooserDialog(Context context) {
        this._context = context;
    }

    public ChooserDialog(Activity activity) {
        this._context = activity;
    }

    public ChooserDialog(Fragment fragment) {
        this._context = fragment.getActivity();
    }

    public ChooserDialog with(Context context) {
        this._context = context;
        return this;
    }

    public ChooserDialog withFilter(FileFilter fileFilter) {
        withFilter(false, false, (String[]) null);
        this._fileFilter = fileFilter;
        return this;
    }

    public ChooserDialog withFilter(boolean z, boolean z2, FileFilter fileFilter) {
        withFilter(z, z2, (String[]) null);
        this._fileFilter = fileFilter;
        return this;
    }

    public ChooserDialog withFilter(boolean z, String... strArr) {
        return withFilter(false, z, strArr);
    }

    public ChooserDialog withFilter(boolean z, final boolean z2, String... strArr) {
        this._dirOnly = z;
        if (strArr == null || strArr.length == 0) {
            this._fileFilter = z ? new FileFilter() {
                public boolean accept(File file) {
                    return file.isDirectory() && (!file.isHidden() || z2);
                }
            } : new FileFilter() {
                public boolean accept(File file) {
                    return !file.isHidden() || z2;
                }
            };
        } else {
            this._fileFilter = new ExtFileFilter(this._dirOnly, z2, strArr);
        }
        return this;
    }

    public ChooserDialog withFilterRegex(boolean z, boolean z2, String str, int i) {
        this._dirOnly = z;
        this._fileFilter = new RegexFileFilter(this._dirOnly, z2, str, i);
        return this;
    }

    public ChooserDialog withFilterRegex(boolean z, boolean z2, String str) {
        this._dirOnly = z;
        this._fileFilter = new RegexFileFilter(this._dirOnly, z2, str, 2);
        return this;
    }

    public ChooserDialog withStartFile(String str) {
        if (str != null) {
            this._currentDir = new File(str);
        } else {
            this._currentDir = Environment.getExternalStorageDirectory();
        }
        if (!this._currentDir.isDirectory()) {
            this._currentDir = this._currentDir.getParentFile();
        }
        if (this._currentDir == null) {
            this._currentDir = Environment.getExternalStorageDirectory();
        }
        return this;
    }

    public ChooserDialog dismissOnButtonClick(boolean z) {
        this._dismissOnButtonClick = z;
        if (z) {
            this._defaultLastBack = new OnBackPressedListener() {
                public void onBackPressed(AlertDialog alertDialog) {
                    alertDialog.dismiss();
                }
            };
        } else {
            this._defaultLastBack = new OnBackPressedListener() {
                public void onBackPressed(AlertDialog alertDialog) {
                }
            };
        }
        return this;
    }

    public ChooserDialog withChosenListener(Result result) {
        this._result = result;
        return this;
    }

    public ChooserDialog withOnBackPressedListener(OnBackPressedListener onBackPressedListener) {
        this._onBackPressed = onBackPressedListener;
        return this;
    }

    public ChooserDialog withOnLastBackPressedListener(OnBackPressedListener onBackPressedListener) {
        this._onLastBackPressed = onBackPressedListener;
        return this;
    }

    public ChooserDialog withResources(int i, int i2, int i3) {
        this._titleRes = i;
        this._okRes = i2;
        this._negativeRes = i3;
        return this;
    }

    public ChooserDialog enableOptions(boolean z) {
        this._enableOptions = z;
        return this;
    }

    public ChooserDialog withOptionResources(int i, int i2, int i3, int i4) {
        this._createDirRes = i;
        this._deleteRes = i2;
        this._newFolderCancelRes = i3;
        this._newFolderOkRes = i4;
        return this;
    }

    public ChooserDialog withOptionIcons(int i, int i2, int i3) {
        this._optionsIconRes = i;
        this._createDirIconRes = i2;
        this._deleteIconRes = i3;
        return this;
    }

    public ChooserDialog withNewFolderFilter(FileUtil.NewFolderFilter newFolderFilter) {
        this._newFolderFilter = newFolderFilter;
        return this;
    }

    public ChooserDialog withIcon(int i) {
        this._iconRes = i;
        return this;
    }

    public ChooserDialog withLayoutView(int i) {
        this._layoutRes = i;
        return this;
    }

    public ChooserDialog withRowLayoutView(int i) {
        this._rowLayoutRes = i;
        return this;
    }

    public ChooserDialog withDateFormat() {
        return withDateFormat("yyyy/MM/dd HH:mm:ss");
    }

    public ChooserDialog withDateFormat(String str) {
        this._dateFormat = str;
        return this;
    }

    public ChooserDialog withNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        this._negativeRes = i;
        this._negativeListener = onClickListener;
        return this;
    }

    public ChooserDialog withNegativeButtonListener(DialogInterface.OnClickListener onClickListener) {
        this._negativeListener = onClickListener;
        return this;
    }

    public ChooserDialog withOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this._cancelListener2 = onCancelListener;
        return this;
    }

    public ChooserDialog withOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        if (Build.VERSION.SDK_INT >= 17) {
            this._onDismissListener = onDismissListener;
        }
        return this;
    }

    public ChooserDialog withFileIcons(final boolean z, final Drawable drawable, final Drawable drawable2) {
        this._adapterSetter = new AdapterSetter() {
            public void apply(DirAdapter dirAdapter) {
                Drawable drawable = drawable;
                if (drawable != null) {
                    dirAdapter.setDefaultFileIcon(drawable);
                }
                Drawable drawable2 = drawable2;
                if (drawable2 != null) {
                    dirAdapter.setDefaultFolderIcon(drawable2);
                }
                dirAdapter.setResolveFileType(z);
            }
        };
        return this;
    }

    public ChooserDialog withFileIconsRes(final boolean z, final int i, final int i2) {
        this._adapterSetter = new AdapterSetter() {
            public void apply(DirAdapter dirAdapter) {
                if (i != -1) {
                    dirAdapter.setDefaultFileIcon(ContextCompat.getDrawable(ChooserDialog.this._context, i));
                }
                if (i2 != -1) {
                    dirAdapter.setDefaultFolderIcon(ContextCompat.getDrawable(ChooserDialog.this._context, i2));
                }
                dirAdapter.setResolveFileType(z);
            }
        };
        return this;
    }

    public ChooserDialog withAdapterSetter(AdapterSetter adapterSetter) {
        this._adapterSetter = adapterSetter;
        return this;
    }

    public ChooserDialog withNavigateUpTo(CanNavigateUp canNavigateUp) {
        this._folderNavUpCB = canNavigateUp;
        return this;
    }

    public ChooserDialog withNavigateTo(CanNavigateTo canNavigateTo) {
        this._folderNavToCB = canNavigateTo;
        return this;
    }

    public ChooserDialog disableTitle(boolean z) {
        this._disableTitle = z;
        return this;
    }

    public ChooserDialog enableMultiple(boolean z) {
        this._enableMultiple = z;
        return this;
    }

    public ChooserDialog build() {
        DialogInterface.OnDismissListener onDismissListener;
        if (this._titleRes == 0 || this._okRes == 0 || this._negativeRes == 0) {
            throw new RuntimeException("withResources() should be called at first.");
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this._context);
        Context context = this._context;
        ArrayList arrayList = new ArrayList();
        int i = this._rowLayoutRes;
        if (i == -1) {
            i = C2852R.layout.li_row_textview;
        }
        this._adapter = new DirAdapter(context, (List<File>) arrayList, i, this._dateFormat);
        AdapterSetter adapterSetter = this._adapterSetter;
        if (adapterSetter != null) {
            adapterSetter.apply(this._adapter);
        }
        refreshDirs();
        builder.setAdapter(this._adapter, this);
        if (!this._disableTitle) {
            builder.setTitle(this._titleRes);
        }
        int i2 = this._iconRes;
        if (i2 != -1) {
            builder.setIcon(i2);
        }
        if (this._layoutRes != -1 && Build.VERSION.SDK_INT >= 21) {
            builder.setView(this._layoutRes);
        }
        if (this._dirOnly || this._enableMultiple) {
            builder.setPositiveButton(this._okRes, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (ChooserDialog.this._result != null) {
                        ChooserDialog.this._result.onChoosePath(ChooserDialog.this._currentDir.getAbsolutePath(), ChooserDialog.this._currentDir);
                    }
                }
            });
        }
        builder.setNegativeButton(this._negativeRes, this._negativeListener);
        DialogInterface.OnCancelListener onCancelListener = this._cancelListener2;
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        if (Build.VERSION.SDK_INT >= 17 && (onDismissListener = this._onDismissListener) != null) {
            builder.setOnDismissListener(onDismissListener);
        }
        builder.setOnKeyListener(new DialogInterface.OnKeyListener() {
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i != 111) {
                    switch (i) {
                        case 19:
                            if (keyEvent.getAction() == 1) {
                                return ChooserDialog.this.doMoveUp();
                            }
                            return false;
                        case 20:
                            if (keyEvent.getAction() == 1) {
                                return ChooserDialog.this.doMoveDown();
                            }
                            return false;
                        case 21:
                            if (keyEvent.getAction() == 1) {
                                return ChooserDialog.this.doGoBack();
                            }
                            return false;
                        case 22:
                        case 23:
                            if (keyEvent.getAction() == 1) {
                                return ChooserDialog.this.doEnter();
                            }
                            return false;
                        default:
                            return false;
                    }
                } else {
                    if (keyEvent.getAction() == 1) {
                        if (ChooserDialog.this._newFolderView == null || ChooserDialog.this._newFolderView.getVisibility() != 0) {
                            ChooserDialog.this._onBackPressed.onBackPressed((AlertDialog) dialogInterface);
                        } else {
                            ChooserDialog.this._newFolderView.setVisibility(4);
                            return true;
                        }
                    }
                    return true;
                }
            }
        });
        this._alertDialog = builder.create();
        setupOnShowListener();
        this._list = this._alertDialog.getListView();
        this._list.setOnItemClickListener(this);
        if (this._enableMultiple) {
            this._list.setOnItemLongClickListener(this);
        }
        return this;
    }

    private void setupOnShowListener() {
        this._alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
            public void onShow(DialogInterface dialogInterface) {
                if (!ChooserDialog.this._dismissOnButtonClick) {
                    AlertDialog alertDialog = (AlertDialog) dialogInterface;
                    Button button = alertDialog.getButton(-2);
                    Button button2 = alertDialog.getButton(-1);
                    button.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            if (ChooserDialog.this._negativeListener != null) {
                                ChooserDialog.this._negativeListener.onClick(ChooserDialog.this._alertDialog, -2);
                            }
                        }
                    });
                    button2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            if (ChooserDialog.this._result == null) {
                                return;
                            }
                            if (ChooserDialog.this._dirOnly || ChooserDialog.this._enableMultiple) {
                                ChooserDialog.this._result.onChoosePath(ChooserDialog.this._currentDir.getAbsolutePath(), ChooserDialog.this._currentDir);
                            }
                        }
                    });
                }
                if (ChooserDialog.this._createDirRes == 0 || ChooserDialog.this._newFolderCancelRes == 0 || ChooserDialog.this._newFolderOkRes == 0) {
                    throw new RuntimeException("withOptionResources() should be called at first.");
                } else if (ChooserDialog.this._enableOptions) {
                    final int themeAccentColor = UiUtil.getThemeAccentColor(ChooserDialog.this._context);
                    final PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(themeAccentColor, PorterDuff.Mode.SRC_IN);
                    Button button3 = ((AlertDialog) dialogInterface).getButton(-3);
                    button3.setText("");
                    button3.setTextColor(themeAccentColor);
                    button3.setVisibility(0);
                    Drawable drawable = ContextCompat.getDrawable(ChooserDialog.this._context, ChooserDialog.this._optionsIconRes != -1 ? ChooserDialog.this._optionsIconRes : C2852R.C2854drawable.ic_menu_24dp);
                    if (drawable != null) {
                        drawable.setColorFilter(porterDuffColorFilter);
                        button3.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    } else {
                        button3.setCompoundDrawablesWithIntrinsicBounds(ChooserDialog.this._optionsIconRes != -1 ? ChooserDialog.this._optionsIconRes : C2852R.C2854drawable.ic_menu_24dp, 0, 0, 0);
                    }
                    final AnonymousClass1Integer r1 = new Object() {
                        int Int = 0;
                    };
                    ChooserDialog.this._list.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            int i9 = i8 - i6;
                            if (view.getHeight() != i9) {
                                int height = i9 - view.getHeight();
                                int listYScroll = UiUtil.getListYScroll(ChooserDialog.this._list);
                                if (r1.Int != listYScroll) {
                                    height += r1.Int - listYScroll;
                                }
                                if (Build.VERSION.SDK_INT >= 19) {
                                    ChooserDialog.this._list.scrollListBy(height);
                                } else {
                                    ChooserDialog.this._list.scrollBy(0, height);
                                }
                            }
                        }
                    });
                    final C28414 r8 = new Runnable() {
                        public void run() {
                            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ChooserDialog.this._list.getLayoutParams();
                            if (ChooserDialog.this._options.getHeight() == 0) {
                                ChooserDialog.this._options.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                                    public boolean onPreDraw() {
                                        if (ChooserDialog.this._options.getHeight() <= 0) {
                                            return false;
                                        }
                                        ChooserDialog.this._options.getViewTreeObserver().removeOnPreDrawListener(this);
                                        new Handler().postDelayed(new Runnable() {
                                            public void run() {
                                                r1.Int = UiUtil.getListYScroll(ChooserDialog.this._list);
                                                if (ChooserDialog.this._options.getParent() instanceof LinearLayout) {
                                                    marginLayoutParams.height = ((LinearLayout) ChooserDialog.this._options.getParent()).getHeight() - ChooserDialog.this._options.getHeight();
                                                } else {
                                                    marginLayoutParams.bottomMargin = ChooserDialog.this._options.getHeight();
                                                }
                                                ChooserDialog.this._list.setLayoutParams(marginLayoutParams);
                                                ChooserDialog.this._options.setVisibility(0);
                                            }
                                        }, 100);
                                        return true;
                                    }
                                });
                                return;
                            }
                            r1.Int = UiUtil.getListYScroll(ChooserDialog.this._list);
                            ChooserDialog.this._options.setVisibility(0);
                            if (ChooserDialog.this._options.getParent() instanceof LinearLayout) {
                                marginLayoutParams.height = ((LinearLayout) ChooserDialog.this._options.getParent()).getHeight() - ChooserDialog.this._options.getHeight();
                            } else {
                                marginLayoutParams.bottomMargin = ChooserDialog.this._options.getHeight();
                            }
                            ChooserDialog.this._list.setLayoutParams(marginLayoutParams);
                        }
                    };
                    final C28445 r7 = new Runnable() {
                        public void run() {
                            r1.Int = UiUtil.getListYScroll(ChooserDialog.this._list);
                            ChooserDialog.this._options.setVisibility(4);
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ChooserDialog.this._list.getLayoutParams();
                            if (ChooserDialog.this._options.getParent() instanceof LinearLayout) {
                                marginLayoutParams.height = ((LinearLayout) ChooserDialog.this._options.getParent()).getHeight();
                            } else {
                                marginLayoutParams.bottomMargin = 0;
                            }
                            ChooserDialog.this._list.setLayoutParams(marginLayoutParams);
                        }
                    };
                    final DialogInterface dialogInterface2 = dialogInterface;
                    button3.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            ViewGroup.LayoutParams layoutParams;
                            if (ChooserDialog.this._options == null) {
                                final ViewGroup viewGroup = (ViewGroup) ((AlertDialog) dialogInterface2).findViewById(ChooserDialog.this._context.getResources().getIdentifier("contentPanel", "id", AbstractSpiCall.ANDROID_CLIENT_TYPE));
                                boolean z = viewGroup instanceof LinearLayout;
                                if (viewGroup != null) {
                                    FrameLayout frameLayout = new FrameLayout(ChooserDialog.this._context);
                                    if (z) {
                                        layoutParams = new LinearLayout.LayoutParams(-1, (int) UiUtil.dip2px(48.0f));
                                    } else {
                                        layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
                                    }
                                    viewGroup.addView(frameLayout, layoutParams);
                                    frameLayout.setOnClickListener((View.OnClickListener) null);
                                    frameLayout.setVisibility(4);
                                    View unused = ChooserDialog.this._options = frameLayout;
                                    Button button = new Button(ChooserDialog.this._context, (AttributeSet) null, 16843567);
                                    button.setText(ChooserDialog.this._createDirRes);
                                    button.setTextColor(themeAccentColor);
                                    Drawable drawable = ContextCompat.getDrawable(ChooserDialog.this._context, ChooserDialog.this._createDirIconRes != -1 ? ChooserDialog.this._createDirIconRes : C2852R.C2854drawable.ic_add_24dp);
                                    if (drawable != null) {
                                        drawable.setColorFilter(porterDuffColorFilter);
                                        button.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                                    } else {
                                        button.setCompoundDrawablesWithIntrinsicBounds(ChooserDialog.this._createDirIconRes != -1 ? ChooserDialog.this._createDirIconRes : C2852R.C2854drawable.ic_add_24dp, 0, 0, 0);
                                    }
                                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 8388627);
                                    layoutParams2.leftMargin = 10;
                                    frameLayout.addView(button, layoutParams2);
                                    final Button button2 = new Button(ChooserDialog.this._context, (AttributeSet) null, 16843567);
                                    button2.setText(ChooserDialog.this._deleteRes);
                                    button2.setTextColor(themeAccentColor);
                                    Drawable drawable2 = ContextCompat.getDrawable(ChooserDialog.this._context, ChooserDialog.this._deleteIconRes != -1 ? ChooserDialog.this._deleteIconRes : C2852R.C2854drawable.ic_delete_24dp);
                                    if (drawable2 != null) {
                                        drawable2.setColorFilter(porterDuffColorFilter);
                                        button2.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
                                    } else {
                                        button2.setCompoundDrawablesWithIntrinsicBounds(ChooserDialog.this._deleteIconRes != -1 ? ChooserDialog.this._deleteIconRes : C2852R.C2854drawable.ic_delete_24dp, 0, 0, 0);
                                    }
                                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2, 8388629);
                                    layoutParams3.rightMargin = 10;
                                    frameLayout.addView(button2, layoutParams3);
                                    button.setOnClickListener(new View.OnClickListener() {
                                        private EditText input = null;

                                        public void onClick(View view) {
                                            r7.run();
                                            File file = new File(ChooserDialog.this._currentDir, "New folder");
                                            int i = 1;
                                            while (file.exists()) {
                                                File access$200 = ChooserDialog.this._currentDir;
                                                file = new File(access$200, "New folder (" + i + ')');
                                                i++;
                                            }
                                            EditText editText = this.input;
                                            if (editText != null) {
                                                editText.setText(file.getName());
                                            }
                                            if (ChooserDialog.this._newFolderView == null) {
                                                try {
                                                    ((AlertDialog) dialogInterface2).getWindow().clearFlags(131080);
                                                    ((AlertDialog) dialogInterface2).getWindow().setSoftInputMode(4);
                                                } catch (NullPointerException e) {
                                                    e.printStackTrace();
                                                }
                                                final FrameLayout frameLayout = new FrameLayout(ChooserDialog.this._context);
                                                frameLayout.setBackgroundColor(1627389951);
                                                frameLayout.setScrollContainer(true);
                                                viewGroup.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
                                                frameLayout.setOnClickListener((View.OnClickListener) null);
                                                frameLayout.setVisibility(4);
                                                View unused = ChooserDialog.this._newFolderView = frameLayout;
                                                LinearLayout linearLayout = new LinearLayout(ChooserDialog.this._context);
                                                frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2, 17));
                                                linearLayout.addView(new Space(ChooserDialog.this._context), new LinearLayout.LayoutParams(0, -2, 2.0f));
                                                LinearLayout linearLayout2 = new LinearLayout(ChooserDialog.this._context);
                                                linearLayout2.setOrientation(1);
                                                linearLayout2.setBackgroundColor(-1);
                                                if (Build.VERSION.SDK_INT >= 21) {
                                                    linearLayout2.setElevation(25.0f);
                                                } else {
                                                    ViewCompat.setElevation(linearLayout2, 25.0f);
                                                }
                                                linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 5.0f));
                                                linearLayout.addView(new Space(ChooserDialog.this._context), new LinearLayout.LayoutParams(0, -2, 2.0f));
                                                final EditText editText2 = new EditText(ChooserDialog.this._context);
                                                editText2.setText(file.getName());
                                                editText2.setSelectAllOnFocus(true);
                                                editText2.setSingleLine(true);
                                                editText2.setInputType(524464);
                                                InputFilter[] inputFilterArr = new InputFilter[1];
                                                inputFilterArr[0] = ChooserDialog.this._newFolderFilter != null ? ChooserDialog.this._newFolderFilter : new FileUtil.NewFolderFilter();
                                                editText2.setFilters(inputFilterArr);
                                                editText2.setGravity(1);
                                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                                layoutParams.setMargins(3, 2, 3, 0);
                                                linearLayout2.addView(editText2, layoutParams);
                                                this.input = editText2;
                                                FrameLayout frameLayout2 = new FrameLayout(ChooserDialog.this._context);
                                                linearLayout2.addView(frameLayout2, new LinearLayout.LayoutParams(-1, -2));
                                                Button button = new Button(ChooserDialog.this._context, (AttributeSet) null, 16843567);
                                                button.setText(ChooserDialog.this._newFolderCancelRes);
                                                button.setTextColor(themeAccentColor);
                                                frameLayout2.addView(button, new FrameLayout.LayoutParams(-2, -2, GravityCompat.START));
                                                Button button2 = new Button(ChooserDialog.this._context, (AttributeSet) null, 16843567);
                                                button2.setText(ChooserDialog.this._newFolderOkRes);
                                                button2.setTextColor(themeAccentColor);
                                                frameLayout2.addView(button2, new FrameLayout.LayoutParams(-2, -2, GravityCompat.END));
                                                editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                                                    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                                                        if (i != 6) {
                                                            return false;
                                                        }
                                                        ChooserDialog.this.createNewDirectory(editText2.getText().toString());
                                                        UiUtil.hideKeyboardFrom(ChooserDialog.this._context, editText2);
                                                        frameLayout.setVisibility(4);
                                                        return true;
                                                    }
                                                });
                                                button.setOnClickListener(new View.OnClickListener() {
                                                    public void onClick(View view) {
                                                        UiUtil.hideKeyboardFrom(ChooserDialog.this._context, editText2);
                                                        frameLayout.setVisibility(4);
                                                    }
                                                });
                                                button2.setOnClickListener(new View.OnClickListener() {
                                                    public void onClick(View view) {
                                                        ChooserDialog.this.createNewDirectory(editText2.getText().toString());
                                                        UiUtil.hideKeyboardFrom(ChooserDialog.this._context, editText2);
                                                        frameLayout.setVisibility(4);
                                                    }
                                                });
                                            }
                                            if (ChooserDialog.this._newFolderView.getVisibility() == 4) {
                                                ChooserDialog.this._newFolderView.setVisibility(0);
                                            } else {
                                                ChooserDialog.this._newFolderView.setVisibility(4);
                                            }
                                        }
                                    });
                                    button2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View view) {
                                            r7.run();
                                            int i = 0;
                                            if (ChooserDialog.this._chooseMode == 2) {
                                                boolean z = true;
                                                for (File next : ChooserDialog.this._adapter.getSelected()) {
                                                    ChooserDialog.this._result.onChoosePath(next.getAbsolutePath(), next);
                                                    if (z) {
                                                        try {
                                                            ChooserDialog.this.deleteFile(next);
                                                        } catch (IOException e) {
                                                            Toast.makeText(ChooserDialog.this._context, e.getMessage(), 1).show();
                                                            z = false;
                                                        }
                                                    }
                                                }
                                                ChooserDialog.this._adapter.clearSelected();
                                                ChooserDialog.this._alertDialog.getButton(-1).setVisibility(4);
                                                int unused = ChooserDialog.this._chooseMode = 0;
                                                ChooserDialog.this.refreshDirs();
                                                return;
                                            }
                                            ChooserDialog chooserDialog = ChooserDialog.this;
                                            if (ChooserDialog.this._chooseMode != 1) {
                                                i = 1;
                                            }
                                            int unused2 = chooserDialog._chooseMode = i;
                                            if (ChooserDialog.this._deleteModeIndicator == null) {
                                                Runnable unused3 = ChooserDialog.this._deleteModeIndicator = new Runnable() {
                                                    public void run() {
                                                        if (ChooserDialog.this._chooseMode == 1) {
                                                            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-2130771968, PorterDuff.Mode.SRC_IN);
                                                            ChooserDialog.this._alertDialog.getButton(-3).getCompoundDrawables()[0].setColorFilter(porterDuffColorFilter);
                                                            ChooserDialog.this._alertDialog.getButton(-3).setTextColor(-2130771968);
                                                            button2.getCompoundDrawables()[0].setColorFilter(porterDuffColorFilter);
                                                            button2.setTextColor(-2130771968);
                                                            return;
                                                        }
                                                        ChooserDialog.this._alertDialog.getButton(-3).getCompoundDrawables()[0].clearColorFilter();
                                                        ChooserDialog.this._alertDialog.getButton(-3).setTextColor(themeAccentColor);
                                                        button2.getCompoundDrawables()[0].clearColorFilter();
                                                        button2.setTextColor(themeAccentColor);
                                                    }
                                                };
                                            }
                                            ChooserDialog.this._deleteModeIndicator.run();
                                        }
                                    });
                                } else {
                                    return;
                                }
                            }
                            if (ChooserDialog.this._options.getVisibility() == 0) {
                                r7.run();
                            } else {
                                r8.run();
                            }
                        }
                    });
                }
            }
        });
    }

    public ChooserDialog show() {
        if (this._alertDialog == null || this._list == null) {
            throw new RuntimeException("call build() before show().");
        }
        if (Build.VERSION.SDK_INT < 23) {
            this._alertDialog.show();
        } else if (this._enableOptions) {
            int checkSelfPermission = ContextCompat.checkSelfPermission(this._context, "android.permission.READ_EXTERNAL_STORAGE");
            int checkSelfPermission2 = ContextCompat.checkSelfPermission(this._context, "android.permission.WRITE_EXTERNAL_STORAGE");
            if (checkSelfPermission == 0 && checkSelfPermission2 == 0) {
                this._alertDialog.show();
            } else {
                ActivityCompat.requestPermissions((Activity) this._context, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 0);
                int checkSelfPermission3 = ContextCompat.checkSelfPermission(this._context, "android.permission.READ_EXTERNAL_STORAGE");
                int checkSelfPermission4 = ContextCompat.checkSelfPermission(this._context, "android.permission.WRITE_EXTERNAL_STORAGE");
                if (checkSelfPermission3 == 0 && checkSelfPermission4 == 0) {
                    this._alertDialog.show();
                }
                return this;
            }
        } else if (ContextCompat.checkSelfPermission(this._context, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            this._alertDialog.show();
        } else {
            ActivityCompat.requestPermissions((Activity) this._context, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
            if (ContextCompat.checkSelfPermission(this._context, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                this._alertDialog.show();
            }
            return this;
        }
        if (this._enableMultiple) {
            this._alertDialog.getButton(-1).setVisibility(4);
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void listDirs() {
        /*
            r7 = this;
            java.util.List<java.io.File> r0 = r7._entries
            r0.clear()
            java.io.File r0 = r7._currentDir
            r1 = 0
            if (r0 != 0) goto L_0x0017
            java.io.File r0 = new java.io.File
            android.content.Context r2 = r7._context
            java.lang.String r2 = com.obsez.android.lib.filechooser.internals.FileUtil.getStoragePath(r2, r1)
            r0.<init>(r2)
            r7._currentDir = r0
        L_0x0017:
            java.io.File r0 = r7._currentDir
            java.io.FileFilter r2 = r7._fileFilter
            java.io.File[] r0 = r0.listFiles(r2)
            android.content.Context r2 = r7._context
            r3 = 1
            java.lang.String r2 = com.obsez.android.lib.filechooser.internals.FileUtil.getStoragePath(r2, r3)
            android.content.Context r4 = r7._context
            java.lang.String r4 = com.obsez.android.lib.filechooser.internals.FileUtil.getStoragePath(r4, r1)
            if (r2 == 0) goto L_0x0056
            java.io.File r5 = r7._currentDir
            java.lang.String r5 = r5.getAbsolutePath()
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0042
            java.util.List<java.io.File> r2 = r7._entries
            java.io.File r4 = __sdcardRoot
            r2.add(r4)
            goto L_0x0057
        L_0x0042:
            java.io.File r4 = r7._currentDir
            java.lang.String r4 = r4.getAbsolutePath()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0056
            java.util.List<java.io.File> r2 = r7._entries
            java.io.File r4 = __primaryRoot
            r2.add(r4)
            goto L_0x0057
        L_0x0056:
            r3 = 0
        L_0x0057:
            if (r3 != 0) goto L_0x0074
            java.io.File r2 = r7._currentDir
            java.io.File r2 = r2.getParentFile()
            if (r2 == 0) goto L_0x0074
            java.io.File r2 = r7._currentDir
            java.io.File r2 = r2.getParentFile()
            boolean r2 = r2.canRead()
            if (r2 == 0) goto L_0x0074
            java.util.List<java.io.File> r2 = r7._entries
            java.io.File r3 = __normalParent
            r2.add(r3)
        L_0x0074:
            if (r0 != 0) goto L_0x0077
            return
        L_0x0077:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            int r4 = r0.length
        L_0x0082:
            if (r1 >= r4) goto L_0x0096
            r5 = r0[r1]
            boolean r6 = r5.isDirectory()
            if (r6 == 0) goto L_0x0090
            r2.add(r5)
            goto L_0x0093
        L_0x0090:
            r3.add(r5)
        L_0x0093:
            int r1 = r1 + 1
            goto L_0x0082
        L_0x0096:
            r7.sortByName(r2)
            r7.sortByName(r3)
            java.util.List<java.io.File> r0 = r7._entries
            r0.addAll(r2)
            java.util.List<java.io.File> r0 = r7._entries
            r0.addAll(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obsez.android.lib.filechooser.ChooserDialog.listDirs():void");
    }

    private void sortByName(List<File> list) {
        Collections.sort(list, new Comparator<File>() {
            public int compare(File file, File file2) {
                return file.getName().toLowerCase().compareTo(file2.getName().toLowerCase());
            }
        });
    }

    private void listDirs2() {
        this._entries.clear();
        File[] listFiles = this._currentDir.listFiles();
        if (this._currentDir.getParent() != null) {
            this._entries.add(new File(".."));
        }
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    this._entries.add(file);
                }
            }
        }
        sortByName(this._entries);
    }

    /* access modifiers changed from: private */
    public void createNewDirectory(String str) {
        File file = new File(this._currentDir, str);
        if (file.exists() || !file.mkdir()) {
            Context context = this._context;
            Toast.makeText(context, "Couldn't create folder " + file.getName() + " at " + file.getAbsolutePath(), 1).show();
            return;
        }
        refreshDirs();
    }

    /* access modifiers changed from: private */
    public void deleteFile(File file) throws IOException {
        if (file.isDirectory()) {
            for (File deleteFile : file.listFiles()) {
                deleteFile(deleteFile);
            }
        }
        if (!file.delete()) {
            throw new IOException("Couldn't delete \"" + file.getName() + "\" at \"" + file.getParent());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView<?> r2, android.view.View r3, int r4, long r5) {
        /*
            r1 = this;
            if (r4 < 0) goto L_0x015f
            java.util.List<java.io.File> r2 = r1._entries
            int r2 = r2.size()
            if (r4 < r2) goto L_0x000c
            goto L_0x015f
        L_0x000c:
            java.util.List<java.io.File> r2 = r1._entries
            java.lang.Object r2 = r2.get(r4)
            java.io.File r2 = (java.io.File) r2
            java.lang.String r3 = r2.getName()
            java.lang.String r5 = ".."
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0031
            android.widget.ListView r2 = r1._list
            boolean r2 = r2.hasFocus()
            if (r2 != 0) goto L_0x002d
            android.widget.ListView r2 = r1._list
            r2.requestFocus()
        L_0x002d:
            r1.doGoBack()
            return
        L_0x0031:
            java.lang.String r3 = r2.getName()
            java.lang.String r5 = ".. SDCard Storage"
            boolean r3 = r3.contains(r5)
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x006f
            android.content.Context r2 = r1._context
            java.lang.String r2 = com.obsez.android.lib.filechooser.internals.FileUtil.getStoragePath(r2, r5)
            if (r2 == 0) goto L_0x0154
            java.lang.String r3 = android.os.Environment.getExternalStorageState()
            java.lang.String r4 = "mounted"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0154
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            r1._currentDir = r3
            int r2 = r1._chooseMode
            if (r2 != r5) goto L_0x005f
            r2 = 0
        L_0x005f:
            r1._chooseMode = r2
            java.lang.Runnable r2 = r1._deleteModeIndicator
            if (r2 == 0) goto L_0x0068
            r2.run()
        L_0x0068:
            com.obsez.android.lib.filechooser.tool.DirAdapter r2 = r1._adapter
            r2.popAll()
            goto L_0x0154
        L_0x006f:
            java.lang.String r3 = r2.getName()
            java.lang.String r0 = ".. Primary Storage"
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L_0x009f
            android.content.Context r2 = r1._context
            java.lang.String r2 = com.obsez.android.lib.filechooser.internals.FileUtil.getStoragePath(r2, r6)
            if (r2 == 0) goto L_0x0154
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            r1._currentDir = r3
            int r2 = r1._chooseMode
            if (r2 != r5) goto L_0x008f
            r2 = 0
        L_0x008f:
            r1._chooseMode = r2
            java.lang.Runnable r2 = r1._deleteModeIndicator
            if (r2 == 0) goto L_0x0098
            r2.run()
        L_0x0098:
            com.obsez.android.lib.filechooser.tool.DirAdapter r2 = r1._adapter
            r2.popAll()
            goto L_0x0154
        L_0x009f:
            int r3 = r1._chooseMode
            if (r3 == 0) goto L_0x010c
            if (r3 == r5) goto L_0x00ed
            r0 = 2
            if (r3 == r0) goto L_0x00aa
            goto L_0x0154
        L_0x00aa:
            boolean r3 = r2.isDirectory()
            if (r3 == 0) goto L_0x00c9
            com.obsez.android.lib.filechooser.ChooserDialog$CanNavigateTo r3 = r1._folderNavToCB
            if (r3 != 0) goto L_0x00b8
            com.obsez.android.lib.filechooser.ChooserDialog$CanNavigateTo r3 = _defaultNavToCB
            r1._folderNavToCB = r3
        L_0x00b8:
            com.obsez.android.lib.filechooser.ChooserDialog$CanNavigateTo r3 = r1._folderNavToCB
            boolean r3 = r3.canNavigate(r2)
            if (r3 == 0) goto L_0x0154
            r1._currentDir = r2
            com.obsez.android.lib.filechooser.tool.DirAdapter r2 = r1._adapter
            r2.push()
            goto L_0x0155
        L_0x00c9:
            com.obsez.android.lib.filechooser.tool.DirAdapter r3 = r1._adapter
            r3.selectItem(r4)
            com.obsez.android.lib.filechooser.tool.DirAdapter r3 = r1._adapter
            boolean r3 = r3.isAnySelected()
            if (r3 != 0) goto L_0x00e3
            r1._chooseMode = r6
            android.app.AlertDialog r3 = r1._alertDialog
            r4 = -1
            android.widget.Button r3 = r3.getButton(r4)
            r4 = 4
            r3.setVisibility(r4)
        L_0x00e3:
            com.obsez.android.lib.filechooser.ChooserDialog$Result r3 = r1._result
            java.lang.String r4 = r2.getAbsolutePath()
            r3.onChoosePath(r4, r2)
            goto L_0x0154
        L_0x00ed:
            r1.deleteFile(r2)     // Catch:{ IOException -> 0x00f1 }
            goto L_0x0102
        L_0x00f1:
            r2 = move-exception
            r2.printStackTrace()
            android.content.Context r3 = r1._context
            java.lang.String r2 = r2.getMessage()
            android.widget.Toast r2 = android.widget.Toast.makeText(r3, r2, r5)
            r2.show()
        L_0x0102:
            r1._chooseMode = r6
            java.lang.Runnable r2 = r1._deleteModeIndicator
            if (r2 == 0) goto L_0x0154
            r2.run()
            goto L_0x0154
        L_0x010c:
            boolean r3 = r2.isDirectory()
            if (r3 == 0) goto L_0x012a
            com.obsez.android.lib.filechooser.ChooserDialog$CanNavigateTo r3 = r1._folderNavToCB
            if (r3 != 0) goto L_0x011a
            com.obsez.android.lib.filechooser.ChooserDialog$CanNavigateTo r3 = _defaultNavToCB
            r1._folderNavToCB = r3
        L_0x011a:
            com.obsez.android.lib.filechooser.ChooserDialog$CanNavigateTo r3 = r1._folderNavToCB
            boolean r3 = r3.canNavigate(r2)
            if (r3 == 0) goto L_0x0154
            r1._currentDir = r2
            com.obsez.android.lib.filechooser.tool.DirAdapter r2 = r1._adapter
            r2.push(r4)
            goto L_0x0155
        L_0x012a:
            boolean r3 = r1._dirOnly
            if (r3 != 0) goto L_0x0154
            com.obsez.android.lib.filechooser.ChooserDialog$Result r3 = r1._result
            if (r3 == 0) goto L_0x0154
            java.lang.String r4 = r2.getAbsolutePath()
            r3.onChoosePath(r4, r2)
            boolean r2 = r1._enableMultiple
            if (r2 == 0) goto L_0x014a
            com.obsez.android.lib.filechooser.ChooserDialog$Result r2 = r1._result
            java.io.File r3 = r1._currentDir
            java.lang.String r3 = r3.getAbsolutePath()
            java.io.File r4 = r1._currentDir
            r2.onChoosePath(r3, r4)
        L_0x014a:
            boolean r2 = r1._dismissOnButtonClick
            if (r2 == 0) goto L_0x0153
            android.app.AlertDialog r2 = r1._alertDialog
            r2.dismiss()
        L_0x0153:
            return
        L_0x0154:
            r5 = 0
        L_0x0155:
            r1.refreshDirs()
            if (r5 == 0) goto L_0x015f
            android.widget.ListView r2 = r1._list
            r2.setSelection(r6)
        L_0x015f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obsez.android.lib.filechooser.ChooserDialog.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        File file = this._entries.get(i);
        if (file.getName().equals("..") || file.getName().contains(".. SDCard Storage") || file.getName().contains(".. Primary Storage") || file.isDirectory() || this._adapter.isSelected(i)) {
            return true;
        }
        this._result.onChoosePath(file.getAbsolutePath(), file);
        this._adapter.selectItem(i);
        this._chooseMode = 2;
        this._alertDialog.getButton(-1).setVisibility(0);
        this._deleteModeIndicator.run();
        return true;
    }

    /* access modifiers changed from: private */
    public void refreshDirs() {
        listDirs();
        this._adapter.setEntries(this._entries);
    }

    public void dismiss() {
        this._alertDialog.dismiss();
    }

    /* access modifiers changed from: private */
    public boolean doMoveUp() {
        if (this._list.hasFocus()) {
            Log.d("z", "move up at " + this._adapter.getHoveredIndex());
            int hoveredIndex = this._adapter.getHoveredIndex();
            int decreaseHoveredIndex = this._adapter.decreaseHoveredIndex();
            if (hoveredIndex < 0 || hoveredIndex == decreaseHoveredIndex) {
                this._list.setSelection(decreaseHoveredIndex);
                moveFocusToButtons();
                return true;
            }
            UiUtil.ensureVisible(this._list, decreaseHoveredIndex);
            this._list.requestFocus();
            return true;
        } else if (!buttonsHasFocus()) {
            return true;
        } else {
            this._list.requestFocus();
            return true;
        }
    }

    /* access modifiers changed from: private */
    public boolean doMoveDown() {
        if (this._list.hasFocus()) {
            Log.d("z", "move down at " + this._adapter.getHoveredIndex());
            int hoveredIndex = this._adapter.getHoveredIndex();
            int increaseHoveredIndex = this._adapter.increaseHoveredIndex();
            if (hoveredIndex < 0 || hoveredIndex == increaseHoveredIndex) {
                this._list.setSelection(increaseHoveredIndex);
                moveFocusToButtons();
                return true;
            }
            UiUtil.ensureVisible(this._list, increaseHoveredIndex);
            this._list.requestFocus();
            return true;
        } else if (!buttonsHasFocus()) {
            return true;
        } else {
            this._list.requestFocus();
            return true;
        }
    }

    /* access modifiers changed from: private */
    public boolean doGoBack() {
        if (this._list.hasFocus()) {
            File parentFile = this._currentDir.getParentFile();
            Log.d("z", "go back at " + this._adapter.getHoveredIndex() + ", go up level: " + parentFile.getAbsolutePath());
            if (this._folderNavUpCB == null) {
                this._folderNavUpCB = _defaultNavUpCB;
            }
            if (this._folderNavUpCB.canUpTo(parentFile)) {
                this._currentDir = parentFile;
                int i = this._chooseMode;
                if (i == 1) {
                    i = 0;
                }
                this._chooseMode = i;
                Runnable runnable = this._deleteModeIndicator;
                if (runnable != null) {
                    runnable.run();
                }
                this._adapter.pop();
                refreshDirs();
                this._list.setSelection(this._adapter.getHoveredIndex());
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public boolean doEnter() {
        if (!this._list.hasFocus()) {
            return true;
        }
        Log.d("z", "enter at " + this._adapter.getHoveredIndex());
        int hoveredIndex = this._adapter.getHoveredIndex();
        ListView listView = this._list;
        onItemClick(listView, listView, hoveredIndex, -1);
        return true;
    }

    private boolean buttonsHasFocus() {
        View currentFocus = this._alertDialog.getCurrentFocus();
        return currentFocus == this._alertDialog.getButton(-3) || currentFocus == this._alertDialog.getButton(-2) || currentFocus == this._alertDialog.getButton(-1);
    }

    private boolean moveFocusToButtons() {
        Button button = this._alertDialog.getButton(-3).getVisibility() == 0 ? this._alertDialog.getButton(-3) : null;
        if (button == null && this._alertDialog.getButton(-2).getVisibility() == 0) {
            button = this._alertDialog.getButton(-2);
        }
        if (button == null && this._alertDialog.getButton(-1).getVisibility() == 0) {
            button = this._alertDialog.getButton(-1);
        }
        if (button == null) {
            return false;
        }
        button.requestFocus();
        return true;
    }
}
