package com.loop.chittaiahmekaladhanusreecricketacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Next extends AppCompatActivity {
    ViewFlipper vf;
    ImageButton imgb1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        vf=findViewById(R.id.vf);
        imgb1=findViewById(R.id.imgb1);
        b1=findViewById(R.id.b1);
        imgb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/maps/place/DhanuSree+Cricket+Academy/@17.3737045,78.5462079,17z/data=!3m1!4b1!4m5!3m4!1s0x3bcb990b3ec9a8e3:0x4dab85d701d78384!8m2!3d17.3737045!4d78.5483966"));
                startActivity(intent);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(Next.this,Contact.class);
                startActivity(i2);
            }
        });
        int images[]={
                R.drawable.im1,R.drawable.im2,R.drawable.im3,R.drawable.im4,R.drawable.im5,R.drawable.im6,R.drawable.im7,
                R.drawable.im8,R.drawable.im9,R.drawable.im10,R.drawable.im11,R.drawable.im12

        };
        for(int image:images){
            flipperimages(image);}

    }
    public void flipperimages(int image){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);
        vf.addView(imageView);
        vf.setFlipInterval(2000);
        vf.setAutoStart(true);
        vf.setInAnimation(this,android.R.anim.slide_out_right);
        vf.setOutAnimation(this,android.R.anim.slide_in_left);

    }
}
