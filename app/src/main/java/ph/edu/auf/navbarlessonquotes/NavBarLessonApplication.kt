package ph.edu.auf.navbarlessonquotes

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.content.res.Configuration

class NavBarLessonApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }


    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context : Context
            private set
    }

}