package biz.bixer.bixer;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import biz.bixer.bixer.tabs.FragmentTab;
import biz.bixer.bixer.tabs.FragmentTab1;
import biz.bixer.bixer.tabs.FragmentTab3;
import biz.bixer.bixer.R;
import biz.bixer.bixer.tabs.fragmentTab2;


public class FourthFragment extends Fragment {

    private RecyclerView mRecyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fourth, container, false);
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabs);

        final ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        viewPager.setAdapter(new PagerAdapter(getFragmentManager(), tabLayout.getTabCount()));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        return view;
    }

    public class PagerAdapter extends FragmentStatePagerAdapter {
        int mNumOfTabs;

        public PagerAdapter(FragmentManager fm, int NumOfTabs) {
            super(fm);
            this.mNumOfTabs = 4;
        }
        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return new FragmentTab();//информация о миксере
                case 1:
                    return new FragmentTab1();//информация об аналитике
                case 2:
                    return new FragmentTab3();//нформация о новостях

                case 3:
                    return new fragmentTab2();//о нас
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return mNumOfTabs;
        }
          @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "mixer";
            case 1:
                return "analytics";
                case 2:
                    return "news";
                    case 3:
                        return"I";
            default:
                return null;
        }
    }
    }
}


