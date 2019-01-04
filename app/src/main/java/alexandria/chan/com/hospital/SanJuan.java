package alexandria.chan.com.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class SanJuan extends AppCompatActivity {
    String items[] = new String[]{"San Juan Medical Center", "Cardinal Santos Medical Center"
            , "St. Martin de Porres Charity Hospital", "Hospital Managers"
            , "Our Lady of Lourdes Hospital", "UERM Memorial Hospital"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sanjuan);

        ListView listView = (ListView) findViewById(R.id.listViewSanJuan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
    }
}