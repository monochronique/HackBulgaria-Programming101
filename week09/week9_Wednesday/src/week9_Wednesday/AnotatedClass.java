package week9_Wednesday;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface ClassAnotation
{
	String author();
	int currentRevision() default 1;
	boolean checked() default true;
	Class<?>[] related();
	
}

@ClassAnotation (
				author = "Misho",
				currentRevision = 2,
				checked = false,
				related = {}
		
			   )

public class AnotatedClass {
	int asd()
	{
		return 42;
	}

}
