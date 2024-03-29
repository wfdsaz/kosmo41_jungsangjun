package com.study.android.aaa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Toast;

import com.study.android.aaa.LinearLayoutSingleAlarmItem.OnRemoveButtonClickListner;

public class AdapterAlarm extends BaseAdapter {

    Context context;
    ArrayList<String> mData;
    LayoutInflater layoutInflater;
    ArrayList<AlarmData> arrayListAlarmDatas;

    public AdapterAlarm(Context context, ArrayList<AlarmData> arrayListAlarmDatas) {
        context = context;
        this.arrayListAlarmDatas = arrayListAlarmDatas;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return arrayListAlarmDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return arrayListAlarmDatas.get(position).reqCode;
    }

    public boolean removeData(int position){
        arrayListAlarmDatas.remove(position);
        notifyDataSetChanged();
        return false;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayoutSingleAlarmItem layoutSingleAlarmItem = (LinearLayoutSingleAlarmItem) convertView;

        if (layoutSingleAlarmItem == null) {
            layoutSingleAlarmItem = new LinearLayoutSingleAlarmItem(context);
            layoutSingleAlarmItem.setOnRemoveButtonClickListner(onRemoveButtonClickListner);
        }
        layoutSingleAlarmItem.setData(arrayListAlarmDatas.get(position), position);
        return layoutSingleAlarmItem;
    }

    OnRemoveButtonClickListner onRemoveButtonClickListner = new OnRemoveButtonClickListner() {

        @Override
        public void onClicked(int hh, int mm, int reqCode, int position) {
            Toast.makeText(context, "position : "+position + " reqCode :"+reqCode, Toast.LENGTH_SHORT).show();
            AlarmManager alarmManager = (AlarmManager)context.getSystemService(Context.ALARM_SERVICE);
//			    Intent i = new Intent(mContext ,AlarmTestForHaruActivity.class);
            Intent intent = new Intent(context, ActivityAlarmedTimeShow.class);
            Toast.makeText(context, "reqCode : "+reqCode, Toast.LENGTH_SHORT).show();
            PendingIntent pi = PendingIntent.getActivity(context, reqCode, intent, PendingIntent.FLAG_CANCEL_CURRENT);
            alarmManager.cancel(pi);
            removeData(position);
        }
    };

}
