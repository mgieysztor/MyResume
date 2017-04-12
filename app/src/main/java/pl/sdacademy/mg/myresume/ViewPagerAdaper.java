package pl.sdacademy.mg.myresume;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by RENT on 2017-04-12.
 */

public class ViewPagerAdaper extends FragmentPagerAdapter {


    public ViewPagerAdaper(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return AboutFragment.newInstance();
            case 1:
                return PersonalSummaryFragment.newInstance();
            case 2:
                return AreaOfExpertiseFragment.newInstance();
            case 3:
                return CareerHistoryFragment.newInstance();
            case 4:
                return KeyCompetenciesFragment.newInstance();
            case 5:
                return AcademicQualificationsFragment.newInstance();

        }

        return null;
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "About";
            case 1:
                return "Personal Summary";
            case 2:
                return "Area of Expertise";
            case 3:
                return "Career history";
            case 4:
                return "Key competencies";
            case 5:
                return "Academic qualifications";

        }
        return super.getPageTitle(position);
    }
}
