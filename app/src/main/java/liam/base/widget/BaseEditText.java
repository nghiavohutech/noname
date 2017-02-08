package liam.base.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

import liam.base.R;
import liam.base.util.layout.LayoutUtil;


/**
 * Created by nghiavo on 1/17/17.
 */

public class BaseEditText extends AppCompatEditText {
    public BaseEditText(Context context) {
        super(context);
        init(null);
    }

    public BaseEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public BaseEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.BaseEditText);

            /* Set font */
            String fontKey = typedArray.getString(R.styleable.BaseEditText_font);
            setFont(getContext(), fontKey);

            typedArray.recycle();
        }
    }

    public void setFont(Context context, String fontKey) {
        this.setTypeface(LayoutUtil.getFont(context, fontKey));
    }

}
