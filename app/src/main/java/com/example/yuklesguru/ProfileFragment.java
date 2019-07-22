package com.example.yuklesguru;

<<<<<<< HEAD
import android.content.Intent;
=======
>>>>>>> f6dadc35de2c6fddc79090798ca924f2039e5120
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
<<<<<<< HEAD
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
=======
>>>>>>> f6dadc35de2c6fddc79090798ca924f2039e5120

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

<<<<<<< HEAD
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ProfileFragment extends Fragment implements View.OnClickListener {
=======
public class ProfileFragment extends Fragment {
>>>>>>> f6dadc35de2c6fddc79090798ca924f2039e5120
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
<<<<<<< HEAD

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
=======
        return view;
    }
>>>>>>> f6dadc35de2c6fddc79090798ca924f2039e5120
}
