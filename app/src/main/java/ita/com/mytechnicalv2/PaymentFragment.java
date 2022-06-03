package ita.com.mytechnicalv2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;


public class PaymentFragment extends Fragment {




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private Button button_Aprobado;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_payment, container, false);

        button_Aprobado = root.findViewById(R.id.btn_cash);


        button_Aprobado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.aprobadoFragment);
                Toast.makeText(getActivity(),"Aprobado!",Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
}