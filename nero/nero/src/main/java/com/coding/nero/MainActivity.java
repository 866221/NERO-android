package com.coding.nero;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends FragmentActivity {

    ViewPager viewPager=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager= (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager=getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));
    }


    /**
     * Created by John on 12/5/14.
     */

    //Links class to layout file fragment_a
    public static class FragmentA extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_a, container, false);
        }
    }

    /**
     * Created by John on 12/5/14.
     */

    //Links class to layout file fragment_a
    public static class FragmentB extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_a, container, false);
        }
    }

    /**
     * Created by John on 12/5/14.
     */

    //Links class to layout file fragment_a
    public static class FragmentC extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_a, container, false);
        }
    }

    /**
     * Created by John on 12/5/14.
     */

    //Links class to layout file fragment_a
    public static class FragmentD extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_d, container, false);
        }
    }
}

class MyAdapter extends FragmentPagerAdapter{

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment=null;
        if(i==0){
            fragment=new FragmentA_1();
        }
        if(i==1){
            fragment=new FragmentB_1();
        }
        if(i==2){
            fragment=new FragmentC_1();
        }
        if(i==3){
            fragment=new FragmentD_1();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return (4);
    }
}
