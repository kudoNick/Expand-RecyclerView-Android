package com.example.expandrecyclerviewandroid;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

class ProductViewHolder extends ChildViewHolder {
    TextView mTextView;
    public ProductViewHolder(View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.tvProduct);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Product", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void bind(Product product) {
        mTextView.setText(product.name);
    }
}
