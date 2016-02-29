package com.sqisland.android.hello;

import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Created by buddhira on 2/28/16.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

//    with this rule espresso will launch test method before each activity
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
        new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void venkataMenuTest() {
        //initial verify if this view is displaying You are in Home page!
        onView(withId(R.id.main_activity_greeting_id))
                .check(matches(withText(R.string.inside_app_text)));

        //see if there is a settings menu and perform a click
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getContext());
        onView(withText(R.string.venkata_menu)).perform(click());

        //now verify if the selected menu has changed the original text to Venkata Menu is selected
        onView(withId(R.id.main_activity_greeting_id))
                .check(matches(withText(R.string.venkata_menu_selected)));
    }


}