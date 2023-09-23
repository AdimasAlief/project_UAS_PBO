package com.mynuqud.navigationbuttom.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.mynuqud.navigationbuttom.R;
import com.mynuqud.navigationbuttom.databinding.FragmentHomeBinding;

import java.util.zip.Inflater;

public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home,container, false);

    }
}