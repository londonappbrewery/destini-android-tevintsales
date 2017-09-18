package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView)findViewById(R.id.storyTextView);
        mButtonTop = (Button)findViewById(R.id.buttonTop);
        mButtonBottom = (Button)findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }


    public void updateStoryTop(View view){
        switch(mStoryIndex){
            case 0:
                mStoryTextView.setText(R.string.T3_Story);
                mButtonTop.setText(R.string.T3_Ans1);
                mButtonBottom.setText(R.string.T3_Ans2);
                mStoryIndex++;
                break;
            case 1:
                mStoryTextView.setText(R.string.T6_End);
                mButtonTop.setVisibility(View.INVISIBLE);
                mButtonBottom.setVisibility(View.INVISIBLE);
                break;
            case 2:
                mStoryIndex = 1;
                mStoryTextView.setText(R.string.T3_Story);
                mButtonTop.setText(R.string.T3_Ans1);
                mButtonBottom.setText(R.string.T3_Ans2);
                break;
            default:
                mStoryTextView.setText(R.string.T1_Story);
                mStoryIndex = 0;
                break;
        }


    }

    public void updateStoryBottom(View view){
        switch(mStoryIndex){
            case 0:
                mStoryTextView.setText(R.string.T2_Story);
                mButtonTop.setText(R.string.T2_Ans1);
                mButtonBottom.setText(R.string.T2_Ans2);
                mStoryIndex = 2;
                break;
            case 1:
                mStoryTextView.setText(R.string.T5_End);
                mButtonTop.setVisibility(View.INVISIBLE);
                mButtonBottom.setVisibility(View.INVISIBLE);
                break;
            case 2:
                mStoryTextView.setText(R.string.T4_End);
                mButtonTop.setVisibility(View.INVISIBLE);
                mButtonBottom.setVisibility(View.INVISIBLE);
                break;
            default:
                mStoryTextView.setText(R.string.T1_Story);
                mStoryIndex = 0;
                break;
        }


    }


}
