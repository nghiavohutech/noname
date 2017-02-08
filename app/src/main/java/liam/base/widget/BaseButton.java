package liam.base.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import liam.base.R;
import liam.base.util.layout.LayoutUtil;

/**
 * Created by nghiavo on 1/17/17.
 */

public class BaseButton extends AppCompatButton {
    public BaseButton(Context context) {
        super(context);
    }

    public BaseButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.BaseButton);

            /* Set font */
            String fontKey = typedArray.getString(R.styleable.BaseButton_font);
            setFont(getContext(), fontKey);

            typedArray.recycle();
        }
    }

    public void setFont(Context context, String fontKey) {
        this.setTypeface(LayoutUtil.getFont(context, fontKey));
    }

}
