package sg.edu.rp.c346.id18044455.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    ListView lvTD;
    ArrayList<ToDoItem> tdList;
    CustomAdapterTD adapterTD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvTD = findViewById(R.id.lvToDo);


        ToDoItem item1 = new ToDoItem("Go for movie", Calendar.getInstance());
        ToDoItem item2 = new ToDoItem("Go for haircut", Calendar.getInstance());

        tdList = new ArrayList<>();
        tdList.add(item1);
        tdList.add(item2);

        adapterTD = new CustomAdapterTD(this, R.layout.row, tdList);
        lvTD.setAdapter(adapterTD);


    }//end of main method


}//end of class