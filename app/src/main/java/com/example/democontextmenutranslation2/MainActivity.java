package com.example.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;
    String wordClicked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText = findViewById(R.id.textViewTranslatedText);
        registerForContextMenu(tvTranslatedText);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_main, menu);


    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();
            if (id == R.id.EnglishSelection) {
                // code for action
                tvTranslatedText.setText("Hello");
                return true;
            } else if (id == R.id.italianSelection) {
                // code for action
                tvTranslatedText.setText("Ciao");
                return true;
            }


        return super.onContextItemSelected(item);
    }


}