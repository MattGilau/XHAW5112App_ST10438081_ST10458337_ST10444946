package za.ac.iie.xhaw5112_mobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class contactUS : AppCompatActivity() {

    // Declarations of palettes with lateinit modifier for deferred initialisation
    private lateinit var btnVSC: Button                                                             //(Mhlanga, 2024)
    private lateinit var btnHC: Button                                                              //(Mhlanga, 2024)
    private lateinit var btnVLC: Button                                                             //(Mhlanga, 2024)
    private lateinit var btnCalcC: Button                                                           //(Mhlanga, 2024)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_us)

        btnVLC = findViewById(R.id.btnVLC)                                                          //(Mhlanga, 2024)
        btnHC = findViewById(R.id.btnHC)                                                            //(Mhlanga, 2024)
        btnVSC = findViewById(R.id.btnVSC)                                                          //(Mhlanga, 2024)
        btnCalcC = findViewById(R.id.btnCalcC)                                                      //(Mhlanga, 2024)

        // Set up button click listeners
        homeButton()                                                                                //(IIE, 2024)
        vsButton()                                                                                  //(IIE, 2024)
        shortButton()                                                                               //(IIE, 2024)
        calcButton()                                                                                //(IIE, 2024)
    }

    private fun homeButton(){

        btnHC.setOnClickListener {

            // Pop-up msg for when start button clicked
            Toast.makeText(this@contactUS, "Loading", Toast.LENGTH_SHORT)
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
    private fun vsButton(){

        btnVLC.setOnClickListener {

            // Pop-up msg for when start button clicked
            Toast.makeText(this@contactUS, "Loading", Toast.LENGTH_SHORT)
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
    private fun shortButton(){

        btnVSC.setOnClickListener {

            // Pop-up msg for when start button clicked
            Toast.makeText(this@contactUS, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            // Explicit intent to specify the Activity class should be started
            val intent = Intent(this, shortCoursesSummary::class.java)                 //(IIE, 2024)

            // Start Activity using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            // Logs to provide warnings, debugging assistance and verbose comments (manual testing)
            // Debug logs allow me to test whether the screen transition executes
            Log.d("CU btn", "Button 'Contact Us' clicked to navigate" +                    //(IIE, 2024)
                    " to contactUS page.")
        }
    }
    private fun calcButton(){

        btnCalcC.setOnClickListener {

            // Pop-up msg for when start button clicked
            Toast.makeText(this@contactUS, "Loading", Toast.LENGTH_SHORT)
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
    /*  Reference List:

        Mhlanga, S. 2024. IMAD5112 Instructor, The Independent Institution of Education.
            [IMAD5112 Session]. Semester 1 2024.
        The IIE. 2024. Introduction to Mobile Application Development [IMAD5112 Module Manual].
            The Independent Institution of Education: Unpublished.
     */
}




