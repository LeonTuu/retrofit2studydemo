package com.mieasy.retrofit2studydemo.module;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mieasy.retrofit2studydemo.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NormalAdapter extends Adapter<ViewHolder> {
    List<MeiZi> dateBean;
    private Context context;

    public NormalAdapter(List<MeiZi> dateBean, Context context) {
        this.dateBean = dateBean;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.phone_recycler_item, parent,
                false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (holder instanceof ItemViewHolder) {
            if (dateBean != null) {
                ((ItemViewHolder) holder).tt.setText(position+"");
                try {
                    Picasso.with(context)
                            .load(dateBean.get(position).getUrl())
                            .into(((ItemViewHolder) holder).img);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

        }
    }

    @Override
    public int getItemCount() {
        return dateBean.size() == 0 ? 0 : dateBean.size() + 1;
    }


    static class ItemViewHolder extends ViewHolder {
        @BindView(R.id.img1)
        ImageView img;
        @BindView(R.id.tt)
        TextView tt;

        public ItemViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
