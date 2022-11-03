package com.alura.marketcontrol.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.alura.marketcontrol.R;

public class FormularioItemActivity extends AppCompatActivity {

    private EditText campoItem;
    private EditText campoQuantidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_item);

        inicializacaoDosCampos();
    }

    private void inicializacaoDosCampos() {
        campoItem = findViewById(R.id.formulario_item_nome_produto);
        campoQuantidade = findViewById(R.id.formulario_item_quantidade_produto);
    }
}