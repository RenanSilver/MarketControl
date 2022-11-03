package com.alura.marketcontrol.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.alura.marketcontrol.R;

public class AdicionaItensActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Adicionar itens";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adiciona_itens);
        setTitle(TITULO_APPBAR);

        Button botaoAdicionar = findViewById(R.id.adiciona_itens_botao_adicionar);
        botaoAdicionar.setOnClickListener(view -> {abreFormularioItemActivity();});
    }

    private void abreFormularioItemActivity() {
        startActivity(new Intent(this, FormularioItemActivity.class));
    }
}