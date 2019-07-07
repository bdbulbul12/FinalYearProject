package com.programmerhuntbd.bulbul.nuhelpdesk.AllResult;

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
 * Created by bulbul on 9/22/2018.
 */

public class StudentResutListAdapter extends ArrayAdapter<StudentResultListItem>{

    private Activity context;
    private List<StudentResultListItem> stList;

    public StudentResutListAdapter(Activity context,List<StudentResultListItem> stList){

        super(context, R.layout.student_list_all_result,stList);
        this.context=context;
        this.stList=stList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.student_list_all_result,null,true);


        TextView studentName = (TextView) listViewItem.findViewById(R.id.student_result_name);
        TextView studentReg = (TextView) listViewItem.findViewById(R.id.student_result_reg);
        TextView studentSession = (TextView) listViewItem.findViewById(R.id.student_result_session);
        TextView studentCollege = (TextView) listViewItem.findViewById(R.id.student_result_college);

        StudentResultListItem stListItem = stList.get(position);

        studentName.setText(stListItem.getName());
        studentReg.setText(stListItem.getReg());
        studentSession.setText(stListItem.getSession());
        studentCollege.setText(stListItem.getColllegeName());

        return listViewItem;

    }
}

