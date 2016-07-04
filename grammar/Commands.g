grammar Commands;

file	:	command+ EOF;

command	:	commandnamesign=First  commandname=Letter+ Commandseperator commandvalue=commandvaluerule method=methodrule Separator (LineBreak | EOF ) ;

First: '!';

Letter: (('a'..'z') | ('A'..'Z'))+;

Commandseperator : '=';

commandvaluerule: (Letter | Whitespace)+;

Separator : ';';

methodrule: (Methodstart Methodend)?;

Methodstart: '(';

Methodend: ')';

LineBreak : '\r'?'\n' | '\r';

Whitespace : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ ;
