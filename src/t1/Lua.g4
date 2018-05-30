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

// Operadores
MINUS: '-';
PLUS: '+';
TIMES: '*';
DIVIDED: '/';
NOR: 'nor';
HASH: '#';

// Utilidades
LOCAL: 'local';
ATRIBUICAO: '=';
COMPARACAO: '==' | '>';
LPAREN : '(' ;
RPAREN : ')' ;
END : 'end';
RETURN: 'return';
FALSE: 'false';


COMENTARIO_INICIO: '--' ~([\n]|[\r])+ -> skip;
UNDERSCORE: '_';
DOT: '.';
SEMI_C: ';' ;
CADEIA: ([\\'] (~[\\'])* [\\']) | ('"' (~'"')* '"');

ID : (LETRA|UNDERSCORE) ((LETRA|ALGARISMO|UNDERSCORE)+)?;
NUMERO : ALGARISMO* DOT? ALGARISMO+;

programa : trecho;


trecho: (comando SEMI_C?)* (comando_ultimo SEMI_C?)?;
bloco: trecho;
comando_ultimo: retorno ;

comando : atr
        | comentario
        | if_decl
        | funcao_decl
        | funcao_chamada
        | repeat_decl
        | do_decl
        | for_decl;
comentario: COMENTARIO_INICIO;

retorno: RETURN (valor|exp);

do_decl: DO bloco END;
repeat_decl: REPEAT bloco UNTIL log_exp;
for_decl: FOR atr DO bloco END SEMI_C;

if_decl: IF log_exp THEN bloco (ELSE bloco)? END;
log_exp: (valor|exp) COMPARACAO (valor|exp);

funcao_decl: FUNCTION funcao_nome funcao_corpo;
funcao_corpo: LPAREN lista_valor RPAREN bloco END SEMI_C;
funcao_chamada : funcao_nome args;
args: LPAREN lista_valor RPAREN;
funcao_nome: funcao_nome_tabela{ TabelaDeSimbolos.adicionarSimbolo($funcao_nome_tabela.text, Tipo.FUNCAO); };

funcao_nome_tabela: ID (DOT ID)?;

var: ID{ TabelaDeSimbolos.adicionarSimbolo($ID.text, Tipo.VARIAVEL); };
valor: NUMERO
     | var
     | funcao_chamada
     | CADEIA
     | FALSE
     ;

atr: (LOCAL)? lista_var '=' lista_valor;

lista_valor: ((valor|exp) ',')* (valor|exp);
lista_var: (var ',')* var;

exp: valor (operador1 | operador2) (valor|exp)
   | operador_un (valor|exp) | LPAREN (valor | exp) RPAREN;

atribuicao: ATRIBUICAO;
operador1: MINUS | PLUS;
operador2: TIMES | DIVIDED;
operador_un: MINUS | NOR |HASH;