package za.ac.iie.xhaw5112_mobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class longCoursesSummary : AppCompatActivity() {

    // Declarations of palettes with lateinit modifier for deferred initialisation
    private lateinit var btnHome: Button                                                            //(Mhlanga, 2024)
    private lateinit var btnVS: Button                                                              //(Mhlanga, 2024)
    private lateinit var btnContactUs: Button                                                       //(Mhlanga, 2024)
    private lateinit var btnCalc1: Button                                                           //(Mhlanga, 2024)
    private lateinit var view1: Button                                                              //(Mhlanga, 2024)
    private lateinit var view2: Button                                                              //(Mhlanga, 2024)
    private lateinit var view3: Button                                                              //(Mhlanga, 2024)
    private lateinit var view4: Button                                                              //(Mhlanga, 2024)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_long_courses_summary)

        // Deferred initialisation of functional palettes
        btnHome = findViewById(R.id.btnHome)                                                        //(Mhlanga, 2024)
        btnVS = findViewById(R.id.btnVS)                                                            //(Mhlanga, 2024)
        btnContactUs = findViewById(R.id.btnContactUs)                                              //(Mhlanga, 2024)
        btnCalc1 = findViewById(R.id.btnCalc1)                                                      //(Mhlanga, 2024)
        view1 = findViewById(R.id.view1)                                                            //(Mhlanga, 2024)
        view2 = findViewById(R.id.view2)                                                            //(Mhlanga, 2024)
        view3 = findViewById(R.id.view3)                                                            //(Mhlanga, 2024)
        view4 = findViewById(R.id.view4)                                                            //(Mhlanga, 2024)

        // Set up button click listeners
        homeButton()                                                                                //(IIE, 2024)
        vsButton()                                                                                  //(IIE, 2024)
        contactUsButton()                                                                           //(IIE, 2024)
        calcButton()                                                                                //(IIE, 2024)
        view1()                                                                                     //(IIE, 2024)
        view2()                                                                                     //(IIE, 2024)
        view3()                                                                                     //(IIE, 2024)
        view4()                                                                                     //(IIE, 2024)
    }

    // Method to handle the Home button click
    private fun homeButton() {                                                                      //(IIE, 2024)
        btnHome.setOnClickListener {

            // Pop-up msg for when start button clicked
            Toast.makeText(this@longCoursesSummary, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            // Explicit intent to specify the Activity class should be started
            val intent = Intent(this, MainActivity::class.java)                        //(IIE, 2024)

            // Start Activity using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            // Logs to provide warnings, debugging assistance and verbose comments (manual testing)
            // Debug logs allow me to test whether the screen transition executes
            Log.d("Home btn", "Button 'Home' clicked to navigate" +                        //(IIE, 2024)
                    " to MainActivity page.")
        }
    }

    // Method to handle the View Short Courses button click
    private fun vsButton() {                                                                        //(IIE, 2024)
        btnVS.setOnClickListener {

            // Pop-up msg for when start button clicked
            Toast.makeText(this@longCoursesSummary, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            // Explicit intent to specify the Activity class should be started
            val intent = Intent(this, shortCoursesSummary::class.java)                 //(IIE, 2024)

            // Start Activity using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            // Logs to provide warnings, debugging assistance and verbose comments (manual testing)
            // Debug logs allow me to test whether the screen transition executes
            Log.d("View Short Courses btn", "Button 'Home' clicked to navigate" +          //(IIE, 2024)
                    " to shortCourseSummary page.")
        }
    }

    // Method to handle the Contact Us button click
    private fun contactUsButton() {                                                                 //(IIE, 2024)
        btnContactUs.setOnClickListener {

            // Pop-up msg for when button clicked
            Toast.makeText(this@longCoursesSummary, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            // Explicit intent to specify the Activity class should be started
            val intent = Intent(this, contactUS::class.java)                           //(IIE, 2024)

            // Start Activity using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            // Logs to provide warnings, debugging assistance and verbose comments (manual testing)
            // Debug logs allow me to test whether the screen transition executes
            Log.d("Contact Us btn", "Button 'Home' clicked to navigate" +                  //(IIE, 2024)
                    " to contactUS page.")
        }

    }
    private fun calcButton(){

        btnCalc1.setOnClickListener {

            // Pop-up msg for when button clicked
            Toast.makeText(this@longCoursesSummary, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            // Explicit intent to specify the Activity class should be started
            val intent = Intent(this, calculateFees::class.java)                       //(IIE, 2024)

            // Start Activity using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            Log.d("btnCalc1", "Button 'Calculate Fees' clicked to navigate" +              //(IIE, 2024)
                    " to calculateFees page.")
        }
    }
    private fun view1() {

        view1.setOnClickListener {

            // Pop-up msg for when button clicked
            Toast.makeText(this@longCoursesSummary, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            // Explicit intent to specify the Activity class should be started
            val intent = Intent(this, firstAid::class.java)                            //(IIE, 2024)

            // Start Activity using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            Log.d("view1", "Button 'View More' clicked to navigate" +                      //(IIE, 2024)
                    " to firstAid page.")
        }
    }
    private fun view2(){

        view2.setOnClickListener {

            // Pop-up msg for when button clicked
            Toast.makeText(this@longCoursesSummary, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            // Explicit intent to specify the Activity class should be started
            val intent = Intent(this, sewing::class.java)                              //(IIE, 2024)

            // Start Activity using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            Log.d("view2", "Button 'View More' clicked to navigate" +                      //(IIE, 2024)
                    " to sewing page.")
        }
    }
    private fun view3(){

        view3.setOnClickListener {

            // Pop-up msg for when button clicked
            Toast.makeText(this@longCoursesSummary, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            // Explicit intent to specify the Activity class should be started
            val intent = Intent(this, landscaping::class.java)                         //(IIE, 2024)

            // Start Activity using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            Log.d("view3", "Button 'View More' clicked to navigate" +                      //(IIE, 2024)
                    " to landscaping page.")

        }
    }
    private fun view4(){

        view4.setOnClickListener {

            // Pop-up msg for when button clicked
            Toast.makeText(this@longCoursesSummary, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            // Explicit intent to specify the Activity class should be started
            val intent = Intent(this, lifeSkills::class.java)                           //(IIE, 2024)

            // Start Activity using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            Log.d("view4", "Button 'View More' clicked to navigate" +                      //(IIE, 2024)
                    " to lifeSkills page.")

        }
    }

    /*  Reference List:

        Mhlanga, S. 2024. IMAD5112 Instructor, The Independent Institution of Education.
            [IMAD5112 Session]. Semester 1 2024.
        The IIE. 2024. Introduction to Mobile Application Development [IMAD5112 Module Manual].
            The Independent Institution of Education: Unpublished.
     */
}