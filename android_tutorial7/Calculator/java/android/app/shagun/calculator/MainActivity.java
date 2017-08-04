package android.app.shagun.calculator;

/*

 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    TextView display , current_action_display;
    double old_data = 0 , new_data = 0;
    int current_action = 0 , point_pressed = 0;
    NumberFormat formatter;
    Animation fade_in_fade_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView)findViewById(R.id.textview); //Int.. of textview
        current_action_display = (TextView)findViewById(R.id.textView1); //Int.. of textview
        fade_in_fade_out = AnimationUtils.loadAnimation(this , R.anim.fade_in_out); //Int.. of fade .. anim

        formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(0);
        formatter.setMaximumFractionDigits(5);
    }

    public void button0(View view) {

        display.setText(display.getText() + "0");
    }

    public void button1(View view) {

        display.setText(display.getText() + "1");
    }

    public void button2(View view) {

        display.setText(display.getText() + "2");

    }

    public void button3(View view) {

        display.setText(display.getText() + "3");

    }

    public void button4(View view) {

        display.setText(display.getText() + "4");

    }

    public void button5(View view) {

        display.setText(display.getText() + "5");
    }

    public void button6(View view) {

        display.setText(display.getText() + "6");

    }

    public void button7(View view) {

        display.setText(display.getText() + "7");

    }

    public void button8(View view) {

        display.setText(display.getText() + "8");

    }

    public void button9(View view) {

        display.setText(display.getText() + "9");

    }

    public void buttonpoint(View view) {

        if(point_pressed == 0) {
        display.setText(display.getText() + "."); point_pressed = 1;}

    }

    public void buttonreset(View view) {

        display.setText("");

        display.setAnimation(fade_in_fade_out);
        display.startAnimation(fade_in_fade_out);

        current_action_display.setAnimation(fade_in_fade_out);
        current_action_display.startAnimation(fade_in_fade_out);

        old_data = 0;
        new_data = 0;
        current_action = 0;

        current_action_display.setText("Calculate something!");

        point_pressed = 0;

    }

    public void buttonclear(View view) {

        String input = display.getText().toString();
        char a;
        String result = "";

        for(int i = 0; i < (input.length()-1); i++) {
            a = input.charAt(i);
            result += a;
        }

        display.setText("" + result);

    }

    public void buttonequal(View view) {

        display.setAnimation(fade_in_fade_out);
        display.startAnimation(fade_in_fade_out);

        current_action_display.setAnimation(fade_in_fade_out);
        current_action_display.startAnimation(fade_in_fade_out);

        if(!display.getText().toString().equals("")){
        new_data = Double.parseDouble(display.getText().toString());

        double result = 0;

        if(current_action == 1) {result = old_data + new_data;}
        if(current_action == 2) {result = old_data - new_data;}
        if(current_action == 3) {result = old_data * new_data;}
        if(current_action == 4) {result = old_data / new_data;}


        current_action_display.setText("Answer");
        display.setText("" + formatter.format(result));

        current_action = 0;
        old_data = 0;
        new_data = 0;} else {current_action_display.setText("Please type something!");}

        point_pressed = 0;


    }

    public void buttonadd(View view) {

        if(!display.getText().toString().equals("")){
        old_data = Double.parseDouble(display.getText().toString());
        current_action = 1;

        current_action_display.setText("Addition");

        display.setText("");} else {current_action_display.setText("Please type something!");}

        point_pressed = 0;

        current_action_display.setAnimation(fade_in_fade_out);
        current_action_display.startAnimation(fade_in_fade_out);

    }

    public void buttonsub(View view) {

        if(!display.getText().toString().equals("")){
        old_data = Double.parseDouble(display.getText().toString());
        current_action = 2;

        current_action_display.setText("Subtraction");
        display.setText("");} else {current_action_display.setText("Please type something!");}

        point_pressed = 0;

        current_action_display.setAnimation(fade_in_fade_out);
        current_action_display.startAnimation(fade_in_fade_out);

    }

    public void buttonmultiply(View view) {

        if(!display.getText().toString().equals("")){
        old_data = Double.parseDouble(display.getText().toString());
        current_action = 3;

        current_action_display.setText("Multiplication");
        display.setText("");} else {current_action_display.setText("Please type something!");}

        point_pressed = 0;

        current_action_display.setAnimation(fade_in_fade_out);
        current_action_display.startAnimation(fade_in_fade_out);

    }

    public void buttondiv(View view) {

        if(!display.getText().toString().equals("")){
        old_data = Double.parseDouble(display.getText().toString());
        current_action = 4;

        current_action_display.setText("Division");
        display.setText("");} else {current_action_display.setText("Please type something!");}

        point_pressed = 0;

        current_action_display.setAnimation(fade_in_fade_out);
        current_action_display.startAnimation(fade_in_fade_out);

    }

    public void buttonsin(View view) {

        if(!display.getText().toString().equals("")){
        double sin_value = Math.sin(Double.parseDouble(display.getText().toString()));
        display.setText("" + formatter.format(sin_value));

        current_action_display.setText("Sine");} else {current_action_display.setText("Please type something!");}

        point_pressed = 0;

        display.setAnimation(fade_in_fade_out);
        display.startAnimation(fade_in_fade_out);

        current_action_display.setAnimation(fade_in_fade_out);
        current_action_display.startAnimation(fade_in_fade_out);

    }

    public void buttoncos(View view) {

        if(!display.getText().toString().equals("")){
        double cos_value = Math.cos(Double.parseDouble(display.getText().toString()));
        display.setText("" + formatter.format(cos_value));

        current_action_display.setText("Cosine");} else {current_action_display.setText("Please type something!");}

        point_pressed = 0;

        display.setAnimation(fade_in_fade_out);
        display.startAnimation(fade_in_fade_out);

        current_action_display.setAnimation(fade_in_fade_out);
        current_action_display.startAnimation(fade_in_fade_out);

    }

    public void buttontan(View view) {

        if(!display.getText().toString().equals("")){
        double tan_value = Math.sin(Double.parseDouble(display.getText().toString()))/Math.cos(Double.parseDouble(display.getText().toString()));
        display.setText("" + formatter.format(tan_value));

        current_action_display.setText("Tangent");} else {current_action_display.setText("Please type something!");}

        point_pressed = 0;

        display.setAnimation(fade_in_fade_out);
        display.startAnimation(fade_in_fade_out);
        current_action_display.setAnimation(fade_in_fade_out);
        current_action_display.startAnimation(fade_in_fade_out);

    }

}
