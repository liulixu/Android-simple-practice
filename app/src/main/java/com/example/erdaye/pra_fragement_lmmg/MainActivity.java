package com.example.erdaye.pra_fragement_lmmg;



import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity implements View.OnClickListener,MovieFragment.MyListener{



    private ViewPager mViewPager;
    private ImageButton mButtonHome;
    private ImageButton mButtonMovie;
    private ImageButton mButtonMusic;
    private ImageButton mButtonNote;

    private List<View> mListTabs;

    private PagerAdapter mAdapter=new PagerAdapter() {

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(mListTabs.get(position));
        }

        /**
         * 初始化Item项
         */
        public Object instantiateItem(ViewGroup container,int position){
            container.addView(mListTabs.get(position),0);
            return mListTabs.get(position);
        }

        @Override
        public int getCount() {
            return mListTabs.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }
    };




    private View.OnClickListener mBtnViewPagerOnClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){   
                case R.id.fra_btn_login:
                    mViewPager.setCurrentItem(0,false);
                    break;
                case R.id.fra_btn_music:
                    mViewPager.setCurrentItem(1,false);
                    break;
                case R.id.fra_btn_movie:
                    mViewPager.setCurrentItem(2,false);
                    break;
                case R.id.fra_btn_note:
                    mViewPager.setCurrentItem(3,false);
                    break;
            }
        }
    };



    @Override
    public void buttonOnClickListener() {

    }

    @Override
    public void onClick(View v) {

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mViewPager= (ViewPager) findViewById(R.id.viewpager);
        mButtonNote= (ImageButton) findViewById(R.id.fra_btn_note);
        mButtonMusic= (ImageButton) findViewById(R.id.fra_btn_music);
        mButtonHome= (ImageButton) findViewById(R.id.fra_btn_login);
        mButtonMovie= (ImageButton) findViewById(R.id.fra_btn_movie);
        mListTabs=new ArrayList<View>();

        LayoutInflater inflater=getLayoutInflater();
        mListTabs.add(inflater.inflate(R.layout.fragment_login,null));
        mListTabs.add(inflater.inflate(R.layout.fragment_music,null));
        mListTabs.add(inflater.inflate(R.layout.fragment_movie,null));
        mListTabs.add(inflater.inflate(R.layout.fragment_game, null));

        mViewPager.setAdapter(mAdapter);
        mButtonHome.setBackgroundColor(Color.GREEN);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                switch (position) {
                    case 0:

                        /*mButtonHome.setBackgroundColor(getResoucer.getColor(R.color.))*/
                        mButtonHome.setBackgroundColor(Color.WHITE);
                        mButtonMovie.setBackgroundColor(getResources().getColor(R.color.green));
                        mButtonMusic.setBackgroundColor(getResources().getColor(R.color.green));
                        mButtonNote.setBackgroundColor(getResources().getColor(R.color.green));
                        break;
                    case 1:
                        mButtonHome.setBackgroundColor(getResources().getColor(R.color.green));
                        mButtonMovie.setBackgroundColor(getResources().getColor(R.color.green));
                        mButtonMusic.setBackgroundColor(Color.WHITE);
                        mButtonNote.setBackgroundColor(getResources().getColor(R.color.green));
                        break;

                    case 2:
                        mButtonHome.setBackgroundColor(getResources().getColor(R.color.green));
                        mButtonMovie.setBackgroundColor(Color.WHITE);
                        mButtonMusic.setBackgroundColor(getResources().getColor(R.color.green));
                        mButtonNote.setBackgroundColor(getResources().getColor(R.color.green));
                        break;
                    case 3:
                        mButtonHome.setBackgroundColor(getResources().getColor(R.color.green));
                        mButtonMovie.setBackgroundColor(getResources().getColor(R.color.green));
                        mButtonMusic.setBackgroundColor(getResources().getColor(R.color.green));
                        mButtonNote.setBackgroundColor(Color.WHITE);
                    default:
                        break;
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        mButtonHome.setOnClickListener(mBtnViewPagerOnClickListener);
        mButtonMovie.setOnClickListener(mBtnViewPagerOnClickListener);
        mButtonMusic.setOnClickListener(mBtnViewPagerOnClickListener);
        mButtonNote.setOnClickListener(mBtnViewPagerOnClickListener);
    }

}