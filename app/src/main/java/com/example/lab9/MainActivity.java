package com.example.lab9;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view=findViewById(R.id.mylaout1);
        registerForContextMenu(view);
    }

    /*@Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater m=getMenuInflater();
        m.inflate(R.menu.mymenu1,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.home:
                Toast.makeText(this,"Home is selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.about:
                Toast.makeText(this,"About is selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.help:
                Toast.makeText(this,"Help is selected",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.mymenu1,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.home:
                Toast.makeText(this,"Home is selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.about:
                Toast.makeText(this,"About is selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.help:
                Toast.makeText(this,"Help is selected",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.mymenu1,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent i;
        Uri u;
        switch(item.getItemId()){
            case R.id.cm:
                i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(i);
                break;
            case R.id.call:
                u= Uri.parse("tel:7992632090");
                i=new Intent(Intent.ACTION_VIEW,u);
                startActivity(i);
                break;
            case R.id.mp:
                u= Uri.parse("geo:?q=bankura");
                i=new Intent(Intent.ACTION_VIEW,u);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
