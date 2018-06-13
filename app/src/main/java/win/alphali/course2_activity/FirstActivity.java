package win.alphali.course2_activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"ADD ITEM",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"REMOVE ITEM",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if(requestCode == 1)
                {
                    String returnedData = data.getStringExtra("data_return");
                    Log.e("FIRST ACTIVITY", returnedData);
                }
                break;
            default:
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Log.e("FIRST ACTIVITY TASK ID","Task id is"+getTaskId());
        Button button1=(Button) findViewById(R.id.button_1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(FirstActivity.this,"This is FirstText.",Toast.LENGTH_SHORT).show();
                //finish();


                //显式的intent
//                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
//                startActivityForResult(intent,1);

//                String data = "This is First Activity Message";
//               intent.putExtra("extra_data",data);

                //隐式的intent
//                Intent hiddenintent = new Intent("win.alphali.course2_activity.ACTION_START");
                //添加一个intent的category
//                hiddenintent.addCategory("win.alphali.course2_activity.MY_CATEGORY");

                //隐式调用其他协议的intent
//                Intent browserintent = new Intent(Intent.ACTION_VIEW);
//                browserintent.setData(Uri.parse("http://www.baidu.com"));
                //browserintent.setData(Uri.parse("tel:10086"));

                //调用自己玩
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);

            }

        });

    }
}
