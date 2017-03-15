package lvs.android.unittest;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/*
GUI test using Espresso
 */

// ===
// ActivityInstrumentationTestCase2 is not depreciated, see below to use ActivityTestRule as replacement
// ===
//public class CalculatorAddTest extends ActivityInstrumentationTestCase2<MainActivity> {
//    public static final String THREE = "3";
//    public static final String FOUR = "4";
//    public static final String RESULT = "7.0";
//
//    public CalculatorAddTest() {
//        super(MainActivity.class);
//    }
//
//    @Override
//    protected void setUp() throws Exception {
//        super.setUp();
//        getActivity();
//    }
//
//    public void testCalculatorAdd() {
//        onView(withId(R.id.et_operand_one)).perform(typeText(THREE));
//        onView(withId(R.id.et_operand_two)).perform(typeText(FOUR));
//        onView(withId(R.id.btn_add)).perform(click());
//        onView(withId(R.id.tv_result)).check(matches(withText(RESULT)));
//    }
//}

@RunWith(AndroidJUnit4.class)
@LargeTest
public class CalculatorAddTest {
    public static final String THREE = "3";
    public static final String FOUR = "4";
    public static final String RESULT = "7.0";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void testCalculatorAdd() {
        onView(withId(R.id.et_operand_one)).perform(typeText(THREE));
        onView(withId(R.id.et_operand_two)).perform(typeText(FOUR));
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText(RESULT)));
    }
}
