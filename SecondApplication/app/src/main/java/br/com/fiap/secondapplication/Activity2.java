package br.com.fiap.secondapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by rm73950 on 17/03/2016.
 */
public class Activity2 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundary);
    }

    public void fecharRetornar(View v){
        finish();
    }
}
