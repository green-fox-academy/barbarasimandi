package com.greenfox.barbara.p2pchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    EditText editText2;
    Button button;
    MessageAdapter adapter;
    ApiService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.button);


        final Message firstMessage = new Message("cat", "meow");

        adapter = new MessageAdapter(this);
        adapter.add(firstMessage);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.add(new Message("barbarasimandi", editText2.getText().toString()));
            }
        });

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://cryptic-badlands-53822.herokuapp.com")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        service = retrofit.create(ApiService.class);

        service.getMessages().enqueue(new Callback<MessageResponse>() {
            @Override
            public void onResponse(Call<MessageResponse> call, Response<MessageResponse> response) {
                response.body();

            }

            @Override
            public void onFailure(Call<MessageResponse> call, Throwable t) {
            }

        });

        listView.setAdapter(adapter);

        adapter.clear();

        adapter.addAll();
    }
}
