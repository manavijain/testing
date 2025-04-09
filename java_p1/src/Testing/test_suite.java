package Testing;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ 
	TestAdd.class, 
	TestSub.class 
	})
public class test_suite {

}
