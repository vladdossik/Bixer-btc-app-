package biz.bixer.bixer;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import biz.bixer.bixer.R;


public class Bitcoin_checker extends Fragment {

    public static final String BTC_URL = "https://api.coindesk.com/v1/bpi/currentprice/btc.json";
    private static final String TAG = "URLBUILDER";
    TextView usdValue;
    Button refreshButton;
    EditText btcValue;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                         Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_bitcoin_checker,container,false);
        usdValue = (TextView) view.findViewById(R.id.usd_value);
        refreshButton =(Button)view.findViewById(R.id.refresh_button);
        btcValue = (EditText) view.findViewById(R.id.btc_value);

        new FetchBtcTask().execute(BTC_URL);

        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new FetchBtcTask().execute(BTC_URL);
            }
        });
        final Handler handler = new Handler();


        final int delay = 9000;

        handler.postDelayed(new Runnable() {
            public void run() {

                handler.postDelayed(this, delay);
                new FetchBtcTask().execute(BTC_URL);
                Log.i(TAG, "run: " + usdValue.getText());
            }
        }, delay);

        btcValue.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                new FetchBtcTask().execute(BTC_URL);
            }
        });
        return view;
    }

    public static String getResponseFromHttpUrl(URL url) throws IOException {
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try {
            InputStream in = urlConnection.getInputStream();

            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("\\A");

            boolean hasInput = scanner.hasNext();
            if (hasInput) {
                return scanner.next();
            } else {
                return null;
            }
        } finally {
            urlConnection.disconnect();
        }
    }
    private URL urlBuilder(String uri) {
        Uri builtUri = Uri.parse(uri).buildUpon().build();

        URL url;

        try {
            url = new URL(builtUri.toString());
            return url;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String jsonParser(String jsonWeatherResponse) throws JSONException {
        JSONObject jsonObject = new JSONObject(jsonWeatherResponse);
        JSONObject bpi = jsonObject.getJSONObject("bpi");
        JSONObject usd = bpi.getJSONObject("USD");

        return usd.getString("rate_float");
    }


    public class FetchBtcTask extends AsyncTask<String, Void, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... params) {

            if (params.length == 0) {
                return null;
            }

            String location = params[0];
            URL weatherRequestUrl = urlBuilder(location);

            try {
                String jsonBtcResponse = getResponseFromHttpUrl(weatherRequestUrl);

                return jsonParser(jsonBtcResponse);

            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }


        @Override
        protected void onPostExecute(String valueData) {
            try {
                double newValue;
                double newValueData = Double.parseDouble(valueData);
                double newBtc = Double.parseDouble(String.valueOf(btcValue.getText()));
                newValue = newValueData * newBtc;
                if (valueData != null) {
                    usdValue.setText(String.valueOf(newValue));
                    Log.d(TAG, "onPostExecute: valueData = " + newValue);
                } else {
                    Log.i(TAG, "onPostExecute: valueData (failed) = " + newValue);
                }
            } catch (Exception e) {
                e.printStackTrace();
                Log.i(TAG, "onPostExecute: Exception " + valueData + " btcValue = " + btcValue.getText());
            }

        }
    }

}
