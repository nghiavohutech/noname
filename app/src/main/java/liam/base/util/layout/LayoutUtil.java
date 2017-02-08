package liam.base.util.layout;

import android.content.Context;
import android.graphics.Typeface;

import static liam.base.constant.LayoutConstant.FONT;


/**
 * Created by nghiavo on 1/17/17.
 */

public class LayoutUtil {
    public static Typeface getFont(Context context, String fontKey) {
        Typeface result;
        if (fontKey == null) {
            result = Typeface.createFromAsset(context.getAssets(), "fonts/" + FONT[2]);
        } else {
            result = Typeface.createFromAsset(context.getAssets(), "fonts/" + FONT[Integer.valueOf(fontKey)]);
        }
        return result;
    }
}
