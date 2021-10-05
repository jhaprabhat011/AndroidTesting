package com.example.androidtesting

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.junit.Assert.*

class MainActivityTest {
    //create rule

    @get:Rule
    val testRule = ActivityScenarioRule<MainActivity>(MainActivity::class.java)

    @Test
    fun testLayout() {
        testRule.scenario.onActivity {
            val tv = it.findViewById<TextView>(R.id.tv)
            assertNotNull(tv)

            val nameEditText = it.findViewById<EditText>(R.id.nameE)
            assertNotNull(nameEditText)

            val okButton = it.findViewById<Button>(R.id.button)
            assertNotNull(okButton)

            val tvText = tv.text.toString()
            val name = nameEditText.text.toString()

            assertEquals("Hello World!",tvText)
            assertEquals("",name)

            val isBtnClickable = okButton.isEnabled
            assertTrue(isBtnClickable)

        }

    }
}