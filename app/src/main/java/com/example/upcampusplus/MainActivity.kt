package com.example.upcampusplus

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelasCampus()
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TelasCampus() {
    val context = LocalContext.current
    val pager = rememberPagerState(initialPage = 0)

    HorizontalPager(
        pageCount = 2,
        state = pager,
        modifier = Modifier.fillMaxSize()
    ) { pagina ->

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            if (pagina == 0) {

                Text("UP Campus+", color = Color.White)
                Text("Bem-vindo à sua agenda acadêmica!", color = Color.White)

                Button(
                    onClick = {
                        context.startActivity(
                            Intent(context, Agenda::class.java)
                        )
                    }
                ) {
                    Text("Começar")
                }

            } else {

                Text("Minha Agenda", color = Color.White)
                Text("Organize seus eventos acadêmicos.", color = Color.White)

            }

            Text("Deslize para mudar de tela", color = Color.White)
        }
    }
}