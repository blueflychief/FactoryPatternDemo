package infinite.com.factorydemo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {
    //画圆弧的paint
    private Paint mScaleArcPaint;
    /* 圆弧的外接矩形 */
    private RectF mScaleArcRectF;

    /* 亮色 */
    private int mLightColor=Color.parseColor("#FF00FF00");
    /* 暗色 */
    private int mDarkColor= Color.parseColor("#FFFF0000");
    /* 背景色*/
    private int mBackgroundColor=Color.parseColor("#000000");
    /* 半径，不含padding值 */
    private float mRadius;
    /* 渐变宽度 */
    private float mScaleLength;

    /* 加一个默认的padding值*/
    private float mDefaultPadding;
    private float mPaddingLeft;
    private float mPaddingTop;
    private float mPaddingRight;
    private float mPaddingBottom;

    /* 梯度扫描渐变 */
    private SweepGradient mSweepGradient;


    public MyView(Context context) {
        this(context, null);
    }

    public MyView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.MyView, defStyleAttr, 0);
        setBackgroundColor(mBackgroundColor);
        ta.recycle();
        mScaleArcPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mScaleArcPaint.setStyle(Paint.Style.STROKE);
        mScaleArcRectF = new RectF();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(measureDimension(widthMeasureSpec), measureDimension(heightMeasureSpec));
    }

    private int measureDimension(int measureSpec) {
        int result;
        int mode = MeasureSpec.getMode(measureSpec);
        int size = MeasureSpec.getSize(measureSpec);
        if (mode == MeasureSpec.EXACTLY) {
            result = size;
        } else {
            result = 800;
            if (mode == MeasureSpec.AT_MOST) {
                result = Math.min(result, size);
            }
        }
        return result;
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mRadius = Math.min(w - getPaddingLeft() - getPaddingRight(),
                h - getPaddingTop() - getPaddingBottom()) / 2;
        mDefaultPadding = 0.12f * mRadius;
        mPaddingLeft = mDefaultPadding + w / 2 - mRadius + getPaddingLeft();
        mPaddingTop = mDefaultPadding + h / 2 - mRadius + getPaddingTop();
        mPaddingRight = mPaddingLeft;
        mPaddingBottom = mPaddingTop;
        mScaleLength = 0.12f * mRadius;//根据比例确定刻度线长度
        mScaleArcPaint.setStrokeWidth(mScaleLength);

        //参数1，参数2，渐变的中心点，这里是圆的中心
        //参数3是颜色矩阵，参数4是颜色的渐变位置，从0到1
        mSweepGradient = new SweepGradient(w / 2, h / 2,
                new int[]{mDarkColor, mLightColor, mDarkColor, mLightColor}, new float[]{0.0f, 0.33f, 0.66f, 1});
    }

    @Override
    protected void onDraw(Canvas canvas) {
        drawScaleLine(canvas);
    }

    private void drawScaleLine(Canvas canvas) {
        canvas.save();
        mScaleArcRectF.set(mPaddingLeft + 1.5f * mScaleLength,
                mPaddingTop + 1.5f * mScaleLength,
                getWidth() - mPaddingRight - 1.5f * mScaleLength,
                getHeight() - mPaddingBottom - 1.5f * mScaleLength);
        mScaleArcPaint.setShader(mSweepGradient);
        canvas.drawArc(mScaleArcRectF, 180, 180, false, mScaleArcPaint);
        canvas.restore();
    }

}
