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

// Utilidades
COMPARACAO: '==';
LPAREN : '(' ;
RPAREN : ')' ;
END : 'end';
RETURN: 'return';
OPERADOR : '*' | '-';
COMENTARIO_INICIO: '--' ~([\n]|[\r])+ -> skip;
UNDERSCORE: '_';
//COMENTARIO_CORPO: ID;

ID : (LETRA|UNDERSCORE) ((LETRA|ALGARISMO|UNDERSCORE)+)?;
NUMERO : ALGARISMO+;

programa : bloco;

bloco: comando comando | comando;

comando : comentario
        | if_decl
        | retorno
        | funcao_decl;
comentario: COMENTARIO_INICIO;

retorno: RETURN valor;

if_decl: IF log_exp THEN bloco (ELSE bloco)? END;
log_exp: valor COMPARACAO valor;

funcao_decl: FUNCTION funcao_nome LPAREN var RPAREN bloco END ';' ;

funcao_nome: ID{ TabelaDeSimbolos.adicionarSimbolo($ID.text, Tipo.FUNCAO); };
var: ID{ TabelaDeSimbolos.adicionarSimbolo($ID.text, Tipo.VARIAVEL); };
valor: (NUMERO|var) | exp | funcao_chamada;

funcao_chamada : ID LPAREN valor RPAREN;

exp: (NUMERO|var) OPERADOR valor; // tratar ordem de operadores
