package com.siddharth_bhat_music_player.music_player.menudrawers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.siddharth_bhat_music_player.music_player.R
import com.siddharth_bhat_music_player.music_player.ui.MainActivity
import kotlinx.android.synthetic.main.activity_settings.*


private lateinit var btnDark: Button

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        back_settings_to_home_button.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }

        btnDark = findViewById(R.id.darkMode)

        val sharedPreferences = getSharedPreferences("sharedPrefs", MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        val isDarkModeOn = sharedPreferences.getBoolean("isDarkModeOn", false)
        if (isDarkModeOn) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            btnDark.text = "Enable Light Mode"
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            btnDark.text = "Enable Dark Mode"
        }

        btnDark.setOnClickListener(View.OnClickListener {
                if (isDarkModeOn) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                    editor.putBoolean("isDarkModeOn", false)
                    editor.apply()
                    btnDark.text = "Enable Dark Mode"
                    Toast.makeText(this, "Light mode enabled !", Toast.LENGTH_SHORT).show()
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                    editor.putBoolean("isDarkModeOn", true)
                    editor.apply()
                    btnDark.text = "Enable Light Mode"
                    Toast.makeText(this, "Dark mode enabled !", Toast.LENGTH_SHORT).show()
                }
            })
        btnFeedback.setOnClickListener {
            if (etFeedback!!.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter feedback !", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Thanks for your feedback !", Toast.LENGTH_LONG).show()
                etFeedback.setText("");
                etFeedback.hint = "Want to send another feedback ?"
            }
        }
    }
}