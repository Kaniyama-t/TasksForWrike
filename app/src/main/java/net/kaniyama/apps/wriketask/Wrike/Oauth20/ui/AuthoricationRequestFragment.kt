package net.kaniyama.apps.wriketask.Wrike.Oauth20.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import net.kaniyama.apps.wriketask.R

/**
 * A simple [Fragment] subclass.
 */
class AuthoricationRequestFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(
            R.layout.fragment_wrike_oauth_authorication_request,
            container,
            false
        )
    }


}
