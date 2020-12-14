package com.example.lorum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FourthRound extends AppCompatActivity {
    TextView tvSumPlayer1,tvSumPlayer2,tvSumPlayer3,tvSumPlayer4;
    TextView tvPlayer1,tvPlayer2,tvPlayer3,tvPlayer4;
    TextView tvSlagalicaPlayer1,tvSlagalicaPlayer2,tvSlagalicaPlayer3,tvSlagalicaPlayer4;
    EditText etCKPlayer1,etDamePlayer1,etCrvenePlayer1,etStihoviPlayer1;
    EditText etCKPlayer2,etDamePlayer2,etCrvenePlayer2,etStihoviPlayer2;
    EditText etCKPlayer3,etDamePlayer3,etCrvenePlayer3,etStihoviPlayer3;
    EditText etCKPlayer4,etDamePlayer4,etCrvenePlayer4,etStihoviPlayer4;

    TextView tvSumPlayer1ThirdRound,tvSumPlayer2ThirdRound,tvSumPlayer3ThirdRound,tvSumPlayer4ThirdRound;

    public Integer getTvSumPlayer1ThirdRound = ThirdRound.getTvSumPlayer1ThirdRound;
    public Integer getTvSumPlayer2ThirdRound = ThirdRound.getTvSumPlayer2ThirdRound;
    public Integer getTvSumPlayer3ThirdRound = ThirdRound.getTvSumPlayer3ThirdRound;
    public Integer getTvSumPlayer4ThirdRound = ThirdRound.getTvSumPlayer4ThirdRound;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_round);

        setupUI();
        setPlayers();
        setTextWatcher();


    }

    private void setPlayers() {


    }


    private void setupUI() {
        tvSumPlayer1 = findViewById(R.id.TVSumPlayer1);
        tvSumPlayer2 = findViewById(R.id.TVSumPlayer2);
        tvSumPlayer3 = findViewById(R.id.TVSumPlayer3);
        tvSumPlayer4 = findViewById(R.id.TVSumPlayer4);

        tvPlayer1 = findViewById(R.id.tvPlayer1);
        tvPlayer2 = findViewById(R.id.tvPlayer2);
        tvPlayer3 = findViewById(R.id.tvPlayer3);
        tvPlayer4 = findViewById(R.id.tvPlayer4);

        tvSlagalicaPlayer1 = findViewById(R.id.TVSlagalicaPlayer1);
        etCKPlayer1 = findViewById(R.id.ETCKPlayer1);
        etCrvenePlayer1 = findViewById(R.id.ETCrvenePlayer1);
        etDamePlayer1 = findViewById(R.id.ETDamePlayer1);
        etStihoviPlayer1 = findViewById(R.id.ETStihoviPlayer1);

        tvSlagalicaPlayer2 = findViewById(R.id.TVSlagalicaPlayer2);
        etCKPlayer2 = findViewById(R.id.ETCKPlayer2);
        etCrvenePlayer2 = findViewById(R.id.ETCrvenePlayer2);
        etDamePlayer2 = findViewById(R.id.ETDamePlayer2);
        etStihoviPlayer2 = findViewById(R.id.ETStihoviPlayer2);

        tvSlagalicaPlayer3 = findViewById(R.id.TVSlagalicaPlayer3);
        etCKPlayer3 = findViewById(R.id.ETCKPlayer3);
        etCrvenePlayer3 = findViewById(R.id.ETCrvenePlayer3);
        etDamePlayer3 = findViewById(R.id.ETDamePlayer3);
        etStihoviPlayer3 = findViewById(R.id.ETStihoviPlayer3);

        tvSlagalicaPlayer4 = findViewById(R.id.TVSlagalicaPlayer4);
        etCKPlayer4 = findViewById(R.id.ETCKPlayer4);
        etCrvenePlayer4 = findViewById(R.id.ETCrvenePlayer4);
        etDamePlayer4 = findViewById(R.id.ETDamePlayer4);
        etStihoviPlayer4 = findViewById(R.id.ETStihoviPlayer4);

        tvSumPlayer1ThirdRound = findViewById(R.id.TVSumPlayer1SecoundRound);
        tvSumPlayer2ThirdRound = findViewById(R.id.TVSumPlayer2SecoundRound);
        tvSumPlayer3ThirdRound = findViewById(R.id.TVSumPlayer3SecoundRound);
        tvSumPlayer4ThirdRound = findViewById(R.id.TVSumPlayer4SecoundRound);





    }

    private void setTextWatcher() {
        etStihoviPlayer1.addTextChangedListener(sum1TextWatcher);
        etCrvenePlayer1.addTextChangedListener(sum1TextWatcher);
        etDamePlayer1.addTextChangedListener(sum1TextWatcher);
        etCKPlayer1.addTextChangedListener(sum1TextWatcher);
        tvSlagalicaPlayer1.addTextChangedListener(sum1TextWatcher);

        etStihoviPlayer2.addTextChangedListener(sum2TextWatcher);
        etCrvenePlayer2.addTextChangedListener(sum2TextWatcher);
        etDamePlayer2.addTextChangedListener(sum2TextWatcher);
        etCKPlayer2.addTextChangedListener(sum2TextWatcher);
        tvSlagalicaPlayer2.addTextChangedListener(sum2TextWatcher);

        etStihoviPlayer3.addTextChangedListener(sum3TextWatcher);
        etCrvenePlayer3.addTextChangedListener(sum3TextWatcher);
        etDamePlayer3.addTextChangedListener(sum3TextWatcher);
        etCKPlayer3.addTextChangedListener(sum3TextWatcher);
        tvSlagalicaPlayer3.addTextChangedListener(sum3TextWatcher);

        etStihoviPlayer4.addTextChangedListener(sum4TextWatcher);
        etCrvenePlayer4.addTextChangedListener(sum4TextWatcher);
        etDamePlayer4.addTextChangedListener(sum4TextWatcher);
        etCKPlayer4.addTextChangedListener(sum4TextWatcher);
        tvSlagalicaPlayer4.addTextChangedListener(sum4TextWatcher);
    }

    private TextWatcher sum1TextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            if (!etStihoviPlayer1.getText().equals("") && !etCrvenePlayer1.getText().toString().equals("")
                    && !etDamePlayer1.getText().toString().equals("") && !etCKPlayer1.getText().toString().equals("") && !tvSlagalicaPlayer1.getText().toString().equals("")
            ) {
                int tempStihovi1 = Integer.parseInt(etStihoviPlayer1.getText().toString());
                int tempCrvene1 = Integer.parseInt(etCrvenePlayer1.getText().toString());
                int tempDame1 = Integer.parseInt(etDamePlayer1.getText().toString());
                int tempCK1 = Integer.parseInt(etCKPlayer1.getText().toString());
                int tempSlagalica1 = Integer.parseInt(tvSlagalicaPlayer1.getText().toString());
                tvSumPlayer1.setText(String.valueOf(tempStihovi1 + tempCrvene1 + tempDame1 + tempCK1 + tempSlagalica1));
                //whole sum from first round
                int tempSum1 = Integer.parseInt(tvSumPlayer1.getText().toString());
                tvSumPlayer1ThirdRound.setText(String.valueOf(tempSum1 + getTvSumPlayer1ThirdRound ));

            }

            else if (!etStihoviPlayer1.getText().equals("") && !etCrvenePlayer1.getText().toString().equals("")
                    && !etDamePlayer1.getText().toString().equals("") && !etCKPlayer1.getText().toString().equals("")
            ) {
                int tempStihovi1 = Integer.parseInt(etStihoviPlayer1.getText().toString());
                int tempCrvene1 = Integer.parseInt(etCrvenePlayer1.getText().toString());
                int tempDame1 = Integer.parseInt(etDamePlayer1.getText().toString());
                int tempCK1 = Integer.parseInt(etCKPlayer1.getText().toString());
                //int tempSlagalica1 = Integer.parseInt(tvSlagalicaPlayer1.getText().toString());
                tvSumPlayer1.setText(String.valueOf(tempStihovi1 + tempCrvene1 + tempDame1 + tempCK1));
                int tempSum1 = Integer.parseInt(tvSumPlayer1.getText().toString());
                tvSumPlayer1ThirdRound.setText(String.valueOf(tempSum1 + getTvSumPlayer1ThirdRound ));
            } else if (!etStihoviPlayer1.getText().equals("") && !etCrvenePlayer1.getText().toString().equals("")
                    && !etDamePlayer1.getText().toString().equals("")) {
                int tempStihovi1 = Integer.parseInt(etStihoviPlayer1.getText().toString());
                int tempCrvene1 = Integer.parseInt(etCrvenePlayer1.getText().toString());
                int tempDame1 = Integer.parseInt(etDamePlayer1.getText().toString());

                tvSumPlayer1.setText(String.valueOf(tempStihovi1 + tempCrvene1 + tempDame1));
                int tempSum1 = Integer.parseInt(tvSumPlayer1.getText().toString());
                tvSumPlayer1ThirdRound.setText(String.valueOf(tempSum1 + getTvSumPlayer1ThirdRound ));
            } else if (!etStihoviPlayer1.getText().equals("") && !etCrvenePlayer1.getText().toString().equals("")) {
                int tempStihovi1 = Integer.parseInt(etStihoviPlayer1.getText().toString());
                int tempCrvene1 = Integer.parseInt(etCrvenePlayer1.getText().toString());
                tvSumPlayer1.setText(String.valueOf(tempStihovi1 + tempCrvene1));

                int tempSum1 = Integer.parseInt(tvSumPlayer1.getText().toString());
                tvSumPlayer1ThirdRound.setText(String.valueOf(tempSum1 + getTvSumPlayer1ThirdRound ));

            } else if (!etStihoviPlayer1.getText().equals("")) {
                int tempStihovi1 = Integer.parseInt(etStihoviPlayer1.getText().toString());



                tvSumPlayer1.setText(String.valueOf(tempStihovi1));
                int tempSum1 = Integer.parseInt(tvSumPlayer1.getText().toString());
                tvSumPlayer1ThirdRound.setText(String.valueOf(tempSum1 + getTvSumPlayer1ThirdRound ));

            }


            if(etCrvenePlayer1.getText().toString().length() == 0){
                etCrvenePlayer1.setText("0");
            }
            if(etDamePlayer1.getText().toString().length() == 0){
                etDamePlayer1.setText("0");
            }
            if(etCKPlayer1.getText().toString().length() == 0){
                etCKPlayer1.setText("0");
            }



        }





        @Override
        public void afterTextChanged(Editable s) {

        }};

    private TextWatcher sum2TextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {


        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            if (!etStihoviPlayer2.getText().equals("") && !etCrvenePlayer2.getText().toString().equals("")
                    && !etDamePlayer2.getText().toString().equals("") && !etCKPlayer2.getText().toString().equals("") && !tvSlagalicaPlayer2.getText().toString().equals("")
            ) {
                int tempStihovi2 = Integer.parseInt(etStihoviPlayer2.getText().toString());
                int tempCrvene2 = Integer.parseInt(etCrvenePlayer2.getText().toString());
                int tempDame2 = Integer.parseInt(etDamePlayer2.getText().toString());
                int tempCK2 = Integer.parseInt(etCKPlayer2.getText().toString());
                int tempSlagalica2 = Integer.parseInt(tvSlagalicaPlayer2.getText().toString());
                tvSumPlayer2.setText(String.valueOf(tempStihovi2 + tempCrvene2 + tempDame2 + tempCK2 + tempSlagalica2));

                int tempSum2 = Integer.parseInt(tvSumPlayer2.getText().toString());
                tvSumPlayer2ThirdRound.setText(String.valueOf(tempSum2 + getTvSumPlayer2ThirdRound ));
            } else if (!etStihoviPlayer2.getText().equals("") && !etCrvenePlayer2.getText().toString().equals("")
                    && !etDamePlayer2.getText().toString().equals("") && !etCKPlayer2.getText().toString().equals("")
            ) {
                int tempStihovi2 = Integer.parseInt(etStihoviPlayer2.getText().toString());
                int tempCrvene2 = Integer.parseInt(etCrvenePlayer2.getText().toString());
                int tempDame2 = Integer.parseInt(etDamePlayer2.getText().toString());
                int tempCK2 = Integer.parseInt(etCKPlayer2.getText().toString());
                //int tempSlagalica2 = Integer.parseInt(tvSlagalicaPlayer2.getText().toString());
                tvSumPlayer2.setText(String.valueOf(tempStihovi2 + tempCrvene2 + tempDame2 + tempCK2));

                int tempSum2 = Integer.parseInt(tvSumPlayer2.getText().toString());
                tvSumPlayer2ThirdRound.setText(String.valueOf(tempSum2 + getTvSumPlayer2ThirdRound ));
            } else if (!etStihoviPlayer2.getText().equals("") && !etCrvenePlayer2.getText().toString().equals("")
                    && !etDamePlayer2.getText().toString().equals("")) {
                int tempStihovi2 = Integer.parseInt(etStihoviPlayer2.getText().toString());
                int tempCrvene2 = Integer.parseInt(etCrvenePlayer2.getText().toString());
                int tempDame2 = Integer.parseInt(etDamePlayer2.getText().toString());

                tvSumPlayer2.setText(String.valueOf(tempStihovi2 + tempCrvene2 + tempDame2));

                int tempSum2 = Integer.parseInt(tvSumPlayer2.getText().toString());
                tvSumPlayer2ThirdRound.setText(String.valueOf(tempSum2 + getTvSumPlayer2ThirdRound ));
            } else if (!etStihoviPlayer2.getText().equals("") && !etCrvenePlayer2.getText().toString().equals("")) {
                int tempStihovi2 = Integer.parseInt(etStihoviPlayer2.getText().toString());
                int tempCrvene2 = Integer.parseInt(etCrvenePlayer2.getText().toString());
                tvSumPlayer2.setText(String.valueOf(tempStihovi2 + tempCrvene2));

                int tempSum2 = Integer.parseInt(tvSumPlayer2.getText().toString());
                tvSumPlayer2ThirdRound.setText(String.valueOf(tempSum2 + getTvSumPlayer2ThirdRound ));
            } else if (!etStihoviPlayer2.getText().equals("")) {
                int tempStihovi2 = Integer.parseInt(etStihoviPlayer2.getText().toString());


                tvSumPlayer2.setText(String.valueOf(tempStihovi2));

                int tempSum2 = Integer.parseInt(tvSumPlayer2.getText().toString());
                tvSumPlayer2ThirdRound.setText(String.valueOf(tempSum2 + getTvSumPlayer2ThirdRound ));
            }


            if (etCrvenePlayer2.getText().toString().length() == 0) {
                etCrvenePlayer2.setText("0");
            }
            if (etDamePlayer2.getText().toString().length() == 0) {
                etDamePlayer2.setText("0");
            }
            if (etCKPlayer2.getText().toString().length() == 0) {
                etCKPlayer2.setText("0");
            }


        }



        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher sum3TextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {


        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            if (!etStihoviPlayer3.getText().equals("") && !etCrvenePlayer3.getText().toString().equals("")
                    && !etDamePlayer3.getText().toString().equals("") && !etCKPlayer3.getText().toString().equals("") && !tvSlagalicaPlayer3.getText().toString().equals("")
            ) {
                int tempStihovi3 = Integer.parseInt(etStihoviPlayer3.getText().toString());
                int tempCrvene3 = Integer.parseInt(etCrvenePlayer3.getText().toString());
                int tempDame3 = Integer.parseInt(etDamePlayer3.getText().toString());
                int tempCK3 = Integer.parseInt(etCKPlayer3.getText().toString());
                int tempSlagalica3 = Integer.parseInt(tvSlagalicaPlayer3.getText().toString());
                tvSumPlayer3.setText(String.valueOf(tempStihovi3 + tempCrvene3 + tempDame3 + tempCK3 + tempSlagalica3));

                int tempSum3 = Integer.parseInt(tvSumPlayer3.getText().toString());
                tvSumPlayer3ThirdRound.setText(String.valueOf(tempSum3 + getTvSumPlayer3ThirdRound ));
            } else if (!etStihoviPlayer3.getText().equals("") && !etCrvenePlayer3.getText().toString().equals("")
                    && !etDamePlayer3.getText().toString().equals("") && !etCKPlayer3.getText().toString().equals("")
            ) {
                int tempStihovi3 = Integer.parseInt(etStihoviPlayer3.getText().toString());
                int tempCrvene3 = Integer.parseInt(etCrvenePlayer3.getText().toString());
                int tempDame3 = Integer.parseInt(etDamePlayer3.getText().toString());
                int tempCK3 = Integer.parseInt(etCKPlayer3.getText().toString());
                //int tempSlagalica3 = Integer.parseInt(tvSlagalicaPlayer3.getText().toString());
                tvSumPlayer3.setText(String.valueOf(tempStihovi3 + tempCrvene3 + tempDame3 + tempCK3));

                int tempSum3 = Integer.parseInt(tvSumPlayer3.getText().toString());
                tvSumPlayer3ThirdRound.setText(String.valueOf(tempSum3 + getTvSumPlayer3ThirdRound ));

            } else if (!etStihoviPlayer3.getText().equals("") && !etCrvenePlayer3.getText().toString().equals("")
                    && !etDamePlayer3.getText().toString().equals("")) {
                int tempStihovi3 = Integer.parseInt(etStihoviPlayer3.getText().toString());
                int tempCrvene3 = Integer.parseInt(etCrvenePlayer3.getText().toString());
                int tempDame3 = Integer.parseInt(etDamePlayer3.getText().toString());

                tvSumPlayer3.setText(String.valueOf(tempStihovi3 + tempCrvene3 + tempDame3));

                int tempSum3 = Integer.parseInt(tvSumPlayer3.getText().toString());
                tvSumPlayer3ThirdRound.setText(String.valueOf(tempSum3 + getTvSumPlayer3ThirdRound ));

            } else if (!etStihoviPlayer3.getText().equals("") && !etCrvenePlayer3.getText().toString().equals("")) {
                int tempStihovi3 = Integer.parseInt(etStihoviPlayer3.getText().toString());
                int tempCrvene3 = Integer.parseInt(etCrvenePlayer3.getText().toString());
                tvSumPlayer3.setText(String.valueOf(tempStihovi3 + tempCrvene3));
            } else if (!etStihoviPlayer3.getText().equals("")) {
                int tempStihovi3 = Integer.parseInt(etStihoviPlayer3.getText().toString());


                tvSumPlayer3.setText(String.valueOf(tempStihovi3));

                int tempSum3 = Integer.parseInt(tvSumPlayer3.getText().toString());
                tvSumPlayer3ThirdRound.setText(String.valueOf(tempSum3 + getTvSumPlayer3ThirdRound ));
            }


            if (etCrvenePlayer3.getText().toString().length() == 0) {
                etCrvenePlayer3.setText("0");
            }
            if (etDamePlayer3.getText().toString().length() == 0) {
                etDamePlayer3.setText("0");
            }
            if (etCKPlayer3.getText().toString().length() == 0) {
                etCKPlayer3.setText("0");
            }


        }



        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher sum4TextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {


        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            if (!etStihoviPlayer4.getText().equals("") && !etCrvenePlayer4.getText().toString().equals("")
                    && !etDamePlayer4.getText().toString().equals("") && !etCKPlayer4.getText().toString().equals("") && !tvSlagalicaPlayer4.getText().toString().equals("")
            ) {
                int tempStihovi4 = Integer.parseInt(etStihoviPlayer4.getText().toString());
                int tempCrvene4 = Integer.parseInt(etCrvenePlayer4.getText().toString());
                int tempDame4 = Integer.parseInt(etDamePlayer4.getText().toString());
                int tempCK4 = Integer.parseInt(etCKPlayer4.getText().toString());
                int tempSlagalica4 = Integer.parseInt(tvSlagalicaPlayer4.getText().toString());
                tvSumPlayer4.setText(String.valueOf(tempStihovi4 + tempCrvene4 + tempDame4 + tempCK4 + tempSlagalica4));

                int tempSum4 = Integer.parseInt(tvSumPlayer4.getText().toString());
                tvSumPlayer4ThirdRound.setText(String.valueOf(tempSum4 + getTvSumPlayer4ThirdRound ));

            } else if (!etStihoviPlayer4.getText().equals("") && !etCrvenePlayer4.getText().toString().equals("")
                    && !etDamePlayer4.getText().toString().equals("") && !etCKPlayer4.getText().toString().equals("")
            ) {
                int tempStihovi4 = Integer.parseInt(etStihoviPlayer4.getText().toString());
                int tempCrvene4 = Integer.parseInt(etCrvenePlayer4.getText().toString());
                int tempDame4 = Integer.parseInt(etDamePlayer4.getText().toString());
                int tempCK4 = Integer.parseInt(etCKPlayer4.getText().toString());
                //int tempSlagalica4 = Integer.parseInt(tvSlagalicaPlayer4.getText().toString());
                tvSumPlayer4.setText(String.valueOf(tempStihovi4 + tempCrvene4 + tempDame4 + tempCK4));

                int tempSum4 = Integer.parseInt(tvSumPlayer4.getText().toString());
                tvSumPlayer4ThirdRound.setText(String.valueOf(tempSum4 + getTvSumPlayer4ThirdRound ));

            } else if (!etStihoviPlayer4.getText().equals("") && !etCrvenePlayer4.getText().toString().equals("")
                    && !etDamePlayer4.getText().toString().equals("")) {
                int tempStihovi4 = Integer.parseInt(etStihoviPlayer4.getText().toString());
                int tempCrvene4 = Integer.parseInt(etCrvenePlayer4.getText().toString());
                int tempDame4 = Integer.parseInt(etDamePlayer4.getText().toString());

                tvSumPlayer4.setText(String.valueOf(tempStihovi4 + tempCrvene4 + tempDame4));

                int tempSum4 = Integer.parseInt(tvSumPlayer4.getText().toString());
                tvSumPlayer4ThirdRound.setText(String.valueOf(tempSum4 + getTvSumPlayer4ThirdRound ));

            } else if (!etStihoviPlayer4.getText().equals("") && !etCrvenePlayer4.getText().toString().equals("")) {
                int tempStihovi4 = Integer.parseInt(etStihoviPlayer4.getText().toString());
                int tempCrvene4 = Integer.parseInt(etCrvenePlayer4.getText().toString());
                tvSumPlayer4.setText(String.valueOf(tempStihovi4 + tempCrvene4));

                int tempSum4 = Integer.parseInt(tvSumPlayer4.getText().toString());
                tvSumPlayer4ThirdRound.setText(String.valueOf(tempSum4 + getTvSumPlayer4ThirdRound ));

            } else if (!etStihoviPlayer4.getText().equals("")) {
                int tempStihovi4 = Integer.parseInt(etStihoviPlayer4.getText().toString());


                tvSumPlayer4.setText(String.valueOf(tempStihovi4));

                int tempSum4 = Integer.parseInt(tvSumPlayer4.getText().toString());
                tvSumPlayer4ThirdRound.setText(String.valueOf(tempSum4 + getTvSumPlayer4ThirdRound ));
            }


            if (etCrvenePlayer4.getText().toString().length() == 0) {
                etCrvenePlayer4.setText("0");
            }
            if (etDamePlayer4.getText().toString().length() == 0) {
                etDamePlayer4.setText("0");
            }
            if (etCKPlayer4.getText().toString().length() == 0) {
                etCKPlayer4.setText("0");
            }


        }



        @Override
        public void afterTextChanged(Editable s) {

        }
    };


    public void player1Dodaj(View view) {
        int tempSlagalicaPlayer1 = Integer.parseInt(tvSlagalicaPlayer1.getText().toString());
        tempSlagalicaPlayer1++;
        tvSlagalicaPlayer1.setText(String.valueOf(tempSlagalicaPlayer1));
    }

    public void player2Dodaj(View view) {
        int tempSlagalicaPlayer2 = Integer.parseInt(tvSlagalicaPlayer2.getText().toString());
        tempSlagalicaPlayer2++;
        tvSlagalicaPlayer2.setText(String.valueOf(tempSlagalicaPlayer2));
    }

    public void player3Dodaj(View view) {
        int tempSlagalicaPlayer3 = Integer.parseInt(tvSlagalicaPlayer3.getText().toString());
        tempSlagalicaPlayer3++;
        tvSlagalicaPlayer3.setText(String.valueOf(tempSlagalicaPlayer3));
    }

    public void player4Dodaj(View view) {
        int tempSlagalicaPlayer4 = Integer.parseInt(tvSlagalicaPlayer4.getText().toString());
        tempSlagalicaPlayer4++;
        tvSlagalicaPlayer4.setText(String.valueOf(tempSlagalicaPlayer4));
    }


}



