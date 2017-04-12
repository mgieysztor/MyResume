package pl.sdacademy.mg.myresume;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.activity_main_navigation_view)
    NavigationView mNavigationView;

    @BindView(R.id.main_activity_drawer_layout)
    DrawerLayout mDrawerLayout;

    @BindView(R.id.main_activity_action_toolbar)
    Toolbar mToolbar;

    @BindView(R.id.main_activity_tab_layout)
    TabLayout mTabLayout;

    @BindView(R.id.main_activity_view_pager)
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(mToolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar,
                R.string.open_drawer, R.string.close_drawer);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();

//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager.setAdapter(new ViewPagerAdaper(getSupportFragmentManager()));
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
//        mTabLayout.setTabMode(TabLayout.FOCUSABLES_TOUCH_MODE);


        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {


            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                for (int i = 0; i < mNavigationView.getMenu().size(); i++) {
                    mNavigationView.getMenu().getItem(i).setChecked(false);
                }

                mToolbar.setTitle(item.getTitle());
                Toast.makeText(MainActivity.this, "" + item.getTitle(), Toast.LENGTH_SHORT).show();
                item.setChecked(true);

                switch (item.getItemId()) {
                    case R.id.action1:
                        mViewPager.setCurrentItem(0, true);
                        break;
                    case R.id.action2:
                        mViewPager.setCurrentItem(1, true);
                        break;
                    case R.id.action3:
                        mViewPager.setCurrentItem(2, true);
                        break;
                    case R.id.action4:
                        mViewPager.setCurrentItem(3, true);
                        break;
                    case R.id.action5:
                        mViewPager.setCurrentItem(4, true);
                        break;
                    case R.id.action6:
                        mViewPager.setCurrentItem(5, true);
                        break;
                }
                mDrawerLayout.closeDrawer(GravityCompat.START);
                return false;
            }

        });


    }


}
