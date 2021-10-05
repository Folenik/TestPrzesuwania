package com.folen.testprzesuwania;

public interface ItemTouchHelperAdapter {


    boolean onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);
}
