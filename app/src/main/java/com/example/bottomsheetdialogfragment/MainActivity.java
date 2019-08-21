package com.example.bottomsheetdialogfragment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
    implements ActionBottomDialogFragment.ItemClickListener {
  TextView tvSelectedItem;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    tvSelectedItem = findViewById(R.id.tvSelectedItem);
  }

  public void showBottomSheet(View view) {
    ActionBottomDialogFragment addPhotoBottomDialogFragment =
        ActionBottomDialogFragment.newInstance();
    addPhotoBottomDialogFragment.show(getSupportFragmentManager(),
        ActionBottomDialogFragment.TAG);
  }

  @Override public void onItemClick(String item) {
    tvSelectedItem.setText("Selected action item is " + item);
  }
}
