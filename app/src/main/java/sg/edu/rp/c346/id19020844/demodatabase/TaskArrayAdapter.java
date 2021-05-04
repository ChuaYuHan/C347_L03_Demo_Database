package sg.edu.rp.c346.id19020844.demodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class TaskArrayAdapter extends ArrayAdapter<Task> {

    private ArrayList<Task> task;
    private Context context;
    private TextView tvID, tvDesc, tvDate;

    public TaskArrayAdapter(Context context, int resource, ArrayList<Task> objects) {
        super(context, resource, objects);
        this.context = context;
        task = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);
        tvID = (TextView) rowView.findViewById(R.id.tvID);
        tvDesc = (TextView) rowView.findViewById(R.id.tvDesc);
        tvDate = (TextView) rowView.findViewById(R.id.tvDate);

        // Get the position of the currentTask and get it's position
        Task currentTask = task.get(position);
        // Set the position to a string value
        String id = String.valueOf(currentTask.getId());
        // Set the text for the ID
        tvID.setText(id);

        // Get the description and set the description
        String desc = currentTask.getDescription();
        tvDesc.setText(desc);

        // Get the date and set the date
        String date = currentTask.getDate();
        tvDate.setText(date);

        return rowView;
    }

}
