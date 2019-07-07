package com.programmerhuntbd.bulbul.nuhelpdesk;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.List;

/**
 * Created by bulbul on 8/31/2018.
 */

public class MainActivityAdapter extends ArrayAdapter<MainActivityList> {

    private Activity context;
    private List<MainActivityList> noticeList;

    public MainActivityAdapter(Activity context,List<MainActivityList> uvList){

        super(context, R.layout.university_list,uvList);
        this.context=context;
        this.noticeList=uvList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.main_activity_noticce_list,null,true);

        TextView textViewHead = (TextView) listViewItem.findViewById(R.id.noticeHeader);
        TextView textViewCode = (TextView) listViewItem.findViewById(R.id.noticeDate);


        MainActivityList noticeItem = noticeList.get(position);

        textViewHead.setText(noticeItem.getTitle());
        textViewCode.setText(noticeItem.getDate());



        return listViewItem;

    }
}
