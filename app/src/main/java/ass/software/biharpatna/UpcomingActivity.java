package ass.software.biharpatna;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Date;

public class UpcomingActivity extends AppCompatActivity {
    ImageView back;
    RelativeLayout zero,one,two,three,four,five,six,seven,eight;
    TextView zeroText, oneText, twoText, threeText, fourText, fiveText, sixText, sevenText, eightText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming);
        back = (ImageView) findViewById(R.id.back);
        zero = (RelativeLayout) findViewById(R.id.zero);
        one = (RelativeLayout) findViewById(R.id.one);
        two = (RelativeLayout) findViewById(R.id.two);
        three = (RelativeLayout) findViewById(R.id.three);
        four = (RelativeLayout) findViewById(R.id.four);
        five = (RelativeLayout) findViewById(R.id.five);
        six = (RelativeLayout) findViewById(R.id.six);
        seven = (RelativeLayout) findViewById(R.id.seven);
        eight = (RelativeLayout) findViewById(R.id.eight);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        java.text.SimpleDateFormat sdf2 = new java.text.SimpleDateFormat("HH");
        String dateString2 = sdf2.format(new Date());
        Log.d("hrrrrrr", dateString2);
        int time = Integer.parseInt(dateString2);

        if (dateString2.equals("12")) {
            zero.setBackgroundResource(R.drawable.btn_ena);
        }
        if (dateString2.equals("13")) {
            zero.setBackgroundResource(R.drawable.btn_ena);
            one.setBackgroundResource(R.drawable.btn_ena);

        }
        if (dateString2.equals("14")) {
            zero.setBackgroundResource(R.drawable.btn_ena);
            one.setBackgroundResource(R.drawable.btn_ena);
            two.setBackgroundResource(R.drawable.btn_ena);
        }
        if (dateString2.equals("15")) {
            zero.setBackgroundResource(R.drawable.btn_ena);
            one.setBackgroundResource(R.drawable.btn_ena);
            two.setBackgroundResource(R.drawable.btn_ena);
            three.setBackgroundResource(R.drawable.btn_ena);
        }
        if (dateString2.equals("16")) {
            zero.setBackgroundResource(R.drawable.btn_ena);
            one.setBackgroundResource(R.drawable.btn_ena);
            two.setBackgroundResource(R.drawable.btn_ena);
            three.setBackgroundResource(R.drawable.btn_ena);
            four.setBackgroundResource(R.drawable.btn_ena);
        }
        if (dateString2.equals("17")) {
            zero.setBackgroundResource(R.drawable.btn_ena);
            one.setBackgroundResource(R.drawable.btn_ena);
            two.setBackgroundResource(R.drawable.btn_ena);
            three.setBackgroundResource(R.drawable.btn_ena);
            four.setBackgroundResource(R.drawable.btn_ena);
            five.setBackgroundResource(R.drawable.btn_ena);

        }
        if (dateString2.equals("18")) {
            zero.setBackgroundResource(R.drawable.btn_ena);
            one.setBackgroundResource(R.drawable.btn_ena);
            two.setBackgroundResource(R.drawable.btn_ena);
            three.setBackgroundResource(R.drawable.btn_ena);
            four.setBackgroundResource(R.drawable.btn_ena);
            five.setBackgroundResource(R.drawable.btn_ena);
            six.setBackgroundResource(R.drawable.btn_ena);
        }
        if (dateString2.equals("19")) {
            zero.setBackgroundResource(R.drawable.btn_ena);
            one.setBackgroundResource(R.drawable.btn_ena);
            two.setBackgroundResource(R.drawable.btn_ena);
            three.setBackgroundResource(R.drawable.btn_ena);
            four.setBackgroundResource(R.drawable.btn_ena);
            five.setBackgroundResource(R.drawable.btn_ena);
            six.setBackgroundResource(R.drawable.btn_ena);
            seven.setBackgroundResource(R.drawable.btn_ena);
        }
        if (dateString2.equals("20")) {
            zero.setBackgroundResource(R.drawable.btn_ena);
            one.setBackgroundResource(R.drawable.btn_ena);
            two.setBackgroundResource(R.drawable.btn_ena);
            three.setBackgroundResource(R.drawable.btn_ena);
            four.setBackgroundResource(R.drawable.btn_ena);
            five.setBackgroundResource(R.drawable.btn_ena);
            six.setBackgroundResource(R.drawable.btn_ena);
            seven.setBackgroundResource(R.drawable.btn_ena);
            eight.setBackgroundResource(R.drawable.btn_ena);
        }
    }
}
