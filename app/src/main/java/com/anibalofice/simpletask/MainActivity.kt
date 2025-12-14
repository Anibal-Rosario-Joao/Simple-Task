package com.anibalofice.simpletask

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
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
                        text = "Email",
                        fontWeight = FontWeight.Black
                    )
                    OutlinedTextField(
                        value = "",
                        placeholder = {
                            Text(
                                text = "Enter your email"
                            )
                        },
                        onValueChange = {}
                    )

                    Spacer(modifier = Modifier.padding(5.dp))

                    Text(
                        text = "Password",
                        fontWeight = FontWeight.Black
                    )
                    OutlinedTextField(
                        value = "",
                        placeholder = {
                            Text(
                                text = "Enter your password"
                            )
                        },
                        onValueChange = {},
                    )

                    Spacer(modifier = Modifier.padding(5.dp))

                    Row(

                    ) {
                        TextButton(
                            onClick = {},
                        )  {
                            Text(
                                text = "I forgot my password",
                                fontStyle = FontStyle.Italic,
                                textDecoration = TextDecoration.Underline
                            )
                        }
                    }

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
                    LoginDivider()

                    Row (

                    ){
                        Row (

                        ){
                            Image(
                                painter = painterResource(R.drawable.google_logo_icon),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(30.dp)
                            )
                            Text("Google")
                        }
                        Spacer(modifier = Modifier.padding(5.dp))

                        Row (

                        ){
                            Image(
                                painter = painterResource(R.drawable.facebook_logo_icon),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(30.dp)
                            )
                            Text("Facebook")
                        }
                    }

                    Spacer(modifier = Modifier.padding(25.dp))
                    Row() {
                        Text(
                            text = "Already have an account ?"
                        )

                        TextButton(
                            onClick = {}
                        ) {
                            Text(
                                text = "Create account",
                                color = primaryBlue,
                                textDecoration = TextDecoration.Underline

                            )
                        }

                    }
                }
            }


        }

    }
}

@Composable
fun LoginDivider() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        // Left Line
        HorizontalDivider(
            modifier = Modifier.weight(1f), // Ocupa todo o espaço disponível restante
            color = Color.Gray,
            thickness = 1.dp
        )


        Text(
            text = "Or Login with",
            modifier = Modifier.padding(horizontal = 8.dp), // Adiciona padding horizontal ao texto
            color = Color.Gray,
            fontSize = 14.sp
        )

        // Linha divisória direita
        HorizontalDivider(
            modifier = Modifier.weight(1f), // Ocupa todo o espaço disponível restante
            color = Color.Gray,
            thickness = 1.dp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    TaskSimpleTheme {
        LoginScreen()
    }
}