package com.example.studyplanner.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studyplanner.R;

import java.util.HashSet;

public class NoteEditorActivity extends AppCompatActivity {
    Button button;

    int noteID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_editor);
        Button button = findViewById(R.id.note);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.example.studyplanner.activity.NoteEditorActivity.this, com.example.studyplanner.activity.AddnotesActivity.class);
                startActivity(i);
            }
        });

        EditText editText = (EditText)findViewById(R.id.editText);
        Intent intent = getIntent();
        noteID = intent.getIntExtra("noteID", -1);

        if(noteID != -1)
        {
            editText.setText(AddnotesActivity.notes.get(noteID));
        }

        else
        {
            AddnotesActivity.notes.add("");                // as initially, the note is empty
            noteID = AddnotesActivity.notes.size() - 1;
            AddnotesActivity.arrayAdapter.notifyDataSetChanged();
        }

        editText.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                AddnotesActivity.notes.set(noteID, String.valueOf(s));
                AddnotesActivity.arrayAdapter.notifyDataSetChanged();

                SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("com.example.studyplanner", Context.MODE_PRIVATE);
                HashSet<String> set = new HashSet<>(AddnotesActivity.notes);
                sharedPreferences.edit().putStringSet("notes", set).apply();
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });

    }
}