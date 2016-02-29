package com.sqisland.android.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

  private TextView greetingView;

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.activity_main_menu, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {

    if(item.getItemId() == R.id.action_first_menu){
      greetingView.setText(R.string.venkata_menu_selected);
      return true;
    }else if(item.getItemId() == R.id.action_second_menu){
        greetingView.setText(R.string.inside_app_text);
    }

    return super.onOptionsItemSelected(item);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    greetingView = (TextView) findViewById(R.id.main_activity_greeting_id);
  }
}