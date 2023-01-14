package tw.mymis.yujincoffeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import tw.mymis.yujincoffeeapp.databinding.ActivityMemberLoginBinding;

public class MemberLogin extends AppCompatActivity {

    ActivityMemberLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMemberLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnenroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        binding.btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}