package com.omaressam.forgetpasswordcomponent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;


import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class TypeMailUI extends Fragment {
    @BindView(R.id.type_mail_btn)
    Button sendCodeBtn;
    @BindView(R.id.type_mail_mail)
    EditText mail;
    @BindView(R.id.type_mail_back_textview)
    TextView back;


    @OnClick(R.id.type_mail_btn)
    public void SendCodeToMail() {
        // to send code to mail for verify it
        Navigation.findNavController(Objects.requireNonNull(getView())).navigate(R.id.action_typeMailUI_to_verifyMailUI );

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_type_mail_u_i, container, false);
        ButterKnife.bind(this , view);

        return view ;

    }
}
