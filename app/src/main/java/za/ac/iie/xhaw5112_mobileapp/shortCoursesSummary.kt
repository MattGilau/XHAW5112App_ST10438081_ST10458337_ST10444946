package za.ac.iie.xhaw5112_mobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class shortCoursesSummary : AppCompatActivity() {

    // Declarations of palettes with lateinit modifier for deferred initialisation
    private lateinit var btnHome2: Button                                                           //(Mhlanga, 2024)
    private lateinit var btnVL2: Button                                                             //(Mhlanga, 2024)
    private lateinit var btnCU: Button                                                              //(Mhlanga, 2024)
    private lateinit var btnCalc2: Button                                                           //(Mhlanga, 2024)
    private lateinit var view5: Button                                                              //(Mhlanga, 2024)
    private lateinit var view6: Button                                                              //(Mhlanga, 2024)
    private lateinit var view7: Button                                                              //(Mhlanga, 2024)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_short_courses_summary)

        // Deferred initialisation of functional palettes
        btnHome2 = findViewById(R.id.btnHome2)                                                      //(Mhlanga, 2024)
        btnVL2 = findViewById(R.id.btnVL2)                                                          //(Mhlanga, 2024)
        btnCU = findViewById(R.id.btnCU)                                                            //(Mhlanga, 2024)
        btnCalc2 = findViewById(R.id.btnCalc2)                                                      //(Mhlanga, 2024)
        view5 = findViewById(R.id.view5)                                                            //(Mhlanga, 2024)
        view6 = findViewById(R.id.view6)                                                            //(Mhlanga, 2024)
        view7 = findViewById(R.id.view7)                                                            //(Mhlanga, 2024)

        // Set up button click listeners
        homeButton()                                                                                //(IIE, 2024)
        vlButton()                                                                                  //(IIE, 2024)
        contactUsButton()                                                                           //(IIE, 2024)
        calcButton()                                                                                //(IIE, 2024)
        view5()                                                                                     //(IIE, 2024)
        view6()                                                                                     //(IIE, 2024)
        view7()                                                                                     //(IIE, 2024)
    }

    private fun homeButton(){

        btnHome2.setOnClickListener {

            // Pop-up msg for when button clicked
            Toast.makeText(this@shortCoursesSummary, "Loading", Toast.LENGTH_SHORT)
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
    private fun vlButton(){

        btnVL2.setOnClickListener {

            // Pop-up msg for when button clicked
            Toast.makeText(this@shortCoursesSummary, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            // Explicit intent to specify the Activity class should be started
            val intent = Intent(this, longCoursesSummary::class.java)                  //(IIE, 2024)

            // Start Activity using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            // Logs to provide warnings, debugging assistance and verbose comments (manual testing)
            // Debug logs allow me to test whether the screen transition executes
            Log.d("VL2 btn", "Button 'View Long Courses' clicked to navigate" +            //(IIE, 2024)
                    " to longCoursesSummary page.")
        }
    }
    private fun contactUsButton(){

        btnCU.setOnClickListener {

            // Pop-up msg for when button clicked
            Toast.makeText(this@shortCoursesSummary, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            // Explicit intent to specify the Activity class should be started
            val intent = Intent(this, contactUS::class.java)                           //(IIE, 2024)

            // Start Activity using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            // Logs to provide warnings, debugging assistance and verbose comments (manual testing)
            // Debug logs allow me to test whether the screen transition executes
            Log.d("CU btn", "Button 'Contact Us' clicked to navigate" +                    //(IIE, 2024)
                    " to contactUS page.")
        }
    }
    private fun calcButton(){

        btnCalc2.setOnClickListener {

            // Pop-up msg for when button clicked
            Toast.makeText(this@shortCoursesSummary, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            // Explicit intent to specify the Activity class should be started
            val intent = Intent(this, calculateFees::class.java)                       //(IIE, 2024)

            // Start Activity using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            // Logs to provide warnings, debugging assistance and verbose comments (manual testing)
            // Debug logs allow me to test whether the screen transition executes
            Log.d("btnCalc2", "Button 'Calculate Fees' clicked to navigate" +              //(IIE, 2024)
                    " to calculateFees page.")
        }
    }
    private fun view5(){

        view5.setOnClickListener {
            // Pop-up msg for when button clicked
            Toast.makeText(this@shortCoursesSummary, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            // Explicit intent to specify the Activity class should be started
            val intent =
                Intent(this, cooking::class.java)                                      //(IIE, 2024)

            // Start Activity using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            Log.d("view5", "Button 'View More' clicked to navigate" +                      //(IIE, 2024)
                    " to cooking page.")
        }
    }
    private fun view6(){

        view6.setOnClickListener {
            // Pop-up msg for when button clicked
            Toast.makeText(this@shortCoursesSummary, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            // Explicit intent to specify the Activity class should be started
            val intent =
                Intent(this, childMinding::class.java)                                 //(IIE, 2024)

            // Start Activity using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            Log.d("view6", "Button 'View More' clicked to navigate" +                      //(IIE, 2024)
                    " childMinding to page.")
        }
    }
    private fun view7(){

        view7.setOnClickListener {
            // Pop-up msg for when button clicked
            Toast.makeText(this@shortCoursesSummary, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            // Explicit intent to specify the Activity class should be started
            val intent =
                Intent(this, gardenM::class.java)                                      //(IIE, 2024)

            // Start Activity using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            Log.d("view7", "Button 'View More' clicked to navigate" +                      //(IIE, 2024)
                    " to gardenM page.")
        }
    }
    /*  Reference List:

        Mhlanga, S. 2024. IMAD5112 Instructor, The Independent Institution of Education.
            [IMAD5112 Session]. Semester 1 2024.
        The IIE. 2024. Introduction to Mobile Application Development [IMAD5112 Module Manual].
            The Independent Institution of Education: Unpublished.
     */
}