package com.alura.marketcontrol.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alura.marketcontrol.R;

public class MarketCriarListaActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Listas";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_criar_lista);
        setTitle(TITULO_APPBAR);

        startActivity(new Intent(this, AdicionaItensActivity.class));
    }
}