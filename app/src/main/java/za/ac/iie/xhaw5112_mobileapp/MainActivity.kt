package za.ac.iie.xhaw5112_mobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // Declarations of palettes with lateinit modifier for deferred initialisation
    private lateinit var btnViewLong: Button                                                        //(Mhlanga, 2024)
    private lateinit var btnViewShort: Button                                                       //(Mhlanga, 2024)
    private lateinit var btnContact: Button                                                         //(Mhlanga, 2024)
    // NOTE: the other palettes are unused and don't require declaration/initialisation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Deferred initialisation of functional palettes
        btnViewLong = findViewById(R.id.btnViewLong)                                                //(Mhlanga, 2024)
        btnViewShort = findViewById(R.id.btnViewShort)                                              //(Mhlanga, 2024)
        btnContact = findViewById(R.id.btnContact)                                                  //(Mhlanga, 2024)

        // Lambda expression for the button function
        btnViewLong.setOnClickListener {                                                     //(IIE, 2024)

            //Pop-up msg for when button clicked
            Toast.makeText(this@MainActivity, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            //Explicit intent to specify the Activity longCoursesSummary class should be started
            val intent = Intent(this, longCoursesSummary::class.java)                  //(IIE, 2024)

            // Start Activity longCoursesSummary using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            // Logs to provide warnings, debugging assistance and verbose comments (manual testing)
            // Debug logs allow me to test whether the screen transition executes
            Log.w("Home Screen Buttons", "Starting of the additional screens not " +                //(IIE, 2024)
                    "tested for exceptions.")
            Log.d("View Long Courses btn", "Button 'View Long Courses' clicked to navigate" +       //(IIE, 2024)
                    " to longCoursesSummary page.")
            Log.v("Functionality", "Additional screens were added per the specifications " +
                    "layed-out for the POE.")                                                       //(IIE, 2024)

        }

        // Lambda expression for the button function
        btnViewShort.setOnClickListener {                                                    //(IIE, 2024)

            //Pop-up msg for when button clicked
            Toast.makeText(this@MainActivity, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            //Explicit intent to specify the Activity class should be started
            val intent = Intent(this, shortCoursesSummary::class.java)                  //(IIE, 2024)

            // Start Activity using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            // Logs to provide warnings, debugging assistance and verbose comments (manual testing)
            // Debug logs allow me to test whether the screen transition executes
            Log.d("View Short Courses btn", "Button 'View Short Courses' clicked to navigate" +       //(IIE, 2024)
                    " to shortCoursesSummary page.")
            Log.d("View Short Courses btn", "Button 'View Short Courses' clicked to navigate" +     //(IIE, 2024)
                    " to shortCoursesSummary page.")
        }

        // Lambda expression for the button function
        btnContact.setOnClickListener {                                                      //(IIE, 2024)

            //Pop-up msg for when button clicked
            Toast.makeText(this@MainActivity, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            //Explicit intent to specify the Activity class should be started
            val intent = Intent(this, contactUS::class.java)                           //(IIE, 2024)

            // Start Activity using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            // Logs to provide warnings, debugging assistance and verbose comments (manual testing)
            // Debug logs allow me to test whether the screen transition executes
            Log.d("Contact Us btn", "Button to navigate to the Contact Us page.")          //(IIE, 2024)
        }
    }
    /*  Reference List:

        Mhlanga, S. 2024. IMAD5112 Instructor, The Independent Institution of Education.
            [IMAD5112 Session]. Semester 1 2024.
        The IIE. 2024. Introduction to Mobile Application Development [IMAD5112 Module Manual].
            The Independent Institution of Education: Unpublished.
     */
}