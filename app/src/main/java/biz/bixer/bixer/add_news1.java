package biz.bixer.bixer;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

public class add_news1 extends Fragment {
    private WebView myWebView;
    private ProgressBar progress;
    private Context mContext;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreate(savedInstanceState);
        View view= inflater.inflate(R.layout.fragment_news1, container, false);
        mContext=getActivity().getApplicationContext();
        myWebView=(WebView)view.findViewById(R.id.web_view);
        progress=(ProgressBar)view.findViewById(R.id.pb);
        //   progress.setMax(100);//

        WebSettings webSettings=myWebView.getSettings();

        // webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view,String url,Bitmap favicon)
            {
                progress.setVisibility(View.VISIBLE);
            }
            @Override
            public void onPageFinished(WebView view,String url)
            {
                Toast.makeText(mContext,"Page loaded",Toast.LENGTH_SHORT).show();
            }
        });
        myWebView.setWebChromeClient(new WebChromeClient(){
            public void onProgressChanged(WebView view,int newProgress)
            {
                progress.setProgress(newProgress);
                if(newProgress==100)
                {
                    progress.setVisibility(View.GONE);
                }
            }
        });
        myWebView.getSettings().setJavaScriptEnabled(true);
        //myWebView.loadUrl(urlToRender)
        myWebView.loadUrl("https://www.cryptoglobe.com/latest/bitcoin/");
        return view;
    }
}








