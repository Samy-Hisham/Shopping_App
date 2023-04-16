package com.android.shoppingapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.android.shoppingapp.databinding.ActivityOrderBinding;

public class OrderActivity extends AppCompatActivity {

    private ActivityOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        onClick();
    }

    private void onClick() {

        String product = binding.product.toString();
        String quantity = binding.quantity.toString();
        String price = binding.price.toString();
        String description = binding.description.toString();

        if (product.isEmpty()) {
            binding.product.setError(getString(R.string.required));

        } else if (quantity.isEmpty()) {
            binding.quantity.setError(getString(R.string.required));

        } else if (price.isEmpty()) {
            binding.price.setError(getString(R.string.required));

        } else {
            // use intent to move next screen
        }
    }
}