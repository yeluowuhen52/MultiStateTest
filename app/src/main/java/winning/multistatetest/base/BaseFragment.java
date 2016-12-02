package winning.multistatetest.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import winning.multistatetest.Fragment.FailedFragment;
import winning.multistatetest.Fragment.NormalFragment;
import winning.multistatetest.R;

/**
 * Created by Jiang on 2016/11/24.
 */

public abstract class BaseFragment extends Fragment {
    //初始化View
    protected abstract View initView();

    //初始化数据
    protected abstract void initData();

    protected Activity mActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mActivity = getActivity();
        View view = initView();
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //更新布局
        initData();
    }

    public void initFragment(int flag) {
        FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        if(flag == 1){
            fragmentTransaction.replace(R.id.fl_layout, new NormalFragment(), "normal");
        } else if(flag == 2){
            fragmentTransaction.replace(R.id.fl_layout, new FailedFragment(), "normal");
        }
        fragmentTransaction.commit();
    }


}
