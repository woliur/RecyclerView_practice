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

        mImageUrl.add("https://www.gettysburgflag.com/media/catalog/product/cache/2/thumbnail/520x416/602f0fa2c1f0d1ba5e241f914e856ff9/b/a/bangladesh.jpg");
        mName.add("Bangladesh");

        mImageUrl.add("https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Flag_of_Pakistan.svg/2000px-Flag_of_Pakistan.svg.png");
        mName.add("Pakistan");

        mImageUrl.add("https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Flag_of_India.svg/1200px-Flag_of_India.svg.png");
        mName.add("India");

        mImageUrl.add("https://cdn.britannica.com/34/4034-004-9D851F0F.jpg");
        mName.add("Myanmar");

        mImageUrl.add("https://upload.wikimedia.org/wikipedia/commons/thumb/9/91/Flag_of_Bhutan.svg/2000px-Flag_of_Bhutan.svg.png");
        mName.add("Bhutan");

        mImageUrl.add("https://www.onlinestores.com/media/catalog/product/cache/5/image/9df78eab33525d08d6e5fb8d27136e95/n/e/nepal-nylon_6.jpg");
        mName.add("Nepal");

        mImageUrl.add("https://www.gettysburgflag.com/media/catalog/product/cache/2/thumbnail/520x416/602f0fa2c1f0d1ba5e241f914e856ff9/s/r/sri-lanka-flag-211-p_1.png");
        mName.add("Sri Lanka");


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
