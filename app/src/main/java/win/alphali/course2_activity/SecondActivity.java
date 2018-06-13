package win.alphali.course2_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {

    //重载返回方法的话，在第二个里修改


  @Override
    public void onBackPressed() {
        Intent intent=new Intent();
        intent.putExtra("data_return","RETURN KEY PRESS!!");
        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        Log.e("SECOND ACTIVITY", "Task id is"+getTaskId() );
//        Intent intent=getIntent();
//        String getdata = intent.getStringExtra("extra_data");
//        Log.e("Second Activity", getdata);

        Button button2=(Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
               startActivity(intent);
            }
        });


    }
}
