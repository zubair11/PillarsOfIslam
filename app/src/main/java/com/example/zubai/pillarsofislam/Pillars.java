package com.example.zubai.pillarsofislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pillars extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pillars);
    }
//https://www.youtube.com/watch?v=GZELHv91juw    Tutorial about Rotation
public void toHajj(View view)
{
    i=new Intent(this,Hajj.class);
    startActivity(i);
}
Intent i;
    public void toRoza(View view)
    {


        i=new Intent(this,Roza.class);
        startActivity(i);
    }

    public void toNamaz(View view)
    {


        i=new Intent(this,Namaz.class);
        startActivity(i);

    }

    public void toZakat(View view)
    {
        i=new Intent(this,Zakat.class);
        startActivity(i);


    }

}
