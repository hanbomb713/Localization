package hanwu.localization;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText EditText1 = (EditText)findViewById(R.id.editText);
        final EditText EditText2 = (EditText)findViewById(R.id.editText2);

        EditText1.setOnKeyListener(new OnKeyListener()
        {
            public boolean onKey(View w,int keyCode, KeyEvent event)
            {
                String s;
                if (event.getAction() == KeyEvent.ACTION_DOWN)
                {
                    if (keyCode == KeyEvent.KEYCODE_DPAD_RIGHT)
                    {
                        s = EditText1.getText().toString();
                        EditText1.setText(EditText2.getText().toString());
                        EditText2.setText(s);
                        return true;
                    }
                    else
                        return false;
                }
                else
                    return false;
            }
        });
        EditText2.setOnKeyListener(new OnKeyListener()
        {
            public boolean onKey(View w,int keyCode, KeyEvent event)
            {
                String s;
                if (event.getAction() == KeyEvent.ACTION_DOWN)
                {
                    if (keyCode == KeyEvent.KEYCODE_DPAD_RIGHT)
                    {
                        s = EditText2.getText().toString();
                        EditText2.setText(EditText1.getText().toString());
                        EditText1.setText(s);
                        return true;
                    }
                    else
                        return false;
                }
                else
                    return false;
            }
        });
    }
}
