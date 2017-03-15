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
//public class CalculatorDivideTest extends ActivityInstrumentationTestCase2<MainActivity> {
//    public static final String THREE = "8";
//    public static final String FOUR = "2";
//    public static final String RESULT = "4.0";
//
//    public CalculatorDivideTest() {
//        super(MainActivity.class);
//    }
//
//    @Override
//    protected void setUp() throws Exception {
//        super.setUp();
//        getActivity();
//    }
//
//    public void testCalculatorDiv() {
//        onView(withId(R.id.et_operand_one)).perform(typeText(THREE));
//        onView(withId(R.id.et_operand_two)).perform(typeText(FOUR));
//        onView(withId(R.id.btn_div)).perform(click());
//        onView(withId(R.id.tv_result)).check(matches(withText(RESULT)));
//    }
//}

@RunWith(AndroidJUnit4.class)
@LargeTest
public class CalculatorDivideTest {
    public static final String THREE = "8";
    public static final String FOUR = "2";
    public static final String RESULT = "4.0";


    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void testCalculatorDiv() {
        onView(withId(R.id.et_operand_one)).perform(typeText(THREE));
        onView(withId(R.id.et_operand_two)).perform(typeText(FOUR));
        onView(withId(R.id.btn_div)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText(RESULT)));
    }
}