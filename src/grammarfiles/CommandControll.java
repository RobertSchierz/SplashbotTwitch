package grammarfiles;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Robert on 04.07.2016.
 */
public class CommandControll {
    public static boolean error = false;
    public static Map<String,String> commandlist = new HashMap<String,String>();
    public static Map<String,String> methodlist = new HashMap<String,String>();

    public void checkCommand() throws IOException {

        CommandsLexer lexer = new CommandsLexer(new ANTLRFileStream(System.getProperty("user.dir") + "/src/grammarfiles/commands.txt"));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CommandsParser parser = new CommandsParser(tokens);
        CommandsParser.FileContext commandContext = parser.file();

        ParseTreeWalker walker = new ParseTreeWalker();
        CommandListener listener = new CommandListener();
        walker.walk(listener, commandContext);

    }

    public boolean checkError(){
        return error;
    }

    public Map getCommandList(){
        return commandlist;
    }

    public Map getMethodist(){
        return methodlist;
    }
}
