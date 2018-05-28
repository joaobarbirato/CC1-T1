/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Lua;

@members {
   public static String grupo="<<Digite os RAs do grupo aqui>>";
}

// base
fragment LETRA : ('A'..'Z' | 'a'..'z');
fragment ALGARISMO : ('0'..'9');

CARACTERE : (LETRA) | (ALGARISMO)+ | (LETRA)+ (ALGARISMO)+ | (ALGARISMO)+ (LETRA)+;
INTEIRO : (ALGARISMO)+;

// Declarar funcao:
FUNCTION : 'function' ;
NOMEVARIAVEL : 'n';
NOMEFUNCAO : 'func';

// IF
IF : 'if';
THEN: 'then';
ELSE: 'else';

// Utilidades
COMPARACAO: '==';
COMENTARIO : '--' CARACTERE;
LPAREN : '(' ;
RPAREN : ')' ;
END : 'end';
RETURN: 'return';
OPERADOR : '*' | '-';

// geral
programa : (declaracao)? (conjunto_codigos)?;
conjunto_codigos : comando | comentario comando | comando comentario/*| comando conjunto_codigos*/;
comando : declaracao | comando_if | calculo;
declaracao : declaracao_funcao;
expressao_logica: var COMPARACAO INTEIRO;

calculo : var OPERADOR chamada_funcao | var OPERADOR INTEIRO;

// if
comando_if:IF (' ') expressao_logica (' ') THEN ELSE END;

// funcao
declaracao_funcao: FUNCTION (' ') funcao_nome (' ') LPAREN var RPAREN ('\n') conjunto_codigos END;
chamada_funcao: funcao_nome LPAREN calculo RPAREN;

// outros
funcao_nome : NOMEFUNCAO{TabelaDeSimbolos.adicionarSimbolo($NOMEFUNCAO.text, Tipo.FUNCAO};
var : NOMEVARIAVEL{TabelaDeSimbolos.adicionarSimbolo($NOMEVARIAVEL.text, Tipo.VARIAVEL};
comentario : COMENTARIO;
retorno: RETURN INTEIRO | RETURN calculo;