package mbukachi.dynamicfeature

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import mbukachi.fragmentscenariodfm.R


@RunWith(AndroidJUnit4::class)
class BlankFragmentTest {

    @Test
    fun testExample() {
        val scenario = launchFragmentInContainer<BlankFragment>(themeResId = R.style.AppTheme)
        onView(withId(R.id.text)).check(matches(withText("Some text")))
    }
}