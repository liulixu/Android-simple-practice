package com.example.erdaye.pra_fragement_lmmg;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by erdaye on 2015/10/11.
 */
public class MusicFragment extends Fragment {
//
//    private TextView mTvMusicTitle;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_music,container,false);
//        mTvMusicTitle= (TextView) view.findViewById(R.id.title_text);
//        mTvMusicTitle.setText("MUSIC");
        return view;
    }
}
