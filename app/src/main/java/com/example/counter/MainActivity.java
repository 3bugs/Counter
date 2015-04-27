package com.example.counter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity
      implements View.OnClickListener {

   // ตัวแปรที่ใช้อ้างอิงวิวต่างๆใน UI (ประกาศตรงนี้เพื่อให้เรียกใช้ได้จากทุกเมธอดในคลาส)
   TextView txtCount;
   RadioButton radUp, radDown;
   Button btnCount;

   int count = 0;  // ค่าของตัวนับ โดยกำหนดค่าเริ่มต้นเป็น 0

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      // ค้นหาวิวต่างๆใน UI โดยใช้ ID ที่เรากำหนดใน layout file
      txtCount = (TextView) findViewById(R.id.counter_value);
      radUp = (RadioButton) findViewById(R.id.count_up_radio);
      radDown = (RadioButton) findViewById(R.id.count_down_radio);
      btnCount = (Button) findViewById(R.id.count_button);

      // แสดงค่าเริ่มต้นของตัวนับ (0) ในเท็กซ์วิว
      txtCount.setText(String.valueOf(count));
      // กำหนดให้ออบเจ็คปัจจุบัน (this) ทำหน้าที่เป็น onClick listener
      // ของปุ่ม btnCount
      btnCount.setOnClickListener(this);
   }

   @Override
   public void onClick(View v) {
      // ตรวจสอบว่าปุ่มเรดิโออันใดถูกเลือก แล้วเพิ่มค่าหรือลดค่าตัวนับ
      if (radUp.isChecked()) {
         count++;
      } else if (radDown.isChecked()) {
         count--;
      }
      // แสดงค่าปัจจุบันของตัวนับในเท็กซ์วิว
      txtCount.setText(String.valueOf(count));
   }
}
