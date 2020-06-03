package com.example.expandrecyclerviewandroid;

import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import static android.view.animation.Animation.RELATIVE_TO_SELF;

class CompanyViewHolder extends GroupViewHolder {
    TextView mTextView;
    ImageView imageView;
    public CompanyViewHolder(View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.tvCompany);
        imageView = itemView.findViewById(R.id.imgUp);
    }

    public void bind(Company company) {
    mTextView.setText(company.getTitle());
    }
    @Override
    public void expand() {
        animateExpand();
    }

    @Override
    public void collapse() {
        animateCollapse();
    }

    private void animateExpand() {
        RotateAnimation rotate =
                new RotateAnimation(-360, -180, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(500);
        rotate.setFillAfter(true);
        imageView.setAnimation(rotate);
    }

    private void animateCollapse() {
        RotateAnimation rotate =
                new RotateAnimation(180, 360, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(500);
        rotate.setFillAfter(true);
        imageView.setAnimation(rotate);
    }
}

