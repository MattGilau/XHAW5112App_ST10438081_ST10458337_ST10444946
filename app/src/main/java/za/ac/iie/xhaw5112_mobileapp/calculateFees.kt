package za.ac.iie.xhaw5112_mobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class calculateFees : AppCompatActivity() {

    // Declarations of palettes with lateinit modifier for deferred initialisation
    private lateinit var butH: Button                                                               //(Mhlanga, 2024)
    private lateinit var butVL: Button                                                              //(Mhlanga, 2024)
    private lateinit var butVS: Button                                                              //(Mhlanga, 2024)
    private lateinit var butC: Button                                                               //(Mhlanga, 2024)
    private lateinit var enterNameS: EditText                                                       //(Mhlanga, 2024)
    private lateinit var enterPhone: EditText                                                       //(Mhlanga, 2024)
    private lateinit var enterEmail: EditText                                                       //(Mhlanga, 2024)
    private lateinit var btnSubmit: Button                                                          //(Mhlanga, 2024)
    private lateinit var btnClear: Button                                                           //(Mhlanga, 2024)
    private lateinit var btnCal: Button                                                             //(Mhlanga, 2024)
    private lateinit var checkBoxFirstAid: CheckBox                                                 //(Mhlanga, 2024)
    private lateinit var checkBoxSewing: CheckBox                                                   //(Mhlanga, 2024)
    private lateinit var checkBoxLandscaping: CheckBox                                              //(Mhlanga, 2024)
    private lateinit var checkBoxLifeSkills: CheckBox                                               //(Mhlanga, 2024)
    private lateinit var checkBoxCooking: CheckBox                                                  //(Mhlanga, 2024)
    private lateinit var checkBoxChildMinding: CheckBox                                             //(Mhlanga, 2024)
    private lateinit var checkBoxGardenMaintenance: CheckBox                                        //(Mhlanga, 2024)
    private lateinit var totalTextView: TextView                                                    //(Mhlanga, 2024)
    private lateinit var totalDiscountTextView: TextView                                            //(Mhlanga, 2024)
    private lateinit var totalVATTextView: TextView                                                 //(Mhlanga, 2024)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_fees)

        // Deferred initialisation of functional palettes
        butC = findViewById(R.id.butC)                                                              //(Mhlanga, 2024)
        butH = findViewById(R.id.butH)                                                              //(Mhlanga, 2024)
        butVL = findViewById(R.id.butVL)                                                            //(Mhlanga, 2024)
        butVS = findViewById(R.id.butVS)                                                            //(Mhlanga, 2024)
        enterNameS = findViewById(R.id.enterNameS)                                                  //(Mhlanga, 2024)
        enterPhone = findViewById(R.id.enterPhone)                                                  //(Mhlanga, 2024)
        enterEmail = findViewById(R.id.enterEmail)                                                  //(Mhlanga, 2024)
        btnSubmit = findViewById(R.id.btnSubmit)                                                    //(Mhlanga, 2024)
        btnClear = findViewById(R.id.btnClear)                                                      //(Mhlanga, 2024)
        btnCal = findViewById(R.id.btnCal)                                                          //(Mhlanga, 2024)
        checkBoxFirstAid = findViewById(R.id.checkBoxFirstAid)                                      //(Mhlanga, 2024)
        checkBoxSewing = findViewById(R.id.checkBoxSewing)                                          //(Mhlanga, 2024)
        checkBoxLandscaping = findViewById(R.id.checkBoxLandscaping)                                //(Mhlanga, 2024)
        checkBoxLifeSkills = findViewById(R.id.checkBoxLifeSkills)                                  //(Mhlanga, 2024)
        checkBoxCooking = findViewById(R.id.checkBoxCooking)                                        //(Mhlanga, 2024)
        checkBoxChildMinding = findViewById(R.id.checkBoxChildMinding)                              //(Mhlanga, 2024)
        checkBoxGardenMaintenance = findViewById(R.id.checkBoxGardenMaintenance)                    //(Mhlanga, 2024)
        totalTextView = findViewById(R.id.totalTextView)                                            //(Mhlanga, 2024)
        totalDiscountTextView = findViewById(R.id.totalDiscountTextView)                            //(Mhlanga, 2024)
        totalVATTextView = findViewById(R.id.totalVATTextView)                                      //(Mhlanga, 2024)

        // Set up button click listeners
        homeButton()                                                                                //(IIE, 2024)
        vlButton()                                                                                  //(IIE, 2024)
        shortButton()                                                                               //(IIE, 2024)
        conButton()                                                                                 //(IIE, 2024)
        validateInfo()                                                                              //(IIE, 2024)
        clearAll()                                                                                  //(IIE, 2024)
        btnCal.setOnClickListener { calculateTotal() }                                              //(IIE, 2024)
        btnClear.setOnClickListener { clearAll() }                                                  //(IIE, 2024)

        btnSubmit.setOnClickListener {                                                       //(IIE, 2024)
            if (validateInfo()) {
                Toast.makeText(this@calculateFees, "Info captured",
                    Toast.LENGTH_SHORT).show()                                                      //(IIE, 2024)
            }
        }


    }

    private fun validateInfo(): Boolean {                                                           //(IIE, 2024)
        val name = enterNameS.text.toString().trim()                                                //(IIE, 2024)
        val phone = enterPhone.text.toString().trim()                                               //(IIE, 2024)
        val email = enterEmail.text.toString().trim()                                               //(IIE, 2024)

        // Check if the name field is empty
        if (name.isEmpty()) {                                                                       //(IIE, 2024)
            Log.e("Validation Error", "Name field is empty")                               //(IIE, 2024)
            Toast.makeText(this@calculateFees, "Please enter your name",
                Toast.LENGTH_SHORT).show()                                                          //(IIE, 2024)
            return false                                                                            //(IIE, 2024)
        } else {
            Log.d("Validation Success", "Name: $name")                                     //(IIE, 2024)
        }

        // Check if the phone number is numeric and of valid length
        if (phone.isEmpty()) {                                                                      //(IIE, 2024)
            Log.e(
                "Validation Error",
                "Phone field is empty"
            )                              //(IIE, 2024)
            Toast.makeText(this@calculateFees, "Please enter your phone number",
                Toast.LENGTH_SHORT).show()                                                          //(IIE, 2024)
            return false                                                                            //(IIE, 2024)
        } else if (phone.length != 10) {                                                            //(IIE, 2024)
            Log.e("Validation Error", "Phone number is not 10 digits. Length: ${phone.length}")//(IIE, 2024)
            Toast.makeText(
                this@calculateFees, "Please enter a valid " +
                        "10-digit phone number", Toast.LENGTH_SHORT).show()                             //(IIE, 2024)
            return false                                                                            //(IIE, 2024)
        } else if (!phone.all { it.isDigit() }) {                                                   //(IIE, 2024)
            Log.e("Validation Error", "Phone number contains non-numeric characters")      //(IIE, 2024)
            Toast.makeText(this@calculateFees, "Please enter a valid 10-digit phone " +
                        "number", Toast.LENGTH_SHORT).show()                                        //(IIE, 2024)
            return false                                                                            //(IIE, 2024)
        } else {
            Log.d("Validation Success", "Phone: $phone")                                   //(IIE, 2024)
        }

        // Check if the email format is valid
        if (email.isEmpty()) {                                                                      //(IIE, 2024)
            Log.e("Validation Error", "Email field is empty")                              //(IIE, 2024)
            Toast.makeText(this@calculateFees, "Please enter your email " +
                        "address", Toast.LENGTH_SHORT).show()                                       //(IIE, 2024)
            return false                                                                            //(IIE, 2024)
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {                              //(IIE, 2024)
            Log.e("Validation Error", "Invalid email format: $email")                      //(IIE, 2024)
            Toast.makeText(
                this@calculateFees, "Please enter a valid email address",
                Toast.LENGTH_SHORT).show()                                                          //(IIE, 2024)
            return false                                                                            //(IIE, 2024)
        } else {
            Log.d("Validation Success", "Email: $email")                                   //(IIE, 2024)
        }

        // If all validations pass, return true
        Log.d("Validation", "All inputs are valid")                                        //(IIE, 2024)
        return true                                                                                 //(IIE, 2024)
    }

    private fun homeButton() {                                                                       //(IIE, 2024)
        butH.setOnClickListener {

            // Pop-up msg for when start button clicked
            Toast.makeText(this@calculateFees, "Loading", Toast.LENGTH_SHORT)
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

    private fun shortButton() {                                                                      //(IIE, 2024)
        butVS.setOnClickListener {

            // Pop-up msg for when start button clicked
            Toast.makeText(this@calculateFees, "Loading", Toast.LENGTH_SHORT)
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

    private fun vlButton() {                                                                         //(IIE, 2024)

        butVL.setOnClickListener {

            // Pop-up msg for when start button clicked
            Toast.makeText(this@calculateFees, "Loading", Toast.LENGTH_SHORT)
                .show()                                                                             //(IIE, 2024)

            // Explicit intent to specify the Activity class should be started
            val intent =
                Intent(this, longCoursesSummary::class.java)                           //(IIE, 2024)

            // Start Activity using the intent created
            startActivity(intent)                                                                   //(IIE, 2024)

            // Logs to provide warnings, debugging assistance and verbose comments (manual testing)
            // Debug logs allow me to test whether the screen transition executes
            Log.d("VL2 btn", "Button 'View Long Courses' clicked to navigate" +            //(IIE, 2024)
                        " to longCoursesSummary page.")
        }

    }

    private fun conButton() {                                                                        //(IIE, 2024)

        butC.setOnClickListener {


            Toast.makeText(this@calculateFees, "Loading", Toast.LENGTH_SHORT)
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

    private fun calculateTotal() {                                                                  //(IIE, 2024)

        Toast.makeText(this@calculateFees, "Calculating...", Toast.LENGTH_SHORT)
            .show()                                                                                 //(IIE, 2024)

        val courseFees = listOf(                                                                    //(OpenAI, 2024)
            Pair(checkBoxFirstAid, 1500),                                                           //(OpenAI, 2024)
            Pair(checkBoxSewing, 1500),                                                             //(OpenAI, 2024)
            Pair(checkBoxLandscaping, 1500),                                                        //(OpenAI, 2024)
            Pair(checkBoxLifeSkills, 1500),                                                         //(OpenAI, 2024)
            Pair(checkBoxCooking, 750),                                                             //(OpenAI, 2024)
            Pair(checkBoxChildMinding, 750),                                                        //(OpenAI, 2024)
            Pair(checkBoxGardenMaintenance, 750))                                                   //(OpenAI, 2024)
        var total = 0
        var selectedCourses = 0
        courseFees.forEach { (checkBox, fee) ->                                                     //(OpenAI, 2024)
            if (checkBox.isChecked) {                                                               //(OpenAI, 2024)
                total += fee                                                                        //(OpenAI, 2024)
                selectedCourses++                                                                   //(OpenAI, 2024)
            }
        }
        // Apply discount based on the number of selected courses
        var discount = 0.0                                                                          //(IIE, 2024)
        var discountPercentage = "0%"                                                               //(IIE, 2024)

        when (selectedCourses) {                                                                    //(IIE, 2024)
            1 -> {                                                                                  //(IIE, 2024)
                discount = 0.0
                discountPercentage = "0%"
            }
            2 -> {                                                                                  //(IIE, 2024)
                discount = 0.05
                discountPercentage = "5%"
            }
            3 -> {                                                                                  //(IIE, 2024)
                discount = 0.10
                discountPercentage = "10%"
            }
            else -> {                                                                               //(IIE, 2024)
                discount = 0.15
                discountPercentage = "15%"
            }
        }

        // Apply discount to total
        val discountedTotal = total - (total * discount)                                            //(IIE, 2024)
        // Add VAT (15%)
        val vat = 0.15                                                                              //(IIE, 2024)
        val totalWithVAT = discountedTotal + (discountedTotal * vat)                                //(IIE, 2024)

        // Display the total with VAT applied
        totalDiscountTextView.text = "Discounted Total = R${"%.2f".format(discountedTotal)} ($discountPercentage Discount)"//(Mhlanga, 2024)
        totalVATTextView.text = "Total with VAT = R${"%.2f".format(totalWithVAT)}"                  //(Mhlanga, 2024)
        totalTextView.text = "Quote Total = R${"%.2f".format(totalWithVAT)}"                        //(Mhlanga, 2024)

    }

    private fun clearAll() {                                                                        //(IIE, 2024)
        Toast.makeText(this@calculateFees, "Cleared", Toast.LENGTH_SHORT)
            .show()                                                                                 //(IIE, 2024)

        enterNameS.text.clear()                                                                     //(IIE, 2024)
        enterPhone.text.clear()                                                                     //(IIE, 2024)
        enterEmail.text.clear()                                                                     //(IIE, 2024)
        totalTextView.text = "Total = R0"                                                           //(IIE, 2024)
        totalDiscountTextView.text = "Discounted Total = R0 (0% discount)"                          //(IIE, 2024)
        totalVATTextView.text = "Total with VAT = R0"                                               //(IIE, 2024)
        listOf(checkBoxFirstAid, checkBoxSewing, checkBoxLandscaping, checkBoxLifeSkills,           //(OpenAI, 2024)
            checkBoxCooking, checkBoxChildMinding, checkBoxGardenMaintenance).forEach { it.isChecked = false }
        totalTextView.text = "Total = R0"                                                           //(IIE, 2024)
    }
    /*  Reference List:

        OpenAI. 2024. Chat-GPT (Version 4). [Large language model]. Available at:
            https://chat.openai.com/ [Accessed: 18 September 2024].
        Mhlanga, S. 2024. IMAD5112 Instructor, The Independent Institution of Education.
            [IMAD5112 Session]. Semester 1 2024.
        The IIE. 2024. Introduction to Mobile Application Development [IMAD5112 Module Manual].
            The Independent Institution of Education: Unpublished.
     */
}
