package com.example.estudiante.patronobserver;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;

public class DialogoColor extends AppCompatDialogFragment  {

    // Observable
    //2. Crear objeto com variable global
    Milistener listener;

    //1. Crear interface
    interface Milistener{

        void onChangeColor(String color);

    }
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {



        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("cambiar color");
        builder.setMessage("seleccione un color");
        builder.setPositiveButton("blanco", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onChangeColor("blanco");
            }
        });
        builder.setNeutralButton("azul", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onChangeColor("azul");
            }
        });
        builder.setNegativeButton("negro", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onChangeColor("negro");
            }
        });
        return builder.create();
    }

    //3. Metodo set para el listener

    public void setListener(Milistener listener){
        this.listener = listener;
    }
}
