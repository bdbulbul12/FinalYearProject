package com.programmerhuntbd.bulbul.nuhelpdesk.ExStudent;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.programmerhuntbd.bulbul.nuhelpdesk.R;

import java.util.List;

/**
 * Created by bulbul on 9/15/2018.
 */

public class ExAdapter extends ArrayAdapter<ExListItem> {

    private Activity context;
    private List<ExListItem> exList;

    public ExAdapter(Activity context,List<ExListItem> exList){

        super(context, R.layout.university_list,exList);
        this.context=context;
        this.exList=exList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.ex_student_list,null,true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.ex_text_view_name);
        TextView textViewCompany = (TextView) listViewItem.findViewById(R.id.ex_text_view_company);
        TextView textViewContact = (TextView) listViewItem.findViewById(R.id.ex_text_view_contact);
        TextView textViewCollege = (TextView) listViewItem.findViewById(R.id.ex_text_view_college);

        ExListItem exListItem = exList.get(position);

        textViewName.setText(exListItem.getName());
        textViewCompany.setText(exListItem.getCompany());
        textViewContact.setText(exListItem.getContact());
        textViewCollege.setText(exListItem.getCollege());

        return listViewItem;

    }
}
