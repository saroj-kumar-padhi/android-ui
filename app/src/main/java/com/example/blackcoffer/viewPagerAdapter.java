package com.example.blackcoffer;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class viewPagerAdapter extends FragmentPagerAdapter {


    public viewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return  new individual();
        } else if (position == 1) {
            return  new professional();

        }
        else{
            return  new marchenr();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
