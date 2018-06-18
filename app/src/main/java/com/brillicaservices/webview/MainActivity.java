package com.brillicaservices.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar pb;
    WebView views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pb = findViewById(R.id.pbar);
        views = findViewById(R.id.webview);
        views.loadUrl("https://www.google.com/");
        views.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int p) {
                if (p == 100) {
                    pb.setVisibility(View.GONE);
                    views.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
