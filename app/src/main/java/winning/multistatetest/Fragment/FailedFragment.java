package winning.multistatetest.Fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

import winning.multistatetest.R;
import winning.multistatetest.base.BaseFragment;

/**
 * Created by Jiang on 2016/12/2.
 */

public class FailedFragment extends BaseFragment {

    @Override
    protected View initView() {
        View view = View.inflate(getActivity(), R.layout.failed_layout, null);
        Button btn = (Button) view.findViewById(R.id.btn_retry);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initFragment(1);
            }
        });
        return view;
    }

    @Override
    protected void initData() {

    }


}
