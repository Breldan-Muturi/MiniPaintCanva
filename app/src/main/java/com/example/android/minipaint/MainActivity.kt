package com.example.android.minipaint

import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import androidx.core.content.res.ResourcesCompat


class MainActivity : AppCompatActivity() {


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val myCanvasView = MyCanvasView(this)
    myCanvasView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
    myCanvasView.contentDescription = getString(R.string.canvasContentDescription)
    setContentView(myCanvasView)
  }

}
