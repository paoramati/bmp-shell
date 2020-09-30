package au.com.bmp.bmpshell.commands;

import au.com.bmp.bmpshell.shell.ShellHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class FirstCommand
{
    @Autowired
    private ShellHelper shellHelper;

    @ShellMethod("Add two integers together.")
    public int add(int a, int b)
    {
        return a + b;
    }

    @ShellMethod("Tells you something nice")
    public String success(final String name)
    {
        return "Hello, " + shellHelper.getSuccessMessage(name);
    }

}
