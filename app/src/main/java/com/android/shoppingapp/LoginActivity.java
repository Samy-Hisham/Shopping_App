package com.android.shoppingapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.android.shoppingapp.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        onClick();
    }

    private void onClick() {

        binding.btnLogin.setOnClickListener(v -> {
            validation();
        });
    }

    private void validation() {

        String name = binding.name.toString();
        String email = binding.email.toString();
        String password = binding.password.toString();
        String phone = binding.phoneNumber.toString();
        String location = binding.location.toString();
        String productType = binding.productType.toString();
        String codeWereHouse = binding.codeWarehouse.toString();

        if (name.isEmpty()) {
            binding.name.setError(getString(R.string.required));
        } else if (email.isEmpty()) {
            binding.email.setError(getString(R.string.required));
        } else if (password.isEmpty()) {
            binding.password.setError(getString(R.string.required));
        } else if (phone.isEmpty()) {
            binding.phoneNumber.setError(getString(R.string.required));
        } else if (location.isEmpty()) {
            binding.location.setError(getString(R.string.required));
        } else if (productType.isEmpty()) {
            binding.productType.setError(getString(R.string.required));
        } else if (codeWereHouse.isEmpty()) {
            binding.codeWarehouse.setError(getString(R.string.required));
        } else {
            Intent intent = new Intent(this, OrderActivity.class);
            startActivity(intent);
        }
    }
}