package za.ac.iie.xhaw5112_mobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class landscaping : AppCompatActivity() {

    private lateinit var btnBack3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landscaping)

        btnBack3 = findViewById(R.id.btnBack3)

        // Find the Spinner by its ID
        val dropdownMenu: Spinner = findViewById(R.id.spinner1)                                     //(see How to Implement Spinner in Android - Codes Easy, 2023)

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(this, R.array.dropdown_Land,                         //(see How to Implement Spinner in Android - Codes Easy, 2023)
            android.R.layout.simple_spinner_item).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)          //(see How to Implement Spinner in Android - Codes Easy, 2023)
            // Apply the adapter to the spinner
            dropdownMenu.adapter = adapter                                                          //(see How to Implement Spinner in Android - Codes Easy, 2023)
        }

        btnBack3.setOnClickListener {
            // Pop-up msg for when start button clicked
            Toast.makeText(this@landscaping, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            // Explicit intent to specify the Activity class should be started
            val intent = Intent(
                this,
                longCoursesSummary::class.java
            )                                                                                       //(IIE, 2024)

            // Start Activity using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            // Logs to provide warnings, debugging assistance and verbose comments (manual testing)
            // Debug logs allow me to test whether the screen transition executes
            Log.d(
                "Back btn", "Button 'Back' clicked to navigate" +                          //(IIE, 2024)
                        " to longCoursesSummary page."
            )

        }
    }
    /*  Reference List:

        How to Implement Spinner in Android - Codes Easy. 2023. YouTube video, added by Codes Easy.
            [Online]. Available at:https://www.youtube.com/watch?v=4ogzfAipGS8 [Accessed 15 September 2024].
        Mhlanga, S. 2024. IMAD5112 Instructor, The Independent Institution of Education.
            [IMAD5112 Session]. Semester 1 2024.
        The IIE. 2024. Introduction to Mobile Application Development [IMAD5112 Module Manual].
            The Independent Institution of Education: Unpublished.
     */
}