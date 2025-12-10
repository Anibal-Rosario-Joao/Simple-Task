package com.anibalofice.simpletask

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.anibalofice.simpletask.ui.theme.TaskSimpleTheme
import com.anibalofice.simpletask.ui.theme.primaryBlue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskSimpleTheme {
                LoginScreen()

            }
        }
    }
}

@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun LoginScreen(){
    Scaffold(
        containerColor = MaterialTheme.colorScheme.background
    ){innerPadding ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
          //  verticalArrangement = Arrangement.Center,
          //  horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column(
            ) {
                Text(
                    text = "Welcome back!",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                )

                Column (){
                    Text(
                        text = "Email"
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {}
                    )

                    Spacer(modifier = Modifier.padding(5.dp))

                    Text(
                        text = "Password"
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {}
                    )

                    Spacer(modifier = Modifier.padding(5.dp))

                    Text(
                        text = "I forgot my password"
                    )

                    Spacer(modifier = Modifier.padding(5.dp))

                    Button(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, end = 15.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = primaryBlue, // Define a cor de fundo do botão
                            contentColor = Color.White // Define a cor do conteúdo (texto/ícone)
                        )
                    ) {
                        Text(
                            text = "Log in"
                        )
                    }
                }
            }


        }

    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    TaskSimpleTheme {
        LoginScreen()
    }
}