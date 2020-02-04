package biz.bixer.bixer.Pages;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.content.ContextCompat;
import biz.bixer.bixer.R;
public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer,toolbar,R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        drawer.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.tvBackground));
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        /*Fragment fragment = null;
        Class fragmentClass = null;
        fragmentClass=StatisticsFragment.class;
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();
        // Выделяем выбранный пункт меню в шторке*/
    }
    private static long back_pressed;
    @Override
    public void onBackPressed() {
        Fragment fragment = null;
        Class fragmentClass = null;
        fragmentClass=FifthFragment.class;
        if (back_pressed + 500 > System.currentTimeMillis()) {
            new AlertDialog.Builder(this)
                    .setTitle("Really exit?")
                    .setMessage("Are you sure you want to exit?")
                    .setNegativeButton(android.R.string.no,null)
                    .setPositiveButton(android.R.string.yes,new DialogInterface.OnClickListener(){
                        public void onClick(DialogInterface arg0,int arg1)
                        {
                            MainActivity.super.onBackPressed();
                        }
                    }).create().show();
        }
        else {
            fragmentClass=FifthFragment.class;
        }
        back_pressed = System.currentTimeMillis();
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Вставляем фрагмент, заменяя текущий фрагмент
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        Fragment fragment = null;
        Class fragmentClass = null;
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_home) {
            fragmentClass=FifthFragment.class;
        }
        if(id==R.id.action_website)
        {
            fragmentClass=website.class;
        }
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Вставляем фрагмент, заменяя текущий фрагмент
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();
        return super.onOptionsItemSelected(item);
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Создадим новый фрагмент
        Fragment fragment = null;
        Class fragmentClass = null;
        int id = item.getItemId();
        if (id == R.id.nav_mixer) {
            fragmentClass = FirstFragment.class;
        } else if (id == R.id.nav_analytics) {
            fragmentClass = SecondFragment.class;
        }
        else if(id == R.id.nav_checker) {
            fragmentClass=Bitcoin_checker.class;
        }
        else if (id == R.id.nav_news) {
            fragmentClass=website.class;
        } else if (id == R.id.nav_about) {
            fragmentClass=FourthFragment.class;
        } else if (id == R.id.nav_share) {
            fragmentClass=FifthFragment.class;
        } else if (id == R.id.nav_help) {
            fragmentClass=SixthFragment.class;
        }
        else if(id==R.id.nav_analytic)
        {
            fragmentClass=StatisticsFragment.class;
        }
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Вставляем фрагмент, заменяя текущий фрагмент
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();
        // Выделяем выбранный пункт меню в шторке
        item.setChecked(true);
        // Выводим выбранный пункт в заголовке
        // setTitle(item.getTitle());
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}