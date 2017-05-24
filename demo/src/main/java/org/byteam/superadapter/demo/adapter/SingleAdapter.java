package org.byteam.superadapter.demo.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.util.Log;
import android.view.ViewGroup;

import org.byteam.superadapter.SuperAdapter;
import org.byteam.superadapter.SuperViewHolder;
import org.byteam.superadapter.demo.R;

import java.util.List;

public class SingleAdapter extends SuperAdapter<String> {
    public SingleAdapter(Context context, List<String> list, @LayoutRes int layoutResId) {
        super(context, list, layoutResId);
    }

    @Override
    public void onCreate(final SuperViewHolder holder, final int position, ViewGroup parent, int viewType) {
        Log.e("SingleAdapter", "onCreate: position=" + position +
                ", holder.getLayoutPosition()=" + holder.getLayoutPosition());
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("onClick", "" + position);
//            }
//        });
//        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                Toast.makeText(getContext(), ((TextView) (holder.findViewById(R.id.tv_name))).getText(), Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        });
    }

    @Override
    public void onBind(final SuperViewHolder holder, int viewType, final int layoutPosition, String item) {
        holder.setText(R.id.tv_name, item);
    }
}
