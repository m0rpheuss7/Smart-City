package com.meusite.smartcity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.webview)

        // Habilita JavaScript, o que é necessário para muitos sites
        myWebView.settings.javaScriptEnabled = true

        // Permanece dentro do WebView ao clicar em links
        myWebView.webViewClient = WebViewClient()

        // Carrega o arquivo HTML da pasta assets
        myWebView.loadUrl("file:///android_asset/meu_conteudo.html")
    }
}