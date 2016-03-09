package com.example.tune.kaafit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void init(Bundle savedInstanceState) {

        // Add your slide's fragments here.
        // AppIntro will automatically generate the dots indicator and buttons.
        addSlide(SampleSlide.newInstance(R.layout.first_fragment));
        addSlide(SampleSlide.newInstance(R.layout.second_fragment));
        addSlide(SampleSlide.newInstance(R.layout.third_fragment));
        addSlide(SampleSlide.newInstance(R.layout.fourth_fragment));

        // SHOW or HIDE the statusbar
        showStatusBar(true);
        // Hide Skip/Done button
        showSkipButton(true);
        showDoneButton(true);


//        // Animations -- use only one of the below. Using both could cause errors.
//        setFadeAnimation();
    }

    //
    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    @Override
    public void onSkipPressed() {
        // Do something when users tap on Skip button.
        loadMainActivity();
        Toast.makeText(getApplicationContext(), getString(R.string.skip), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNextPressed() {
        loadMainActivity();
        Toast.makeText(getApplicationContext(), getString(R.string.skip), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDonePressed() {
        // Do something when users tap on Done button.
        loadMainActivity();

    }

    @Override
    public void onSlideChanged() {
        // Do something when slide is changed
    }

}
