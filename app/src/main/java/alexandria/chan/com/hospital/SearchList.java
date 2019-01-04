package alexandria.chan.com.hospital;

import android.Manifest;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class SearchList extends AppCompatActivity {
    String items[] = new String[]{"Caloocan City", "Las Piñas", "Makati", "Malabon", "Mandaluyong", "Manila"
            , "Marikina", "Muntinlupa", "Navotas", "Parañaque", "Pasay City", "Pasig", "Pateros", "Quezon City", "San Juan"
            , "Taguig", "Valenzuela"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchlist);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent myintent = new Intent(view.getContext(),Caloocan.class);
                    startActivityForResult(myintent,0);
                }
                if(position==1){
                    Intent myintent = new Intent(view.getContext(),LasPinas.class);
                    startActivityForResult(myintent,1);
                }
                if(position==2){
                    Intent myintent = new Intent(view.getContext(),Makati.class);
                    startActivityForResult(myintent,2);
                }
                if(position==3){
                    Intent myintent = new Intent(view.getContext(),Malabon.class);
                    startActivityForResult(myintent,3);
                }
                if(position==4){
                    Intent myintent = new Intent(view.getContext(), Mandaluyong.class);
                    startActivityForResult(myintent,4);
                }
                if(position==5){
                    Intent myintent = new Intent(view.getContext(),Manila.class);
                    startActivityForResult(myintent,5);
                }
                if(position==6){
                    Intent myintent = new Intent(view.getContext(),Marikina.class);
                    startActivityForResult(myintent,6);
                }
                if(position==7){
                    Intent myintent = new Intent(view.getContext(),Muntinlupa.class);
                    startActivityForResult(myintent,7);
                }
                if(position==8){
                    Intent myintent = new Intent(view.getContext(),Navotas.class);
                    startActivityForResult(myintent,8);
                }
                if(position==9){
                    Intent myintent = new Intent(view.getContext(),Paranaque.class);
                    startActivityForResult(myintent,9);
                }
                if(position==10){
                    Intent myintent = new Intent(view.getContext(),Pasay.class);
                    startActivityForResult(myintent,10);
                }
                if(position==11){
                    Intent myintent = new Intent(view.getContext(),Pasig.class);
                    startActivityForResult(myintent,11);
                }
                if(position==12){
                    Intent myintent = new Intent(view.getContext(),Pateros.class);
                    startActivityForResult(myintent,12);
                }
                if(position==13){
                    Intent myintent = new Intent(view.getContext(),QuezonCity.class);
                    startActivityForResult(myintent,13);
                }
                if(position==14){
                    Intent myintent = new Intent(view.getContext(),SanJuan.class);
                    startActivityForResult(myintent,14);
                }
                if(position==15){
                    Intent myintent = new Intent(view.getContext(),Taguig.class);
                    startActivityForResult(myintent,15);
                }
                if(position==16){
                    Intent myintent = new Intent(view.getContext(),Valenzuela.class);
                    startActivityForResult(myintent,16);
                }
            }
        });
    }


}