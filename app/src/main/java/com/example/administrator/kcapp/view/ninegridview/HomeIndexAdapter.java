package com.example.administrator.kcapp.view.ninegridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.administrator.kcapp.base.BaseAdapter;
import com.example.administrator.kcapp.base.BaseHolder;
import com.example.administrator.kcapp.interfaces.OnItemPictureClickListener;

import java.util.List;


/**
 * Description
 * Created by Administrator
 * Time 2018/1/2  22:00
 */

public class HomeIndexAdapter extends BaseAdapter<String> {

    private List<String> list;
    private Context context;
    private final int ITEM_TEXT=0;
    private final int ITEM_EMPTY=1;
    private OnItemPictureClickListener listener;
    public HomeIndexAdapter(Context context, List<String> list,OnItemPictureClickListener listener) {
        super(context, list);
        this.list = list;
        this.context = context;
        this.listener = listener;
    }

    @Override
    public int getHolderType(int position) {
        return ITEM_TEXT;
    }



    @Override
    public BaseHolder createBaseHolder(ViewGroup parent, int viewType) {
        BaseHolder holder = null;
        switch (viewType){
            case ITEM_TEXT:
//                holder = new MomentHolder(LayoutInflater.from(context).inflate(R.layout.item_wechat_moment,parent,false),listener);
                break;
        }
        return holder;
    }


}
