package com.gardion.gardionclient.ui.about;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;

import com.gardion.gardionclient.R;
import com.gardion.gardionclient.ui.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * About screen.
 */
public class AboutActivity extends BaseActivity {

    private static final String URL_ABOUT = "https://www.gardion.com/";
    private static final String URL_LOCAL_LICENSES = "file:///android_asset/licenses.html";

    // UI ref
    @BindView(R.id.about_webview)
    protected WebView mLicencesWebView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ButterKnife.bind(this);

        // Load local html
        mLicencesWebView.loadUrl(URL_LOCAL_LICENSES);
    }

}
