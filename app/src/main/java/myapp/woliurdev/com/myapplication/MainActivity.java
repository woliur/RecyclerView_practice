package myapp.woliurdev.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ArrayList<String> mName = new ArrayList<>();
    private ArrayList<String> mImageUrl = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Strated Rifad");
        initImageBitmap();

    }

    private void initImageBitmap(){
        Log.d(TAG, "initImageBitmap: prepareing bitmap rifad");

        mImageUrl.add("https://upload.wikimedia.org/wikipedia/commons/f/f9/Flag_of_Bangladesh.svg");
        mName.add("Bangladesh");

        mImageUrl.add("https://upload.wikimedia.org/wikipedia/commons/3/32/Flag_of_Pakistan.svg");
        mName.add("Pakistan");

        mImageUrl.add("https://upload.wikimedia.org/wikipedia/en/4/41/Flag_of_India.svg");
        mName.add("India");

        mImageUrl.add("https://upload.wikimedia.org/wikipedia/commons/8/8c/Flag_of_Myanmar.svg");
        mName.add("Myanmar");

        mImageUrl.add("https://upload.wikimedia.org/wikipedia/commons/9/91/Flag_of_Bhutan.svg");
        mName.add("Bhutan");

        mImageUrl.add("https://upload.wikimedia.org/wikipedia/commons/9/9b/Flag_of_Nepal.svg");
        mName.add("Nepal");

        mImageUrl.add("https://upload.wikimedia.org/wikipedia/commons/1/11/Flag_of_Sri_Lanka.svg");
        mName.add("Sri Lanka");

        mImageUrl.add("https://upload.wikimedia.org/wikipedia/commons/a/a9/Flag_of_Thailand.svg");
        mName.add("Thailand");

        initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init Recycler View Rifad");
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mName,mImageUrl,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
