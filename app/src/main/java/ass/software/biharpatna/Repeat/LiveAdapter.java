package ass.software.biharpatna.Repeat;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ass.software.biharpatna.R;

/**
 * Created by lue on 27-11-2017.
 */

public class LiveAdapter extends BaseAdapter {
    private Context activity;
    private LayoutInflater inflater;
    private List<PojoClass> movieItems;

    String id ;


    public LiveAdapter(Context context, List<PojoClass> movie) {

        this.activity = context;
        this.movieItems = movie;

    }


    @Override
    public int getCount() {
        return movieItems.size();
    }

    @Override
    public Object getItem(int location) {
        return movieItems.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    static class ViewHolder {

        ImageView mgridimage;
        TextView detailtxt;
        TextView price;
        TextView calrtxt;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null){
            convertView = inflater.inflate(R.layout.live_adapter, null);
            holder = new ViewHolder();

            holder.detailtxt = (TextView) convertView.findViewById(R.id.griddetail_text);





            convertView.setTag(holder);
        }
        else {

            holder = (ViewHolder) convertView.getTag();
        }


        PojoClass m = movieItems.get(position);
        Log.d("kbbobo",""+movieItems.size());


       // id = m.getItemid();
      //  Log.d("rj123ww",id);
        holder.detailtxt.setText(m.getZero());


        return convertView;
    }


}
