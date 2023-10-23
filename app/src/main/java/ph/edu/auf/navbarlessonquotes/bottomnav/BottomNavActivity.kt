package ph.edu.auf.navbarlessonquotes.bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import ph.edu.auf.navbarlessonquotes.R
import ph.edu.auf.navbarlessonquotes.databinding.ActivityBottomNavBinding

class BottomNavActivity : AppCompatActivity() {
    private lateinit var binding : ActivityBottomNavBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val navHostFragment  = supportFragmentManager.findFragmentById(R.id.bottom_nav_host_fragment) as NavHostFragment
//        val navController = navHostFragment.navController
//        val navView: BottomNavigationView = findViewById(R.id.bottom_nav)
//        navView.setupWithNavController(navController)

        val navView: BottomNavigationView = binding.bottomNav
        val navController = findNavController(R.id.bottom_nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_quotes_day,R.id.nav_love_quotes,R.id.nav_fave_quotes
            )
        )
        setupActionBarWithNavController(navController,appBarConfiguration)
        navView.setupWithNavController(navController)


    }


}