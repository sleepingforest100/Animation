package kz.just_code.animationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import kz.just_code.animationapp.databinding.FragmentSharedStartBinding
class SharedStartFragment : Fragment() {
    private lateinit var binding: FragmentSharedStartBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSharedStartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageView5.setOnClickListener {

            val extras = FragmentNavigatorExtras(
                binding.imageView5 to "image",
                binding.textView1 to "title"
            )
            findNavController().navigate(
                SharedStartFragmentDirections.actionSharedStartFragmentToSharedEndFragment(), extras
            )
        }

        binding.imageView6.setOnClickListener {

            val extras = FragmentNavigatorExtras(
                binding.imageView6 to "shared_image2",
                binding.textView2 to "shared_title2"
            )
            findNavController().navigate(
                SharedStartFragmentDirections.actionSharedStartFragmentToSharedEndFragment2(), extras
            )
        }
        binding.imageView7.setOnClickListener {

            val extras = FragmentNavigatorExtras(
                binding.imageView7 to "shared_image3",
                binding.textView3 to "shared_title3"
            )
            findNavController().navigate(
                SharedStartFragmentDirections.actionSharedStartFragmentToSharedEndFragment3(), extras
            )
        }

        binding.imageView4.setOnClickListener {

            val extras = FragmentNavigatorExtras(
                binding.imageView4 to "shared_image4",
                binding.textView4 to "shared_title4"
            )
            findNavController().navigate(
                SharedStartFragmentDirections.actionSharedStartFragmentToSharedEndFragment4(), extras
            )
        }
        binding.imageView8.setOnClickListener {

            val extras = FragmentNavigatorExtras(
                binding.imageView8 to "shared_image5",
                binding.textView5 to "shared_title5"
            )
            findNavController().navigate(
                SharedStartFragmentDirections.actionSharedStartFragmentToSharedEndFragment5(), extras
            )
        }
        binding.imageView9.setOnClickListener {

            val extras = FragmentNavigatorExtras(
                binding.imageView9 to "shared_image6",
                binding.textView6 to "shared_title6"
            )
            findNavController().navigate(
                SharedStartFragmentDirections.actionSharedStartFragmentToSharedEndFragment6(), extras
            )
        }

    }
}
