grammar Person;

person: 'Person' '{' 'name' ':' STRING ',' 'age' ':' INT '}';

STRING: '"' [a-zA-Z]+ '"';
INT: [0-9]+;
WS: [ \t\r\n]+ -> skip;
