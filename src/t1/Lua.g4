/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Lua;

@members {
   public static String grupo="<<Digite os RAs do grupo aqui>>";
}
WS:   (' ') -> skip;
ENDL:  ([\n] | [\t]) -> skip;
// base
fragment LETRA: [a-z|A-Z];
fragment ALGARISMO: [0-9];

// Declarar funcao:
FUNCTION : 'function' ;

// IF
IF : 'if';
THEN: 'then';
ELSE: 'else';

// Repeat
REPEAT: 'repeat';
UNTIL: 'until';

// For
FOR: 'for';
DO: 'do';

// Utilidades
LOCAL: 'local';
ATRIBUICAO: '=';
COMPARACAO: '==' | '>';
LPAREN : '(' ;
RPAREN : ')' ;
END : 'end';
RETURN: 'return';
OPERADOR : '*' | '-' | '+' | '/';
COMENTARIO_INICIO: '--' ~([\n]|[\r])+ -> skip;
UNDERSCORE: '_';
DOT: '.';
COMMA: ',';
DOT_COMMA: ';' ;
CADEIA: ([\\'] (~[\\'])* [\\']) | ('"' (~'"')* '"');

ID : (LETRA|UNDERSCORE) ((LETRA|ALGARISMO|UNDERSCORE)+)?;
NUMERO : ALGARISMO+;

programa : bloco;

bloco: (comando DOT_COMMA?)* comando DOT_COMMA? /*| comando DOT_COMMA?*/;

comando : atr
        | comentario
        | if_decl
        | retorno
        | funcao_decl
        | funcao_chamada
        | repeat_decl
        | do_decl
        | for_decl;
comentario: COMENTARIO_INICIO;

retorno: RETURN valor;

do_decl: DO bloco END;
repeat_decl: REPEAT bloco UNTIL log_exp;
for_decl: FOR atr COMMA LPAREN valor RPAREN DO bloco END DOT_COMMA;

if_decl: IF log_exp THEN bloco (ELSE bloco)? END;
log_exp: valor COMPARACAO valor;

funcao_decl: FUNCTION funcao_nome LPAREN lista_valor RPAREN bloco END DOT_COMMA;

funcao_nome: ID{ TabelaDeSimbolos.adicionarSimbolo($ID.text, Tipo.FUNCAO); };
var: ID{ TabelaDeSimbolos.adicionarSimbolo($ID.text, Tipo.VARIAVEL); };
valor: (NUMERO|var) | exp | funcao_chamada | CADEIA | var DOT funcao_chamada;
atr: (LOCAL)? var ATRIBUICAO valor;

funcao_chamada : ID LPAREN lista_valor RPAREN;
lista_valor: (valor COMMA)* valor;

exp: (NUMERO|var) OPERADOR valor; // tratar ordem de operadores
