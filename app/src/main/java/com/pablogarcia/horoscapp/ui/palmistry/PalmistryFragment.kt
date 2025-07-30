package com.pablogarcia.horoscapp.ui.palmistry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.PermissionChecker
import com.pablogarcia.horoscapp.R
import com.pablogarcia.horoscapp.databinding.FragmentPalmistryBinding
import dagger.hilt.android.AndroidEntryPoint
import java.util.jar.Manifest

@AndroidEntryPoint
class PalmistryFragment : Fragment() {

    companion object {
        private const val PERMISSION_CAMERA = android.Manifest.permission.CAMERA
    }

    private var _binding: FragmentPalmistryBinding? = null
    private val binding get() = _binding!!

    private val requestPermissionLauncher =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) {
        isGranted ->
            if (isGranted){
                //start Camera
            }else{
                Toast.makeText(context, "Acepta permisos de camara para disfrutar de una experiencia mágica", Toast.LENGTH_SHORT).show()
            }
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (checkedCameraPermission()) {
            // Permiso de camara garantizado
            // start Camera
        } else {
            // No hay permiso de camara, hay que solicitarlo
            requestPermissionLauncher.launch(PERMISSION_CAMERA)
        }

    }

    private fun checkedCameraPermission(): Boolean {
        return PermissionChecker.checkSelfPermission(
            requireContext(), PERMISSION_CAMERA
        ) == PermissionChecker.PERMISSION_GRANTED
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentPalmistryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}