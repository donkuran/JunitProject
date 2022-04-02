package junits;

import java.lang.annotation.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

@Tag("Sanity")
@DisplayName("Negative Test")
@Test
public @interface CustomAnnotation {
	
}
