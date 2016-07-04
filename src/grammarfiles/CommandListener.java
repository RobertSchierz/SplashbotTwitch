package grammarfiles;

import org.antlr.v4.runtime.tree.ErrorNode;


/**
 * Created by Robert on 04.07.2016.
 */
public class CommandListener extends CommandsBaseListener {



    @Override
    public void enterFile(CommandsParser.FileContext ctx){
        //System.out.println(ctx.getText());

    }

    @Override
    public void visitErrorNode(ErrorNode node){
        CommandControll.error = true;
    }

    @Override
    public void exitFile(CommandsParser.FileContext ctx){

        for(int i = 0; i < ctx.getChildCount()-1; i++){
            CommandsParser.CommandContext tempcommand = ctx.command().get(i);
            if(tempcommand.methodrule().getChildCount() == 0){
                CommandControll.commandlist.put(tempcommand.commandnamesign.getText() + tempcommand.commandname.getText(), tempcommand.commandvalue.getText());
            }else if(tempcommand.methodrule().getChildCount() != 0){
                CommandControll.methodlist.put(tempcommand.commandnamesign.getText() + tempcommand.commandname.getText(), tempcommand.commandvalue.getText());
            }

        }
    }


}
