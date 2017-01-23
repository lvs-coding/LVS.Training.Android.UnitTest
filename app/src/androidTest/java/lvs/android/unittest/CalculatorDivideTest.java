package lvs.android.unittest;

import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class CalculatorDivideTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public static final String THREE = "8";
    public static final String FOUR = "2";
    public static final String RESULT = "4.0";

    public CalculatorDivideTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testCalculatorAdd() {
        onView(withId(R.id.et_operand_one)).perform(typeText(THREE));
        onView(withId(R.id.et_operand_two)).perform(typeText(FOUR));
        onView(withId(R.id.btn_div)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText(RESULT)));
    }
}