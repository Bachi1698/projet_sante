package com.example.e_sante;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button connexion_medecin;
    public int verifRole;
    Button inscription_medecin;
    Button connexion_intervenant;
    Button inscription_intervenant;
    Button connexion_patient;
    Button inscription_patient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  connexion_medecin = findViewById(R.id.connexionMedecin);
        inscription_medecin = findViewById(R.id.inscriptionMedecin);
        connexion_intervenant = findViewById(R.id.connexionIntervenant);
        inscription_intervenant = findViewById(R.id.inscriptionIntervenant);
        connexion_patient = findViewById(R.id.connexionPatient);
        inscription_patient = findViewById(R.id.inscriptionPatient);

        connexion_medecin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickDialogue();
            }
        });*/
        connexion_medecin = findViewById(R.id.connexionMedecin);
        connexion_medecin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickDialogue();
                verifRole = 1;
            }
        });

    }
    public void clickDialogue() {
        FragmentManager paypal = getSupportFragmentManager();
        ConnexionFragment connexionFragment = ConnexionFragment.newInstance("Titre");
        connexionFragment.show(paypal,"connexion");
    };

}