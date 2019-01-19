package com.example.mypracticaltraining.view;

public interface Iview<T> {
    void getSuccess(T resule);
    void getFail(String tips);
}
