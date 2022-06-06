package ita.com.mytechnicalv2;

import android.app.Activity;
import android.app.DirectAction;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.arch.core.executor.DefaultTaskExecutor;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ProfileFragment extends Fragment {

    private DatabaseReference mDatabase;
    private FirebaseAuth auth;
    private String CurrentUserId;
    private View fragmento;

    private EditText nombre, telefono, correo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmento = inflater.inflate(R.layout.fragment_profile, container, false);

        auth = FirebaseAuth.getInstance();
        CurrentUserId = auth.getCurrentUser().getUid();
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Usuario");


        nombre = (EditText) fragmento.findViewById(R.id.editTextTextPersonName);
        telefono = (EditText) fragmento.findViewById(R.id.editTextNumber);
        correo = (EditText) fragmento.findViewById(R.id.editTextTextEmailAddress);

        mDatabase.child(CurrentUserId).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){

                    String nombres = snapshot.child("Nombre").getValue().toString();
                    String telefonos = snapshot.child("Telefono").getValue().toString();
                    String correos = snapshot.child("Correo").getValue().toString();

                    Toast.makeText(getActivity(),nombres+correos,Toast.LENGTH_LONG).show();
                    nombre.setText(nombres);
                    telefono.setText(telefonos);
                    correo.setText(correos);

                }else {
                    Toast.makeText(getActivity(),"Vacio",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        return fragmento;
    }


}