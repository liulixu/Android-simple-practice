package com.example.erdaye.pra_fragement_lmmg;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginFragment  extends Fragment  {

    private Button btn_login ;
    private EditText login_user;
    private EditText login_password;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final  View view=inflater.inflate(R.layout.fragment_login, container, false);

        login_user= (EditText) view.findViewById(R.id.login_user);
        login_password= (EditText) view.findViewById(R.id.login_password);

        btn_login= (Button) view.findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strname=login_user.getText().toString();
                String strpas=login_password.getText().toString();


                if(strname.equals("1234")&&strpas.equals("1234")){
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    Toast.makeText(getActivity(),"Login sucssed !",Toast.LENGTH_SHORT).show();
//                    LinearLayout menu= (LinearLayout) view.findViewById(R.id.menu);
//                    menu.setVisibility(View.VISIBLE);
//                    menu.setBackgroundColor(getResources().getColor(R.color.red));
                }
            }
        });

        return view;
    }

}
