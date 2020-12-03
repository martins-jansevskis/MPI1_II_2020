package lv.martins.mpi1_ii_2020;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button dialog = findViewById(R.id.dialog);
        String[] studentsArray = getResources().getStringArray(R.array.students);
        dialog.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Use the Builder class for convenient dialog construction
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(R.string.members)
                    .setMultiChoiceItems(R.array.students, null, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                                if (isChecked) {
                                    Toast.makeText(MainActivity.this, "Student " + studentsArray[which] + " checked", Toast.LENGTH_LONG).show();
                                } else {
                                    Toast.makeText(MainActivity.this, "Student " + studentsArray[which] + " unchecked", Toast.LENGTH_LONG).show();
                                }
                            }
                        })
                        .setPositiveButton(R.string.ok, null)
                        .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Toast.makeText(MainActivity.this, "You closed dialog", Toast.LENGTH_LONG).show();
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
                Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                positiveButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "You clicked Ok", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    public void goToSecond(View v){
        startActivity(new Intent(MainActivity.this, MainActivity2.class));
    }
}