package voting.pilipinas.com.customadapater;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by atabay on 5/4/16.
 */
public class CustomAdapter extends BaseAdapter {

    ArrayList<String> list;
    Activity activity;
    public CustomAdapter(ArrayList<String> data, Activity context){
        list = data;
        this.activity = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View rootView = inflater.inflate(R.layout.list_item, null);
        TextView textView = (TextView) rootView.findViewById(R.id.textView);
        textView.setText(list.get(position));

        return rootView;
    }
}
