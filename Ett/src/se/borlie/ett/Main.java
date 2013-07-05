package se.borlie.ett;

import se.borlie.ett.R;
import android.annotation.SuppressLint;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

@SuppressLint("ShowToast")
public class Main extends ListActivity {

    public ArrayAdapter<CharSequence> listAdapter;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listAdapter = ArrayAdapter.createFromResource(this, R.array.kapitel,
                R.layout.simplerow);
        setListAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        long chapter = listAdapter.getItemId(position);
//        String s = listAdapter.getItem(position).toString();
 
        Toast.makeText(Main.this,
                "Öppnar kapitel " +  chapter + "?", 600).show();
 
        Toast.makeText(Main.this,
                "Sen öppnar vi kapitel " +  chapter + "?", 600).show();
        
        
        
        
        
    }
}