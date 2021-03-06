package winning.multistatetest.Fragment;

import android.view.View;
import android.widget.Button;

import winning.multistatetest.R;
import winning.multistatetest.base.BaseFragment;

/**
 * Created by Jiang on 2016/12/2.
 */

public class NormalFragment extends BaseFragment {
    @Override
    protected View initView() {
        View view = View.inflate(getActivity(), R.layout.normal_main, null);
        Button btn_suc = (Button) view.findViewById(R.id.btn_start_success);
        btn_suc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initFragment(3);
            }
        });
        Button btn_fail = (Button) view.findViewById(R.id.btn_start_failed);
        btn_fail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initFragment(2);
            }
        });
        return view;
    }

    @Override
    protected void initData() {

    }
}
