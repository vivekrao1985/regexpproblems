package my.checkstyle.frustrations;

import java.lang.instrument.ClassDefinition;

/**
 * @author Vivek Rao
 */
public class ShouldAlsoPass
{
    public static void main(final String[] args)
    {
        final ClassDefinition cl = new ClassDefinition(ShouldAlsoPass.class, null);
    }
}
