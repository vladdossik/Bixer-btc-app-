package biz.bixer.bixer;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;
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

public class StatisticsFragment extends Fragment {
    private TextView textView;
    private Switch aSwitch;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view= inflater.inflate(R.layout.fragment_statistics, container, false);
        Button difficulty=(Button)view.findViewById(R.id.difficulty);
        Button Hashrate=(Button)view.findViewById(R.id.Hashrate);
        Button Average=(Button)view.findViewById(R.id.Average);
        Button Number=(Button)view.findViewById(R.id.Number);
        Button Fee=(Button)view.findViewById(R.id.Fee);
        textView = (TextView) view.findViewById(R.id.text);
        difficulty.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new JSONTask().execute("https://bitaps.com/api/difficulty");
            }
        });
        Hashrate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new JSONTas().execute("https://bitaps.com/api/hashrate");
            }
        });
        Average.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new JSONTa().execute("https://bitaps.com/api/blocktime");
            }
        });
        Number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new JSONT().execute("https://bitaps.com/api/txrate");
            }
        });
        Fee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new JSON().execute("https://bitaps.com/api/fee");
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
                StringBuffer buffer = new StringBuffer();
                String line = "";
                while ((line = reader.readLine()) != null) {
                    buffer.append(line);
                }
                String finalJson=buffer.toString();
                JSONObject parentObject=new JSONObject(finalJson);

                String difficulty=parentObject.getString("difficulty");

return "difficulty of Bitcoin network: "+difficulty;
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
            textView.setText(result);
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
                StringBuffer buffer = new StringBuffer();
                String line = "";
                while ((line = reader.readLine()) != null) {
                    buffer.append(line);

                }
                String finalJson=buffer.toString();
                JSONObject parentObject=new JSONObject(finalJson);

                String hashrate=parentObject.getString("hashrate");

                return "Hashrate of Bitcoin network: "+hashrate;
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
            textView.setText(result);
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
                StringBuffer buffer = new StringBuffer();
                String line = "";
                while ((line = reader.readLine()) != null) {
                    buffer.append(line);

                }
                String finalJson=buffer.toString();
                JSONObject parentObject=new JSONObject(finalJson);

                String blocktime=parentObject.getString("blocktime");

                return "blocktime in the Bitcoin network: "+blocktime+" seconds";
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
            textView.setText(result);
        }
    }
    public class JSONT extends AsyncTask<String, String, String> {

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
                StringBuffer buffer = new StringBuffer();
                String line = "";
                while ((line = reader.readLine()) != null) {
                    buffer.append(line);

                }
                String finalJson=buffer.toString();
                JSONObject parentObject=new JSONObject(finalJson);

                String txrate=parentObject.getString("txrate");

                return "Average number of payments per second in the last 24 hours: "+txrate;
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
            textView.setText(result);
        }
    }
    public class JSON   extends AsyncTask<String, String, String> {

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
                StringBuffer buffer = new StringBuffer();
                String line = "";
                while ((line = reader.readLine()) != null) {
                    buffer.append(line);

                }
                String finalJson=buffer.toString();
                JSONObject parentObject=new JSONObject(finalJson);

                String high=parentObject.getString("high");
                String medium=parentObject.getString("medium");
                String low=parentObject.getString("low");

                return "Commission: \n"+"high: "+high+" satoshi per byte"+"\n"+"medium: "+medium+" satoshi per byte"+"\n"+"low: "+low+" satoshi per byte";
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
            textView.setText(result);
        }
    }
}


