package pereira.lopes.julio.lista.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import pereira.lopes.julio.lista.R;

public class MainActivity extends AppCompatActivity {

    // Declara e cria a variável NEW_ITEM_REQUEST
    static int NEW_ITEM_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fabAddItem = findViewById(R.id.fabAddNewItem);
    }
}