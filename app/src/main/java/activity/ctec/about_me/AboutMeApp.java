package activity.ctec.about_me;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;

public class AboutMeApp extends AppCompatActivity {
    private Button hobbieButton;
    private Button gamingButton;
    private Button achevementsButton;
    private Button familyButton;
    private Button summerButton;

    private  TextView hobbieText;
    private TextView gamingText;
    private TextView achevementsText;
    private TextView familyText;
    private TextView summerText;

    private ImageView hobbieImage;
    private ImageView gamingImage;
    private ImageView achevementsImage;
    private ImageView familyImage;
    private ImageView summerImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me_app);

        hobbieButton = (Button) findViewById(R.id.hobbieButton);
        gamingButton = (Button) findViewById(R.id.gamingButton);
        achevementsButton = (Button) findViewById(R.id.achevementsButton);
        familyButton = (Button) findViewById(R.id.familyButton);
        summerButton = (Button) findViewById(R.id.summerButton);

        hobbieText = (TextView) findViewById(R.id.hobbieText);
        gamingText = (TextView) findViewById(R.id.gamingText);
        achevementsText = (TextView) findViewById(R.id.achevementsText);
        familyText = (TextView) findViewById(R.id.familyText);
        summerText = (TextView) findViewById(R.id.summerText);

        hobbieImage = (ImageView) findViewById(R.id.hobbieImage);
        gamingImage = (ImageView) findViewById(R.id.gamingImage);
        achevementsImage = (ImageView) findViewById(R.id.achevementsImage);
        familyImage = (ImageView) findViewById(R.id.familyImage);
        summerImage = (ImageView) findViewById(R.id.summerImage);

        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about_me_app, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void changeHobbieVisibility()
    {
        if(hobbieText.getVisibility() == View.VISIBLE) //&& hobbieImage.getVisibility() == View.VISIBLE)
        {
            hobbieText.setVisibility(View.GONE);
            hobbieImage.setVisibility(View.GONE);
        }
        else
        {
            hobbieText.setVisibility(View.VISIBLE);
            hobbieImage.setVisibility(View.VISIBLE);
        }

    }
    private void changeGamingVisibility()
    {
        if(gamingText.getVisibility() == View.VISIBLE)
        {
            gamingText.setVisibility(View.GONE);
            gamingImage.setVisibility(View.GONE);
        }
        else
        {
            gamingText.setVisibility(View.VISIBLE);
            gamingImage.setVisibility(View.VISIBLE);
        }
    }
    private void changeAchevementsVisibility()
    {
        if(achevementsText.getVisibility() == View.VISIBLE)
        {
            achevementsText.setVisibility(View.GONE);
            achevementsImage.setVisibility(View.GONE);
        }
        else
        {
            achevementsText.setVisibility(View.VISIBLE);
            achevementsImage.setVisibility(View.VISIBLE);
        }
    }

    private void setupListeners()
    {
        hobbieButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                changeHobbieVisibility();
            }
        });
        gamingButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                changeGamingVisibility();
            }
        });
        achevementsButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                changeAchevementsVisibility();
            }
        });
    }
}
