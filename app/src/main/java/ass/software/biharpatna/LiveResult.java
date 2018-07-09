package ass.software.biharpatna;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ass.software.biharpatna.Repeat.PojoClass;
import ass.software.biharpatna.Repeat.PreviousAdapter;

public class LiveResult extends AppCompatActivity {
    ImageView back;
    PreviousAdapter adapter;
    List<PojoClass> pojoClasses = new ArrayList<>();
    ProgressDialog pDialog;
    PojoClass movie;
    RelativeLayout zero,one,two,three,four,five,six,seven,eight;
    TextView zeroText, oneText, twoText, threeText, fourText, fiveText, sixText, sevenText, eightText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_result);
        back=(ImageView)findViewById(R.id.back);
        zero=(RelativeLayout)findViewById(R.id.zero);
        one=(RelativeLayout)findViewById(R.id.one);
        two=(RelativeLayout)findViewById(R.id.two);
        three=(RelativeLayout)findViewById(R.id.three);
        four=(RelativeLayout)findViewById(R.id.four);
        five=(RelativeLayout)findViewById(R.id.five);
        six=(RelativeLayout)findViewById(R.id.six);
        seven=(RelativeLayout)findViewById(R.id.seven);
        eight=(RelativeLayout)findViewById(R.id.eight);
        zeroText=(TextView)findViewById(R.id.zeroText);
        oneText=(TextView)findViewById(R.id.oneText);
        twoText=(TextView)findViewById(R.id.twoText);
        threeText=(TextView)findViewById(R.id.threeText);
        fourText=(TextView)findViewById(R.id.fourText);
        fiveText=(TextView)findViewById(R.id.fiveText);
        sixText=(TextView)findViewById(R.id.sixText);
        sevenText=(TextView)findViewById(R.id.sevenText);
        eightText=(TextView)findViewById(R.id.eightText);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        populatedata();
    }

    public void populatedata(){

        pDialog = new ProgressDialog(LiveResult.this);
        // Showing progress dialog before making http request
        pDialog.setMessage("Loading...");
        pDialog.show();

        Map<String, String> postParam= new HashMap<String, String>();
        // postParam.put("session_id", sessionid);
        postParam.put("rest_id", "1");


        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.POST,
                "http://condoassist2u.com/casinofun/api/store_live_result.php", new JSONObject(postParam),
                new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject objone)
                    {
                        pDialog.dismiss();
                        Log.d("tag", objone.toString());
                        try {
                            // JSONObject objone = new JSONObject(response);
                            boolean error = objone.getBoolean("error");

                            if(error){

                            }else{

                                JSONArray jsonArray = objone.getJSONArray("live");
                                for (int i = 0; i < jsonArray.length(); i++) {

                                    JSONObject obj = jsonArray.getJSONObject(i);
                                    movie = new PojoClass();
                                    movie.setZero("12:00 PM   =   "+obj.getString("0"));
                                    movie.setOne("01:00 PM  =   "+obj.getString("1"));
                                    movie.setTwo("02:00 PM  =   "+obj.getString("2"));
                                    movie.setThree("03:00  PM  =   "+obj.getString("3"));
                                    movie.setFour("04:00  PM =   "+obj.getString("4"));
                                    movie.setFive("05:00 PM  =   "+obj.getString("5"));
                                    movie.setSix("06:00  PM  =   "+obj.getString("6"));
                                    movie.setSeven("07:00  PM  =   "+obj.getString("7"));
                                    movie.setEight("08:00  PM  =   "+obj.getString("8"));
                                    Log.d("eight", obj.getString("8"));
                                    pojoClasses.add(movie);

                                    Log.d("yyyyyyyyy1", movie.getFour());
                                    Log.d("yyyyyyyyy2", movie.getFive());
                                    Log.d("yyyyyyyyy3", movie.getSix());
                                    Log.d("yyyyyyyyy4", movie.getSeven());
                                    Log.d("yyyyyyyyy5", movie.getEight());

                                }

                                java.text.SimpleDateFormat sdf2 = new java.text.SimpleDateFormat("HH");
                                String dateString2 = sdf2.format(new Date());
                                Log.d("hrrrrrr", dateString2);
                                int time = Integer.parseInt(dateString2);

                                if(dateString2.equals("12")) {
                                    zero.setVisibility(View.VISIBLE);
                                    zeroText.setText(movie.getZero());
                                } if(dateString2.equals("13")) {
                                    zero.setVisibility(View.VISIBLE);
                                    zeroText.setText(movie.getZero());

                                    one.setVisibility(View.VISIBLE);
                                    oneText.setText(movie.getOne());
                                } if(dateString2.equals("14")) {
                                    zero.setVisibility(View.VISIBLE);
                                    zeroText.setText(movie.getZero());

                                    one.setVisibility(View.VISIBLE);
                                    oneText.setText(movie.getOne());

                                    two.setVisibility(View.VISIBLE);
                                    twoText.setText(movie.getTwo());
                                } if(dateString2.equals("15")) {
                                    zero.setVisibility(View.VISIBLE);
                                    zeroText.setText(movie.getZero());

                                    one.setVisibility(View.VISIBLE);
                                    oneText.setText(movie.getOne());

                                    two.setVisibility(View.VISIBLE);
                                    twoText.setText(movie.getTwo());

                                    three.setVisibility(View.VISIBLE);
                                    threeText.setText(movie.getThree());
                                } if(dateString2.equals("16")) {
                                    zero.setVisibility(View.VISIBLE);
                                    zeroText.setText(movie.getZero());

                                    one.setVisibility(View.VISIBLE);
                                    oneText.setText(movie.getOne());

                                    two.setVisibility(View.VISIBLE);
                                    twoText.setText(movie.getTwo());

                                    three.setVisibility(View.VISIBLE);
                                    threeText.setText(movie.getThree());

                                    four.setVisibility(View.VISIBLE);
                                    fourText.setText(movie.getFour());
                                } if(dateString2.equals("17")) {
                                    zero.setVisibility(View.VISIBLE);
                                    zeroText.setText(movie.getZero());

                                    one.setVisibility(View.VISIBLE);
                                    oneText.setText(movie.getOne());

                                    two.setVisibility(View.VISIBLE);
                                    twoText.setText(movie.getTwo());

                                    three.setVisibility(View.VISIBLE);
                                    threeText.setText(movie.getThree());

                                    four.setVisibility(View.VISIBLE);
                                    fourText.setText(movie.getFour());

                                    five.setVisibility(View.VISIBLE);
                                    fiveText.setText(movie.getFive());
                                } if(dateString2.equals("18")) {
                                    zero.setVisibility(View.VISIBLE);
                                    zeroText.setText(movie.getZero());

                                    one.setVisibility(View.VISIBLE);
                                    oneText.setText(movie.getOne());

                                    two.setVisibility(View.VISIBLE);
                                    twoText.setText(movie.getTwo());

                                    three.setVisibility(View.VISIBLE);
                                    threeText.setText(movie.getThree());

                                    four.setVisibility(View.VISIBLE);
                                    fourText.setText(movie.getFour());

                                    five.setVisibility(View.VISIBLE);
                                    fiveText.setText(movie.getFive());

                                    six.setVisibility(View.VISIBLE);
                                    sixText.setText(movie.getSix());
                                } if(dateString2.equals("19")) {
                                    zero.setVisibility(View.VISIBLE);
                                    zeroText.setText(movie.getZero());

                                    one.setVisibility(View.VISIBLE);
                                    oneText.setText(movie.getOne());

                                    two.setVisibility(View.VISIBLE);
                                    twoText.setText(movie.getTwo());

                                    three.setVisibility(View.VISIBLE);
                                    threeText.setText(movie.getThree());

                                    four.setVisibility(View.VISIBLE);
                                    fourText.setText(movie.getFour());

                                    five.setVisibility(View.VISIBLE);
                                    fiveText.setText(movie.getFive());

                                    six.setVisibility(View.VISIBLE);
                                    sixText.setText(movie.getSix());

                                    seven.setVisibility(View.VISIBLE);
                                    sevenText.setText(movie.getSeven());
                                } if(dateString2.equals("20")) {
                                    zero.setVisibility(View.VISIBLE);
                                    zeroText.setText(movie.getZero());

                                    one.setVisibility(View.VISIBLE);
                                    oneText.setText(movie.getOne());

                                    two.setVisibility(View.VISIBLE);
                                    twoText.setText(movie.getTwo());

                                    three.setVisibility(View.VISIBLE);
                                    threeText.setText(movie.getThree());

                                    four.setVisibility(View.VISIBLE);
                                    fourText.setText(movie.getFour());

                                    five.setVisibility(View.VISIBLE);
                                    fiveText.setText(movie.getFive());

                                    six.setVisibility(View.VISIBLE);
                                    sixText.setText(movie.getSix());

                                    seven.setVisibility(View.VISIBLE);
                                    sevenText.setText(movie.getSeven());

                                    eight.setVisibility(View.VISIBLE);
                                    eightText.setText(movie.getEight());
                                }
                            }

                            //  adapter.notifyDataSetChanged();

                        }catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                pDialog.dismiss();
                VolleyLog.d("tag", "Error: " + error.getMessage());
                //  hideProgressDialog();
            }
        }) {

            /**
             * Passing some request headers
             * */
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> headers = new HashMap<String, String>();
                headers.put("Content-Type", "application/json; charset=utf-8");
                return headers;
            }

        };

        jsonObjReq.setTag("tag");
        // Adding request to request queue
        RequestQueue queue = Volley.newRequestQueue(LiveResult.this);
        queue.add(jsonObjReq);

    }
}
