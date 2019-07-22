package com.example.yuklesguru;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
<<<<<<< HEAD
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
=======
>>>>>>> f6dadc35de2c6fddc79090798ca924f2039e5120
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class register extends AppCompatActivity {

    private EditText edtEmail,edtPassword,edtusername;
    private Button btnRegister;
    private FirebaseAuth auth;
<<<<<<< HEAD
    private DatabaseReference mDB;
=======
>>>>>>> f6dadc35de2c6fddc79090798ca924f2039e5120

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView();
        registerUser();
    }

    private void registerUser() {
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //menampung imputan user
                FirebaseAuth mauth = FirebaseAuth.getInstance();
                String emailUser = edtEmail.getText().toString().trim();
                String passwordUser = edtPassword.getText().toString().trim();
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("username");

                myRef.setValue(edtusername.getText().toString());

                //validasi email dan password
                // jika email kosong
                if (emailUser.isEmpty()){
                    edtEmail.setError("Email tidak boleh kosong");
                }
                // jika email not valid
                else if (!Patterns.EMAIL_ADDRESS.matcher(emailUser).matches()){
                    edtEmail.setError("Email tidak valid");
                }
                // jika password kosong
                else if (passwordUser.isEmpty()){
                    edtPassword.setError("Password tidak boleh kosong");
                }
                //jika password kurang dari 6 karakter
                else if (passwordUser.length() < 6){
                    edtPassword.setError("Password minimal terdiri dari 6 karakter");
                }
                else {
                    //create user dengan firebase auth
                    auth.createUserWithEmailAndPassword(emailUser,passwordUser)
                            .addOnCompleteListener(register.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    //jika gagal register do something
                                    if (!task.isSuccessful()){
                                        Toast.makeText(register.this,
                                                "Register gagal karena "+ task.getException().getMessage(),
                                                Toast.LENGTH_LONG).show();
                                    }else {
                                        //jika sukses akan menuju ke login activity
<<<<<<< HEAD
                                        mDB = FirebaseDatabase.getInstance().getReference();
                                        String UID = auth.getCurrentUser().getUid();
                                        String UserName = edtusername.getText().toString().trim();
                                        String Email = edtEmail.getText().toString().trim();

                                        FirebaseUser user = auth.getCurrentUser();
                                        UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest.Builder().setDisplayName(UserName).build();
                                        user.updateProfile(userProfileChangeRequest);

                                        User USER = new User (UserName, Email, "","",0);
                                        mDB.child("users").child(UID).setValue(USER);


=======
>>>>>>> f6dadc35de2c6fddc79090798ca924f2039e5120
                                        startActivity(new Intent(register.this,MainActivity.class));
                                        finish();
                                    }
                                }
                            });
                }
            }
        });
    }

    private void initView() {
        edtusername = findViewById(R.id.username);
        edtEmail = findViewById(R.id.edt_email_register);
        edtPassword = findViewById(R.id.edt_password_register);
        btnRegister = findViewById(R.id.btn_sign_up);
        auth = FirebaseAuth.getInstance();
    }

//    public void Pindah(View view){
//        Intent intent = new Intent(register.this, MainActivity.class);
//        startActivity(intent);
//    }
//
//    public void Pindah1(View view){
//        Intent intent = new Intent(register.this, home.class);
//        startActivity(intent);
//    }

}
