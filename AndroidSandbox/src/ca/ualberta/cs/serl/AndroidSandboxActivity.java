package ca.ualberta.cs.serl;

import android.app.Activity;
import android.os.Bundle;

public class AndroidSandboxActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}