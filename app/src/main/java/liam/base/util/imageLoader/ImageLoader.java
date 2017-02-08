package liam.base.util.imageLoader;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by nghiavo on 1/18/17.
 */

public interface ImageLoader {
    void loadImage(Context context, int resource, ImageView imageView);

    void loadImage(Context context, int resource, int placeholder, ImageView imageView);

    void loadImage(Context context, int resource, int placeholder, int error, ImageView imageView);

    void loadImage(Context context, String url, ImageView imageView);

    void loadImage(Context context, String url, int placeholder, ImageView imageView);

    void loadImage(Context context, String url, int placeholder, int error, ImageView imageView);
}

