package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;

    private RetrofitClient retrofitClient;
    private RetrofitInterface retrofitInterface;

    private String API_KEY = "YOUR_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        retrofitClient = RetrofitClient.getInstance();
        retrofitInterface = RetrofitClient.getRetrofitInterface();

        Call<List<Result>> call = retrofitInterface.getData();


        call.enqueue(new Callback<List<Result>>() {
            @Override
            public void onResponse(Call<List<Result>> call, Response<List<Result>> response) {
                if (response.isSuccessful()) {
                    Result result = (Result) response.body();
                    Data data = (Data) result.getData();
                    recyclerView.setAdapter(mAdapter);
                }
                // Result result = (Result) response.body();
//                Data data = result.getData();
//                Log.e("retrofit", "Data fetch success");
//                mAdapter = new RetrofitAdapter(data.getDevices());
//                Log.e("dedede", String.valueOf(data.getDevices()));

            }

            @Override
            public void onFailure(Call<List<Result>> call, Throwable t) {
                Log.e("retrofit", t.getMessage());

            }
        });
    }

}
