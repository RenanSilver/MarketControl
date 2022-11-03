package com.alura.marketcontrol.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alura.marketcontrol.R;

public class AdicionaItensActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Adicionar itens";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adiciona_itens);
        setTitle(TITULO_APPBAR);
    }
}