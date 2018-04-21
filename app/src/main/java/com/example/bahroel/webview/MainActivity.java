package com.example.bahroel.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private String URL ="https://developercupuh.blogspot.co.id/";
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView)findViewById(R.id.wbBlog);
        webView.loadUrl(URL);
        webView.setWebViewClient(new WebViewClient());
    }
}
