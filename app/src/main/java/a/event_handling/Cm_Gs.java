package a.event_handling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class Cm_Gs extends AppCompatActivity implements GestureDetector.OnGestureListener,
            GestureDetector.OnDoubleTapListener{

        private TextView gestureText;
        private GestureDetectorCompat gDetector;

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_cm_gs);
            gestureText = findViewById(R.id.textView2);
            this.gDetector = new GestureDetectorCompat(this,this);
            gDetector.setOnDoubleTapListener(this);

        }
        @Override
        public boolean onDown(android.view.MotionEvent event) {
            gestureText.setText ("onDown");
            return true;
        }

        @Override
        public boolean onFling(android.view.MotionEvent event1, android.view.MotionEvent event2,
                               float velocityX, float velocityY) {
            gestureText.setText("onFling");
            return true;
        }

        @Override
        public void onLongPress(android.view.MotionEvent event) {
            gestureText.setText("onLongPress");
        }

        @Override
        public boolean onScroll(android.view.MotionEvent e1, android.view.MotionEvent e2,
                                float distanceX, float distanceY) {
            gestureText.setText("onScroll");
            return true;
        }

        @Override
        public void onShowPress(android.view.MotionEvent event) {
            gestureText.setText("onShowPress");
        }

        @Override
        public boolean onSingleTapUp(android.view.MotionEvent event) {
            gestureText.setText("onSingleTapUp");
            return true;
        }

        @Override
        public boolean onDoubleTap(android.view.MotionEvent event) {
            gestureText.setText("onDoubleTap");
            return true;
        }

        @Override
        public boolean onDoubleTapEvent(android.view.MotionEvent event) {
            gestureText.setText("onDoubleTapEvent");
            return true;
        }

        @Override
        public boolean onSingleTapConfirmed(android.view.MotionEvent event) {
            gestureText.setText("onSingleTapConfirmed");
            return true;
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            this.gDetector.onTouchEvent(event);

            return super.onTouchEvent(event);
        }
    }

