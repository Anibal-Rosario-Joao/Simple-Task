package com.anibalofice.simpletask

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
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
    var showPassword by remember { mutableStateOf(false) }
    var inputEmail by remember { mutableStateOf("") }
    var inputPassWord by remember { mutableStateOf("") }
    Scaffold(
        containerColor = MaterialTheme.colorScheme.background
    ){innerPadding ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 30.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Welcome back!",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.padding(vertical = 20.dp))
                Column (
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = "Email",
                        modifier = Modifier
                            .align(alignment = Alignment.Start)
                            .padding(start = 5.dp)
                    )
                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                    OutlinedTextField(
                        value = inputEmail,
                        placeholder = {
                            Text(
                                text = "Enter your email"
                            )
                        },
                        onValueChange = {newEmail ->
                            inputEmail = newEmail

                        },
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = MaterialTheme.colorScheme.onPrimary,
                            unfocusedContainerColor = MaterialTheme.colorScheme.onPrimary

                        ),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Email,
                                contentDescription = "Email"
                            )
                        },
                        modifier = Modifier
                            .width(360.dp)
                    )

                    Spacer(modifier = Modifier.padding(5.dp))

                    Text(
                        text = "Password",
                        modifier = Modifier
                            .align(alignment = Alignment.Start)
                            .padding(start = 5.dp)
                    )
                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                    OutlinedTextField(
                        value = inputPassWord,
                        placeholder = {
                            Text(
                                text = "Enter your password"
                            )
                        },
                        visualTransformation = if (showPassword)
                            VisualTransformation.None
                        else
                            PasswordVisualTransformation(),
                        onValueChange = { newPassword ->
                            inputPassWord = newPassword

                        },
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = MaterialTheme.colorScheme.onPrimary,
                            unfocusedContainerColor = MaterialTheme.colorScheme.onPrimary

                        ),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Lock,
                                contentDescription = "Password"
                            )
                        },
                        modifier = Modifier
                            .width(360.dp)
                    )

                    Row (
                        modifier = Modifier
                            .align(Alignment.Start)
                    ){
                        IconButton(
                            onClick = {
                                showPassword = !showPassword
                            }
                        ) {
                            Icon(
                                painter = if (showPassword)
                                painterResource(R.drawable.visibility_black)
                                else
                                painterResource(R.drawable.visibility_off_black),
                                contentDescription = "Show Password"
                            )

                        }
                        if (showPassword==false){
                            Text(
                                text = "Show Password",
                                modifier = Modifier
                                    .padding(top = 10.dp)
                            )
                        }else{
                            Text(
                                text = "Hidden Password",
                                modifier = Modifier
                                    .padding(top = 10.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.padding(5.dp))

                    Row(
                        modifier = Modifier
                            .align(Alignment.End)

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
                            .width(400.dp)
                            .height(50.dp)
                            .padding(start = 15.dp, end = 15.dp),
                        shape = RoundedCornerShape(12.dp),
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
                        modifier = Modifier
                            .wrapContentSize()
                            .padding(top = 10.dp),
                        horizontalArrangement = Arrangement.Center,
                    ){
                        Row (
                        ) {
                            Card (
                                colors = CardDefaults.cardColors(
                                    containerColor = MaterialTheme.colorScheme.onPrimary
                                ),
                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 4.dp
                                )
                            ){
                                Row(
                                    modifier = Modifier
                                        .padding(vertical = 10.dp, horizontal = 20.dp)
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.google_logo_icon),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .size(30.dp)
                                            .padding(end = 10.dp)
                                    )
                                    Text(
                                        text = "Google",
                                        modifier = Modifier
                                            .padding(top=3.dp)
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.padding(20.dp))

                        Card(
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.onPrimary
                            ),
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 2.dp
                            )
                        ) {
                            Row (
                                modifier = Modifier
                                    .padding(vertical = 10.dp, horizontal = 20.dp)
                            ){
                                Image(
                                    painter = painterResource(R.drawable.facebook_logo_icon),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(30.dp)
                                        .padding(end = 10.dp)
                                )
                                Text(
                                    text = "Facebook",
                                    modifier = Modifier
                                        .padding(top=3.dp)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.padding(25.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(bottom = 30.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.Bottom
                    ) {
                        Text(
                            text = "Already have an account ?",
                            modifier = Modifier
                                .padding(bottom = 5.dp)
                        )

                        TextButton(
                            onClick = {}
                        ) {
                            Text(
                                text = "Create account",
                                color = primaryBlue,
                                textDecoration = TextDecoration.Underline,
                                modifier = Modifier
                                    .padding(top = 30.dp)

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