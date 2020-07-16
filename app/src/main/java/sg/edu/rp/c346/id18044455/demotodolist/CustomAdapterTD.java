package sg.edu.rp.c346.id18044455.demotodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

import static android.media.CamcorderProfile.get;

public class CustomAdapterTD extends ArrayAdapter{


        Context parent_context;
        int layout_id;
        ArrayList<ToDoItem> tdList;

        public CustomAdapterTD(Context context, int resource, ArrayList<ToDoItem> objects){

            super(context, resource, objects);

            parent_context = context;
            layout_id = resource;
            tdList = objects;
        }



    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvT = rowView.findViewById(R.id.textViewTitle);
        TextView tvD = rowView.findViewById(R.id.textViewDate);

        // Obtain the Android Version information based on the position
        ToDoItem currentVersion = tdList.get(position);

        // Set values to the TextView to display the corresponding information
        tvT.setText(currentVersion.getTitle());
        tvD.setText((currentVersion.toString()));

        return rowView;
    }

}//end of class