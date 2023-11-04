package kz.just_code.animationapp

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kz.just_code.animationapp.databinding.FragmentViewAnimationBinding

class ViewAnimationFragment: Fragment() {
    private lateinit var binding: FragmentViewAnimationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewAnimationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            // Start animation when the fragment is created
            val titleAnimator = ObjectAnimator.ofFloat(imageView2, "translationY", -200f, 0f)
            titleAnimator.duration = 1000
            titleAnimator.start()

            val descriptionAnimator = ObjectAnimator.ofFloat(imageView3, "translationX", -200f, 0f)
            descriptionAnimator.duration = 1000
            descriptionAnimator.start()

            val buttonAnimator = ObjectAnimator.ofFloat(next, "translationY", 200f, 0f)
            buttonAnimator.duration = 1000
            buttonAnimator.start()

            next.setOnClickListener {
                findNavController().navigate(ViewAnimationFragmentDirections.actionFragmentFirstScreenToSharedStartFragment())
            }
        }
    }

}

