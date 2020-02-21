package com.example.bloodBowlStat;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import java.text.DecimalFormat;

import static java.lang.Integer.divideUnsigned;
import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

       GridView gridVDChiffre, gridVDCrane,gridVDChiffre2,gridVDCrane2;
       Button btn;
       TextView statPlayer1, statPlayer2, nameP1, nameP2;
       int
    icondice[] = {
            R.drawable.de1,
            R.drawable.de2,
            R.drawable.de3,
            R.drawable.de4,
            R.drawable.de5,
            R.drawable.de6,
            R.drawable.total    },
    crane[] = {
            R.drawable.de_crane,
            R.drawable.de_cranedef,
            R.drawable.des_fleche,
            R.drawable.de_def_strumble,
            R.drawable.de_defense,
            R.drawable.total,
           };

    String  numberdice[]={"0","0","0","0","0","0","0"},
            numberCrane[]= {"0","0","0","0","0","0"    },
            numberdice2[]={"0","0","0","0","0","0","0"},
            numberCrane2[]= {"0","0","0","0","0","0"    };

    int jetDP1,jetDP2,jetDc1,jetDc2;
    View view;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bloquer la rotation de l'ecran et la remise à 0
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        gridVDChiffre= findViewById(R.id.GridVDChiffre);
        gridVDCrane= findViewById(R.id.GirdVDCrane);
        gridVDChiffre2= findViewById(R.id.GridVDChiffre2);
        gridVDCrane2= findViewById(R.id.GirdVDCrane2);
        btn=findViewById(R.id.btn);
        nameP1=findViewById(R.id.eTextP1);
        nameP2=findViewById(R.id.eTextP2);
        statPlayer1=findViewById(R.id.textVeditStat1);
        statPlayer2=findViewById(R.id.textVeditStat2);


/////affichage des grille//////
        gridVDChiffre.setAdapter(new AdapterGridView(MainActivity.this, icondice,numberdice));
        gridVDCrane.setAdapter(new AdapterGridView(MainActivity.this, crane,numberCrane));
        gridVDChiffre2.setAdapter(new AdapterGridView(MainActivity.this, icondice,numberdice2));
        gridVDCrane2.setAdapter(new AdapterGridView(MainActivity.this, crane,numberCrane2));

/////JOUEUR1 /////
        //// pour chaque clique on incremente la valeur et le total
        gridVDChiffre.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                jetDP1++;
                Log.i("valeur du de 1:", "jetDP1est :"+jetDP1);
                Log.i("valeur de position:", ":"+position);
                if (position ==0){
                    numberdice[0]= String.valueOf(Integer.parseInt(numberdice[0])+1);
                    Log.i("valeur du de 1:", numberdice[0]);
                 }
                if (position ==1){
                    numberdice[1]= String.valueOf(Integer.parseInt(numberdice[1])+1);
                 }
                if (position ==2){
                    numberdice[2]= String.valueOf(Integer.parseInt(numberdice[2])+1);
                }
                if (position ==3){
                    numberdice[3]= String.valueOf(Integer.parseInt(numberdice[3])+1);
                }
                if (position ==4){
                    numberdice[4]= String.valueOf(Integer.parseInt(numberdice[4])+1);
                }
                if (position ==5){
                    numberdice[5]= String.valueOf(Integer.parseInt(numberdice[5])+1);

                } if (position ==6){
                jetDP1--;}
                numberdice[6]= String.valueOf(jetDP1);

                gridVDChiffre.setAdapter(new AdapterGridView(MainActivity.this, icondice,numberdice));
            }
        });


        gridVDCrane.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                jetDc1++;

                if (position ==0){
                    numberCrane[0]= String.valueOf(Integer.parseInt(numberCrane[0])+1);
                    Log.i("valeur du de 1:", numberCrane[0]);
                }
                if (position ==1){
                    numberCrane[1]= String.valueOf(Integer.parseInt(numberCrane[1])+1);
                }
                if (position ==2){
                    numberCrane[2]= String.valueOf(Integer.parseInt(numberCrane[2])+1);
                }
                if (position ==3){
                    numberCrane[3]= String.valueOf(Integer.parseInt(numberCrane[3])+1);
                }
                if (position ==4){
                    numberCrane[4]= String.valueOf(Integer.parseInt(numberCrane[4])+1);
                }
                if (position ==5){
                    jetDc1--;
                }

                numberCrane[5]= String.valueOf(jetDc1);

                gridVDCrane.setAdapter(new AdapterGridView(MainActivity.this, crane,numberCrane));
            }
        });

//////////Joueur2
        gridVDChiffre2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                jetDP2++;
                Log.i("valeur du de 1:", "jetDP1est :"+jetDP1);
                Log.i("valeur de position:", ":"+position);
                if (position ==0){
                    numberdice2[0]= String.valueOf(Integer.parseInt(numberdice2[0])+1);
                    Log.i("valeur du de 1:", numberdice2[0]);
                }
                if (position ==1){
                    numberdice2[1]= String.valueOf(Integer.parseInt(numberdice2[1])+1);
                }
                if (position ==2){
                    numberdice2[2]= String.valueOf(Integer.parseInt(numberdice2[2])+1);
                }
                if (position ==3){
                    numberdice2[3]= String.valueOf(Integer.parseInt(numberdice2[3])+1);
                }
                if (position ==4){
                    numberdice2[4]= String.valueOf(Integer.parseInt(numberdice2[4])+1);
                }
                if (position ==5){
                    numberdice2[5]= String.valueOf(Integer.parseInt(numberdice2[5])+1);

                }if (position ==6){
                   jetDP2--;

                }
                numberdice2[6]= String.valueOf(jetDP2);

                gridVDChiffre2.setAdapter(new AdapterGridView(MainActivity.this, icondice,numberdice2));
            }
        });


        gridVDCrane2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                jetDc2++;

                if (position ==0){
                    numberCrane2[0]= String.valueOf(Integer.parseInt(numberCrane2[0])+1);
                    Log.i("valeur du de 1:", numberCrane2[0]);
                }
                if (position ==1){
                    numberCrane2[1]= String.valueOf(Integer.parseInt(numberCrane2[1])+1);
                }
                if (position ==2){
                    numberCrane2[2]= String.valueOf(Integer.parseInt(numberCrane2[2])+1);
                }
                if (position ==3){
                    numberCrane2[3]= String.valueOf(Integer.parseInt(numberCrane2[3])+1);
                }
                if (position ==4){
                    numberCrane2[4]= String.valueOf(Integer.parseInt(numberCrane2[4])+1);
                }
                if (position ==5){
                    jetDc2--;
                }

                numberCrane2[5]= String.valueOf(jetDc2);

                gridVDCrane2.setAdapter(new AdapterGridView(MainActivity.this, crane,numberCrane2));
            }
        });

        ///////////////////////Bouton pour stat en fin de jeu//////////////////

    btn.setOnClickListener(new View.OnClickListener() {
        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public void onClick(View v) {
            DecimalFormat df= new DecimalFormat("#,#0.0");

            String statDéP1="Dé1: "+(df.format(Double.parseDouble(numberdice[0])/jetDP1*100))+
                      "% ;Dé2: "+(df.format(Double.parseDouble(numberdice[1])/jetDP1*100))+
                      "% ;Dé3: "+(df.format(Double.parseDouble(numberdice[2])/jetDP1*100))+
                      "% ;Dé4: "+(df.format(Double.parseDouble(numberdice[3])/jetDP1*100))+
                      "% ;Dé5: "+(df.format(Double.parseDouble(numberdice[4])/jetDP1*100))+
                      "% ;Dé6: "+(df.format(Double.parseDouble(numberdice[5])/jetDP1*100))+ "%";
            String statDc1= "dé crane:"+ (df.format(Double.parseDouble(numberCrane[0])/jetDc1*100))+
                    "% crane pow:"+ (df.format(Double.parseDouble(numberCrane[1])/jetDc1*100))+
                    "% push:"+ (df.format(Double.parseDouble(numberCrane[2])/jetDc1*100))+
                    "% pow/esquive:"+ (df.format(Double.parseDouble(numberCrane[3])/jetDc1*100))+
                    "% pow :"+ (df.format(Double.parseDouble(numberCrane[4])/jetDc1*100))+"%";

            statPlayer1.setText(nameP1.getText()+":" +statDéP1 + statDc1);

            String statDéP2="Dé1: "+(df.format(Double.parseDouble(numberdice2[0])/jetDP2*100))+
                    "% ;Dé2: "+(df.format(Double.parseDouble(numberdice2[1])/jetDP2*100))+
                    "% ;Dé3: "+(df.format(Double.parseDouble(numberdice2[2])/jetDP2*100))+
                    "% ;Dé4: "+(df.format(Double.parseDouble(numberdice2[3])/jetDP2*100))+
                    "% ;Dé5: "+(df.format(Double.parseDouble(numberdice2[4])/jetDP2*100))+
                    "% ;Dé6: "+(df.format(Double.parseDouble(numberdice2[5])/jetDP2*100))+ "%";
            String statDc2= "dé crane:"+(df.format(Double.parseDouble(numberCrane2[0])/jetDc2*100))+
                    "% crane pow:"+ (df.format(Double.parseDouble(numberCrane2[1])/jetDc2*100))+
                    "% push:"+ (df.format(Double.parseDouble(numberCrane2[2])/jetDc2*100))+
                    "% pow/esquive:"+(df.format(Double.parseDouble(numberCrane2[3])/jetDc2*100))+
                    "% pow :"+ (df.format(Double.parseDouble(numberCrane2[4])/jetDc2*100))+"%";

            statPlayer2.setText(nameP2.getText()+":" +statDéP2 + statDc2);
        }
    });



    }
}