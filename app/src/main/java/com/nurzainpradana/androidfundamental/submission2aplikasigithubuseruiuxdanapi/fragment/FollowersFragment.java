package com.nurzainpradana.androidfundamental.submission2aplikasigithubuseruiuxdanapi.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.nurzainpradana.androidfundamental.submission2aplikasigithubuseruiuxdanapi.R;
import com.nurzainpradana.androidfundamental.submission2aplikasigithubuseruiuxdanapi.activity.DetailUserActivity;
import com.nurzainpradana.androidfundamental.submission2aplikasigithubuseruiuxdanapi.adapter.UserAdapter;
import com.nurzainpradana.androidfundamental.submission2aplikasigithubuseruiuxdanapi.model.User;
import com.nurzainpradana.androidfundamental.submission2aplikasigithubuseruiuxdanapi.viewmodel.FollowersViewModel;

import java.util.List;

public class FollowersFragment extends Fragment {

    private RecyclerView rvFollowers;
    private ProgressBar progressBar;
    private UserAdapter userAdapter;
    private FollowersViewModel followersViewModel;

    public static final String EXTRA_FOLLOWERS = "extra_followers";

    public FollowersFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_followers, container, false);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        progressBar = view.findViewById(R.id.progressBarDetailFollowers);
        rvFollowers = view.findViewById(R.id.rvFollowers);
        rvFollowers.setLayoutManager(new LinearLayoutManager(getContext()));

        String username = getArguments().getString(EXTRA_FOLLOWERS);

        showLoading(false);

        followersViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(FollowersViewModel.class);

        followersViewModel.setListFollowers(username, getContext());

        followersViewModel.getListFollower().observe(getViewLifecycleOwner(), new Observer<List<User>>() {
            @Override
            public void onChanged(List<User> list) {
                userAdapter = new UserAdapter();
                userAdapter.notifyDataSetChanged();
                userAdapter.setListUsers(list);

                rvFollowers.setAdapter(userAdapter);
               showLoading(false);

                userAdapter.setOnItemClickCallback((User data) -> {
                    showLoading(true);
                    Intent goToDetailUser = new Intent(getContext(), DetailUserActivity.class);
                    goToDetailUser.putExtra(DetailUserActivity.EXTRA_USER, data);
                    startActivity(goToDetailUser);
                });
            }
        });


    }

    private void showLoading(Boolean state) {
        if (state) {
            progressBar.setVisibility(View.VISIBLE);
        } else {
            progressBar.setVisibility(View.GONE);
        }
    }
    @Override
    public void onResume() {
        super.onResume();
        showLoading(false);
    }

}
