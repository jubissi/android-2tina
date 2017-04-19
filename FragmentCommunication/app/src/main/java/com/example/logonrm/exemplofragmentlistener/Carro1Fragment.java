package com.example.logonrm.exemplofragmentlistener;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by logonrm on 05/04/2017.
 */

public class Carro1Fragment extends Fragment {

    Carro1Listener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View layout =  inflater.inflate(R.layout.fragment_carro1, container, false);

        if ( listener != null ) {
            listener.avisarUsuario("Fragment foi criado na tela");
        }

        return layout;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Activity activity = (Activity) context;
        if ( ! (activity instanceof Carro1Listener) ) {
            // Exibe alguma coisa informando o programador
            return;
        }

        listener = (Carro1Listener) activity;
    }
}
