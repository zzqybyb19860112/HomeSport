package com.tiyujia.homesport.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;

/**
 * Created by zzqybyb19860112 on 2016/10/19.
 */

public class PicassoUtil {
    public static void handlePic(Context context, String url, ImageView view, int width, int height){
        String type=url.substring(url.lastIndexOf("."),url.length());
        if (type.equals(".gif")){
            Glide.with(context).load(url).into(view);
        }else {
            Picasso.with(context).load(url).config(Bitmap.Config.RGB_565).resize(width, height)
                    .centerCrop().memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE)
                    .into(view);
        }
    }
    public static void showImage(Context context, int localUrl,String netUrl, ImageView view){
        if (netUrl.equals("")||netUrl.equals("null")||netUrl==null){
            Picasso.with(context).load(localUrl).into(view);
        }else {
            Picasso.with(context).load(netUrl).into(view);
        }
    }
}

