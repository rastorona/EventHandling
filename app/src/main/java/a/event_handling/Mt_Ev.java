package a.event_handling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Mt_Ev extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_mt_ev);
            ConstraintLayout constraintLayout = findViewById(R.id.Con_Layout);
            constraintLayout.setOnTouchListener(new ConstraintLayout.OnTouchListener() {
                @Override
                public boolean onTouch(View v, android.view.MotionEvent m) {
                    handleTouch(m);
                    return true;
                }

            });

        }

        private void handleTouch(android.view.MotionEvent m) {
            TextView textView1 = findViewById(R.id.textView3);
            TextView textView2 = findViewById(R.id.textView4);

            int pointerCount = m.getPointerCount();

            for (int i = 0; i < pointerCount; i++)
            {
                int x = (int) m.getX(i);
                int y = (int) m.getY(i);
                int id = m.getPointerId(i);
                int action = m.getActionMasked();
                int actionIndex = m.getActionIndex();
                String actionString;


                switch (action)
                {
                    case android.view.MotionEvent.ACTION_DOWN:
                        actionString = "DOWN";
                        break;
                    case android.view.MotionEvent.ACTION_UP:
                        actionString = "UP";
                        break;
                    case android.view.MotionEvent.ACTION_POINTER_DOWN:
                        actionString = "PNTR DOWN";
                        break;
                    case android.view.MotionEvent.ACTION_POINTER_UP:
                        actionString = "PNTR UP";
                        break;
                    case android.view.MotionEvent.ACTION_MOVE:
                        actionString = "MOVE";
                        break;
                    default:
                        actionString = "";
                }

                String touchStatus = "Action: " + actionString + " Index: " +
                        actionIndex + " ID: " + id + " X: " + x + " Y: " + y;
                if (id == 0)
                    textView1.setText(touchStatus);
                else
                    textView2.setText(touchStatus);
            }

        }

    }
