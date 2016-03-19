package week9_Wednesday;

import java.lang.annotation.Annotation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annotation[] annotations = AnotatedClass.class.getAnnotations();
		for (Annotation ann : annotations)
		{
			System.out.println(ann.annotationType().getClass().getFields());
			System.out.println(ann);
		}

	}

}
