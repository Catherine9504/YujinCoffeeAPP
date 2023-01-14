package tw.mymis.yujincoffeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import tw.mymis.yujincoffeeapp.R;
import tw.mymis.yujincoffeeapp.databinding.ActivityEnrollBinding;

public class EnrollActivity extends AppCompatActivity {

    ActivityEnrollBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityEnrollBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        binding.confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}