package com.thought_daily.admin.app;

//import android.app.AlarmManager;
//import android.app.PendingIntent;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
//import android.icu.text.DateFormat;
//import java.util.Calendar;
import java.util.Calendar;
//import java.util.Date;

//import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;





public class MainActivity extends AppCompatActivity {
    ImageButton btnShare;
    Intent shareIntent;

    NavigationView mNavigationView;


    Animation animm;

    public static final String TAG =MainActivity.class.getSimpleName();
    private FactBook mFactBook=new FactBook();
    private ColorWheel mColorWheel=new ColorWheel();
    private TextView mFactTextView,mAuthTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;
    public String fact,auth;
    public int count;
    int maxfact = mFactBook.maxcount()-1;

    //Drawer

    boolean notificationToggle;


    Calendar calendar=Calendar.getInstance();






//    Date date;

    Calendar c = Calendar.getInstance();
    int date = c.get(Calendar.DATE);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Drawer Notification Icon Set
        mNavigationView=(NavigationView)findViewById(R.id.navigation_view);


        Menu menu = mNavigationView.getMenu();
        ///
        SharedPreferences getPreviousState =getSharedPreferences("buttonstate", Context.MODE_PRIVATE);
         notificationToggle=getPreviousState.getBoolean("state",false);
        if(notificationToggle == true) {

            menu.findItem(R.id.notification).setIcon(R.mipmap.ic_notifications_active_black_24dp);
        }else {
            menu.findItem(R.id.notification).setIcon(R.mipmap.ic_notifications_none_black_24dp);

        }
        //Animation
        animm= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);

        //String currentDateString = DateFormat.getDateInstance().format(new Date());

        //Getting Dates
        SharedPreferences sharedPref =getSharedPreferences("data", Context.MODE_PRIVATE);
        String previousDate=sharedPref.getString("previous","");
        String currentDateString =String.valueOf(date); //Convetring To String

        count =sharedPref.getInt("count",-1);

        //Toast.makeText(this,currentDateString,Toast.LENGTH_SHORT).show();

        if(count>=maxfact){
            count=-1;
        }


       //btnShare= (ImageButton) findViewById(R.id.shareButton);
        mFactTextView= (TextView) findViewById(R.id.factText);
        mShowFactButton=(Button) findViewById(R.id.factButton);
        mRelativeLayout=(RelativeLayout) findViewById(R.id.relativeLayout);
        mAuthTextView=(TextView) findViewById(R.id.authText);

        //Navigation Menu
        // 1)Share
        // 2)Notification

               mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.share:
                       share();
                        break;
                    case R.id.notification:
                    {
                        Menu menu = mNavigationView.getMenu();

                        if(notificationToggle == true){
                        menu.findItem(R.id.notification).setIcon(R.mipmap.ic_notifications_none_black_24dp);
                        Toast.makeText(getApplicationContext(),"Disable",Toast.LENGTH_SHORT).show();
                        notificationToggle =false;
                            saveButtonState(notificationToggle);


                            calendar.set(calendar.HOUR_OF_DAY,8);
                            calendar.set(calendar.MINUTE,30);
                            calendar.set(calendar.SECOND,0);

                            Intent intent=new Intent(getApplicationContext(),Notification_receiver.class);

                            PendingIntent pendingIntent=PendingIntent.getBroadcast(getApplicationContext(),100,intent,PendingIntent.FLAG_UPDATE_CURRENT);

                            AlarmManager alarmManager=(AlarmManager) getSystemService(ALARM_SERVICE);


                            if (alarmManager!= null) {
                                alarmManager.cancel(pendingIntent);
                            }
                        }else {
                            menu.findItem(R.id.notification).setIcon(R.mipmap.ic_notifications_active_black_24dp);
                            notificationToggle =true;

                            saveButtonState(notificationToggle);

                            calendar.set(calendar.HOUR_OF_DAY,8);
                            calendar.set(calendar.MINUTE,30);
                            calendar.set(calendar.SECOND,0);

                            Intent intent=new Intent(getApplicationContext(),Notification_receiver.class);

                            PendingIntent pendingIntent=PendingIntent.getBroadcast(getApplicationContext(),100,intent,PendingIntent.FLAG_UPDATE_CURRENT);

                            AlarmManager alarmManager=(AlarmManager) getSystemService(ALARM_SERVICE);


                            alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),AlarmManager.INTERVAL_DAY,pendingIntent);

                            Toast.makeText(getApplicationContext(),"Enable",Toast.LENGTH_SHORT).show();

                        }

                    }
                        break;

                }
                return false;
            }
        });


        int color=mColorWheel.getColor();

        if(! previousDate.equals(currentDateString) ){
           //Toast.makeText(this,maxfact,Toast.LENGTH_LONG).show();
            count++;
            saveData(currentDateString,count);
            //Toast.makeText(this,"!!!",Toast.LENGTH_LONG).show();
        }

        fact=mFactBook.getFact(count);
        auth=mFactBook.getAuth(count);
        mFactTextView.setText(fact);
        mAuthTextView.setText(auth);
        mRelativeLayout.setBackgroundColor(color);
        mShowFactButton.setTextColor(color);

    /*
        //Settings

        mSettingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            openSettings();
            }
        });
    */
        //Share Button

       /*
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String fact=mFactBook.getFact();
               share();
                    }
                });*/

    //Getting Random Facts on Click

        View.OnClickListener listener= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             fact=mFactBook.getFactRandom();
             auth=mFactBook.getAuthRandom();
             int color=mColorWheel.getColor();
             mFactTextView.setText(fact);
             mAuthTextView.setText(auth);


                //Animation Code
                mFactTextView.startAnimation(animm);

                mAuthTextView.startAnimation(animm);
                mFactTextView.setVisibility(View.VISIBLE);
                mAuthTextView.setVisibility(View.VISIBLE);

             mRelativeLayout.setBackgroundColor(color);
             mShowFactButton.setTextColor(color);
            }
        };
        mShowFactButton.setOnClickListener(listener);
       // Toast.makeText(this, "hey,toast working", Toast.LENGTH_SHORT).show();
}
/* Setting languge
    private void openSettings(){
        Intent intent = new Intent(this,settings.class);
        startActivity(intent);
    }*/
    public void saveData(String previousDate,int count){
        //SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences sharedPref =getSharedPreferences("data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("previous",previousDate);
        editor.putInt("count",count);
        editor.apply();
      //  Toast.makeText(this,"saved",Toast.LENGTH_LONG).show();
    }
   /* public int getCount()
    {
        count =sharedPref.getInt("count",-1);
        return count;
    }*/

   public void saveButtonState(Boolean state){
       SharedPreferences savestate = getSharedPreferences("buttonstate",Context.MODE_PRIVATE);
       SharedPreferences.Editor editor = savestate.edit();
       editor.putBoolean("state",state);
       editor.apply();


   }
   private void share()
    {
        shareIntent = new Intent(android.content.Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Thought");
        shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, fact +"\n"+auth );
        startActivity(Intent.createChooser(shareIntent, "share via"));
    }

}