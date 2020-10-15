package com.android.myfriend

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tampilMyFriendsFragment()
    }

    private fun gantiFragment(fragmentManager: FragmentManager, fragment: Fragment, frameId: Int) {
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(frameId, fragment)

        transaction.commit()
    }

    fun tampilMyFriendsFragment() {
        gantiFragment(supportFragmentManager, MyFriendsFragment.newInstance(), R.id.contentFrame)
    }

    fun tampilMyFriendsAddFragment() {
        gantiFragment(supportFragmentManager, MyFriendsAddFragment.newInstance(), R.id.contentFrame)
    }

    fun tampilMyFriendsEditFragment() {
        gantiFragment(
            supportFragmentManager,
            MyFriendsEditFragment.newInstance(),
            R.id.contentFrame
        )
    }
}