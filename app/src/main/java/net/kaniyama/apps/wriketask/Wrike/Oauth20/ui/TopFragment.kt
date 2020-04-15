package net.kaniyama.apps.wriketask.Wrike.Oauth20.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import net.kaniyama.apps.wriketask.R
import net.kaniyama.apps.wriketask.Wrike.Oauth20.ConfigrationViewModel
import net.kaniyama.apps.wriketask.Wrike.Oauth20.ConfigurationActivity

/**
 * A simple [Fragment] subclass.
 */
class TopFragment : Fragment() {

    private lateinit var activity: ConfigurationActivity

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        this.activity = getActivity() as ConfigurationActivity
        //activity.setChanger(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v = inflater.inflate(R.layout.fragment_wrike_oauth_top, container, false)
        v.findViewById<TextView>(R.id.nextButton).setOnClickListener {

        }
        return v
    }


}
