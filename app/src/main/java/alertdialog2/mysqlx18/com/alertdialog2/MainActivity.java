package alertdialog2.mysqlx18.com.alertdialog2;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final Dialog dialog = new Dialog(getApplicationContext());

        //dialog = new AlertDialog.Builder(this);
        button = (Button)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("Delete Scan History");
                dialog.setMessage("Are you sure you want to delete your scan history? This can not be undone...");
                dialog.setCancelable(false);
                dialog.setIcon(R.mipmap.ic_launcher);
                dialog.setPositiveButton("Yes",

                        new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }

                        });

                dialog.setNegativeButton("No",

                        new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }

                        });


                AlertDialog alertD = dialog.create();
                alertD.show();
            }
        });
    }
}
