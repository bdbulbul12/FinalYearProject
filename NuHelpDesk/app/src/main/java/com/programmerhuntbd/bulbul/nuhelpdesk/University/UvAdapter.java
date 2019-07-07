package com.programmerhuntbd.bulbul.nuhelpdesk.University;

/**
 * Created by bulbul on 7/17/2018.
 */

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.programmerhuntbd.bulbul.nuhelpdesk.R;

import java.util.List;

/**
 * Created by bulbul on 5/22/2018.
 */

public class UvAdapter extends ArrayAdapter<UvListItem> {
    private Activity context;
    private List<UvListItem> uvList;

    public UvAdapter(Activity context,List<UvListItem> uvList){

        super(context, R.layout.university_list,uvList);
        this.context=context;
        this.uvList=uvList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.university_list,null,true);


        TextView textViewHead = (TextView) listViewItem.findViewById(R.id.uvName);
        TextView textViewCode = (TextView) listViewItem.findViewById(R.id.uvCode);
        TextView textViewLocation = (TextView) listViewItem.findViewById(R.id.uvLocation);

        UvListItem uvListItem = uvList.get(position);

        textViewHead.setText(uvListItem.getHead());
        textViewCode.setText("Code :"+uvListItem.getCollegeCode());
        textViewLocation.setText("Contact :"+uvListItem.getContact());

        return listViewItem;

    }
}
