package com.example.hellojetpack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.core.setContent
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.example.hellojetpack.ui.HelloJetPackTheme
import com.example.hellojetpack.ui.typography

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Example1()
        }
    }
}
@Composable
fun Example1() {
    val image = imageResource(R.drawable.coconut)
    MaterialTheme {
        Column(
                modifier = Modifier.padding(16.dp)
        ) {
            val imageModifier = Modifier
                    .preferredHeightIn(maxHeight = 180.dp)
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(10.dp))
            Image(image, modifier = imageModifier,
                    contentScale = ContentScale.Crop)
            Spacer(Modifier.preferredHeight(16.dp))
            Text("Hello world.", style = typography.h6)
            Text("I am Nguyen Cuong", style = typography.body2)
            Text("I studied in HCMUS",style =  typography.body2)
        }
    }
}

@Preview
@Composable
fun Preview() {
    Example1()
}