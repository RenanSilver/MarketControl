package com.alura.marketcontrol.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.alura.marketcontrol.R;
import com.alura.marketcontrol.dao.ItemDAO;
import com.alura.marketcontrol.model.Item;

public class FormularioItemActivity extends AppCompatActivity {

    private EditText campoItem;
    private EditText campoQuantidade;
    private final ItemDAO dao = new ItemDAO();
    private Item item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_item);

        inicializacaoDosCampos();

        Button adicionaItem = findViewById(R.id.formulario_item_adiciona_item_botao);
        adicionaItem.setOnClickListener(view -> {vaiParaAdicionaItensActivity();});
    }

    private void vaiParaAdicionaItensActivity() {
        startActivity(new Intent(this, AdicionaItensActivity.class));
        //preencheItem();
    }


    private void preencheItem() {
        String produto = campoItem.getText().toString();
        String quantidade = campoQuantidade.getText().toString();

        item.setItem(produto);
        item.setQuantidade(quantidade);
    }

    private void inicializacaoDosCampos() {
        campoItem = findViewById(R.id.formulario_item_nome_produto);
        campoQuantidade = findViewById(R.id.formulario_item_quantidade_produto);
    }
}