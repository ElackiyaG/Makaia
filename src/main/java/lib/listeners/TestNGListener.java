package lib.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class TestNGListener implements IAnnotationTransformer, IRetryAnalyzer {
	int maxCount = 1;

	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess() && maxCount<2)
		{
			maxCount++;
			return true;
		}
		return false;
	}

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		//code snippet to set timeout and disable the test execution
		/*if(testMethod.getName().equals("createLead"))
		{
		annotation.setTimeOut(10000);
		}
		if(testMethod.getName().equals("deleteLead"))
		{
		annotation.setEnabled(false);
		}*/
		annotation.setRetryAnalyzer(this.getClass());
		
		
	}
 
}
