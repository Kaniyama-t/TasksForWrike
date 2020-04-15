package net.kaniyama.apps.wriketask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.ActivityNavigator
import net.kaniyama.apps.wriketask.Wrike.Oauth20.ConfigrationViewModel
import net.kaniyama.apps.wriketask.Wrike.Oauth20.ConfigurationActivity
import net.kaniyama.apps.wriketask.ui.gallery.GalleryViewModel

class InitializationActivity : AppCompatActivity() {

    private lateinit var viewModel: InitializationActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_initialization)

        viewModel =
            ViewModelProviders.of(this).get(InitializationActivityViewModel::class.java)
        with(viewModel){
            // --- ローディングメッセージ ----------------------------------------------------------
            // --- 準備が整ったときの挙動 ----------------------------------------------------------
            goMainActivity.observe(this@InitializationActivity, Observer {
                ActivityNavigator(this@InitializationActivity).let {
                    it.navigate(
                        it.createDestination().setIntent(
                            Intent(
                                this@InitializationActivity,
                                ConfigurationActivity::class.java
                            )
                        ), null, null, null
                    )
                }
            })
            // --- 準備開始 ------------------------------------------------------------------------
            onWakeupApplication()
        }
    }
}
