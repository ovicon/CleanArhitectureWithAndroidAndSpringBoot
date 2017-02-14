package ro.ovidiuconeac.client.features.featurex.presentation.view;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ro.ovidiuconeac.presentationlayer.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityHeadersTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityHeadersTest() {
        ViewInteraction textView = onView(
                allOf(withText("Fruits"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.activity_main),
                                        0),
                                0),
                        isDisplayed()));
        textView.check(matches(withText("Fruits")));

        ViewInteraction textView2 = onView(
                allOf(withText("Cheeses"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.activity_main),
                                        0),
                                3),
                        isDisplayed()));
        textView2.check(matches(withText("Cheeses")));

        ViewInteraction textView3 = onView(
                allOf(withText("Sweets"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.activity_main),
                                        0),
                                6),
                        isDisplayed()));
        textView3.check(matches(withText("Sweets")));
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
