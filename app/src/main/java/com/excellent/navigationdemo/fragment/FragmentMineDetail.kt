package com.excellent.navigationdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.excellent.navigationdemo.R

/**
 * Description：
 * Created by lff on 2019/4/16
 */
class FragmentMineDetail : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_mine_detail,container,false)
    }
}