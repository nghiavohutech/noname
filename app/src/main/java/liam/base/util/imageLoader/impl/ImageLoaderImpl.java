package liam.base.util.imageLoader.impl;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import liam.base.util.imageLoader.ImageLoader;

/**
 * Created by nghiavo on 1/18/17.
 */

public class ImageLoaderImpl implements ImageLoader {
    @Override
    public void loadImage(Context context, int resource, ImageView imageView) {
        Picasso.with(context).load(resource).into(imageView);
    }

    @Override
    public void loadImage(Context context, int resource, int placeholder, ImageView imageView) {
        Picasso.with(context).load(resource).placeholder(placeholder).into(imageView);
    }

    @Override
    public void loadImage(Context context, int resource, int placeholder, int error, ImageView imageView) {
        Picasso.with(context).load(resource).placeholder(placeholder).error(error).into(imageView);
    }

    @Override
    public void loadImage(Context context, String url, ImageView imageView) {
        Picasso.with(context).load(url).into(imageView);
    }

    @Override
    public void loadImage(Context context, String url, int placeholder, ImageView imageView) {
        Picasso.with(context).load(url).placeholder(placeholder).into(imageView);
    }

    @Override
    public void loadImage(Context context, String url, int placeholder, int error, ImageView imageView) {
        Picasso.with(context).load(url).placeholder(placeholder).error(error).into(imageView);
    }
}
