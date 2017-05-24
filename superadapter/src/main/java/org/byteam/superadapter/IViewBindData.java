package org.byteam.superadapter;

import android.view.ViewGroup;

/**
 * Create and bind data to item view.
 * <p>
 * Created by Cheney on 16/3/31.
 */
interface IViewBindData<T, VH> {

    /**
     * @param holder   VH
     * @param position Current VH position.
     * @param parent   Target container(ListView, GridView, RecyclerView,Spinner, etc.).
     * @param viewType Choose the layout resource according to view type.
     */
    void onCreate(VH holder, int position, ViewGroup parent, int viewType);

    /**
     * Method for binding data to view.
     *
     * @param holder   ViewHolder
     * @param viewType {@link RVAdapter#getItemViewType(int)}
     * @param position position in adapter
     * @param item     data
     */
    void onBind(VH holder, int viewType, int position, T item);
}
