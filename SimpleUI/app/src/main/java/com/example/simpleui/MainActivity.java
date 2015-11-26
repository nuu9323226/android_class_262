package com.example.simpleui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.TooManyListenersException;

public class MainActivity extends AppCompatActivity {
    private EditText inputText;
    //private View view;
    private CheckBox hideCheckBox;
=======

public class MainActivity extends AppCompatActivity {
>>>>>>> origin/master

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        inputText = (EditText)findViewById(R.id.editText);
        inputText.setText("1234");
        inputText.setOnKeyListener(new View.OnKeyListener() {
                                       public boolean onKey(View v, int KeyCode, KeyEvent event) {
                                           if (event.getAction() == KeyEvent.ACTION_DOWN) {
                                               if (KeyCode == KeyEvent.KEYCODE_ENTER) {
                                                   submit(v);
                                                   return true;
                                               }
                                           }
                                           return false;
                                       }
                                   });
        hideCheckBox = (CheckBox) findViewById(R.id.hideCheckBox);
       // hideCheckBox.setChecked(true);
    }
    public void submit(View view){
        //this.view = view;
        String text = inputText.getText().toString();
        if(hideCheckBox.isChecked()){
            text = "**********";
            inputText.setText("***********");
        }

        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }



}
=======
    }
}
>>>>>>> origin/master
