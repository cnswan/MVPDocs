package com.cnswan.mvpdocs;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 00013259 on 2017/9/26.
 */

public class GoodsAdapter extends BaseAdapter {

    List<GoodsBean> mData;

    public GoodsAdapter(List<GoodsBean> list) {
        this.mData = list;
    }

    public void setNewData(List<GoodsBean> list) {
        this.mData = list;
        if (mData == null) {
            mData = new ArrayList<>();
        }
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            view = View.inflate(viewGroup.getContext(), R.layout.item_goods, null);
            viewHolder.tvNumber = (TextView) view.findViewById(R.id.tv_goods_number);
            viewHolder.tvName = (TextView) view.findViewById(R.id.tv_goods_name);
            viewHolder.tvTime = (TextView) view.findViewById(R.id.tv_goods_time);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        GoodsBean item = (GoodsBean) getItem(position);
        viewHolder.tvNumber.setText(String.valueOf(item.getNumber()));
        viewHolder.tvName.setText(item.getName());
        viewHolder.tvTime.setText(item.getTime());
        return view;
    }

    class ViewHolder {

        TextView tvNumber;
        TextView tvName;
        TextView tvTime;

    }
}
