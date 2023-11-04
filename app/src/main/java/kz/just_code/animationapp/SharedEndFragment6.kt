package kz.just_code.animationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.transition.TransitionInflater
import kz.just_code.animationapp.databinding.FragmentSharedEnd6Binding
class SharedEndFragment6: Fragment() {
    private lateinit var binding: FragmentSharedEnd6Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSharedEnd6Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sharedElementEnterTransition =
            TransitionInflater.from(requireContext()).inflateTransition(android.R.transition.move)

        val rotatingImageView: ImageView = binding.sharedImageView6
        rotatingImageView.setOnClickListener {
            val rotationAnimation = RotateAnimation(
                0f, 360f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f
            )
            rotationAnimation.duration = 1000 // Adjust duration as needed
            rotationAnimation.fillAfter = false // Keeps the view rotated after animation
            rotatingImageView.startAnimation(rotationAnimation)
        }
    }
}