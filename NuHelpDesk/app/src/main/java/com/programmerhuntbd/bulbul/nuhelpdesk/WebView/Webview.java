package com.programmerhuntbd.bulbul.nuhelpdesk.WebView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.programmerhuntbd.bulbul.nuhelpdesk.MainActivity;
import com.programmerhuntbd.bulbul.nuhelpdesk.R;
import com.programmerhuntbd.bulbul.nuhelpdesk.University.UniversityList;

public class Webview extends AppCompatActivity {


    private WebView webView;
    //private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);


        Toolbar toolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Web View");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webView= (WebView) findViewById(R.id.webViewId);
     //   progressDialog = new ProgressDialog(this);


        Intent intent = getIntent();

        String  url = intent.getStringExtra(UniversityList.WEB_URL);
       // String  ur2 = intent.getStringExtra(MainActivity.WEB_URL_Notice);

        final ProgressDialog pd = ProgressDialog.show(Webview.this, "", "Please wait, your website is being processed...", true);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new myBrowser(pd));
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        //----------------------------------------------

        webView.getSettings().setLoadWithOverviewMode(true);
//        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setBuiltInZoomControls(true);
//
//        webView.setWebViewClient(new WebViewClient() {
//                                      public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
//                                          Toast.makeText(Webview.this, description, Toast.LENGTH_SHORT).show();
//                                      }
//
//
//
//            @Override
//            public void onPageStarted(WebView view, String url, Bitmap favicon)
//            {
//                pd.show();
//            }
//
//
//            @Override
//            public void onPageFinished(WebView view, String url) {
//                pd.dismiss();
//
//                String webUrl = webView.getUrl();
//
//            }
//
//
//
//    });
        //--------------------------



        if(url.endsWith(".pdf") ){
            pd.show();
            webView.loadUrl("http://docs.google.com/gview?embedded=true&url="+url);
            pd.dismiss();
        }else{
            webView.loadUrl(url);
        }



//        if(ur2.endsWith(".pdf")){
//            webView.loadUrl("http://docs.google.com/gview?embedded=true&url="+ur2);
//        }else{
//            webView.loadUrl(ur2);
//        }

    }

    public class myBrowser extends WebViewClient {
        ProgressDialog progressDialog;
        public myBrowser(ProgressDialog progressDialog){
            this.progressDialog=progressDialog;
            progressDialog.show();


        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return super.shouldOverrideUrlLoading(view, url);
        }


        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);

            if(progressDialog.isShowing()){
                progressDialog.dismiss();
            }
        }

        @Override
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            super.onReceivedError(view, request, error);
        }
    }




    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}
