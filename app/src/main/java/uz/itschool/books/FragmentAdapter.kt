package uz.itschool.books

import android.content.Context
import android.content.SharedPreferences
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.itschool.books.comments.CommentsFragment
import uz.itschool.books.home.HomeFragmentActivity
import uz.itschool.books.library.MyLibraryFragmentActivity
import uz.itschool.books.library.MyLibraryRecyclerAdapter
import uz.itschool.books.library.MyWishlistRecyclerAdapter1

class FragmentAdapter(var context: Context, fragmentManager: FragmentManager, lifecycle: Lifecycle, val discoverListener: MyLibraryRecyclerAdapter.DiscoverListener, val sharedPreferences: SharedPreferences) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 ->{
                MyLibraryFragmentActivity(context, discoverListener, sharedPreferences)
            }
            1 ->{
                HomeFragmentActivity(context, discoverListener)
            }
            else ->{
                CommentsFragment()
            }

        }
    }
}