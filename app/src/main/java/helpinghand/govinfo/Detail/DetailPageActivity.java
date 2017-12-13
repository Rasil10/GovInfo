package helpinghand.govinfo.Detail;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import helpinghand.govinfo.R;

public class DetailPageActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            android.support.v4.app.FragmentManager fm=getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction transaction=fm.beginTransaction();
            switch (item.getItemId()) {

                case R.id.navigation_home:
                    transaction.replace(R.id.mainFrame,new HomeFragment()).commit();
                    return true;
                case R.id.navigation_important:
                    transaction.replace(R.id.mainFrame,new ImportantFragment()).commit();
                    return true;
                case R.id.navigation_faqs:
                    transaction.replace(R.id.mainFrame,new FAQsFragment()).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame,new HomeFragment()).commit();
    }

}
