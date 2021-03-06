package com.weapon.joker.app;

import com.weapon.joker.app.home.HomeViewModel;
import com.weapon.joker.app.home.MainFragment;

/**
 * Function 业务索引
 * author:张冠之
 * time: 2017/9/8 下午7:01
 * e-mail: guanzhi.zhang@sojex.cn
 */

interface Function {

    void activity();

    /**
     * {@link MainFragment 首页fragment}
     */
    void fragment();

    /**
     * {@link HomeViewModel 首页ViewModel}
     */
    void viewModel();
}
