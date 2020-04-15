package net.kaniyama.apps.wriketask.Wrike.Oauth20

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.shuhart.stepview.StepView
import kotlinx.android.synthetic.main.activity_scrolling.*
import kotlinx.android.synthetic.main.activity_wrike_oauth_configration.*
import net.kaniyama.apps.wriketask.R


class ConfigurationActivity : AppCompatActivity() {

    private lateinit var viewModel : ConfigrationViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrike_oauth_configration)

        // --- Setup ViewModel
        viewModel =
            ViewModelProviders.of(this).get(ConfigrationViewModel::class.java)
        with(viewModel){
            viewModel.onActivityCreated(this@ConfigurationActivity)
        }

        // --- Setup Navigation components
        val navController = findNavController(R.id.wrike_oauth_configration)
        val appBarConfiguration = AppBarConfiguration(navController.graph)

        // --- Header ------------------------------------------------------------------------------
        navController.addOnDestinationChangedListener{ controller, destination, argments ->
            headerTitle.text = destination.label
        }

        // ---
        findViewById<StepView>(R.id.headerStepView).state
            .animationType(StepView.ANIMATION_CIRCLE)
            .steps(object : ArrayList<String?>() {
                init {
                    add("First step")
                    add("Second step")
                    add("Third step")
                }
            })
            .stepsNumber(4)
            .commit()

        // --- Control Button
//        findViewById<Button>(R.id.nextButton).setOnClickListener {
//            navController.navigate(navController.currentDestination!!.id)
//        }
    }
}
