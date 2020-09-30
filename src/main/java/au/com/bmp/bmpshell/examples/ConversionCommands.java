package au.com.bmp.bmpshell.examples;

import org.springframework.core.convert.converter.Converter;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.stereotype.Component;

/**
 * Copied from: https://github.com/spring-projects/spring-shell/blob/master/spring-shell-samples/src/main/java/org/springframework/shell/samples/standard/ConversionExample.java
 */
@ShellComponent
class ConversionCommands {

    @ShellMethod("Shows conversion using Spring converter")
    public Object conversionExample(DomainObject object) {
        return object;
    }

}

class DomainObject {
    private final String value;

    DomainObject(String value) {
        this.value = value;
    }
}

@Component
class CustomDomainConverter implements Converter<String, DomainObject> {

    @Override
    public DomainObject convert(String source) {
        return new DomainObject(source);
    }
}