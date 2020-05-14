package biz.bixer.bixer;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import biz.bixer.bixer.R;

public class   SecondFragment extends Fragment {
private TextView tvData;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        Button btnHit = (Button) view.findViewById(R.id.btnHit);
        Button btnHi=(Button)view.findViewById(R.id.btnHi);
        Button btnH=(Button)view.findViewById(R.id.btnH);
          tvData = (TextView) view.findViewById(R.id.tvJsonItem);
        btnHit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
new JSONTask().execute("https://bitaps.com/api/block/latest");
            }
        });
        btnHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new JSONTas().execute("https://blockchain.info/ru/ticker");
            }
        });
        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new JSONTa().execute("https://bitaps.com/api/blocksize");
            }
        });
        return view;
    }
    public class JSONTask extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            HttpURLConnection connection = null;
            BufferedReader reader = null;
            try {
                URL url = new URL(params[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();
                InputStream stream = connection.getInputStream();
                reader = new BufferedReader(new InputStreamReader(stream));
                StringBuilder buffer = new StringBuilder();
                String line = "";
                while ((line = reader.readLine()) != null) {
                    buffer.append(line);
                }
                String finalJson=buffer.toString();
                JSONObject parentObject=new JSONObject(finalJson);
String height=parentObject.getString("height");
String hash=parentObject.getString("hash");
String miner=parentObject.getString("miner");
String transactions=parentObject.getString("transactions");
String size=parentObject.getString("size");
String bits=parentObject.getString("bits");
return "height: "+height+" "+"\n"+"hash: "+ hash+"\n"+"miner: "+miner+"\n"+"transactions: "+transactions+"\n"+"size: "+size+"\n"+"bits: "+bits;
            } catch (
                    MalformedURLException e)

            {
                e.printStackTrace();
            } catch (
                    IOException e)

            {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            } finally

            {
                if (connection != null) {
                    connection.disconnect();
                }
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return  null;
        }
        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            tvData.setText(result);
        }
    }
    public class JSONTas extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {
            HttpURLConnection connection = null;
            BufferedReader reader = null;
            try {
                URL url = new URL(params[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();
                InputStream stream = connection.getInputStream();
                reader = new BufferedReader(new InputStreamReader(stream));
                StringBuilder buffer = new StringBuilder();
                String line = "";
                while ((line = reader.readLine()) != null) {
                    buffer.append(line);

                }
                String finalJson=buffer.toString();
                JSONObject parentObject=new JSONObject(finalJson);
                String USD=parentObject.getString("USD");
                String RUB=parentObject.getString("RUB");
                String EUR=parentObject.getString("EUR");
                String finalJso=USD.toString();
                String finalJs=RUB.toString();
                String finalJ=EUR.toString();
                JSONObject parentObjec=new JSONObject(finalJso);
                JSONObject parentObje=new JSONObject(finalJs);
                JSONObject parentObj=new JSONObject(finalJ);
                String  now=parentObjec.getString("15m");
                String  no=parentObje.getString("15m");
                String  n=parentObj.getString("15m");
                return "(USD)bitcoin rate is "+now+"\n"+"\n"+"\n"+"(RUB)bitcoin rate is "+no+"\n"+"\n"+"\n"+"(EUR)bitcoin rate is "+n;
          } catch (
                    MalformedURLException e)
            {
                e.printStackTrace();
            } catch (
                    IOException e)
            {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            } finally
            {
                if (connection != null) {
                    connection.disconnect();
                }
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return  null;
        }
        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            tvData.setText(result);
        }
    }
    public class JSONTa extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            HttpURLConnection connection = null;
            BufferedReader reader = null;
            try {
                URL url = new URL(params[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();
                InputStream stream = connection.getInputStream();
                reader = new BufferedReader(new InputStreamReader(stream));
                StringBuilder buffer = new StringBuilder();
                String line = "";
                while ((line = reader.readLine()) != null) {
                    buffer.append(line);
                }
                String finalJson=buffer.toString();
                JSONObject parentObject=new JSONObject(finalJson);
               String blocksize=parentObject.getString("blocksize");
               return "blocksize: "+blocksize+" bytes";
            } catch (
                    MalformedURLException e)
            {
                e.printStackTrace();
            } catch (
                    IOException e)
            {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            } finally

            {
                if (connection != null) {
                    connection.disconnect();
                }
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return  null;
        }
        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            tvData.setText(result);
        }
    }
}