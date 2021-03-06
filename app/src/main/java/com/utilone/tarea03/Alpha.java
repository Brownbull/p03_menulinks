package com.utilone.tarea03;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Alpha extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_alpha);

    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
  }

  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(@NonNull MenuItem item) {
    int itemId = item.getItemId();
    switch (itemId){
      case android.R.id.home:
        goMain();
        Toast.makeText(this, "Back in Home", Toast.LENGTH_SHORT).show();
        break;
      case R.id.action_goAlpha:
        Toast.makeText(this, "Estas en Alpha Activity", Toast.LENGTH_SHORT).show();
        break;
      case R.id.action_goGoogle:
        goGoogle();
        break;
      default:
        Toast.makeText(this, "Action id: " + itemId, Toast.LENGTH_SHORT).show();
        break;
    }
    return super.onOptionsItemSelected(item);
  }

  public void goMain() {
    Intent tvMain = new Intent(this, MainActivity.class);
    startActivity(tvMain);
    Toast.makeText(this,
        "Main Activity", Toast.LENGTH_SHORT).show();
    finish();
  }

  public void goGoogle() {
    Toast.makeText(this, "Opening Google.com", Toast.LENGTH_SHORT).show();
    Uri uri = Uri.parse("http://www.google.com"); // missing 'http://' will cause crashed
    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
    startActivity(intent);
  }
}
