package ru.startandroid.develop.preferencessimple2

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var tvInfo: TextView? = null
    var sp: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInfo = findViewById(R.id.tvInfo)
        sp = PreferenceManager.getDefaultSharedPreferences(this)
    }

    override fun onResume() {
        val listValue = sp!!.getString("list", "не выыбрано")
        tvInfo!!.text = "Значение списка - $listValue"
        super.onResume()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val mi:MenuItem = menu!!.add(0, 1, 0, "Preferences")
        mi.setIntent(Intent(this, PrefActivity::class.java))
        return super.onCreateOptionsMenu(menu)
    }
}