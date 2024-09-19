package za.ac.iie.xhaw5112_mobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class firstAid : AppCompatActivity() {

    private lateinit var btnBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid)

        btnBack = findViewById(R.id.btnBack)                                                        //(IIE, 2024)

        // Find the Spinner by its ID
        val dropdownMenu: Spinner = findViewById(R.id.spinner1)                                     //(see How to Implement Spinner in Android - Codes Easy, 2023)
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(this, R.array.dropdown_FA,
            android.R.layout.simple_spinner_item).also { adapter ->                                 //(see How to Implement Spinner in Android - Codes Easy, 2023)
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)          //(see How to Implement Spinner in Android - Codes Easy, 2023)
            // Apply the adapter to the spinner
            dropdownMenu.adapter = adapter                                                          //(see How to Implement Spinner in Android - Codes Easy, 2023)

            btnBack.setOnClickListener {

                // Pop-up msg for when button clicked
                Toast.makeText(this@firstAid, "Loading", Toast.LENGTH_SHORT)
                    .show()                                                                         //(IIE, 2024)

                // Explicit intent to specify the Activity class should be started
                val intent = Intent(this, longCoursesSummary::class.java)              //(IIE, 2024)

                // Start Activity using the intent created
                startActivity(intent)                                                               //(IIE, 2024)

                Log.d(
                    "Back btn", "Button 'Back' clicked to navigate" +                      //(IIE, 2024)
                            " to longCoursesSummary page."
                )
            }
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