package com.example.edittext;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rnd =new Random();
    TextView tx1,tx2,tx3,tx4,tx5,tx6;
    int fnum, snum,num,score;
    EditText etn1, etn2, etn3;
    ImageView image1,image2,image3;
    String str;
    Button btn,btn2,btn3,newgame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx1 = (TextView) findViewById(R.id.textView);
        tx2 = (TextView) findViewById(R.id.textView2);
        tx3 = (TextView) findViewById(R.id.textView3);
        tx4 = (TextView) findViewById(R.id.textView4);
        tx5 = (TextView) findViewById(R.id.textView5);
        tx6 = (TextView) findViewById(R.id.textView6);
        etn1 = (EditText) findViewById(R.id.etn);
        etn2 = (EditText) findViewById(R.id.etn2);
        etn3 = (EditText) findViewById(R.id.etn3);
        image1 = (ImageView) findViewById(R.id.imageView);
        image2 = (ImageView) findViewById(R.id.imageView2);
        image3 = (ImageView) findViewById(R.id.imageView3);
        btn =   (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setVisibility(1);
        btn3 = (Button) findViewById(R.id.button3);
        btn3.setVisibility(1);
        newgame = (Button) findViewById(R.id.newgame);
        fnum = rnd.nextInt(89)+10;
        snum = rnd.nextInt(89)+10;
        tx1.setText(""+fnum);
        tx2.setText(""+snum);
    }

    public void firstbutton(View view) {
        str = (etn1.getText().toString());
        num = Integer.parseInt(str);
        if (num == fnum+snum){
            image1.setImageResource(R.drawable.greenv);
            score ++;
        }
        else{
            image1.setImageResource(R.drawable.redx);
        }
        fnum += snum;
        tx3.setText(""+fnum);
        snum = rnd.nextInt(89)+10;
        tx4.setText(""+snum);
    }

    public void secbutton(View view) {
        str = (etn2.getText().toString());
        num = Integer.parseInt(str);
        if (num == fnum+snum){
            image2.setImageResource(R.drawable.greenv);
            score ++;
        }
        else{
            image2.setImageResource(R.drawable.redx);
        }
        fnum += snum;
        tx5.setText(""+fnum);
        snum = rnd.nextInt(89)+10;
        tx6.setText(""+snum);
    }

    public void thrdgo(View view) {
        str = (etn3.getText().toString());
        num = Integer.parseInt(str);
        if (num == fnum+snum){
            image3.setImageResource(R.drawable.greenv);
            score ++;
        }
        else{
            image3.setImageResource(R.drawable.redx);
            }
        if(score != 0)
            Toast.makeText(this, score+"/3, "+ 100/score + " %", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, score+"/3, "+ score + " %", Toast.LENGTH_SHORT).show();

    }
    public void newgame(View view) {
        tx3.setText("");
        tx4.setText("");
        tx5.setText("");
        tx6.setText("");
        etn1.setText("");
        etn2.setText("");
        etn3.setText("");
        image1.setImageResource(0);
        image2.setImageResource(0);
        image3.setImageResource(0);
        fnum = rnd.nextInt(89)+10;
        snum = rnd.nextInt(89)+10;
        tx1.setText(""+fnum);
        tx2.setText(""+snum);
    }
}