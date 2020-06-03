package com.example.expandrecyclerviewandroid;

import android.os.Parcel;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class Company extends ExpandableGroup<Product> {
    public Company(String title, List<Product> items) {
        super(title, items);
    }

    protected Company(Parcel in) {
        super(in);
    }
}
