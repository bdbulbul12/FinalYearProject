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
 * Created by bulbul on 9/23/2018.
 */

public class SubjectResultAdapter extends ArrayAdapter<StudentResultListItem> {
    private Activity context;
    private List<StudentResultListItem> stList;

    public SubjectResultAdapter(Activity context,List<StudentResultListItem> stList){

        super(context, R.layout.student_list_all_result,stList);
        this.context=context;
        this.stList=stList;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.semester_result_list,null,true);


        TextView subOne = (TextView) listViewItem.findViewById(R.id.subResult1);
        TextView subTwo = (TextView) listViewItem.findViewById(R.id.subResult2);
        TextView subThree = (TextView) listViewItem.findViewById(R.id.subResult3);
        TextView subFour = (TextView) listViewItem.findViewById(R.id.subResult4);
        TextView subFive = (TextView) listViewItem.findViewById(R.id.subResult5);
        TextView subSix = (TextView) listViewItem.findViewById(R.id.subResult6);

        StudentResultListItem stListItem = stList.get(position);

        subOne.setText(stListItem.getItcs());
        subTwo.setText(stListItem.getPl());
        subThree.setText(stListItem.getPlPractical());
        subFour.setText(stListItem.getPhysics());
        subFive.setText(stListItem.getMath());
        subSix.setText(stListItem.getEnglish());

        return listViewItem;

    }
}
