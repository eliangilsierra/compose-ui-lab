package me.egil.testapp

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
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyApp() {
    Column(
        modifier = Modifier
            .background(Color.Yellow)
            .padding(15.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
        ) {
            Text(
                text = "Inicio",
                modifier = Modifier
                    .padding(15.dp)
                    .background(Color.Green)
                    .padding(15.dp)
                    .weight(1f)
            )
            Text(
                text = "perfil",
                modifier = Modifier
                    .padding(15.dp)
                    .background(Color.Green)
                    .padding(15.dp)
                    .weight(1f)
            )
            Text(
                text = "Configuracion",
                modifier = Modifier
                    .padding(15.dp)
                    .background(Color.Green)
                    .padding(15.dp)
                    .weight(1f)
            )
        }

        Image(
            painter = painterResource(R.drawable.tecna),
            contentDescription = "mi imagen",
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .clip(CircleShape),
            contentScale = ContentScale.FillBounds
        )

        Row(
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
        ) {
            Text(
                text = "Inicio",
                modifier = Modifier
                    .padding(15.dp)
                    .background(Color.Green)
                    .padding(15.dp)
                    .weight(1f)
            )
            Text(
                text = "perfil",
                modifier = Modifier
                    .padding(15.dp)
                    .background(Color.Green)
                    .padding(15.dp)
                    .weight(1f)
            )
            Text(
                text = "Configuracion",
                modifier = Modifier
                    .padding(15.dp)
                    .background(Color.Green)
                    .padding(15.dp)
                    .weight(1f)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun segundaPantalla() {
    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(15.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(R.drawable.check),
            contentDescription = "mi imagen",
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .clip(CircleShape),
            contentScale = ContentScale.FillBounds
        )
        Text(
            text = "all tasks completed",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = "Nice Work!",
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun tercerapantalla() {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
            .background(Color(214, 176, 255))
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            CeldaTabla(
                titulo = "Inicio",
                descripcion = "Lorem ipsum dolor sit amet consectetur adipiscing elit, " +
                        "fusce arcu venenatis eros aenean tortor, congue porttitor " +
                        "facilisi posuere aptent curae.",
                colorFondo = Color(237, 224, 255),
                modifier = Modifier.weight(1f)
            )
            CeldaTabla(
                titulo = "Perfil",
                descripcion = "Lorem ipsum dolor sit amet consectetur adipiscing elit, " +
                        "fusce arcu venenatis eros aenean tortor, congue porttitor " +
                        "facilisi posuere aptent curae.",
                colorFondo = Color(171, 102, 255),
                modifier = Modifier.weight(1f)
            )
        }
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            CeldaTabla(
                titulo = "Configuración",
                descripcion = "Lorem ipsum dolor sit amet consectetur adipiscing elit, " +
                        "fusce arcu venenatis eros aenean tortor, congue porttitor " +
                        "facilisi posuere aptent curae.",
                colorFondo = Color(200, 160, 255),
                modifier = Modifier.weight(1f)
            )
            CeldaTabla(
                titulo = "Ayuda",
                descripcion = "Lorem ipsum dolor sit amet consectetur adipiscing elit, " +
                        "fusce arcu venenatis eros aenean tortor, congue porttitor " +
                        "facilisi posuere aptent curae.",
                colorFondo = Color(255, 220, 250),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun CeldaTabla(
    titulo: String,
    descripcion: String,
    colorFondo: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .background(colorFondo)
            .padding(15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = titulo,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = descripcion,
            fontSize = 16.sp,
            color = Color.DarkGray
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun MiPantallaDos() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Top App Bar") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                ),
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = null
                    )
                }
            )
        },
        bottomBar = {
            BottomBar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(paddingValues = innerPadding)
        ) {
            BodyScreen()
        }
    }
}

@Composable
fun BodyScreen() {
    var texto1 by remember { mutableStateOf("") }
    var texto2 by remember { mutableStateOf("") }
    var checked by remember { mutableStateOf(true) }
    var switchState by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        TextField(
            value = texto1,
            onValueChange = { texto1 = it },
            placeholder = { Text(text = "Escriba Algo") },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Close, contentDescription = null)
            },
            trailingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = null)
            },
            modifier = Modifier.fillMaxWidth()
        )

        TextField(
            value = texto2,
            onValueChange = { texto2 = it },
            placeholder = { Text(text = "Escriba Algo") },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Close, contentDescription = null)
            },
            trailingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = null)
            },
            modifier = Modifier.fillMaxWidth()
        )

        Button(onClick = {}) {
            Icon(imageVector = Icons.Default.Add, contentDescription = null)
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "Save")
        }

        FilledTonalButton(onClick = {}) {
            Icon(imageVector = Icons.Default.Add, contentDescription = null)
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "Save")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = checked,
                onCheckedChange = { checked = it }
            )
            Text(text = "Check")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Switch(
                checked = switchState,
                onCheckedChange = { switchState = it }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Check")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun cuartaPantalla() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Encabezado",
            modifier = Modifier
                .background(Color(0xFF80DEEA))
                .padding(horizontal = 16.dp, vertical = 8.dp)
        )

        Row(
            modifier = Modifier
                .background(Color(0xFFA5D6A7))
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text("Item 1", modifier = Modifier.background(Color(0xFFFFF176)).padding(8.dp))
            Text("Item 2", modifier = Modifier.background(Color(0xFFFFCC80)).padding(8.dp))
            Text("Item 3", modifier = Modifier.background(Color(0xFFCE93D8)).padding(8.dp))
        }

        Text(
            text = "Pie de página",
            modifier = Modifier
                .background(Color(0xFFEF9A9A))
                .padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun quintaPantalla() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        Image(
            painter = painterResource(R.drawable.perfil),
            contentDescription = "Foto de perfil",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Elian Gil",
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = "Desarrollador Fullstack Senior at Proteccion S.A",
            fontSize = 14.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            EstadisticaPerfil(valor = "150", etiqueta = "Posts")
            EstadisticaPerfil(valor = "2.3K", etiqueta = "Seguidores")
            EstadisticaPerfil(valor = "980", etiqueta = "Likes")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Button(onClick = {}, modifier = Modifier.weight(1f)) {
                Text("Seguir")
            }
            OutlinedButton(onClick = {}, modifier = Modifier.weight(1f)) {
                Text("Mensaje")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Intereses",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            listOf("Música", "Programación", "Gaming", "Viajes", "Fútbol").forEach { interes ->
                SuggestionChip(onClick = {}, label = { Text(interes) })
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Proyectos Recientes",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Card(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(R.drawable.games),
                    contentDescription = null,
                    modifier = Modifier
                        .width(120.dp)
                        .height(140.dp),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier
                        .padding(12.dp)
                        .weight(1f)
                ) {
                    Text(
                        text = "GameScore Tracker",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "App para registrar puntuaciones, logros y estadísticas de tus videojuegos favoritos.",
                        fontSize = 13.sp,
                        color = Color.DarkGray
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(onClick = {}) {
                        Text("Ver más")
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Composable
fun EstadisticaPerfil(valor: String, etiqueta: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = valor, fontWeight = FontWeight.Bold, fontSize = 18.sp)
        Text(text = etiqueta, fontSize = 12.sp, color = Color.Gray)
    }
}

@Composable
fun BottomBar() {
    NavigationBar {
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = null
                )
            },
            label = { Text(text = "Home") }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = null
                )
            },
            label = { Text(text = "Favoritos") }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = null
                )
            },
            label = { Text(text = "Ajuste") }
        )
    }
}
