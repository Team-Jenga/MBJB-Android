package org.dod.manbanjalbu;

import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;

public class CustomActionBar extends Fragment {

    private Activity activity;
    private ActionBar actionBar;

    public CustomActionBar(Activity _activity, ActionBar _actionBar) {
        this.activity = _activity;
        this.actionBar = _actionBar;
    }

    public void setActionBar(){
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowHomeEnabled(false);

        View mCustomView = LayoutInflater.from(activity).inflate(R.layout.fragment_custom_action_bar, null);
        actionBar.setCustomView(mCustomView);
    }

}