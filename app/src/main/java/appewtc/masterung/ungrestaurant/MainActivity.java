package appewtc.masterung.ungrestaurant;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    private EditText UserEditText;
    private EditText passwordEditText;
    private Button loginButton;

    private String userString, passwordString;



    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget เป็นการผูกตัวแปร....
        bindWidger();

        //Button Controller
        buttonController();



    } // Main Method

    private void buttonController() {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Receive Value From Edit text
                userString = UserEditText.getText().toString().trim();
                passwordString= passwordEditText.getText().toString().trim();
                
                //check Space
                if(userString.equals("") || passwordString.equals("")) {
                    //Have Space
                    MyAlertDialog myAlertDialog = new MyAlertDialog();
                    myAlertDialog.MyDialog(MainActivity.this,
                            "มีช่องว่าง","กรุณากรอกทุกช่องค่ะ");
                }else {

                }//No Space
             
                         
               

            } //onclick
        });

    } //buttonController

    private void bindWidger() {


        UserEditText = (EditText) findViewById(R.id.editText);
        passwordEditText = (EditText) findViewById(R.id.editText);
        loginButton = (Button)findViewById(R.id.button);



    }





} // Main class นี่คือ คลาสหลัก

