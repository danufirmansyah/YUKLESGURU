package com.example.yuklesguru;


import android.content.Intent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ProfileFragment extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        FirebaseAuth mAuth;
        FirebaseUser mUser;
        TextView Nama, Alamat, Umur, Pekerjaan, Kelamin;
        ImageView Foto;
        Button Logout;
        DatabaseReference mDB;

        mDB = FirebaseDatabase.getInstance().getReference();
        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();


        Nama = view.findViewById(R.id.NamaUser);
        Alamat = view.findViewById(R.id.AlamatUser);
        Umur = view.findViewById(R.id.AlamatUser);
        Pekerjaan = view.findViewById(R.id.PekerjaanUser);
        Kelamin = view.findViewById(R.id.KelaminUser);
        Foto = view.findViewById(R.id.FotoUser);

        String NamaUserFB = mUser.getDisplayName();
        Nama.setText(NamaUserFB);

        Logout = view.findViewById(R.id.logout);
        Logout.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        mAuth.signOut();
        Intent a = new Intent(getActivity(), MainActivity.class);
        startActivity(a);
        getActivity().finish();
    }
}
