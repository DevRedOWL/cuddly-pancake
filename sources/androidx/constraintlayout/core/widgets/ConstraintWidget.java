package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int BOTH = 2;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    static final int DIMENSION_HORIZONTAL = 0;
    static final int DIMENSION_VERTICAL = 1;
    protected static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    private static final boolean USE_WRAP_DIMENSION_FOR_SPREAD = false;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    private static final int WRAP = -2;
    public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
    public static final int WRAP_BEHAVIOR_INCLUDED = 0;
    public static final int WRAP_BEHAVIOR_SKIPPED = 3;
    public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
    private boolean OPTIMIZE_WRAP;
    private boolean OPTIMIZE_WRAP_ON_RESOLVED;
    private boolean hasBaseline;
    public ChainRun horizontalChainRun;
    public int horizontalGroup;
    public HorizontalWidgetRun horizontalRun;
    private boolean inPlaceholder;
    public boolean[] isTerminalWidget;
    protected ArrayList<ConstraintAnchor> mAnchors;
    public ConstraintAnchor mBaseline;
    int mBaselineDistance;
    public ConstraintAnchor mBottom;
    boolean mBottomHasCentered;
    public ConstraintAnchor mCenter;
    ConstraintAnchor mCenterX;
    ConstraintAnchor mCenterY;
    private float mCircleConstraintAngle;
    private Object mCompanionWidget;
    private int mContainerItemSkip;
    private String mDebugName;
    public float mDimensionRatio;
    protected int mDimensionRatioSide;
    int mDistToBottom;
    int mDistToLeft;
    int mDistToRight;
    int mDistToTop;
    boolean mGroupsToSolver;
    int mHeight;
    private int mHeightOverride;
    float mHorizontalBiasPercent;
    boolean mHorizontalChainFixedPosition;
    int mHorizontalChainStyle;
    ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    boolean mHorizontalWrapVisited;
    private boolean mInVirtuaLayout;
    public boolean mIsHeightWrapContent;
    private boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    private int mLastHorizontalMeasureSpec;
    private int mLastVerticalMeasureSpec;
    public ConstraintAnchor mLeft;
    boolean mLeftHasCentered;
    public ConstraintAnchor[] mListAnchors;
    public DimensionBehaviour[] mListDimensionBehaviors;
    protected ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    private int[] mMaxDimension;
    private boolean mMeasureRequested;
    protected int mMinHeight;
    protected int mMinWidth;
    protected ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    public ConstraintWidget mParent;
    int mRelX;
    int mRelY;
    float mResolvedDimensionRatio;
    int mResolvedDimensionRatioSide;
    boolean mResolvedHasRatio;
    public int[] mResolvedMatchConstraintDefault;
    public ConstraintAnchor mRight;
    boolean mRightHasCentered;
    public ConstraintAnchor mTop;
    boolean mTopHasCentered;
    private String mType;
    float mVerticalBiasPercent;
    boolean mVerticalChainFixedPosition;
    int mVerticalChainStyle;
    ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    boolean mVerticalWrapVisited;
    private int mVisibility;
    public float[] mWeight;
    int mWidth;
    private int mWidthOverride;
    private int mWrapBehaviorInParent;

    /* renamed from: mX */
    protected int f15mX;

    /* renamed from: mY */
    protected int f16mY;
    public boolean measured;
    private boolean resolvedHorizontal;
    private boolean resolvedVertical;
    public WidgetRun[] run;
    public ChainRun verticalChainRun;
    public int verticalGroup;
    public VerticalWidgetRun verticalRun;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public WidgetRun getRun(int i) {
        if (i == 0) {
            return this.horizontalRun;
        }
        if (i == 1) {
            return this.verticalRun;
        }
        return null;
    }

    public void setFinalFrame(int i, int i2, int i3, int i4, int i5, int i6) {
        setFrame(i, i2, i3, i4);
        setBaselineDistance(i5);
        if (i6 == 0) {
            this.resolvedHorizontal = true;
            this.resolvedVertical = false;
        } else if (i6 == 1) {
            this.resolvedHorizontal = false;
            this.resolvedVertical = true;
        } else if (i6 == 2) {
            this.resolvedHorizontal = true;
            this.resolvedVertical = true;
        } else {
            this.resolvedHorizontal = false;
            this.resolvedVertical = false;
        }
    }

    public void setFinalLeft(int i) {
        this.mLeft.setFinalValue(i);
        this.f15mX = i;
    }

    public void setFinalTop(int i) {
        this.mTop.setFinalValue(i);
        this.f16mY = i;
    }

    public void setFinalHorizontal(int i, int i2) {
        this.mLeft.setFinalValue(i);
        this.mRight.setFinalValue(i2);
        this.f15mX = i;
        this.mWidth = i2 - i;
        this.resolvedHorizontal = true;
    }

    public void setFinalVertical(int i, int i2) {
        this.mTop.setFinalValue(i);
        this.mBottom.setFinalValue(i2);
        this.f16mY = i;
        this.mHeight = i2 - i;
        if (this.hasBaseline) {
            this.mBaseline.setFinalValue(i + this.mBaselineDistance);
        }
        this.resolvedVertical = true;
    }

    public void setFinalBaseline(int i) {
        if (this.hasBaseline) {
            int i2 = i - this.mBaselineDistance;
            int i3 = this.mHeight + i2;
            this.f16mY = i2;
            this.mTop.setFinalValue(i2);
            this.mBottom.setFinalValue(i3);
            this.mBaseline.setFinalValue(i);
            this.resolvedVertical = true;
        }
    }

    public boolean isResolvedHorizontally() {
        return this.resolvedHorizontal || (this.mLeft.hasFinalValue() && this.mRight.hasFinalValue());
    }

    public boolean isResolvedVertically() {
        return this.resolvedVertical || (this.mTop.hasFinalValue() && this.mBottom.hasFinalValue());
    }

    public void resetFinalResolution() {
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            this.mAnchors.get(i).resetFinalResolution();
        }
    }

    public void ensureMeasureRequested() {
        this.mMeasureRequested = true;
    }

    public boolean hasDependencies() {
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            if (this.mAnchors.get(i).hasDependents()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDanglingDimension(int i) {
        if (i == 0) {
            return (this.mLeft.mTarget != null ? 1 : 0) + (this.mRight.mTarget != null ? 1 : 0) < 2;
        }
        if ((this.mTop.mTarget != null ? 1 : 0) + (this.mBottom.mTarget != null ? 1 : 0) + (this.mBaseline.mTarget != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public boolean isInVirtualLayout() {
        return this.mInVirtuaLayout;
    }

    public void setInVirtualLayout(boolean z) {
        this.mInVirtuaLayout = z;
    }

    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }

    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }

    public void setMaxWidth(int i) {
        this.mMaxDimension[0] = i;
    }

    public void setMaxHeight(int i) {
        this.mMaxDimension[1] = i;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public void setHasBaseline(boolean z) {
        this.hasBaseline = z;
    }

    public boolean getHasBaseline() {
        return this.hasBaseline;
    }

    public boolean isInPlaceholder() {
        return this.inPlaceholder;
    }

    public void setInPlaceholder(boolean z) {
        this.inPlaceholder = z;
    }

    /* access modifiers changed from: protected */
    public void setInBarrier(int i, boolean z) {
        this.mIsInBarrier[i] = z;
    }

    public void setMeasureRequested(boolean z) {
        this.mMeasureRequested = z;
    }

    public boolean isMeasureRequested() {
        return this.mMeasureRequested && this.mVisibility != 8;
    }

    public void setWrapBehaviorInParent(int i) {
        if (i >= 0 && i <= 3) {
            this.mWrapBehaviorInParent = i;
        }
    }

    public int getWrapBehaviorInParent() {
        return this.mWrapBehaviorInParent;
    }

    public int getLastHorizontalMeasureSpec() {
        return this.mLastHorizontalMeasureSpec;
    }

    public int getLastVerticalMeasureSpec() {
        return this.mLastVerticalMeasureSpec;
    }

    public void setLastMeasureSpec(int i, int i2) {
        this.mLastHorizontalMeasureSpec = i;
        this.mLastVerticalMeasureSpec = i2;
        setMeasureRequested(false);
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mCircleConstraintAngle = 0.0f;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f15mX = 0;
        this.f16mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mListDimensionBehaviors[0] = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors[1] = DimensionBehaviour.FIXED;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.mMaxDimension;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedHasRatio = false;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mGroupsToSolver = false;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.mInVirtuaLayout = false;
        boolean[] zArr2 = this.mIsInBarrier;
        zArr2[0] = false;
        zArr2[1] = false;
        this.mMeasureRequested = true;
        int[] iArr2 = this.mResolvedMatchConstraintDefault;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
    }

    public boolean oppositeDimensionDependsOn(int i) {
        char c = i == 0 ? (char) 1 : 0;
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[i];
        DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[c];
        if (dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT && dimensionBehaviour2 == DimensionBehaviour.MATCH_CONSTRAINT) {
            return true;
        }
        return false;
    }

    public boolean oppositeDimensionsTied() {
        return this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean hasDimensionOverride() {
        return (this.mWidthOverride == -1 && this.mHeightOverride == -1) ? false : true;
    }

    public ConstraintWidget() {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP = false;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtuaLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        this.mCenter = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, this.mCenter};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f15mX = 0;
        this.f16mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
    }

    public ConstraintWidget(String str) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP = false;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtuaLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        this.mCenter = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, this.mCenter};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f15mX = 0;
        this.f16mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
        setDebugName(str);
    }

    public ConstraintWidget(int i, int i2, int i3, int i4) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP = false;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtuaLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        this.mCenter = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, this.mCenter};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f15mX = 0;
        this.f16mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        this.f15mX = i;
        this.f16mY = i2;
        this.mWidth = i3;
        this.mHeight = i4;
        addAnchors();
    }

    public ConstraintWidget(String str, int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4);
        setDebugName(str);
    }

    public ConstraintWidget(int i, int i2) {
        this(0, 0, i, i2);
    }

    public void ensureWidgetRuns() {
        if (this.horizontalRun == null) {
            this.horizontalRun = new HorizontalWidgetRun(this);
        }
        if (this.verticalRun == null) {
            this.verticalRun = new VerticalWidgetRun(this);
        }
    }

    public ConstraintWidget(String str, int i, int i2) {
        this(i, i2);
        setDebugName(str);
    }

    public void resetSolverVariables(Cache cache) {
        this.mLeft.resetSolverVariable(cache);
        this.mTop.resetSolverVariable(cache);
        this.mRight.resetSolverVariable(cache);
        this.mBottom.resetSolverVariable(cache);
        this.mBaseline.resetSolverVariable(cache);
        this.mCenter.resetSolverVariable(cache);
        this.mCenterX.resetSolverVariable(cache);
        this.mCenterY.resetSolverVariable(cache);
    }

    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    public void setParent(ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    public void setWidthWrapContent(boolean z) {
        this.mIsWidthWrapContent = z;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public void setHeightWrapContent(boolean z) {
        this.mIsHeightWrapContent = z;
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public void connectCircularConstraint(ConstraintWidget constraintWidget, float f, int i) {
        immediateConnect(ConstraintAnchor.Type.CENTER, constraintWidget, ConstraintAnchor.Type.CENTER, i, 0);
        this.mCircleConstraintAngle = f;
    }

    public String getType() {
        return this.mType;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setVisibility(int i) {
        this.mVisibility = i;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public String getDebugName() {
        return this.mDebugName;
    }

    public void setDebugName(String str) {
        this.mDebugName = str;
    }

    public void setDebugSolverName(LinearSystem linearSystem, String str) {
        this.mDebugName = str;
        SolverVariable createObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        createObjectVariable.setName(str + ".left");
        createObjectVariable2.setName(str + ".top");
        createObjectVariable3.setName(str + ".right");
        createObjectVariable4.setName(str + ".bottom");
        SolverVariable createObjectVariable5 = linearSystem.createObjectVariable(this.mBaseline);
        createObjectVariable5.setName(str + ".baseline");
    }

    public void createObjectVariables(LinearSystem linearSystem) {
        linearSystem.createObjectVariable(this.mLeft);
        linearSystem.createObjectVariable(this.mTop);
        linearSystem.createObjectVariable(this.mRight);
        linearSystem.createObjectVariable(this.mBottom);
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.mType != null) {
            str = "type: " + this.mType + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.mDebugName != null) {
            str2 = "id: " + this.mDebugName + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f15mX);
        sb.append(", ");
        sb.append(this.f16mY);
        sb.append(") - (");
        sb.append(this.mWidth);
        sb.append(" x ");
        sb.append(this.mHeight);
        sb.append(")");
        return sb.toString();
    }

    public int getX() {
        ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) {
            return this.f15mX;
        }
        return ((ConstraintWidgetContainer) constraintWidget).mPaddingLeft + this.f15mX;
    }

    public int getY() {
        ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) {
            return this.f16mY;
        }
        return ((ConstraintWidgetContainer) constraintWidget).mPaddingTop + this.f16mY;
    }

    public int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }

    public int getOptimizerWrapWidth() {
        int i;
        int i2 = this.mWidth;
        if (this.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i2;
        }
        if (this.mMatchConstraintDefaultWidth == 1) {
            i = Math.max(this.mMatchConstraintMinWidth, i2);
        } else {
            i = this.mMatchConstraintMinWidth;
            if (i > 0) {
                this.mWidth = i;
            } else {
                i = 0;
            }
        }
        int i3 = this.mMatchConstraintMaxWidth;
        return (i3 <= 0 || i3 >= i) ? i : i3;
    }

    public int getOptimizerWrapHeight() {
        int i;
        int i2 = this.mHeight;
        if (this.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i2;
        }
        if (this.mMatchConstraintDefaultHeight == 1) {
            i = Math.max(this.mMatchConstraintMinHeight, i2);
        } else {
            i = this.mMatchConstraintMinHeight;
            if (i > 0) {
                this.mHeight = i;
            } else {
                i = 0;
            }
        }
        int i3 = this.mMatchConstraintMaxHeight;
        return (i3 <= 0 || i3 >= i) ? i : i3;
    }

    public int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }

    public int getLength(int i) {
        if (i == 0) {
            return getWidth();
        }
        if (i == 1) {
            return getHeight();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public int getRootX() {
        return this.f15mX + this.mOffsetX;
    }

    /* access modifiers changed from: protected */
    public int getRootY() {
        return this.f16mY + this.mOffsetY;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getLeft() {
        return getX();
    }

    public int getTop() {
        return getY();
    }

    public int getRight() {
        return getX() + this.mWidth;
    }

    public int getBottom() {
        return getY() + this.mHeight;
    }

    public int getHorizontalMargin() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        int i = 0;
        if (constraintAnchor != null) {
            i = 0 + constraintAnchor.mMargin;
        }
        ConstraintAnchor constraintAnchor2 = this.mRight;
        return constraintAnchor2 != null ? i + constraintAnchor2.mMargin : i;
    }

    public int getVerticalMargin() {
        int i = 0;
        if (this.mLeft != null) {
            i = 0 + this.mTop.mMargin;
        }
        return this.mRight != null ? i + this.mBottom.mMargin : i;
    }

    public float getHorizontalBiasPercent() {
        return this.mHorizontalBiasPercent;
    }

    public float getVerticalBiasPercent() {
        return this.mVerticalBiasPercent;
    }

    public float getBiasPercent(int i) {
        if (i == 0) {
            return this.mHorizontalBiasPercent;
        }
        if (i == 1) {
            return this.mVerticalBiasPercent;
        }
        return -1.0f;
    }

    public boolean hasBaseline() {
        return this.hasBaseline;
    }

    public int getBaselineDistance() {
        return this.mBaselineDistance;
    }

    public Object getCompanionWidget() {
        return this.mCompanionWidget;
    }

    public ArrayList<ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public void setX(int i) {
        this.f15mX = i;
    }

    public void setY(int i) {
        this.f16mY = i;
    }

    public void setOrigin(int i, int i2) {
        this.f15mX = i;
        this.f16mY = i2;
    }

    public void setOffset(int i, int i2) {
        this.mOffsetX = i;
        this.mOffsetY = i2;
    }

    public void setGoneMargin(ConstraintAnchor.Type type, int i) {
        int i2 = C01601.f17x6930e354[type.ordinal()];
        if (i2 == 1) {
            this.mLeft.mGoneMargin = i;
        } else if (i2 == 2) {
            this.mTop.mGoneMargin = i;
        } else if (i2 == 3) {
            this.mRight.mGoneMargin = i;
        } else if (i2 == 4) {
            this.mBottom.mGoneMargin = i;
        } else if (i2 == 5) {
            this.mBaseline.mGoneMargin = i;
        }
    }

    public void setWidth(int i) {
        this.mWidth = i;
        int i2 = this.mWidth;
        int i3 = this.mMinWidth;
        if (i2 < i3) {
            this.mWidth = i3;
        }
    }

    public void setHeight(int i) {
        this.mHeight = i;
        int i2 = this.mHeight;
        int i3 = this.mMinHeight;
        if (i2 < i3) {
            this.mHeight = i3;
        }
    }

    public void setLength(int i, int i2) {
        if (i2 == 0) {
            setWidth(i);
        } else if (i2 == 1) {
            setHeight(i);
        }
    }

    public void setHorizontalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultWidth = i;
        this.mMatchConstraintMinWidth = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxWidth = i3;
        this.mMatchConstraintPercentWidth = f;
        if (f > 0.0f && f < 1.0f && this.mMatchConstraintDefaultWidth == 0) {
            this.mMatchConstraintDefaultWidth = 2;
        }
    }

    public void setVerticalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultHeight = i;
        this.mMatchConstraintMinHeight = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxHeight = i3;
        this.mMatchConstraintPercentHeight = f;
        if (f > 0.0f && f < 1.0f && this.mMatchConstraintDefaultHeight == 0) {
            this.mMatchConstraintDefaultHeight = 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDimensionRatio(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = 0
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = 1
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = 0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.mDimensionRatio = r9
            r8.mDimensionRatioSide = r1
        L_0x008d:
            return
        L_0x008e:
            r8.mDimensionRatio = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.setDimensionRatio(java.lang.String):void");
    }

    public void setDimensionRatio(float f, int i) {
        this.mDimensionRatio = f;
        this.mDimensionRatioSide = i;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public void setHorizontalBiasPercent(float f) {
        this.mHorizontalBiasPercent = f;
    }

    public void setVerticalBiasPercent(float f) {
        this.mVerticalBiasPercent = f;
    }

    public void setMinWidth(int i) {
        if (i < 0) {
            this.mMinWidth = 0;
        } else {
            this.mMinWidth = i;
        }
    }

    public void setMinHeight(int i) {
        if (i < 0) {
            this.mMinHeight = 0;
        } else {
            this.mMinHeight = i;
        }
    }

    public void setDimension(int i, int i2) {
        this.mWidth = i;
        int i3 = this.mWidth;
        int i4 = this.mMinWidth;
        if (i3 < i4) {
            this.mWidth = i4;
        }
        this.mHeight = i2;
        int i5 = this.mHeight;
        int i6 = this.mMinHeight;
        if (i5 < i6) {
            this.mHeight = i6;
        }
    }

    public void setFrame(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f15mX = i;
        this.f16mY = i2;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (this.mListDimensionBehaviors[0] != DimensionBehaviour.FIXED || i7 >= (i5 = this.mWidth)) {
            i5 = i7;
        }
        if (this.mListDimensionBehaviors[1] != DimensionBehaviour.FIXED || i8 >= (i6 = this.mHeight)) {
            i6 = i8;
        }
        this.mWidth = i5;
        this.mHeight = i6;
        int i9 = this.mHeight;
        int i10 = this.mMinHeight;
        if (i9 < i10) {
            this.mHeight = i10;
        }
        int i11 = this.mWidth;
        int i12 = this.mMinWidth;
        if (i11 < i12) {
            this.mWidth = i12;
        }
        if (this.mMatchConstraintMaxWidth > 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.mWidth = Math.min(this.mWidth, this.mMatchConstraintMaxWidth);
        }
        if (this.mMatchConstraintMaxHeight > 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.mHeight = Math.min(this.mHeight, this.mMatchConstraintMaxHeight);
        }
        int i13 = this.mWidth;
        if (i5 != i13) {
            this.mWidthOverride = i13;
        }
        int i14 = this.mHeight;
        if (i6 != i14) {
            this.mHeightOverride = i14;
        }
    }

    public void setFrame(int i, int i2, int i3) {
        if (i3 == 0) {
            setHorizontalDimension(i, i2);
        } else if (i3 == 1) {
            setVerticalDimension(i, i2);
        }
    }

    public void setHorizontalDimension(int i, int i2) {
        this.f15mX = i;
        this.mWidth = i2 - i;
        int i3 = this.mWidth;
        int i4 = this.mMinWidth;
        if (i3 < i4) {
            this.mWidth = i4;
        }
    }

    public void setVerticalDimension(int i, int i2) {
        this.f16mY = i;
        this.mHeight = i2 - i;
        int i3 = this.mHeight;
        int i4 = this.mMinHeight;
        if (i3 < i4) {
            this.mHeight = i4;
        }
    }

    /* access modifiers changed from: package-private */
    public int getRelativePositioning(int i) {
        if (i == 0) {
            return this.mRelX;
        }
        if (i == 1) {
            return this.mRelY;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void setRelativePositioning(int i, int i2) {
        if (i2 == 0) {
            this.mRelX = i;
        } else if (i2 == 1) {
            this.mRelY = i;
        }
    }

    public void setBaselineDistance(int i) {
        this.mBaselineDistance = i;
        this.hasBaseline = i > 0;
    }

    public void setCompanionWidget(Object obj) {
        this.mCompanionWidget = obj;
    }

    public void setContainerItemSkip(int i) {
        if (i >= 0) {
            this.mContainerItemSkip = i;
        } else {
            this.mContainerItemSkip = 0;
        }
    }

    public int getContainerItemSkip() {
        return this.mContainerItemSkip;
    }

    public void setHorizontalWeight(float f) {
        this.mWeight[0] = f;
    }

    public void setVerticalWeight(float f) {
        this.mWeight[1] = f;
    }

    public void setHorizontalChainStyle(int i) {
        this.mHorizontalChainStyle = i;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public void setVerticalChainStyle(int i) {
        this.mVerticalChainStyle = i;
    }

    public int getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public boolean allowedInBarrier() {
        return this.mVisibility != 8;
    }

    public void immediateConnect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        getAnchor(type).connect(constraintWidget.getAnchor(type2), i, i2, true);
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.getOwner() == this) {
            connect(constraintAnchor.getType(), constraintAnchor2.getOwner(), constraintAnchor2.getType(), i);
        }
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        connect(type, constraintWidget, type2, 0);
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        boolean z;
        if (type == ConstraintAnchor.Type.CENTER) {
            if (type2 == ConstraintAnchor.Type.CENTER) {
                ConstraintAnchor anchor = getAnchor(ConstraintAnchor.Type.LEFT);
                ConstraintAnchor anchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
                ConstraintAnchor anchor3 = getAnchor(ConstraintAnchor.Type.TOP);
                ConstraintAnchor anchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
                boolean z2 = true;
                if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                    connect(ConstraintAnchor.Type.LEFT, constraintWidget, ConstraintAnchor.Type.LEFT, 0);
                    connect(ConstraintAnchor.Type.RIGHT, constraintWidget, ConstraintAnchor.Type.RIGHT, 0);
                    z = true;
                } else {
                    z = false;
                }
                if ((anchor3 == null || !anchor3.isConnected()) && (anchor4 == null || !anchor4.isConnected())) {
                    connect(ConstraintAnchor.Type.TOP, constraintWidget, ConstraintAnchor.Type.TOP, 0);
                    connect(ConstraintAnchor.Type.BOTTOM, constraintWidget, ConstraintAnchor.Type.BOTTOM, 0);
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.CENTER), 0);
                } else if (z) {
                    getAnchor(ConstraintAnchor.Type.CENTER_X).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.CENTER_X), 0);
                } else if (z2) {
                    getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.CENTER_Y), 0);
                }
            } else if (type2 == ConstraintAnchor.Type.LEFT || type2 == ConstraintAnchor.Type.RIGHT) {
                connect(ConstraintAnchor.Type.LEFT, constraintWidget, type2, 0);
                connect(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(type2), 0);
            } else if (type2 == ConstraintAnchor.Type.TOP || type2 == ConstraintAnchor.Type.BOTTOM) {
                connect(ConstraintAnchor.Type.TOP, constraintWidget, type2, 0);
                connect(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(type2), 0);
            }
        } else if (type == ConstraintAnchor.Type.CENTER_X && (type2 == ConstraintAnchor.Type.LEFT || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor anchor5 = getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor anchor6 = constraintWidget.getAnchor(type2);
            ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.RIGHT);
            anchor5.connect(anchor6, 0);
            anchor7.connect(anchor6, 0);
            getAnchor(ConstraintAnchor.Type.CENTER_X).connect(anchor6, 0);
        } else if (type == ConstraintAnchor.Type.CENTER_Y && (type2 == ConstraintAnchor.Type.TOP || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor anchor8 = constraintWidget.getAnchor(type2);
            getAnchor(ConstraintAnchor.Type.TOP).connect(anchor8, 0);
            getAnchor(ConstraintAnchor.Type.BOTTOM).connect(anchor8, 0);
            getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(anchor8, 0);
        } else if (type == ConstraintAnchor.Type.CENTER_X && type2 == ConstraintAnchor.Type.CENTER_X) {
            getAnchor(ConstraintAnchor.Type.LEFT).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT), 0);
            getAnchor(ConstraintAnchor.Type.RIGHT).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT), 0);
            getAnchor(ConstraintAnchor.Type.CENTER_X).connect(constraintWidget.getAnchor(type2), 0);
        } else if (type == ConstraintAnchor.Type.CENTER_Y && type2 == ConstraintAnchor.Type.CENTER_Y) {
            getAnchor(ConstraintAnchor.Type.TOP).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.TOP), 0);
            getAnchor(ConstraintAnchor.Type.BOTTOM).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM), 0);
            getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(constraintWidget.getAnchor(type2), 0);
        } else {
            ConstraintAnchor anchor9 = getAnchor(type);
            ConstraintAnchor anchor10 = constraintWidget.getAnchor(type2);
            if (anchor9.isValidConnection(anchor10)) {
                if (type == ConstraintAnchor.Type.BASELINE) {
                    ConstraintAnchor anchor11 = getAnchor(ConstraintAnchor.Type.TOP);
                    ConstraintAnchor anchor12 = getAnchor(ConstraintAnchor.Type.BOTTOM);
                    if (anchor11 != null) {
                        anchor11.reset();
                    }
                    if (anchor12 != null) {
                        anchor12.reset();
                    }
                } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                    ConstraintAnchor anchor13 = getAnchor(ConstraintAnchor.Type.BASELINE);
                    if (anchor13 != null) {
                        anchor13.reset();
                    }
                    ConstraintAnchor anchor14 = getAnchor(ConstraintAnchor.Type.CENTER);
                    if (anchor14.getTarget() != anchor10) {
                        anchor14.reset();
                    }
                    ConstraintAnchor opposite = getAnchor(type).getOpposite();
                    ConstraintAnchor anchor15 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
                    if (anchor15.isConnected()) {
                        opposite.reset();
                        anchor15.reset();
                    }
                } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                    ConstraintAnchor anchor16 = getAnchor(ConstraintAnchor.Type.CENTER);
                    if (anchor16.getTarget() != anchor10) {
                        anchor16.reset();
                    }
                    ConstraintAnchor opposite2 = getAnchor(type).getOpposite();
                    ConstraintAnchor anchor17 = getAnchor(ConstraintAnchor.Type.CENTER_X);
                    if (anchor17.isConnected()) {
                        opposite2.reset();
                        anchor17.reset();
                    }
                }
                anchor9.connect(anchor10, i);
            }
        }
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
    }

    public void resetAnchor(ConstraintAnchor constraintAnchor) {
        if (getParent() == null || !(getParent() instanceof ConstraintWidgetContainer) || !((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            ConstraintAnchor anchor = getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor anchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
            ConstraintAnchor anchor3 = getAnchor(ConstraintAnchor.Type.TOP);
            ConstraintAnchor anchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
            ConstraintAnchor anchor5 = getAnchor(ConstraintAnchor.Type.CENTER);
            ConstraintAnchor anchor6 = getAnchor(ConstraintAnchor.Type.CENTER_X);
            ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
            if (constraintAnchor == anchor5) {
                if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                    anchor.reset();
                    anchor2.reset();
                }
                if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                    anchor3.reset();
                    anchor4.reset();
                }
                this.mHorizontalBiasPercent = 0.5f;
                this.mVerticalBiasPercent = 0.5f;
            } else if (constraintAnchor == anchor6) {
                if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                    anchor.reset();
                    anchor2.reset();
                }
                this.mHorizontalBiasPercent = 0.5f;
            } else if (constraintAnchor == anchor7) {
                if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                    anchor3.reset();
                    anchor4.reset();
                }
                this.mVerticalBiasPercent = 0.5f;
            } else if (constraintAnchor == anchor || constraintAnchor == anchor2) {
                if (anchor.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                    anchor5.reset();
                }
            } else if ((constraintAnchor == anchor3 || constraintAnchor == anchor4) && anchor3.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                anchor5.reset();
            }
            constraintAnchor.reset();
        }
    }

    public void resetAnchors() {
        ConstraintWidget parent = getParent();
        if (parent == null || !(parent instanceof ConstraintWidgetContainer) || !((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            int size = this.mAnchors.size();
            for (int i = 0; i < size; i++) {
                this.mAnchors.get(i).reset();
            }
        }
    }

    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
        switch (type) {
            case LEFT:
                return this.mLeft;
            case TOP:
                return this.mTop;
            case RIGHT:
                return this.mRight;
            case BOTTOM:
                return this.mBottom;
            case BASELINE:
                return this.mBaseline;
            case CENTER:
                return this.mCenter;
            case CENTER_X:
                return this.mCenterX;
            case CENTER_Y:
                return this.mCenterY;
            case NONE:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public DimensionBehaviour getDimensionBehaviour(int i) {
        if (i == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[0] = dimensionBehaviour;
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[1] = dimensionBehaviour;
    }

    public boolean isInHorizontalChain() {
        if (this.mLeft.mTarget == null || this.mLeft.mTarget.mTarget != this.mLeft) {
            return this.mRight.mTarget != null && this.mRight.mTarget.mTarget == this.mRight;
        }
        return true;
    }

    public ConstraintWidget getPreviousChainMember(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i == 0) {
            if (this.mLeft.mTarget == null || this.mLeft.mTarget.mTarget != (constraintAnchor2 = this.mLeft)) {
                return null;
            }
            return constraintAnchor2.mTarget.mOwner;
        } else if (i == 1 && this.mTop.mTarget != null && this.mTop.mTarget.mTarget == (constraintAnchor = this.mTop)) {
            return constraintAnchor.mTarget.mOwner;
        } else {
            return null;
        }
    }

    public ConstraintWidget getNextChainMember(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i == 0) {
            if (this.mRight.mTarget == null || this.mRight.mTarget.mTarget != (constraintAnchor2 = this.mRight)) {
                return null;
            }
            return constraintAnchor2.mTarget.mOwner;
        } else if (i == 1 && this.mBottom.mTarget != null && this.mBottom.mTarget.mTarget == (constraintAnchor = this.mBottom)) {
            return constraintAnchor.mTarget.mOwner;
        } else {
            return null;
        }
    }

    public ConstraintWidget getHorizontalChainControlWidget() {
        ConstraintAnchor constraintAnchor;
        ConstraintWidget constraintWidget;
        ConstraintAnchor constraintAnchor2;
        if (!isInHorizontalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget2 = this;
        ConstraintWidget constraintWidget3 = null;
        while (constraintWidget3 == null && constraintWidget2 != null) {
            ConstraintAnchor anchor = constraintWidget2.getAnchor(ConstraintAnchor.Type.LEFT);
            if (anchor == null) {
                constraintAnchor = null;
            } else {
                constraintAnchor = anchor.getTarget();
            }
            if (constraintAnchor == null) {
                constraintWidget = null;
            } else {
                constraintWidget = constraintAnchor.getOwner();
            }
            if (constraintWidget == getParent()) {
                return constraintWidget2;
            }
            if (constraintWidget == null) {
                constraintAnchor2 = null;
            } else {
                constraintAnchor2 = constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).getTarget();
            }
            if (constraintAnchor2 == null || constraintAnchor2.getOwner() == constraintWidget2) {
                constraintWidget2 = constraintWidget;
            } else {
                constraintWidget3 = constraintWidget2;
            }
        }
        return constraintWidget3;
    }

    public boolean isInVerticalChain() {
        if (this.mTop.mTarget == null || this.mTop.mTarget.mTarget != this.mTop) {
            return this.mBottom.mTarget != null && this.mBottom.mTarget.mTarget == this.mBottom;
        }
        return true;
    }

    public ConstraintWidget getVerticalChainControlWidget() {
        ConstraintAnchor constraintAnchor;
        ConstraintWidget constraintWidget;
        ConstraintAnchor constraintAnchor2;
        if (!isInVerticalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget2 = this;
        ConstraintWidget constraintWidget3 = null;
        while (constraintWidget3 == null && constraintWidget2 != null) {
            ConstraintAnchor anchor = constraintWidget2.getAnchor(ConstraintAnchor.Type.TOP);
            if (anchor == null) {
                constraintAnchor = null;
            } else {
                constraintAnchor = anchor.getTarget();
            }
            if (constraintAnchor == null) {
                constraintWidget = null;
            } else {
                constraintWidget = constraintAnchor.getOwner();
            }
            if (constraintWidget == getParent()) {
                return constraintWidget2;
            }
            if (constraintWidget == null) {
                constraintAnchor2 = null;
            } else {
                constraintAnchor2 = constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM).getTarget();
            }
            if (constraintAnchor2 == null || constraintAnchor2.getOwner() == constraintWidget2) {
                constraintWidget2 = constraintWidget;
            } else {
                constraintWidget3 = constraintWidget2;
            }
        }
        return constraintWidget3;
    }

    private boolean isChainHead(int i) {
        int i2 = i * 2;
        if (this.mListAnchors[i2].mTarget != null) {
            ConstraintAnchor constraintAnchor = this.mListAnchors[i2].mTarget.mTarget;
            ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
            if (constraintAnchor != constraintAnchorArr[i2]) {
                int i3 = i2 + 1;
                return constraintAnchorArr[i3].mTarget != null && this.mListAnchors[i3].mTarget.mTarget == this.mListAnchors[i3];
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:205:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0566  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0569  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x05a9  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x05af  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x05da  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x05e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addToSolver(androidx.constraintlayout.core.LinearSystem r51, boolean r52) {
        /*
            r50 = this;
            r15 = r50
            r14 = r51
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mLeft
            androidx.constraintlayout.core.SolverVariable r13 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mRight
            androidx.constraintlayout.core.SolverVariable r12 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mTop
            androidx.constraintlayout.core.SolverVariable r11 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBottom
            androidx.constraintlayout.core.SolverVariable r10 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBaseline
            androidx.constraintlayout.core.SolverVariable r9 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            r8 = 2
            r1 = 3
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0056
            if (r0 == 0) goto L_0x0036
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r0.mListDimensionBehaviors
            r0 = r0[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r2) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.mParent
            if (r2 == 0) goto L_0x0045
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r2.mListDimensionBehaviors
            r2 = r2[r7]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r3) goto L_0x0045
            r2 = 1
            goto L_0x0046
        L_0x0045:
            r2 = 0
        L_0x0046:
            int r3 = r15.mWrapBehaviorInParent
            if (r3 == r7) goto L_0x0053
            if (r3 == r8) goto L_0x0051
            if (r3 == r1) goto L_0x0056
            r5 = r0
            r4 = r2
            goto L_0x0058
        L_0x0051:
            r4 = r2
            goto L_0x0057
        L_0x0053:
            r5 = r0
            r4 = 0
            goto L_0x0058
        L_0x0056:
            r4 = 0
        L_0x0057:
            r5 = 0
        L_0x0058:
            int r0 = r15.mVisibility
            r3 = 8
            if (r0 != r3) goto L_0x006f
            boolean r0 = r50.hasDependencies()
            if (r0 != 0) goto L_0x006f
            boolean[] r0 = r15.mIsInBarrier
            boolean r2 = r0[r6]
            if (r2 != 0) goto L_0x006f
            boolean r0 = r0[r7]
            if (r0 != 0) goto L_0x006f
            return
        L_0x006f:
            boolean r0 = r15.resolvedHorizontal
            r2 = 5
            if (r0 != 0) goto L_0x0078
            boolean r0 = r15.resolvedVertical
            if (r0 == 0) goto L_0x00f7
        L_0x0078:
            boolean r0 = r15.resolvedHorizontal
            if (r0 == 0) goto L_0x00a9
            int r0 = r15.f15mX
            r14.addEquality(r13, r0)
            int r0 = r15.f15mX
            int r8 = r15.mWidth
            int r0 = r0 + r8
            r14.addEquality(r12, r0)
            if (r5 == 0) goto L_0x00a9
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x00a9
            boolean r8 = r15.OPTIMIZE_WRAP_ON_RESOLVED
            if (r8 == 0) goto L_0x00a0
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.mLeft
            r0.addVerticalWrapMinVariable(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.mRight
            r0.addHorizontalWrapMaxVariable(r8)
            goto L_0x00a9
        L_0x00a0:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r14.addGreaterThan(r0, r12, r6, r2)
        L_0x00a9:
            boolean r0 = r15.resolvedVertical
            if (r0 == 0) goto L_0x00ea
            int r0 = r15.f16mY
            r14.addEquality(r11, r0)
            int r0 = r15.f16mY
            int r8 = r15.mHeight
            int r0 = r0 + r8
            r14.addEquality(r10, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBaseline
            boolean r0 = r0.hasDependents()
            if (r0 == 0) goto L_0x00ca
            int r0 = r15.f16mY
            int r8 = r15.mBaselineDistance
            int r0 = r0 + r8
            r14.addEquality(r9, r0)
        L_0x00ca:
            if (r4 == 0) goto L_0x00ea
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x00ea
            boolean r8 = r15.OPTIMIZE_WRAP_ON_RESOLVED
            if (r8 == 0) goto L_0x00e1
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.mTop
            r0.addVerticalWrapMinVariable(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.mBottom
            r0.addVerticalWrapMaxVariable(r8)
            goto L_0x00ea
        L_0x00e1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r14.addGreaterThan(r0, r10, r6, r2)
        L_0x00ea:
            boolean r0 = r15.resolvedHorizontal
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r15.resolvedVertical
            if (r0 == 0) goto L_0x00f7
            r15.resolvedHorizontal = r6
            r15.resolvedVertical = r6
            return
        L_0x00f7:
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            r17 = 1
            if (r0 == 0) goto L_0x0105
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            long r1 = r0.widgets
            long r1 = r1 + r17
            r0.widgets = r1
        L_0x0105:
            if (r52 == 0) goto L_0x01a1
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            if (r0 == 0) goto L_0x01a1
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r15.verticalRun
            if (r1 == 0) goto L_0x01a1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            boolean r0 = r0.resolved
            if (r0 == 0) goto L_0x01a1
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            boolean r0 = r0.resolved
            if (r0 == 0) goto L_0x01a1
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            boolean r0 = r0.resolved
            if (r0 == 0) goto L_0x01a1
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            boolean r0 = r0.resolved
            if (r0 == 0) goto L_0x01a1
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r0 == 0) goto L_0x0139
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            long r1 = r0.graphSolved
            long r1 = r1 + r17
            r0.graphSolved = r1
        L_0x0139:
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            int r0 = r0.value
            r14.addEquality(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r14.addEquality(r12, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            int r0 = r0.value
            r14.addEquality(r11, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r14.addEquality(r10, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.baseline
            int r0 = r0.value
            r14.addEquality(r9, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x019c
            if (r5 == 0) goto L_0x0183
            boolean[] r0 = r15.isTerminalWidget
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x0183
            boolean r0 = r50.isInHorizontalChain()
            if (r0 != 0) goto L_0x0183
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r14.addGreaterThan(r0, r12, r6, r3)
        L_0x0183:
            if (r4 == 0) goto L_0x019c
            boolean[] r0 = r15.isTerminalWidget
            boolean r0 = r0[r7]
            if (r0 == 0) goto L_0x019c
            boolean r0 = r50.isInVerticalChain()
            if (r0 != 0) goto L_0x019c
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r14.addGreaterThan(r0, r10, r6, r3)
        L_0x019c:
            r15.resolvedHorizontal = r6
            r15.resolvedVertical = r6
            return
        L_0x01a1:
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r0 == 0) goto L_0x01ad
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            long r1 = r0.linearSolved
            long r1 = r1 + r17
            r0.linearSolved = r1
        L_0x01ad:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x021e
            boolean r0 = r15.isChainHead(r6)
            if (r0 == 0) goto L_0x01c0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            r0.addChain(r15, r6)
            r0 = 1
            goto L_0x01c4
        L_0x01c0:
            boolean r0 = r50.isInHorizontalChain()
        L_0x01c4:
            boolean r1 = r15.isChainHead(r7)
            if (r1 == 0) goto L_0x01d3
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r1
            r1.addChain(r15, r7)
            r1 = 1
            goto L_0x01d7
        L_0x01d3:
            boolean r1 = r50.isInVerticalChain()
        L_0x01d7:
            if (r0 != 0) goto L_0x01f6
            if (r5 == 0) goto L_0x01f6
            int r2 = r15.mVisibility
            if (r2 == r3) goto L_0x01f6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L_0x01f6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L_0x01f6
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mRight
            androidx.constraintlayout.core.SolverVariable r2 = r14.createObjectVariable(r2)
            r14.addGreaterThan(r2, r12, r6, r7)
        L_0x01f6:
            if (r1 != 0) goto L_0x0219
            if (r4 == 0) goto L_0x0219
            int r2 = r15.mVisibility
            if (r2 == r3) goto L_0x0219
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L_0x0219
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L_0x0219
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mBaseline
            if (r2 != 0) goto L_0x0219
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mBottom
            androidx.constraintlayout.core.SolverVariable r2 = r14.createObjectVariable(r2)
            r14.addGreaterThan(r2, r10, r6, r7)
        L_0x0219:
            r28 = r0
            r29 = r1
            goto L_0x0222
        L_0x021e:
            r28 = 0
            r29 = 0
        L_0x0222:
            int r0 = r15.mWidth
            int r1 = r15.mMinWidth
            if (r0 >= r1) goto L_0x0229
            r0 = r1
        L_0x0229:
            int r1 = r15.mHeight
            int r2 = r15.mMinHeight
            if (r1 >= r2) goto L_0x0230
            r1 = r2
        L_0x0230:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r15.mListDimensionBehaviors
            r2 = r2[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 == r8) goto L_0x023a
            r2 = 1
            goto L_0x023b
        L_0x023a:
            r2 = 0
        L_0x023b:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r15.mListDimensionBehaviors
            r8 = r8[r7]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 == r7) goto L_0x0245
            r7 = 1
            goto L_0x0246
        L_0x0245:
            r7 = 0
        L_0x0246:
            int r8 = r15.mDimensionRatioSide
            r15.mResolvedDimensionRatioSide = r8
            float r8 = r15.mDimensionRatio
            r15.mResolvedDimensionRatio = r8
            int r6 = r15.mMatchConstraintDefaultWidth
            int r3 = r15.mMatchConstraintDefaultHeight
            r22 = 0
            r23 = 4
            r24 = r0
            int r8 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r8 <= 0) goto L_0x02f9
            int r8 = r15.mVisibility
            r0 = 8
            if (r8 == r0) goto L_0x02f9
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r8 = 0
            r0 = r0[r8]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r8) goto L_0x026e
            if (r6 != 0) goto L_0x026e
            r6 = 3
        L_0x026e:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r8 = 1
            r0 = r0[r8]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r8) goto L_0x027a
            if (r3 != 0) goto L_0x027a
            r3 = 3
        L_0x027a:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r8 = 0
            r0 = r0[r8]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r8) goto L_0x0295
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r8 = 1
            r0 = r0[r8]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r8) goto L_0x0295
            r0 = 3
            if (r6 != r0) goto L_0x0296
            if (r3 != r0) goto L_0x0296
            r15.setupDimensionRatio(r5, r4, r2, r7)
            goto L_0x02f1
        L_0x0295:
            r0 = 3
        L_0x0296:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r15.mListDimensionBehaviors
            r7 = 0
            r2 = r2[r7]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r8) goto L_0x02be
            if (r6 != r0) goto L_0x02be
            r15.mResolvedDimensionRatioSide = r7
            float r0 = r15.mResolvedDimensionRatio
            int r2 = r15.mHeight
            float r2 = (float) r2
            float r0 = r0 * r2
            int r0 = (int) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r15.mListDimensionBehaviors
            r7 = 1
            r2 = r2[r7]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r24 = r0
            r32 = r1
            r31 = r3
            if (r2 == r8) goto L_0x02f5
            r8 = 0
            r30 = 4
            goto L_0x0300
        L_0x02be:
            r7 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r0 = r0[r7]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r2) goto L_0x02f1
            r0 = 3
            if (r3 != r0) goto L_0x02f1
            r15.mResolvedDimensionRatioSide = r7
            int r0 = r15.mDimensionRatioSide
            r1 = -1
            if (r0 != r1) goto L_0x02d8
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r15.mResolvedDimensionRatio
            float r0 = r0 / r1
            r15.mResolvedDimensionRatio = r0
        L_0x02d8:
            float r0 = r15.mResolvedDimensionRatio
            int r1 = r15.mWidth
            float r1 = (float) r1
            float r0 = r0 * r1
            int r1 = (int) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r2 = 0
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 == r2) goto L_0x02f1
            r32 = r1
            r30 = r6
            r8 = 0
            r31 = 4
            goto L_0x0300
        L_0x02f1:
            r32 = r1
            r31 = r3
        L_0x02f5:
            r30 = r6
            r8 = 1
            goto L_0x0300
        L_0x02f9:
            r32 = r1
            r31 = r3
            r30 = r6
            r8 = 0
        L_0x0300:
            int[] r0 = r15.mResolvedMatchConstraintDefault
            r1 = 0
            r0[r1] = r30
            r1 = 1
            r0[r1] = r31
            r15.mResolvedHasRatio = r8
            if (r8 == 0) goto L_0x0316
            int r0 = r15.mResolvedDimensionRatioSide
            r1 = -1
            if (r0 == 0) goto L_0x0313
            if (r0 != r1) goto L_0x0317
        L_0x0313:
            r17 = 1
            goto L_0x0319
        L_0x0316:
            r1 = -1
        L_0x0317:
            r17 = 0
        L_0x0319:
            if (r8 == 0) goto L_0x0325
            int r0 = r15.mResolvedDimensionRatioSide
            r2 = 1
            if (r0 == r2) goto L_0x0322
            if (r0 != r1) goto L_0x0325
        L_0x0322:
            r33 = 1
            goto L_0x0327
        L_0x0325:
            r33 = 0
        L_0x0327:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r1) goto L_0x0337
            boolean r0 = r15 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r0 == 0) goto L_0x0337
            r22 = 1
            goto L_0x0339
        L_0x0337:
            r22 = 0
        L_0x0339:
            if (r22 == 0) goto L_0x033e
            r23 = 0
            goto L_0x0340
        L_0x033e:
            r23 = r24
        L_0x0340:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mCenter
            boolean r0 = r0.isConnected()
            r1 = 1
            r34 = r0 ^ 1
            boolean[] r0 = r15.mIsInBarrier
            r2 = 0
            boolean r27 = r0[r2]
            boolean r35 = r0[r1]
            int r0 = r15.mHorizontalResolution
            r36 = 0
            r7 = 2
            if (r0 == r7) goto L_0x0445
            boolean r0 = r15.resolvedHorizontal
            if (r0 != 0) goto L_0x0445
            if (r52 == 0) goto L_0x03a6
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            if (r0 == 0) goto L_0x03a6
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            boolean r0 = r0.resolved
            if (r0 == 0) goto L_0x03a6
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            boolean r0 = r0.resolved
            if (r0 != 0) goto L_0x0370
            goto L_0x03a6
        L_0x0370:
            if (r52 == 0) goto L_0x0445
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            int r0 = r0.value
            r14.addEquality(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r14.addEquality(r12, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x0445
            if (r5 == 0) goto L_0x0445
            boolean[] r0 = r15.isTerminalWidget
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x0445
            boolean r0 = r50.isInHorizontalChain()
            if (r0 != 0) goto L_0x0445
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r3 = 8
            r14.addGreaterThan(r0, r12, r1, r3)
            goto L_0x0445
        L_0x03a6:
            r3 = 8
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x03b5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r16 = r0
            goto L_0x03b7
        L_0x03b5:
            r16 = r36
        L_0x03b7:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x03c3
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mLeft
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r6 = r0
            goto L_0x03c5
        L_0x03c3:
            r6 = r36
        L_0x03c5:
            boolean[] r0 = r15.isTerminalWidget
            r20 = 0
            boolean r21 = r0[r20]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r37 = r0[r20]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r15.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mRight
            r39 = r2
            int r2 = r15.f15mX
            r40 = r2
            int r2 = r15.mMinWidth
            int[] r3 = r15.mMaxDimension
            r42 = r3[r20]
            float r3 = r15.mHorizontalBiasPercent
            r18 = 1
            r0 = r0[r18]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r7) goto L_0x03ec
            r44 = 1
            goto L_0x03ee
        L_0x03ec:
            r44 = 0
        L_0x03ee:
            int r0 = r15.mMatchConstraintMinWidth
            r24 = r0
            int r0 = r15.mMatchConstraintMaxWidth
            r25 = r0
            float r0 = r15.mMatchConstraintPercentWidth
            r26 = r0
            r0 = r50
            r45 = r1
            r1 = r51
            r19 = r39
            r38 = r40
            r7 = 5
            r39 = r2
            r2 = 1
            r40 = r3
            r3 = r5
            r41 = r4
            r46 = r5
            r5 = r21
            r18 = 2
            r7 = r16
            r43 = r8
            r8 = r37
            r47 = r9
            r9 = r22
            r48 = r10
            r10 = r45
            r49 = r11
            r11 = r19
            r37 = r12
            r12 = r38
            r38 = r13
            r13 = r23
            r14 = r39
            r15 = r42
            r16 = r40
            r18 = r44
            r19 = r28
            r20 = r29
            r21 = r27
            r22 = r30
            r23 = r31
            r27 = r34
            r0.applyConstraints(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0455
        L_0x0445:
            r41 = r4
            r46 = r5
            r43 = r8
            r47 = r9
            r48 = r10
            r49 = r11
            r37 = r12
            r38 = r13
        L_0x0455:
            r15 = r50
            if (r52 == 0) goto L_0x04b4
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            if (r0 == 0) goto L_0x04b4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            boolean r0 = r0.resolved
            if (r0 == 0) goto L_0x04b4
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            boolean r0 = r0.resolved
            if (r0 == 0) goto L_0x04b4
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            int r0 = r0.value
            r14 = r51
            r13 = r49
            r14.addEquality(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r12 = r48
            r14.addEquality(r12, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.baseline
            int r0 = r0.value
            r1 = r47
            r14.addEquality(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x04ae
            if (r29 != 0) goto L_0x04ae
            if (r41 == 0) goto L_0x04ae
            boolean[] r2 = r15.isTerminalWidget
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x04aa
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r2 = 8
            r10 = 0
            r14.addGreaterThan(r0, r12, r10, r2)
            goto L_0x04b2
        L_0x04aa:
            r2 = 8
            r10 = 0
            goto L_0x04b2
        L_0x04ae:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x04b2:
            r6 = 0
            goto L_0x04c1
        L_0x04b4:
            r14 = r51
            r1 = r47
            r12 = r48
            r13 = r49
            r2 = 8
            r10 = 0
            r11 = 1
            r6 = 1
        L_0x04c1:
            int r0 = r15.mVerticalResolution
            r3 = 2
            if (r0 != r3) goto L_0x04c7
            r6 = 0
        L_0x04c7:
            if (r6 == 0) goto L_0x05a9
            boolean r0 = r15.resolvedVertical
            if (r0 != 0) goto L_0x05a9
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r0 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r3) goto L_0x04db
            boolean r0 = r15 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r0 == 0) goto L_0x04db
            r9 = 1
            goto L_0x04dc
        L_0x04db:
            r9 = 0
        L_0x04dc:
            if (r9 == 0) goto L_0x04e0
            r32 = 0
        L_0x04e0:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x04ec
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r7 = r0
            goto L_0x04ee
        L_0x04ec:
            r7 = r36
        L_0x04ee:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x04fa
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTop
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r6 = r0
            goto L_0x04fc
        L_0x04fa:
            r6 = r36
        L_0x04fc:
            int r0 = r15.mBaselineDistance
            if (r0 > 0) goto L_0x0504
            int r0 = r15.mVisibility
            if (r0 != r2) goto L_0x0546
        L_0x0504:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L_0x0531
            int r0 = r50.getBaselineDistance()
            r14.addEquality(r1, r13, r0, r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.mBaseline
            int r3 = r3.getMargin()
            r14.addEquality(r1, r0, r3, r2)
            if (r41 == 0) goto L_0x052e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r1 = 5
            r14.addGreaterThan(r7, r0, r10, r1)
        L_0x052e:
            r27 = 0
            goto L_0x0548
        L_0x0531:
            int r0 = r15.mVisibility
            if (r0 != r2) goto L_0x053f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBaseline
            int r0 = r0.getMargin()
            r14.addEquality(r1, r13, r0, r2)
            goto L_0x0546
        L_0x053f:
            int r0 = r50.getBaselineDistance()
            r14.addEquality(r1, r13, r0, r2)
        L_0x0546:
            r27 = r34
        L_0x0548:
            boolean[] r0 = r15.isTerminalWidget
            boolean r5 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r8 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r15.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.mBottom
            int r1 = r15.f16mY
            int r2 = r15.mMinHeight
            int[] r10 = r15.mMaxDimension
            r16 = r10[r11]
            float r10 = r15.mVerticalBiasPercent
            r17 = 0
            r0 = r0[r17]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r11) goto L_0x0569
            r18 = 1
            goto L_0x056b
        L_0x0569:
            r18 = 0
        L_0x056b:
            int r0 = r15.mMatchConstraintMinHeight
            r24 = r0
            int r0 = r15.mMatchConstraintMaxHeight
            r25 = r0
            float r0 = r15.mMatchConstraintPercentHeight
            r26 = r0
            r0 = r50
            r19 = r1
            r1 = r51
            r20 = r2
            r2 = 0
            r11 = r3
            r3 = r41
            r21 = r4
            r4 = r46
            r17 = r10
            r10 = r21
            r34 = r12
            r12 = r19
            r36 = r13
            r13 = r32
            r14 = r20
            r15 = r16
            r16 = r17
            r17 = r33
            r19 = r29
            r20 = r28
            r21 = r35
            r22 = r31
            r23 = r30
            r0.applyConstraints(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x05ad
        L_0x05a9:
            r34 = r12
            r36 = r13
        L_0x05ad:
            if (r43 == 0) goto L_0x05da
            r6 = 8
            r7 = r50
            int r0 = r7.mResolvedDimensionRatioSide
            r1 = 1
            if (r0 != r1) goto L_0x05c8
            float r5 = r7.mResolvedDimensionRatio
            r0 = r51
            r1 = r34
            r2 = r36
            r3 = r37
            r4 = r38
            r0.addRatio(r1, r2, r3, r4, r5, r6)
            goto L_0x05dc
        L_0x05c8:
            float r5 = r7.mResolvedDimensionRatio
            r6 = 8
            r0 = r51
            r1 = r37
            r2 = r38
            r3 = r34
            r4 = r36
            r0.addRatio(r1, r2, r3, r4, r5, r6)
            goto L_0x05dc
        L_0x05da:
            r7 = r50
        L_0x05dc:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.mCenter
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x0604
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.mCenter
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getOwner()
            float r1 = r7.mCircleConstraintAngle
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r7.mCenter
            int r2 = r2.getMargin()
            r3 = r51
            r3.addCenterPoint(r7, r0, r1, r2)
        L_0x0604:
            r0 = 0
            r7.resolvedHorizontal = r0
            r7.resolvedVertical = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.addToSolver(androidx.constraintlayout.core.LinearSystem, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public boolean addFirst() {
        return (this instanceof VirtualLayout) || (this instanceof Guideline);
    }

    public void setupDimensionRatio(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z3 && !z4) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (!z3 && z4) {
                this.mResolvedDimensionRatioSide = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                }
            }
        }
        if (this.mResolvedDimensionRatioSide == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.mResolvedDimensionRatioSide = 1;
        } else if (this.mResolvedDimensionRatioSide == 1 && (!this.mLeft.isConnected() || !this.mRight.isConnected())) {
            this.mResolvedDimensionRatioSide = 0;
        }
        if (this.mResolvedDimensionRatioSide == -1 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if (this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide != -1) {
            return;
        }
        if (this.mMatchConstraintMinWidth > 0 && this.mMatchConstraintMinHeight == 0) {
            this.mResolvedDimensionRatioSide = 0;
        } else if (this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMinHeight > 0) {
            this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
            this.mResolvedDimensionRatioSide = 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0452, code lost:
        if ((r3 instanceof androidx.constraintlayout.core.widgets.Barrier) != false) goto L_0x0457;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x043d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x050c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x053b  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x054a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:370:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:374:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void applyConstraints(androidx.constraintlayout.core.LinearSystem r35, boolean r36, boolean r37, boolean r38, boolean r39, androidx.constraintlayout.core.SolverVariable r40, androidx.constraintlayout.core.SolverVariable r41, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r42, boolean r43, androidx.constraintlayout.core.widgets.ConstraintAnchor r44, androidx.constraintlayout.core.widgets.ConstraintAnchor r45, int r46, int r47, int r48, int r49, float r50, boolean r51, boolean r52, boolean r53, boolean r54, boolean r55, int r56, int r57, int r58, int r59, float r60, boolean r61) {
        /*
            r34 = this;
            r0 = r34
            r10 = r35
            r11 = r40
            r12 = r41
            r13 = r44
            r14 = r45
            r15 = r48
            r1 = r49
            r2 = r57
            r3 = r58
            r4 = r59
            androidx.constraintlayout.core.SolverVariable r9 = r10.createObjectVariable(r13)
            androidx.constraintlayout.core.SolverVariable r8 = r10.createObjectVariable(r14)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r44.getTarget()
            androidx.constraintlayout.core.SolverVariable r7 = r10.createObjectVariable(r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r45.getTarget()
            androidx.constraintlayout.core.SolverVariable r6 = r10.createObjectVariable(r5)
            androidx.constraintlayout.core.Metrics r5 = androidx.constraintlayout.core.LinearSystem.getMetrics()
            if (r5 == 0) goto L_0x0040
            androidx.constraintlayout.core.Metrics r5 = androidx.constraintlayout.core.LinearSystem.getMetrics()
            long r11 = r5.nonresolvedWidgets
            r16 = 1
            long r11 = r11 + r16
            r5.nonresolvedWidgets = r11
        L_0x0040:
            boolean r11 = r44.isConnected()
            boolean r12 = r45.isConnected()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r0.mCenter
            boolean r16 = r5.isConnected()
            if (r11 == 0) goto L_0x0053
            r18 = 1
            goto L_0x0055
        L_0x0053:
            r18 = 0
        L_0x0055:
            if (r12 == 0) goto L_0x0059
            int r18 = r18 + 1
        L_0x0059:
            if (r16 == 0) goto L_0x005d
            int r18 = r18 + 1
        L_0x005d:
            r19 = r18
            if (r51 == 0) goto L_0x0064
            r20 = 3
            goto L_0x0066
        L_0x0064:
            r20 = r56
        L_0x0066:
            int[] r21 = androidx.constraintlayout.core.widgets.ConstraintWidget.C01601.f18x6d00e4a2
            int r22 = r42.ordinal()
            r5 = r21[r22]
            r2 = 2
            r14 = 1
            if (r5 == r14) goto L_0x007a
            if (r5 == r2) goto L_0x007a
            r14 = 3
            if (r5 == r14) goto L_0x007a
            r14 = 4
            if (r5 == r14) goto L_0x007f
        L_0x007a:
            r5 = r20
        L_0x007c:
            r20 = 0
            goto L_0x0085
        L_0x007f:
            r5 = r20
            if (r5 == r14) goto L_0x007c
            r20 = 1
        L_0x0085:
            int r14 = r0.mWidthOverride
            r2 = -1
            if (r14 == r2) goto L_0x0093
            if (r36 == 0) goto L_0x0093
            r0.mWidthOverride = r2
            r21 = r6
            r20 = 0
            goto L_0x0097
        L_0x0093:
            r14 = r47
            r21 = r6
        L_0x0097:
            int r6 = r0.mHeightOverride
            if (r6 == r2) goto L_0x00a2
            if (r36 != 0) goto L_0x00a2
            r0.mHeightOverride = r2
            r20 = 0
            goto L_0x00a3
        L_0x00a2:
            r6 = r14
        L_0x00a3:
            int r14 = r0.mVisibility
            r2 = 8
            if (r14 != r2) goto L_0x00ac
            r6 = 0
            r20 = 0
        L_0x00ac:
            if (r61 == 0) goto L_0x00c5
            if (r11 != 0) goto L_0x00ba
            if (r12 != 0) goto L_0x00ba
            if (r16 != 0) goto L_0x00ba
            r14 = r46
            r10.addEquality(r9, r14)
            goto L_0x00c5
        L_0x00ba:
            if (r11 == 0) goto L_0x00c5
            if (r12 != 0) goto L_0x00c5
            int r14 = r44.getMargin()
            r10.addEquality(r9, r7, r14, r2)
        L_0x00c5:
            if (r20 != 0) goto L_0x00f1
            if (r43 == 0) goto L_0x00de
            r2 = 0
            r14 = 3
            r10.addEquality(r8, r9, r2, r14)
            r6 = 8
            if (r15 <= 0) goto L_0x00d5
            r10.addGreaterThan(r8, r9, r15, r6)
        L_0x00d5:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r2) goto L_0x00e4
            r10.addLowerThan(r8, r9, r1, r6)
            goto L_0x00e4
        L_0x00de:
            r1 = 8
            r14 = 3
            r10.addEquality(r8, r9, r6, r1)
        L_0x00e4:
            r23 = r3
            r15 = r5
            r1 = r7
            r14 = r8
            r2 = r21
            r21 = r19
        L_0x00ed:
            r19 = r39
            goto L_0x01f7
        L_0x00f1:
            r1 = r19
            r2 = 2
            r14 = 3
            if (r1 == r2) goto L_0x011c
            if (r51 != 0) goto L_0x011c
            r2 = 1
            if (r5 == r2) goto L_0x00fe
            if (r5 != 0) goto L_0x011c
        L_0x00fe:
            int r2 = java.lang.Math.max(r3, r6)
            if (r4 <= 0) goto L_0x0108
            int r2 = java.lang.Math.min(r4, r2)
        L_0x0108:
            r6 = 8
            r10.addEquality(r8, r9, r2, r6)
            r19 = r39
            r23 = r3
            r15 = r5
            r14 = r8
            r2 = r21
            r20 = 0
        L_0x0117:
            r21 = r1
            r1 = r7
            goto L_0x01f7
        L_0x011c:
            r2 = -2
            if (r3 != r2) goto L_0x0120
            r3 = r6
        L_0x0120:
            if (r4 != r2) goto L_0x0124
            r2 = r6
            goto L_0x0125
        L_0x0124:
            r2 = r4
        L_0x0125:
            if (r6 <= 0) goto L_0x012b
            r4 = 1
            if (r5 == r4) goto L_0x012b
            r6 = 0
        L_0x012b:
            if (r3 <= 0) goto L_0x0136
            r4 = 8
            r10.addGreaterThan(r8, r9, r3, r4)
            int r6 = java.lang.Math.max(r6, r3)
        L_0x0136:
            if (r2 <= 0) goto L_0x014f
            if (r37 == 0) goto L_0x013f
            r4 = 1
            if (r5 != r4) goto L_0x013f
            r4 = 0
            goto L_0x0140
        L_0x013f:
            r4 = 1
        L_0x0140:
            if (r4 == 0) goto L_0x0148
            r4 = 8
            r10.addLowerThan(r8, r9, r2, r4)
            goto L_0x014a
        L_0x0148:
            r4 = 8
        L_0x014a:
            int r6 = java.lang.Math.min(r6, r2)
            goto L_0x0151
        L_0x014f:
            r4 = 8
        L_0x0151:
            r14 = 1
            if (r5 != r14) goto L_0x0175
            if (r37 == 0) goto L_0x015a
            r10.addEquality(r8, r9, r6, r4)
            goto L_0x016b
        L_0x015a:
            if (r53 == 0) goto L_0x0164
            r14 = 5
            r10.addEquality(r8, r9, r6, r14)
            r10.addLowerThan(r8, r9, r6, r4)
            goto L_0x016b
        L_0x0164:
            r14 = 5
            r10.addEquality(r8, r9, r6, r14)
            r10.addLowerThan(r8, r9, r6, r4)
        L_0x016b:
            r19 = r39
            r4 = r2
            r23 = r3
            r15 = r5
            r14 = r8
            r2 = r21
            goto L_0x0117
        L_0x0175:
            r4 = 2
            if (r5 != r4) goto L_0x01e6
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = r44.getType()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r4 == r6) goto L_0x01a2
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = r44.getType()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r4 != r6) goto L_0x0189
            goto L_0x01a2
        L_0x0189:
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getAnchor(r6)
            androidx.constraintlayout.core.SolverVariable r4 = r10.createObjectVariable(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r0.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r14 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.getAnchor(r14)
            androidx.constraintlayout.core.SolverVariable r6 = r10.createObjectVariable(r6)
            goto L_0x01ba
        L_0x01a2:
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getAnchor(r6)
            androidx.constraintlayout.core.SolverVariable r4 = r10.createObjectVariable(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r0.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r14 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.getAnchor(r14)
            androidx.constraintlayout.core.SolverVariable r6 = r10.createObjectVariable(r6)
        L_0x01ba:
            r14 = r4
            androidx.constraintlayout.core.ArrayRow r4 = r35.createRow()
            r19 = r3
            r3 = r4
            r4 = r8
            r43 = r2
            r15 = r5
            r2 = 0
            r5 = r9
            r2 = r21
            r21 = r1
            r1 = r7
            r7 = r14
            r14 = r8
            r8 = r60
            androidx.constraintlayout.core.ArrayRow r3 = r3.createRowDimensionRatio(r4, r5, r6, r7, r8)
            r10.addConstraint(r3)
            if (r37 == 0) goto L_0x01dc
            r5 = 0
            goto L_0x01de
        L_0x01dc:
            r5 = r20
        L_0x01de:
            r4 = r43
            r20 = r5
            r23 = r19
            goto L_0x00ed
        L_0x01e6:
            r43 = r2
            r19 = r3
            r15 = r5
            r14 = r8
            r2 = r21
            r21 = r1
            r1 = r7
            r4 = r43
            r23 = r19
            r19 = 1
        L_0x01f7:
            if (r61 == 0) goto L_0x053b
            if (r53 == 0) goto L_0x020a
            r3 = r40
            r4 = r41
            r7 = r9
            r2 = r21
            r1 = 0
            r5 = 2
            r13 = 8
            r30 = 1
            goto L_0x0548
        L_0x020a:
            if (r11 != 0) goto L_0x0212
            if (r12 != 0) goto L_0x0212
            if (r16 != 0) goto L_0x0212
            goto L_0x0505
        L_0x0212:
            if (r11 == 0) goto L_0x0218
            if (r12 != 0) goto L_0x0218
            goto L_0x0505
        L_0x0218:
            if (r11 != 0) goto L_0x024b
            if (r12 == 0) goto L_0x024b
            int r1 = r45.getMargin()
            int r1 = -r1
            r3 = 8
            r10.addEquality(r14, r2, r1, r3)
            if (r37 == 0) goto L_0x0505
            boolean r1 = r0.OPTIMIZE_WRAP
            if (r1 == 0) goto L_0x0242
            boolean r1 = r9.isFinalValue
            if (r1 == 0) goto L_0x0242
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.mParent
            if (r1 == 0) goto L_0x0242
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r1
            if (r36 == 0) goto L_0x023d
            r1.addHorizontalWrapMinVariable(r13)
            goto L_0x0505
        L_0x023d:
            r1.addVerticalWrapMinVariable(r13)
            goto L_0x0505
        L_0x0242:
            r8 = r40
            r1 = 5
            r3 = 0
            r10.addGreaterThan(r9, r8, r3, r1)
            goto L_0x0505
        L_0x024b:
            r8 = r40
            r3 = 0
            if (r11 == 0) goto L_0x0505
            if (r12 == 0) goto L_0x0505
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r13.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r5.mOwner
            r12 = r45
            r16 = 4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r12.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r5.mOwner
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r34.getParent()
            r18 = 6
            if (r20 == 0) goto L_0x037f
            if (r15 != 0) goto L_0x02b9
            if (r4 != 0) goto L_0x0292
            if (r23 != 0) goto L_0x0292
            boolean r4 = r1.isFinalValue
            if (r4 == 0) goto L_0x0286
            boolean r4 = r2.isFinalValue
            if (r4 == 0) goto L_0x0286
            int r3 = r44.getMargin()
            r5 = 8
            r10.addEquality(r9, r1, r3, r5)
            int r1 = r45.getMargin()
            int r1 = -r1
            r10.addEquality(r14, r2, r1, r5)
            return
        L_0x0286:
            r5 = 8
            r4 = 0
            r21 = 1
            r22 = 0
            r24 = 8
            r25 = 8
            goto L_0x029d
        L_0x0292:
            r5 = 8
            r4 = 1
            r21 = 0
            r22 = 1
            r24 = 5
            r25 = 5
        L_0x029d:
            boolean r3 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r3 != 0) goto L_0x02ab
            boolean r3 = r7 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r3 == 0) goto L_0x02a6
            goto L_0x02ab
        L_0x02a6:
            r3 = r4
            r17 = r22
            r5 = 1
            goto L_0x02b1
        L_0x02ab:
            r3 = r4
            r17 = r22
            r5 = 1
            r25 = 4
        L_0x02b1:
            r4 = r41
            r22 = r21
            r21 = 6
            goto L_0x03cd
        L_0x02b9:
            r3 = 2
            r5 = 8
            if (r15 != r3) goto L_0x02dd
            boolean r3 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r3 != 0) goto L_0x02d7
            boolean r3 = r7 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r3 == 0) goto L_0x02c7
            goto L_0x02d7
        L_0x02c7:
            r4 = r41
            r3 = 1
            r5 = 1
            r17 = 1
            r21 = 6
            r22 = 0
        L_0x02d1:
            r24 = 5
        L_0x02d3:
            r25 = 5
            goto L_0x03cd
        L_0x02d7:
            r4 = r41
            r3 = 1
            r5 = 1
            goto L_0x03c3
        L_0x02dd:
            r3 = 1
            if (r15 != r3) goto L_0x02ee
            r4 = r41
            r3 = 1
            r5 = 1
            r17 = 1
            r21 = 6
            r22 = 0
            r24 = 8
            goto L_0x03cb
        L_0x02ee:
            r3 = 3
            if (r15 != r3) goto L_0x0378
            int r3 = r0.mResolvedDimensionRatioSide
            r5 = -1
            if (r3 != r5) goto L_0x0313
            if (r54 == 0) goto L_0x0306
            r4 = r41
            r3 = 1
            r5 = 1
            r17 = 1
            if (r37 == 0) goto L_0x0303
            r21 = 5
            goto L_0x030e
        L_0x0303:
            r21 = 4
            goto L_0x030e
        L_0x0306:
            r4 = r41
            r3 = 1
            r5 = 1
            r17 = 1
            r21 = 8
        L_0x030e:
            r22 = 1
            r24 = 8
            goto L_0x02d3
        L_0x0313:
            if (r51 == 0) goto L_0x0339
            r3 = r57
            r5 = 2
            if (r3 == r5) goto L_0x0320
            r5 = 1
            if (r3 != r5) goto L_0x031e
            goto L_0x0321
        L_0x031e:
            r3 = 0
            goto L_0x0322
        L_0x0320:
            r5 = 1
        L_0x0321:
            r3 = 1
        L_0x0322:
            if (r3 != 0) goto L_0x0328
            r3 = 8
            r4 = 5
            goto L_0x032a
        L_0x0328:
            r3 = 5
            r4 = 4
        L_0x032a:
            r24 = r3
            r25 = r4
            r3 = 1
            r17 = 1
            r21 = 6
            r22 = 1
            r4 = r41
            goto L_0x03cd
        L_0x0339:
            r5 = 1
            if (r4 <= 0) goto L_0x0346
            r4 = r41
            r3 = 1
            r17 = 1
            r21 = 6
            r22 = 1
            goto L_0x02d1
        L_0x0346:
            if (r4 != 0) goto L_0x036e
            if (r23 != 0) goto L_0x036e
            if (r54 != 0) goto L_0x035b
            r4 = r41
            r3 = 1
            r17 = 1
            r21 = 6
            r22 = 1
            r24 = 5
            r25 = 8
            goto L_0x03cd
        L_0x035b:
            if (r11 == r6) goto L_0x0361
            if (r7 == r6) goto L_0x0361
            r3 = 4
            goto L_0x0362
        L_0x0361:
            r3 = 5
        L_0x0362:
            r4 = r41
            r24 = r3
            r3 = 1
            r17 = 1
            r21 = 6
            r22 = 1
            goto L_0x03cb
        L_0x036e:
            r4 = r41
            r3 = 1
            r17 = 1
            r21 = 6
            r22 = 1
            goto L_0x03c9
        L_0x0378:
            r5 = 1
            r4 = r41
            r3 = 0
            r17 = 0
            goto L_0x03c5
        L_0x037f:
            r5 = 1
            boolean r3 = r1.isFinalValue
            if (r3 == 0) goto L_0x03c0
            boolean r3 = r2.isFinalValue
            if (r3 == 0) goto L_0x03c0
            int r3 = r44.getMargin()
            int r4 = r45.getMargin()
            r5 = 8
            r51 = r35
            r52 = r9
            r53 = r1
            r54 = r3
            r55 = r50
            r56 = r2
            r57 = r14
            r58 = r4
            r59 = r5
            r51.addCentering(r52, r53, r54, r55, r56, r57, r58, r59)
            if (r37 == 0) goto L_0x03bf
            if (r19 == 0) goto L_0x03bf
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r12.mTarget
            if (r1 == 0) goto L_0x03b6
            int r5 = r45.getMargin()
            r4 = r41
            goto L_0x03b9
        L_0x03b6:
            r4 = r41
            r5 = 0
        L_0x03b9:
            if (r2 == r4) goto L_0x03bf
            r1 = 5
            r10.addGreaterThan(r4, r14, r5, r1)
        L_0x03bf:
            return
        L_0x03c0:
            r4 = r41
            r3 = 1
        L_0x03c3:
            r17 = 1
        L_0x03c5:
            r21 = 6
            r22 = 0
        L_0x03c9:
            r24 = 5
        L_0x03cb:
            r25 = 4
        L_0x03cd:
            if (r17 == 0) goto L_0x03d8
            if (r1 != r2) goto L_0x03d8
            if (r11 == r6) goto L_0x03d8
            r17 = 0
            r26 = 0
            goto L_0x03da
        L_0x03d8:
            r26 = 1
        L_0x03da:
            if (r3 == 0) goto L_0x041f
            if (r20 != 0) goto L_0x03ef
            if (r52 != 0) goto L_0x03ef
            if (r54 != 0) goto L_0x03ef
            if (r1 != r8) goto L_0x03ef
            if (r2 != r4) goto L_0x03ef
            r21 = 8
            r24 = 0
            r26 = 0
            r27 = 8
            goto L_0x03f3
        L_0x03ef:
            r27 = r24
            r24 = r37
        L_0x03f3:
            int r28 = r44.getMargin()
            int r29 = r45.getMargin()
            r3 = r1
            r1 = r35
            r5 = r2
            r13 = 8
            r30 = 1
            r2 = r9
            r39 = r3
            r4 = r28
            r42 = r5
            r5 = r50
            r31 = r6
            r6 = r42
            r32 = r7
            r7 = r14
            r8 = r29
            r33 = r9
            r9 = r21
            r1.addCentering(r2, r3, r4, r5, r6, r7, r8, r9)
            r5 = r26
            goto L_0x0433
        L_0x041f:
            r39 = r1
            r42 = r2
            r31 = r6
            r32 = r7
            r33 = r9
            r13 = 8
            r30 = 1
            r27 = r24
            r5 = r26
            r24 = r37
        L_0x0433:
            int r1 = r0.mVisibility
            if (r1 != r13) goto L_0x043e
            boolean r1 = r45.hasDependents()
            if (r1 != 0) goto L_0x043e
            return
        L_0x043e:
            r1 = r39
            r2 = r42
            if (r17 == 0) goto L_0x046f
            if (r24 == 0) goto L_0x0459
            if (r1 == r2) goto L_0x0459
            if (r20 != 0) goto L_0x0459
            boolean r3 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r3 != 0) goto L_0x0455
            r3 = r32
            boolean r4 = r3 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r4 == 0) goto L_0x045b
            goto L_0x0457
        L_0x0455:
            r3 = r32
        L_0x0457:
            r4 = 6
            goto L_0x045d
        L_0x0459:
            r3 = r32
        L_0x045b:
            r4 = r27
        L_0x045d:
            int r6 = r44.getMargin()
            r7 = r33
            r10.addGreaterThan(r7, r1, r6, r4)
            int r6 = r45.getMargin()
            int r6 = -r6
            r10.addLowerThan(r14, r2, r6, r4)
            goto L_0x0475
        L_0x046f:
            r3 = r32
            r7 = r33
            r4 = r27
        L_0x0475:
            if (r24 == 0) goto L_0x0485
            if (r55 == 0) goto L_0x0485
            boolean r6 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r6 != 0) goto L_0x0485
            boolean r6 = r3 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r6 != 0) goto L_0x0485
            r4 = 6
            r5 = 1
            r6 = 6
            goto L_0x0488
        L_0x0485:
            r6 = r4
            r4 = r25
        L_0x0488:
            if (r5 == 0) goto L_0x04d8
            if (r22 == 0) goto L_0x04b8
            if (r54 == 0) goto L_0x0490
            if (r38 == 0) goto L_0x04b8
        L_0x0490:
            r5 = r31
            if (r11 == r5) goto L_0x0499
            if (r3 != r5) goto L_0x0497
            goto L_0x0499
        L_0x0497:
            r18 = r4
        L_0x0499:
            boolean r8 = r11 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r8 != 0) goto L_0x04a1
            boolean r8 = r3 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r8 == 0) goto L_0x04a3
        L_0x04a1:
            r18 = 5
        L_0x04a3:
            boolean r8 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r8 != 0) goto L_0x04ab
            boolean r8 = r3 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r8 == 0) goto L_0x04ad
        L_0x04ab:
            r18 = 5
        L_0x04ad:
            if (r54 == 0) goto L_0x04b1
            r8 = 5
            goto L_0x04b3
        L_0x04b1:
            r8 = r18
        L_0x04b3:
            int r4 = java.lang.Math.max(r8, r4)
            goto L_0x04ba
        L_0x04b8:
            r5 = r31
        L_0x04ba:
            if (r24 == 0) goto L_0x04c9
            int r4 = java.lang.Math.min(r6, r4)
            if (r51 == 0) goto L_0x04c9
            if (r54 != 0) goto L_0x04c9
            if (r11 == r5) goto L_0x04c8
            if (r3 != r5) goto L_0x04c9
        L_0x04c8:
            r4 = 4
        L_0x04c9:
            int r3 = r44.getMargin()
            r10.addEquality(r7, r1, r3, r4)
            int r3 = r45.getMargin()
            int r3 = -r3
            r10.addEquality(r14, r2, r3, r4)
        L_0x04d8:
            if (r24 == 0) goto L_0x04ea
            r3 = r40
            if (r3 != r1) goto L_0x04e3
            int r5 = r44.getMargin()
            goto L_0x04e4
        L_0x04e3:
            r5 = 0
        L_0x04e4:
            if (r1 == r3) goto L_0x04ea
            r1 = 5
            r10.addGreaterThan(r7, r3, r5, r1)
        L_0x04ea:
            if (r24 == 0) goto L_0x0503
            if (r20 == 0) goto L_0x0503
            r5 = r15
            if (r48 != 0) goto L_0x0503
            if (r23 != 0) goto L_0x0503
            if (r20 == 0) goto L_0x04fd
            r1 = 3
            if (r5 != r1) goto L_0x04fd
            r1 = 0
            r10.addGreaterThan(r14, r7, r1, r13)
            goto L_0x050a
        L_0x04fd:
            r1 = 0
            r3 = 5
            r10.addGreaterThan(r14, r7, r1, r3)
            goto L_0x050a
        L_0x0503:
            r1 = 0
            goto L_0x050a
        L_0x0505:
            r12 = r45
            r1 = 0
            r24 = r37
        L_0x050a:
            if (r24 == 0) goto L_0x053a
            if (r19 == 0) goto L_0x053a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r12.mTarget
            if (r3 == 0) goto L_0x0519
            int r5 = r45.getMargin()
            r4 = r41
            goto L_0x051c
        L_0x0519:
            r4 = r41
            r5 = 0
        L_0x051c:
            if (r2 == r4) goto L_0x053a
            boolean r1 = r0.OPTIMIZE_WRAP
            if (r1 == 0) goto L_0x0536
            boolean r1 = r14.isFinalValue
            if (r1 == 0) goto L_0x0536
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.mParent
            if (r1 == 0) goto L_0x0536
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r1
            if (r36 == 0) goto L_0x0532
            r1.addHorizontalWrapMaxVariable(r12)
            goto L_0x0535
        L_0x0532:
            r1.addVerticalWrapMaxVariable(r12)
        L_0x0535:
            return
        L_0x0536:
            r1 = 5
            r10.addGreaterThan(r4, r14, r5, r1)
        L_0x053a:
            return
        L_0x053b:
            r3 = r40
            r4 = r41
            r7 = r9
            r1 = 0
            r5 = 2
            r13 = 8
            r30 = 1
            r2 = r21
        L_0x0548:
            if (r2 >= r5) goto L_0x058a
            if (r37 == 0) goto L_0x058a
            if (r19 == 0) goto L_0x058a
            r10.addGreaterThan(r7, r3, r1, r13)
            if (r36 != 0) goto L_0x055c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L_0x055a
            goto L_0x055c
        L_0x055a:
            r5 = 0
            goto L_0x055d
        L_0x055c:
            r5 = 1
        L_0x055d:
            if (r36 != 0) goto L_0x0585
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L_0x0585
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.mOwner
            float r3 = r2.mDimensionRatio
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0584
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r2.mListDimensionBehaviors
            r3 = r3[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r5) goto L_0x0584
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r2.mListDimensionBehaviors
            r2 = r2[r30]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x0584
            r5 = 1
            goto L_0x0585
        L_0x0584:
            r5 = 0
        L_0x0585:
            if (r5 == 0) goto L_0x058a
            r10.addGreaterThan(r4, r14, r1, r13)
        L_0x058a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.applyConstraints(androidx.constraintlayout.core.LinearSystem, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$1 */
    static /* synthetic */ class C01601 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour */
        static final /* synthetic */ int[] f18x6d00e4a2 = new int[DimensionBehaviour.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0093 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18x6d00e4a2 = r0
                r0 = 1
                int[] r1 = f18x6d00e4a2     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f18x6d00e4a2     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f18x6d00e4a2     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f18x6d00e4a2     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f17x6930e354 = r4
                int[] r4 = f17x6930e354     // Catch:{ NoSuchFieldError -> 0x0048 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0048 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                int[] r0 = f17x6930e354     // Catch:{ NoSuchFieldError -> 0x0052 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                int[] r0 = f17x6930e354     // Catch:{ NoSuchFieldError -> 0x005c }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                int[] r0 = f17x6930e354     // Catch:{ NoSuchFieldError -> 0x0066 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                int[] r0 = f17x6930e354     // Catch:{ NoSuchFieldError -> 0x0071 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r0 = f17x6930e354     // Catch:{ NoSuchFieldError -> 0x007c }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x007c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007c }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007c }
            L_0x007c:
                int[] r0 = f17x6930e354     // Catch:{ NoSuchFieldError -> 0x0087 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = f17x6930e354     // Catch:{ NoSuchFieldError -> 0x0093 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                int[] r0 = f17x6930e354     // Catch:{ NoSuchFieldError -> 0x009f }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x009f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009f }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009f }
            L_0x009f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.C01601.<clinit>():void");
        }
    }

    public void updateFromSolver(LinearSystem linearSystem, boolean z) {
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = linearSystem.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = linearSystem.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = linearSystem.getObjectVariableValue(this.mBottom);
        if (z && (horizontalWidgetRun = this.horizontalRun) != null && horizontalWidgetRun.start.resolved && this.horizontalRun.end.resolved) {
            objectVariableValue = this.horizontalRun.start.value;
            objectVariableValue3 = this.horizontalRun.end.value;
        }
        if (z && (verticalWidgetRun = this.verticalRun) != null && verticalWidgetRun.start.resolved && this.verticalRun.end.resolved) {
            objectVariableValue2 = this.verticalRun.start.value;
            objectVariableValue4 = this.verticalRun.end.value;
        }
        int i = objectVariableValue4 - objectVariableValue2;
        if (objectVariableValue3 - objectVariableValue < 0 || i < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue4 = 0;
            objectVariableValue = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
        }
        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
    }

    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        this.mHorizontalResolution = constraintWidget.mHorizontalResolution;
        this.mVerticalResolution = constraintWidget.mVerticalResolution;
        this.mMatchConstraintDefaultWidth = constraintWidget.mMatchConstraintDefaultWidth;
        this.mMatchConstraintDefaultHeight = constraintWidget.mMatchConstraintDefaultHeight;
        int[] iArr = this.mResolvedMatchConstraintDefault;
        int[] iArr2 = constraintWidget.mResolvedMatchConstraintDefault;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.mMatchConstraintMinWidth = constraintWidget.mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = constraintWidget.mMatchConstraintMaxWidth;
        this.mMatchConstraintMinHeight = constraintWidget.mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = constraintWidget.mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = constraintWidget.mMatchConstraintPercentHeight;
        this.mIsWidthWrapContent = constraintWidget.mIsWidthWrapContent;
        this.mIsHeightWrapContent = constraintWidget.mIsHeightWrapContent;
        this.mResolvedDimensionRatioSide = constraintWidget.mResolvedDimensionRatioSide;
        this.mResolvedDimensionRatio = constraintWidget.mResolvedDimensionRatio;
        int[] iArr3 = constraintWidget.mMaxDimension;
        this.mMaxDimension = Arrays.copyOf(iArr3, iArr3.length);
        this.mCircleConstraintAngle = constraintWidget.mCircleConstraintAngle;
        this.hasBaseline = constraintWidget.hasBaseline;
        this.inPlaceholder = constraintWidget.inPlaceholder;
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mListDimensionBehaviors = (DimensionBehaviour[]) Arrays.copyOf(this.mListDimensionBehaviors, 2);
        ConstraintWidget constraintWidget2 = null;
        this.mParent = this.mParent == null ? null : hashMap.get(constraintWidget.mParent);
        this.mWidth = constraintWidget.mWidth;
        this.mHeight = constraintWidget.mHeight;
        this.mDimensionRatio = constraintWidget.mDimensionRatio;
        this.mDimensionRatioSide = constraintWidget.mDimensionRatioSide;
        this.f15mX = constraintWidget.f15mX;
        this.f16mY = constraintWidget.f16mY;
        this.mRelX = constraintWidget.mRelX;
        this.mRelY = constraintWidget.mRelY;
        this.mOffsetX = constraintWidget.mOffsetX;
        this.mOffsetY = constraintWidget.mOffsetY;
        this.mBaselineDistance = constraintWidget.mBaselineDistance;
        this.mMinWidth = constraintWidget.mMinWidth;
        this.mMinHeight = constraintWidget.mMinHeight;
        this.mHorizontalBiasPercent = constraintWidget.mHorizontalBiasPercent;
        this.mVerticalBiasPercent = constraintWidget.mVerticalBiasPercent;
        this.mCompanionWidget = constraintWidget.mCompanionWidget;
        this.mContainerItemSkip = constraintWidget.mContainerItemSkip;
        this.mVisibility = constraintWidget.mVisibility;
        this.mDebugName = constraintWidget.mDebugName;
        this.mType = constraintWidget.mType;
        this.mDistToTop = constraintWidget.mDistToTop;
        this.mDistToLeft = constraintWidget.mDistToLeft;
        this.mDistToRight = constraintWidget.mDistToRight;
        this.mDistToBottom = constraintWidget.mDistToBottom;
        this.mLeftHasCentered = constraintWidget.mLeftHasCentered;
        this.mRightHasCentered = constraintWidget.mRightHasCentered;
        this.mTopHasCentered = constraintWidget.mTopHasCentered;
        this.mBottomHasCentered = constraintWidget.mBottomHasCentered;
        this.mHorizontalWrapVisited = constraintWidget.mHorizontalWrapVisited;
        this.mVerticalWrapVisited = constraintWidget.mVerticalWrapVisited;
        this.mHorizontalChainStyle = constraintWidget.mHorizontalChainStyle;
        this.mVerticalChainStyle = constraintWidget.mVerticalChainStyle;
        this.mHorizontalChainFixedPosition = constraintWidget.mHorizontalChainFixedPosition;
        this.mVerticalChainFixedPosition = constraintWidget.mVerticalChainFixedPosition;
        float[] fArr = this.mWeight;
        float[] fArr2 = constraintWidget.mWeight;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.mListNextMatchConstraintsWidget;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.mListNextMatchConstraintsWidget;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.mNextChainWidget;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.mNextChainWidget;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget3 = constraintWidget.mHorizontalNextWidget;
        this.mHorizontalNextWidget = constraintWidget3 == null ? null : hashMap.get(constraintWidget3);
        ConstraintWidget constraintWidget4 = constraintWidget.mVerticalNextWidget;
        if (constraintWidget4 != null) {
            constraintWidget2 = hashMap.get(constraintWidget4);
        }
        this.mVerticalNextWidget = constraintWidget2;
    }

    public void updateFromRuns(boolean z, boolean z2) {
        int i;
        int i2;
        boolean isResolved = z & this.horizontalRun.isResolved();
        boolean isResolved2 = z2 & this.verticalRun.isResolved();
        int i3 = this.horizontalRun.start.value;
        int i4 = this.verticalRun.start.value;
        int i5 = this.horizontalRun.end.value;
        int i6 = this.verticalRun.end.value;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (isResolved) {
            this.f15mX = i3;
        }
        if (isResolved2) {
            this.f16mY = i4;
        }
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (isResolved) {
            if (this.mListDimensionBehaviors[0] != DimensionBehaviour.FIXED || i8 >= (i2 = this.mWidth)) {
                i2 = i8;
            }
            this.mWidth = i2;
            int i10 = this.mWidth;
            int i11 = this.mMinWidth;
            if (i10 < i11) {
                this.mWidth = i11;
            }
        }
        if (isResolved2) {
            if (this.mListDimensionBehaviors[1] != DimensionBehaviour.FIXED || i9 >= (i = this.mHeight)) {
                i = i9;
            }
            this.mHeight = i;
            int i12 = this.mHeight;
            int i13 = this.mMinHeight;
            if (i12 < i13) {
                this.mHeight = i13;
            }
        }
    }

    public void addChildrenToSolverByDependency(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, HashSet<ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                Optimizer.checkMatchParent(constraintWidgetContainer, linearSystem, this);
                hashSet.remove(this);
                addToSolver(linearSystem, constraintWidgetContainer.optimizeFor(64));
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet<ConstraintAnchor> dependents = this.mLeft.getDependents();
            if (dependents != null) {
                Iterator<ConstraintAnchor> it = dependents.iterator();
                while (it.hasNext()) {
                    it.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
            }
            HashSet<ConstraintAnchor> dependents2 = this.mRight.getDependents();
            if (dependents2 != null) {
                Iterator<ConstraintAnchor> it2 = dependents2.iterator();
                while (it2.hasNext()) {
                    it2.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> dependents3 = this.mTop.getDependents();
        if (dependents3 != null) {
            Iterator<ConstraintAnchor> it3 = dependents3.iterator();
            while (it3.hasNext()) {
                it3.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> dependents4 = this.mBottom.getDependents();
        if (dependents4 != null) {
            Iterator<ConstraintAnchor> it4 = dependents4.iterator();
            while (it4.hasNext()) {
                it4.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> dependents5 = this.mBaseline.getDependents();
        if (dependents5 != null) {
            Iterator<ConstraintAnchor> it5 = dependents5.iterator();
            while (it5.hasNext()) {
                it5.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
    }
}
