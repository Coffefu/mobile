package com.example.cofefuandroid

import androidx.appcompat.app.AppCompatActivity


open class BaseActivity : AppCompatActivity() {


//    open fun KeyboardVisibilityEvent() {
//        KeyboardVisibilityEvent.setEventListener(this,
//            object : KeyboardVisibilityEventListener() {
//                fun onVisibilityChanged(isOpen: Boolean) {
//                    // some code depending on keyboard visiblity status
//                    if (isOpen) {
//                        showSystemUI()
//                    } else {
//                        hideSystemUI()
//                    }
//                }
//            })
//    }

//    override fun onWindowFocusChanged(hasFocus: Boolean) {
//        super.onWindowFocusChanged(hasFocus)
//        hideSystemUI()
//    }

//    protected open fun hideSystemUI() {
//        // Enables regular immersive mode.
//        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
//        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
//        val decorView: View = window.decorView
//        decorView.setSystemUiVisibility(
//            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY // Set the content to appear under the system bars so that the
//                    // content doesn't resize when the system bars hide and show.
//                    or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                    or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                    or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN // Hide the nav bar and status bar
//                    or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
//                    or View.SYSTEM_UI_FLAG_FULLSCREEN
//        )
//    }

    // Shows the system bars by removing all the flags
    // except for the ones that make the content appear under the system bars.
//    protected open fun showSystemUI() {
//        val decorView: View = window.decorView
//        decorView.setSystemUiVisibility(
//            (
//                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                            or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)
//        )
//    }

//    protected open fun hideKeyboard(activity: Activity) {
//        val imm: InputMethodManager =
//            activity.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
//        //Find the currently focused view, so we can grab the correct window token from it.
//        var view: View? = activity.currentFocus
//        //If no view currently has focus, create a new one, just so we can grab a window token from it
//        if (view == null) {
//            view = View(activity)
//        }
//        imm.hideSoftInputFromWindow(view.getWindowToken(), 0)
//    }
}