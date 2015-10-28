package com.example.erdaye.pra_fragement_lmmg;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by erdaye on 2015/10/11.
 */
public class MovieFragment extends Fragment {
    private TextView mTvMovieTitle;
    private MyListener mlisterner;
    private Button mBtnEdit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_movie,container,false);
        mTvMovieTitle= (TextView) view.findViewById(R.id.title_text);
        mBtnEdit= (Button) view.findViewById(R.id.title_edit);
        mTvMovieTitle.setText("MOVIE");
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mBtnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mlisterner.buttonOnClickListener();
            }
        });

    }

    @Override
    /**
     * Fragment和Activity建立关联的时候调用。
     */
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mlisterner = (MyListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + "你必须实现这个接口");
        }

    }



    public interface MyListener{
        public void buttonOnClickListener();
    }
}
