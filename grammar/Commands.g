grammar Commands;

file	:	command+ EOF;

command	:	commandnamesign=First  commandname=Letter+ Commandseperator commandvalue=Letter+  Separator (LineBreak | EOF ) ;

First: '!';

Letter: (('a'..'z') | ('A'..'Z'))+;

Commandseperator : '=';

Separator : ';';

LineBreak : '\r'?'\n' | '\r';

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
