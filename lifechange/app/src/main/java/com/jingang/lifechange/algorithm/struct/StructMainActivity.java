package com.jingang.lifechange.algorithm.struct;

import com.jingang.lifechange.base.ActivityInfo;
import com.jingang.lifechange.base.BaseListActivity;

import java.util.ArrayList;

public class StructMainActivity extends BaseListActivity {


    @Override
    protected String getLabel() {
        return "数据结构学习入口页";
    }

    @Override
    protected ArrayList<ActivityInfo> getActivityList() {
        ArrayList<ActivityInfo> activityInfos=new ArrayList<>();
        ActivityInfo activityInfo= new ActivityInfo();
        activityInfo.className="com.jingang.lifechange.algorithm.struct.map.MapUseActivity";
        activityInfo.labelName="Map学习主页";
        activityInfos.add(activityInfo);
        ActivityInfo activityInfo1= new ActivityInfo();
        activityInfo1.className="com.jingang.lifechange.algorithm.struct.array.ArrayTestActivity";
        activityInfo1.labelName="Array学习主页";
        activityInfos.add(activityInfo1);

        ActivityInfo activityInfo2= new ActivityInfo();
        activityInfo2.className="com.jingang.lifechange.algorithm.struct.tree.TreeTestActivity";
        activityInfo2.labelName="tree学习主页";
        activityInfos.add(activityInfo2);


        ActivityInfo activityInfo3= new ActivityInfo();
        activityInfo3.className="com.jingang.lifechange.algorithm.struct.vector." +
                "VectorAndStackTestActivity";
        activityInfo3.labelName="Stack和Vector学习主页";
        activityInfos.add(activityInfo3);
        return activityInfos;
    }
}