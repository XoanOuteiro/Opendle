package com.example.opendle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;

public class Activity_Juego extends AppCompatActivity {

    /*

        --Linea 1

     */
    private LinearLayout div_l1;
    private EditText celda_11;
    private EditText celda_12;
    private EditText celda_13;
    private EditText celda_14;
    private EditText celda_15;
    private EditText[] l1;

    /*

    --Linea 2

 */
    private LinearLayout div_l2;
    private EditText celda_21;
    private EditText celda_22;
    private EditText celda_23;
    private EditText celda_24;
    private EditText celda_25;
    private EditText[] l2;

    /*

    --Linea 3

 */
    private LinearLayout div_l3;
    private EditText celda_31;
    private EditText celda_32;
    private EditText celda_33;
    private EditText celda_34;
    private EditText celda_35;
    private EditText[] l3;

    /*

    --Linea 4

 */
    private LinearLayout div_l4;
    private EditText celda_41;
    private EditText celda_42;
    private EditText celda_43;
    private EditText celda_44;
    private EditText celda_45;
    private EditText[] l4;

    /*

    --Linea 5

 */
    private LinearLayout div_l5;
    private EditText celda_51;
    private EditText celda_52;
    private EditText celda_53;
    private EditText celda_54;
    private EditText celda_55;
    private EditText[] l5;

    /*

    --Linea 1

 */
    private LinearLayout div_l6;
    private EditText celda_61;
    private EditText celda_62;
    private EditText celda_63;
    private EditText celda_64;
    private EditText celda_65;
    private EditText[] l6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        this.assignments();
    }

    private void assignments(){

        this.l1_assign();
        this.l2_assign();
        this.l3_assign();
        this.l4_assign();
        this.l5_assign();
        this.l6_assign();

    }

    private void l1_assign(){

        this.div_l1 = findViewById(R.id.firstLine);
        this.celda_11 = findViewById(R.id.celda_11);
        this.celda_12 = findViewById(R.id.celda_12);
        this.celda_13 = findViewById(R.id.celda_13);
        this.celda_14 = findViewById(R.id.celda_14);
        this.celda_15 = findViewById(R.id.celda_15);
        this.l1 = new EditText[]{celda_11, celda_12, celda_13, celda_14, celda_15};
    }

    private void l2_assign(){

        this.div_l2 = findViewById(R.id.secondLine);
        this.celda_21 = findViewById(R.id.celda_21);
        this.celda_22 = findViewById(R.id.celda_22);
        this.celda_23 = findViewById(R.id.celda_23);
        this.celda_24 = findViewById(R.id.celda_24);
        this.celda_25 = findViewById(R.id.celda_25);
        this.l2 = new EditText[]{celda_21, celda_22, celda_23, celda_24, celda_25};
    }

    private void l3_assign(){

        this.div_l3 = findViewById(R.id.thirdLine);
        this.celda_31 = findViewById(R.id.celda_31);
        this.celda_32 = findViewById(R.id.celda_32);
        this.celda_33 = findViewById(R.id.celda_33);
        this.celda_34 = findViewById(R.id.celda_34);
        this.celda_35 = findViewById(R.id.celda_35);
        this.l3 = new EditText[]{celda_31, celda_32, celda_33, celda_34, celda_35};
    }

    private void l4_assign(){

        this.div_l4 = findViewById(R.id.fourthLine);
        this.celda_41 = findViewById(R.id.celda_41);
        this.celda_42 = findViewById(R.id.celda_42);
        this.celda_43 = findViewById(R.id.celda_43);
        this.celda_44 = findViewById(R.id.celda_44);
        this.celda_45 = findViewById(R.id.celda_45);
        this.l4 = new EditText[]{celda_41, celda_42, celda_43, celda_44, celda_45};
    }

    private void l5_assign(){

        this.div_l5 = findViewById(R.id.fifthLine);
        this.celda_51 = findViewById(R.id.celda_51);
        this.celda_52 = findViewById(R.id.celda_52);
        this.celda_53 = findViewById(R.id.celda_53);
        this.celda_54 = findViewById(R.id.celda_54);
        this.celda_55 = findViewById(R.id.celda_55);
        this.l5 = new EditText[]{celda_51, celda_52, celda_53, celda_54, celda_55};

    }

    private void l6_assign(){

        this.div_l6 = findViewById(R.id.sixthLine);
        this.celda_61 = findViewById(R.id.celda_61);
        this.celda_62 = findViewById(R.id.celda_62);
        this.celda_63 = findViewById(R.id.celda_63);
        this.celda_64 = findViewById(R.id.celda_64);
        this.celda_65 = findViewById(R.id.celda_65);
        this.l6 = new EditText[]{celda_61, celda_62, celda_63, celda_64, celda_65};

    }
}